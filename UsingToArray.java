
// Vendo arrays como listas e convertendo listas para arrays
import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray {

    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));//constroi uma lista c os elementos do array colors. Permite q vc manipule um array como se fosse uma lista. Isso é útil p add elementos do array a coleção e classificar. Qlqr modificação feita por list altera o array, e tds as modificações feita no array alteram a visualização list. A unica operação permitida na visualização de list é set q altera o valor da visualização e o array. N pode add ou del elementos.

        //As operações add aqui são permitidas pq operam diretamente na list e n na visualização retornada por asList
        links.addLast("red");
        links.add("pink"); // adiciona p o fim
        links.add(3, "green");
        links.addFirst("cyan");//green torna o 5 elemento

        //aqui o array é uma cópia dos elementos da lista, modificar o conteúdo do array n modifica o da lista. Se o número de elementos no array for maior ou igual ao num elementos na linkedlist, toarray copia os elementos d lista em seu arg de array e retorna esse array. Se linkedlist tiver mais elementos q o array, toarray aloca um novo array do mesmo tipo q ele recebe c um arg, copia os elementos da lista no novo array e retorna o novo array.
        colors = links.toArray(new String[links.size()]);//obtem um array de uma coleção list

        System.out.println("colors: ");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
/*Passar um array q contém dados p toArray pode causar erros de lógica. Se o num de elementos no array for menor q o da lista, um novo array é alocado p armazenar os elementos d lista(sem preservar os elementos do array). Mas se o num de elementos no array for maior  q o d lista, os elemento do array serao sobrescrito pelo elementos d lista, os q n forem sobrescritos retem seus valores.*/
