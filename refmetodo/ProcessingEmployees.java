package refmetodo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees {

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Jason", "Red", 5000, "IT"),
            new Employee("Ashley", "Green", 7600, "IT"),
            new Employee("Matthew", "Indigo", 3587.5, "Sales"),
            new Employee("James", "Indigo", 4700.77, "Marketing"),
            new Employee("Luke", "Indigo", 6200, "IT"),
            new Employee("Jason", "Blue", 3200, "Sales"),
            new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        List<Employee> list = Arrays.asList(employees);

        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);//cria uma stream emplyee a partir de uma list
        //Pedicate é interface funcional. Definindo dessa maneira, se pode usar várias vezes
        Predicate<Employee> fourToSixThousand
                = e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        /*Interface Comparator e metodo static comparing. O metodo de ref é passado como argumento e 
      convertido pelo compilador em um obj que implementa a interface Function. Essa function é usada
      p extrair um valor de um obj no fluxo p utilização em comparações. O método comparing retorna
      um objeto Comparator em cad um dos dois objetos getSalary e então retorna um valor negativo
      se o salario do primeiro Employee for menor que o segundo, 0 se forem iguais e um valor positivo se o
      salario do primeiro Employee for maior que o segundo*/
        System.out.printf(
                "%nEmployees earning $4000-$6000 per month sorted by salary:%n");
        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                        .filter(fourToSixThousand)//entre 4000 e 6000
                        .findFirst()//preguiçoso, interrompe assim que encontra o valor
                        .get());//obtem o Employee encontrado
        //o Predicate retorna true se for interrompido pq encontrou a correspondencia no filter

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst
                = Comparator.comparing(byLastName).thenComparing(byFirstName);
        //compara pelo sobrenome, se sobrenome for igual ai compara primeiro nome

        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

        System.out.printf(
                "%nEmployees in descending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        System.out.printf("%nUnique employee last names:%n");
        list.stream()//cria um Stream<Employee>
                .map(Employee::getLastName)//mapeia Employee p seu sobrenome. O resultado é um Stream<String>
                .distinct()//pega so sobrenomes unicos
                .sorted()
                .forEach(System.out::println);

        System.out.printf(
                "%nEmployee names in order by last name then first name:%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

        /*collect aceita um arg q é um Collector q especifica como resumir os dados de uma forma útil.
         */
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment
                = list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
        //o resultado aqui é um Map<String, List<Emplyee>>, no qual cada ch string é um departamento 
        //e cada List<Employee> contem os employee nesse departamento
        groupedByDepartment.forEach(
                (department, employeesInDepartment)
                -> {
            System.out.println(department);
            employeesInDepartment.forEach(
                    employee -> System.out.printf("   %s%n", employee));
        }
        );

        System.out.printf("%nCount of Employees by department:%n");
        Map<String, Long> employeeCountByDepartment
                = list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                TreeMap::new, Collectors.counting()));
        employeeCountByDepartment.forEach(
                (department, count) -> System.out.printf(
                        "%s has %d employee(s)%n", department, count));

        System.out.printf(
                "%nSum of Employees' salaries (via sum method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum());

        System.out.printf(
                "Sum of Employees' salaries (via reduce method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, (value1, value2) -> value1 + value2));

        System.out.printf("Average of Employees' salaries: %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .getAsDouble());
    }
}
