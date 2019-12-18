/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/

 /*Se um bloco catch relançar uma nova exceção, as info e o rastreamento de pilha da exceção original eram perdidos. Exceções encadeadas permitem que um obj de exceção mantenha info completas do rastreamento de pilha da exceção original.*/
public class UsingChainedExceptions {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("Exception thrown in method1", exception);
        }
    }

    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception exception) {
            throw new Exception("Exception thrown in method2", exception);
        }
    }

    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
