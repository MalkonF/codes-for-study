//Interface Collection demonstrada por meio d um obj ArrayList.
/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

    public static void main(String[] args) {

        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>(); //List implementa ArrayList então pode armazenar tipo array. Criou obj ArrayList e atribuiu sua ref a var list

        for (String color : colors) {
            list.add(color); // add color p final da lista     
        }

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();//Se mais tarde quisermos q seje LinkedList no lugar de ArrayList só modificar aqui. Ao criar um objeto d coleção referencie este obj c uma var do tipo d interface d coleção correspondente.

        for (String color : removeColors) {
            removeList.add(color);
        }

        System.out.println("ArrayList: ");

        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }

        removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");

        list.forEach((color) -> { //List é do tipo String então pode ser atribuída a um tipo String
            System.out.printf("%s ", color);
        });
        /*for (String color : list)
         System.out.printf("%s ", color);*/
    }

    private static void removeColors(Collection<String> collection1,
            Collection<String> collection2) {

        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()) {//enqt tiver um próx elemento
            if (collection2.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
}//Se uma coleção for modificada por um d seus métodos depois d ter sido criada, o iterador se torna inválido(acontece uma exceção). Isso garante q uma coleção modificável n seja manipulada p duas ou mais threads ao mesmo tempo, o q pode corromper a coleção.

/*Uma coleção é uma estrutura de dados q pode armazenar referências a outros objetos q tem o relacionamento é um com o tipo armazenado na coleção. As interfaces de estrutura de coleções declaram as operações a ser realizadas em vários tipos de coleções:

Collection - Interface raiz da qual todas as outras são derivadas. É usada como um tipo de parâmetro nos métodos p permitir processamento polimórfico de todos os obj que implementam a interface Collection.
A maioria das implementações de Collection fornece um contrutor q aceita um arg Collection, permitindo assim q uma nova coleção a ser construída contenha os elementos da coleção especificada.
Set - Uma coleção q n contém duplicatas

List - Coleção ordenada q pode conter elementos duplicados
A interface List é implementada por várias classes como:
ArrayList - Inserir um novo elementos em uma coleção já existente é ineficiente. Melhor para buscar. N são sincronizadas p padrão. As coleções n sincronizadas oferecem mais desempenho que as sincronizadas.
LinkedList - Qnd for inserir novos elementos em uma coleção já existente. É adquada p criar pilhas, filas e deques(filas com dupla terminação).
Vector - Inserir um novo elementos em uma coleção já existente é ineficiente. Melhor p buscar. Operações aqui são sincronizadas p padrão

Map - Coleção q associa chaves a valores e q n pode conter duplicatas
Fila - Coleção do tipo primeiro a entrar, primeiro a sair*/
//Autoboxing - integerArray[0] = 10;
//Autounboxing - int value = integerArray[0];

