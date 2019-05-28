/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 
{
   public static void main(String[] args)
   {
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

      List<String> list = Arrays.asList(suits); // create List
       System.out.printf("Unsorted array elements: %s%n", list);

      // classifica em ordem decrescente utilizando a interface Comparator q é utilizada p classificar elementos de uma Collection em uma ordem diferente
      Collections.sort(list, Collections.reverseOrder()); 
      System.out.printf("Sorted list elements: %s%n", list);
   } 
} 