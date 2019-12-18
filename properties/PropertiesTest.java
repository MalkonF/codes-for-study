package properties;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

    public static void main(String[] args) {

        Properties table = new Properties(); //cria tabela vazia  

        // set properties.Se a chave n existir retorna null senão retorna o valor anterior dessa chave
        table.setProperty("color", "blue");
        table.setProperty("width", "200");

        System.out.println("After setting properties");
        listProperties(table);

        // substitui o valor da propriedade color
        table.setProperty("color", "red");

        System.out.println("After replacing properties");
        listProperties(table);

        saveProperties(table);

        table.clear();

        System.out.println("After clearing properties");
        listProperties(table);

        loadProperties(table);

        // pega o valor da propriedade color.Se a chave n for localizada retorna null
        Object value = table.getProperty("color");

        // checa se o valor esta na tab
        if (value != null) {
            System.out.printf("Property color's value is %s%n", value);
        } else {
            System.out.println("Property color is not in table");
        }
    }

    private static void saveProperties(Properties props) {

        try {
            FileOutputStream output = new FileOutputStream("props.dat");
            props.store(output, "Sample Properties"); // salva properties p output
            output.close();
            System.out.println("After saving properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static void loadProperties(Properties props) {

        try {
            FileInputStream input = new FileInputStream("props.dat");
            props.load(input); // restaura o conteúdo do arquivo
            input.close();
            System.out.println("After loading properties");
            listProperties(props);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // output property values
    private static void listProperties(Properties props) {
        Set<Object> keys = props.keySet(); // obtem set dos nomes da propriedade 

        for (Object key : keys) {
            System.out.printf("%s\t%s%n", key, props.getProperty((String) key));/*obtem o valor da propriedade 
            passando nome da chave*/
        }

        System.out.println();
    }
}

/*Properties é usada para armazenamento persistente de pares chave-valor. Essa classe estende HashTable<Object, Object>*/

 /*Vector e HashTable são desincronizadas p padrão, mas o acesso concorrente a uma Collection por múltiplas threads
pode provocar resultados indeterminados ou erros fatais. Por isso empacotadores de sincronização podem ser usados
p coleções q podem ser acessadas por múltiplas threads
List<String> list1 = new ArrayList<>();
List<String> list2 = Collections.synchronizedList(list1);*/

 /*Empacotadores n modificaveis lançam um UnsupportedOperationExceptions se forem feitas tentivas de modificar a 
coleção.Em uma coleção n modificavel as referencias armazenadas n são modificaveis, mas os obj q elas referenciam 
são modificaveis, a menos q pertençam a uma classe imutável String. 
List<String> list1 = new ArrayList<>();
List<String> list2 = Collections.unmodifiableList(list1);

Vc pode utilizar um empacotador n modificável p criar uma coleção q oferece acesso de leitura as outras pessoas 
enqt permite o acesso de leitura e gravação a si mesmo. Isso é feito dando as outras pessoas uma ref ao
empacotador n modificavel, ao mesmo tempo em q retem p vc uma ref a coleção original*/

 /*A estrutura de coleções fornece várias implementações abstratas de interfaces Collection a partir das quais vc
pode implementar rapidamente app personalizados.
AbstractCollection - implementação magra de Colletion
AbstractList - implementação de List q permite acesso do tipo de array
AbstractMap
.
.
P escrever uma implementação abstrata, estenda a implementação abstrata q melhor atender suas necessidades,
implemente cd um dos métodos abstract da classe e sobrescreva os métodos concretos da classe conforme necessário.*/
