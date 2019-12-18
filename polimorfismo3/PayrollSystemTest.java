package polimorfismo3;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
public class PayrollSystemTest {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee
                = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee
                = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee
                = new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee
                = new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee; //basePlusComissionEmployee pode ser atribuído a Employee pq a classe que base estende(ComissionEmployee) estende Employee

        System.out.printf("Employees processed polymorphically:%n%n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            //instanceof verifica se uma var é uma instância de uma classe
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                //Faz downcast pq currentEmployee é Employee
                BasePlusCommissionEmployee employee
                        = (BasePlusCommissionEmployee) currentEmployee;
                //chama getBaseSalary de basePlusComission
                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            }

            System.out.printf(
                    "earned $%,.2f%n%n", currentEmployee.earnings());//chama earnings de cada classe que implementa esse método
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());//mostra qual classe um obj pertence e getName mostra o nome da classe em String
        }
    }
}
