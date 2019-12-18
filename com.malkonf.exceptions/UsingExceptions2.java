/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/

 /* Qnd uma exceção é lançada mas n capturada em um escopo em particular, a pilha de chamada de método é 
desempilhada e é feita um atentiva de capturar a exceção no proximo bloco try mais externo*/
public class UsingExceptions2 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
/*Exceções da classe Error dificilmente são capturadas e tratadas 

RuntTimeExeceptions Error são exceções n verificadas
Se são herdadas da classe Exceptions são verificadas

Se um método de subclasse sobrescreve um método de superclasse, é um erro o método de subclasse listar mais 
exceções em sua cláusula throws do que o método da superclasse lista. Entretanto, a cláusula throws de uma 
subclcasse pode conter um subconjunto da cláusula trows de uma superclasse.

Se uma rotina de tratamento catch for escrita para capturar objetos de exceção de superclasse, ele tb pode 
capturar todos os objetos de subclasses dessa classe.*/
