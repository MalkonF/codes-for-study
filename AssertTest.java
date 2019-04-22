
import java.util.Scanner;

public class AssertTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 10: ");
        int number = input.nextInt();

        assert (number >= 0 && number <= 10) : "bad number: " + number;

        System.out.printf("You entered %d%n", number);
    }
}
//Ativando assertivas no tempo de execução: java -ea nomeclass
//Instrução try com recursos: o cód de liberação de recurso deve ser colocado em um bloco finally p garantir q um recurso é liberado. Existe uma notação alternativa chamada try com recursos. Ela chama o método close() implicitamente
