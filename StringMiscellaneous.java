/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
public class StringMiscellaneous {

    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s1: %s", s1);

        System.out.printf("\nLength of s1: %d", s1.length());

        System.out.printf("%nThe string reversed is: ");

        for (int count = s1.length() - 1; count >= 0; count--) {
            System.out.printf("%c ", s1.charAt(count));//charAt retorna os caracteres de uma string em uma posição específica
        }

        s1.getChars(0, 5, charArray, 0);//1 arg - índice inicial a partir do qual os caractees devem ser copiados. 2 arg - índice que está além do último caractere q será copiado. 3 arg - array. 4 arg - é o índice inicial onde os caracteres copiados são colocados no array destino
        System.out.printf("%nThe character array is: ");

        for (char character : charArray) {
            System.out.print(character);
        }

        System.out.println();
    }
}
