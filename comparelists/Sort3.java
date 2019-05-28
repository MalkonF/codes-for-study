package comparelists;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
// Objeto comparator personalizado
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort3 {

    public static void main(String[] args) {
        
        List<Time2> list = new ArrayList<>();

        list.add(new Time2(6, 24, 34));//Add obj Time2 p lista pq ela é do tipo Time2
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 05, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));

        System.out.printf("Unsorted array elements:%n%s%n", list);

        Collections.sort(list, new TimeComparator());//passa um obj que implementa Comparator 

        System.out.printf("Sorted list elements:%n%s%n", list);
    }
}
