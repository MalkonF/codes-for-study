
public class StringBuilderConstructors {

    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder();//capacidade inicial de 16 caracteres
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");
        //chama implicitamente o método toString()
        System.out.printf("buffer1 = \"%s\"\n", buffer1);
        System.out.printf("buffer2 = \"%s\"\n", buffer2);
        System.out.printf("buffer3 = \"%s\"\n", buffer3);
    }
} 
/*Em programas q frequentemente executam concatenção de string, ou outras modificações em string, é mais eficiente implementa as modificações com StringBuilder do que String

StringBuilders n são seguras a thread. Se múltiplas threads exigem acesso às mesmas informações de string dinâmica, use a classe StringBuffer*/
