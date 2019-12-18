
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTest {

    public static void main(String[] args) {

        String[] colors
                = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        for (String color : colors) {
            list1.add(color);
        }

        String[] colors2
                = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for (String color : colors2) {
            list2.add(color);
        }

        list1.addAll(list2); // add elementos de list2 ao final de list1
        list2 = null; //libera recursos já q list2 n é mais necessária
        printList(list1);

        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7); // remove items 4-6 from list
        printList(list1);
        printReversedList(list1);
    }

    private static void printList(List<String> list) {
        
        System.out.printf("%nlist:%n");

        for (String color : list) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    }

    private static void convertToUppercaseStrings(List<String> list) {

        ListIterator<String> iterator = list.listIterator();/*iterator bidirecional, pode percorrer a lista 
        em 2 sentidos p trás ou p frente*/

        while (iterator.hasNext()) {//tem próximo elementos na lista?
            String color = iterator.next(); // get item
            iterator.set(color.toUpperCase()); // substitui a string na list
        }
    }

    private static void removeItems(List<String> list, int start, int end) {
        
        list.subList(start, end).clear(); //obtem uma parte da lista de acordo com os intervalos, uma sublista
    }

    private static void printReversedList(List<String> list) {
        
        ListIterator<String> iterator = list.listIterator(list.size());//obtem iterator bidirecional

        System.out.printf("%nReversed List:%n");

        while (iterator.hasPrevious()) {//há mais elementos p percorrer a lista de trás p frente?
            System.out.printf("%s ", iterator.previous());//obtem o elementos anterior a partir da lista
        }
    }
}
