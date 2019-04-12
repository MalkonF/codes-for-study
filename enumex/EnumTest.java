package enumex;

//em uma declaração enum é um erro de sintaxe declarar constantes enum apos construtores, campos e métodos do tipo enum
import java.util.EnumSet;

public class EnumTest {

    public static void main(String[] args) {

        System.out.println("All books:");

        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }

        System.out.printf("%nDisplay a tange of enum constants: %n");
        //exibe um intervalo de constantes enum
        for (Book book : EnumSet.range(Book.JHTP, Book.IW3HTP)) {
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }
    }
}
