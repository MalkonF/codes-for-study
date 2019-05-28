/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
// Métodos de Collection reverse, fill, copy, max and min.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms1 {

    public static void main(String[] args) {
   
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);

        Collections.reverse(list); //aqui List é uma visualização do array, então o array tb é invertido
        System.out.printf("%nAfter calling reverse, list contains:%n");
        output(list);

        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        Collections.copy(copyList, list);//a List destino deve ser longa igual a origem senão um IndexOutOfBoundException ocorre
        System.out.printf("%nAfter copying, copyList contains:%n");
        output(copyList);

        Collections.fill(list, 'R');//sobrescreve a lista com R
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
    }

    private static void output(List<Character> listRef) {
        
        System.out.print("The list is: ");

        for (Character element : listRef) {
            System.out.printf("%s ", element);
        }

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf("  Min: %s%n", Collections.min(listRef));
    }
}
