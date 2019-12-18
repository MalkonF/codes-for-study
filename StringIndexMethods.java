
public class StringIndexMethods {

    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghijklm";
        //localiza primeira ocorrência de um caractere em uma string. Retorna negativo se n encontrar
        System.out.printf(
                "'c' is located at index %d\n", letters.indexOf('c'));
        System.out.printf(
                "'a' is located at index %d\n", letters.indexOf('a', 1));//índice inicial q a pesquisa deve começar
        System.out.printf(
                "'$' is located at index %d\n\n", letters.indexOf('$'));
        //localiza a última ocorrência de um caractere numa string(pesquisa de tras p frente)
        System.out.printf("Last 'c' is located at index %d\n",
                letters.lastIndexOf('c'));
        System.out.printf("Last 'a' is located at index %d\n",
                letters.lastIndexOf('a', 25));
        System.out.printf("Last '$' is located at index %d\n\n",
                letters.lastIndexOf('$'));

        System.out.printf("\"def\" is located at index %d\n",
                letters.indexOf("def"));
        System.out.printf("\"def\" is located at index %d\n",
                letters.indexOf("def", 7));
        System.out.printf("\"hello\" is located at index %d\n\n",
                letters.indexOf("hello"));

        System.out.printf("Last \"def\" is located at index %d\n",
                letters.lastIndexOf("def"));
        System.out.printf("Last \"def\" is located at index %d\n",
                letters.lastIndexOf("def", 25));
        System.out.printf("Last \"hello\" is located at index %d\n",
                letters.lastIndexOf("hello"));
    }
}
