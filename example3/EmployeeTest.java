package example3;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
public class EmployeeTest {

    public static void main(String[] args) {

        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "blue", birth, hire);

        System.out.println(employee);
    }
}
/*Java permite que outros métodos da classe além dos seus contrutores tenham o mesmo nome da classe 
e especifiquem tipos de retorno. Esses métodos n são construtores e n serão chamados qnd um objeto da
classe for instanciado?????

 Classes nunca devem ter dados public n constantes, mas declarar dados public static final permite 
disponibilizar as constantes p os clientes da sua classe 

Métodos predicados -isEmpty - boolean
 */
