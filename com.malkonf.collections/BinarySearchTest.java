
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearchTest {

    public static void main(String[] args) {
        
        // cria ArrayList<String> do conteúdo do array colors
        String[] colors = {"red", "white", "blue", "black", "yellow",
            "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list); 
        System.out.printf("Sorted ArrayList: %s%n", list);

        printSearchResults(list, "black"); 
        printSearchResults(list, "red"); 
        printSearchResults(list, "pink"); 
        printSearchResults(list, "aqua"); 
        printSearchResults(list, "gray"); 
        printSearchResults(list, "teal"); 
    }

    private static void printSearchResults(
            List<String> list, String key) {
        int result = 0;

        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list, key);

        if (result >= 0) {
            System.out.printf("Found at index %d%n", result);
        } else {
            System.out.printf("Not Found (%d)%n", result);
        }
    }
} 
//Se o item for encontrado binarySearch retorna o índice q ele ta, se n for encontrado retorna valor negativo. P calcular o valor negativo ele ve o ponto de inserção e o torna negativo adicionando sempre 1 para evitar de retornar 0. Se múltiplos elementos da lista correspondem a chave d pequisa, n é garantido que um será localizado primeiro.
//binarySearch tem uma versão sobrecarregada onde num terceiro arg recebe um obj Comparator q especifica como deve ser comparado chave pesquisa com elementos da List