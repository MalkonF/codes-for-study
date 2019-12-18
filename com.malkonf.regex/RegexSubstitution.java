
import java.util.Arrays;

public class RegexSubstitution {

    public static void main(String[] args) {

        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Original String 1: %s\n", firstString);
        //usa-se \\ para não confundir com o quantificador ou caractere de escape
        firstString = firstString.replaceAll("\\*", "^");

        System.out.printf("^ substituted for *: %s\n", firstString);

        firstString = firstString.replaceAll("stars", "carets");

        System.out.printf(
                "\"carets\" substituted for \"stars\": %s\n", firstString);

        System.out.printf("Every word replaced by \"word\": %s\n\n",
                firstString.replaceAll("\\w+", "word"));//\w é qualquer caractere

        System.out.printf("Original String 2: %s\n", secondString);

        for (int i = 0; i < 3; i++) {
            secondString = secondString.replaceFirst("\\d", "digit");//substitui a primeira ocorrência que encontrar
        }

        System.out.printf(
                "First 3 digits replaced by \"digit\" : %s\n", secondString);

        System.out.print("String split at commas: ");
        String[] results = secondString.split(",\\s*");/*retorna um array de strings. Separa as string onde 
        quer q tenha virgula*/
        System.out.println(Arrays.toString(results));
    }
}
