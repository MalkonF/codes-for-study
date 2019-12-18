
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount {

    public static void main(String[] args) {
        /* Cria hashmap para guardar chave tipo String e valores tipo Integer com 16 elementos e um fator de 
        carga 0,75. Qnd o núm d slots ocupados no HashMap torna-se maior do q a capacidade multiplicada pelo
        fator carga, a capacidade é dobrada automaticamente*/
        Map<String, Integer> myMap = new HashMap<>();
        //sempre use chaves imutáveis como String
        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<String, Integer> map) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // tokenize the input
        String[] tokens = input.split(" ");

        // processing input text 
        for (String token : tokens) {
            String word = token.toLowerCase();

            if (map.containsKey(word)) {//verifica se a palavra está no mapa
                int count = map.get(word);//resgata o valor associado a chave
                map.put(word, count + 1);//substitui o valor associado a chave
            } else {
                map.put(word, 1);
                /* cria uma nova entrada com a palavra como a chave e um obj Integer 
                contendo 1 como valor(aqui ocorre um autoboxing com 1 p Integer)*/
            }
        }
    }

    private static void displayMap(Map<String, Integer> map) {

        Set<String> keys = map.keySet(); // obtem o conjunto das chaves

        // classifica as chaves
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}

/*Maps associam chaves a valores.
Map 1 p 1 - contém chaves únicas e valores únicos
Map muitos p 1 - Muitas chaves podem mapear p um valor

As classes que implementam a interface Map são: Hashtable, HashMap(não é sincronizado e permite chaves null e valores null), TreeMap
SortedMap estende Map e mantém suas chaves em ordem classificada natural ou especificada p uma implementação Comparator. A classe TreeMap implementa SortedMap*/
