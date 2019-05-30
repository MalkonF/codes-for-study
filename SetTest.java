// Fig. 16.16: SetTest.java
// HashSet remove os valores duplicados num array de strings.

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest {

    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray",
            "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        printNonDuplicates(list);
    }

    private static void printNonDuplicates(Collection<String> values) {
        // cria um HashSet 
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: ");

        for (String value : set) {
            System.out.printf("%s ", value);
        }

        System.out.println();
    }
}
/*Implementações de Set: HashSet(armazena seus elementos em uma tabela de hash) e TreeSet(armazena seus elementos em uma arvore)*/