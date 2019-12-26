/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {

    public static void main(String[] args) {
        String[] strings
                = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};

        // display original strings
        System.out.printf("Original strings: %s%n", Arrays.asList(strings));

        // mapeia cada string p sua versão maiúscula chamando o método de instância string toUpperCase()
        System.out.printf("strings in uppercase: %s%n",
                Arrays.stream(strings)
                        .map(String::toUpperCase)/*Conhecido como referencia de método, é uma abreviação p expr lambda.*/
                        .collect(Collectors.toList()));
        /*Equivale a  (String s) -> {return s.toUpperCase();} ou
        s -> s.toUpperCase()*/

        System.out.printf("strings greater than m sorted ascending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER)//recebe um Comparator como arg
                        .collect(Collectors.toList()));

        // strings greater than "m" (case insensitive) sorted descending
        System.out.printf("strings greater than m sorted descending: %s%n",
                Arrays.stream(strings)
                        .filter(s -> s.compareToIgnoreCase("m") > 0)
                        .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                        .collect(Collectors.toList()));
    }
}
/*System.out::println - Ref de metodo p um metodo de instancia que deve ser chamado em um obj especifico.
Cria uma lambda de um parametro q chama o metodo de instancia sobre o obj especificado e retorna o resultado
do metodo.
Math::srqt - ref de metodo p um metodo static.

TreeMap::new - Ref de construtor. Cria uma lambda q chama o construtor sem arg da classe especificada
p criar e inicializar um nv obj dessa classe.*/
