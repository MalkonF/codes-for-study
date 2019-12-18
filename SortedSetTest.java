import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {
        // SortedSet estende Set e armazena os elementos de maneira ordenada. A classe TreeSet implementa SortedSet
        String[] colors = {"yellow", "green", "black", "tan", "grey",
            "white", "orange", "red", "green"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

        System.out.print("sorted set: ");
        printSet(tree);

        // Mostra elementos antes de orange
        System.out.print("headSet (\"orange\"):  ");
        printSet(tree.headSet("orange"));

        //Mostra elementos após orange
        System.out.print("tailSet (\"orange\"):  ");
        printSet(tree.tailSet("orange"));

        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last : %s%n", tree.last());
    }

    private static void printSet(SortedSet<String> set) {
        for (String s : set) {
            System.out.printf("%s ", s);
        }

        System.out.println();
    }
}
