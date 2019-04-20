
import java.util.InputMismatchException;
import java.util.Scanner;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
public class DivideByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator,
                        denominator, result);
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n",
                        inputMismatchException);
                scanner.nextLine();
                System.out.printf(
                        "You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf(
                        "Zero is an invalid denominator. Please try again.%n%n");
            }
        } while (continueLoop);
    }
}

//rastreamento de pilha inclui o nome da exceção, a pilha de chamadas de método
//Todas as classes de exceção herdam direta ou indiretamente da classe Exception, formando um hierarquia de herança. Qnd se faz uma classe para lançar exceção tem que se estender essa classe ou alguma subclasse
//Java permite a divisão por zero com valores ponto-flutuantes, pode dar infinity e se 0.0 for divido por 0.0 da NaN
//Pelo menos um bloco catch ou finally deve vir junto com try