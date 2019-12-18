
import java.util.Scanner;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
public class StaticCharMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character and press Enter");
        String input = scanner.next();
        char c = input.charAt(0);

        System.out.printf("is defined: %b\n", Character.isDefined(c));//está definido no UNICODE?
        System.out.printf("is digit: %b\n", Character.isDigit(c));
        System.out.printf("is first character in a Java identifier: %b\n",
                Character.isJavaIdentifierStart(c));//pode ser usado como primeiro caractere em um identificador java?
        System.out.printf("is part of a Java identifier: %b\n",
                Character.isJavaIdentifierPart(c));
        System.out.printf("is letter: %b\n", Character.isLetter(c));
        System.out.printf(
                "is letter or digit: %b\n", Character.isLetterOrDigit(c));
        System.out.printf(
                "is lower case: %b\n", Character.isLowerCase(c));
        System.out.printf(
                "is upper case: %b\n", Character.isUpperCase(c));
        System.out.printf(
                "to upper case: %s\n", Character.toUpperCase(c));
        System.out.printf(
                "to lower case: %s\n", Character.toLowerCase(c));
    }
}
