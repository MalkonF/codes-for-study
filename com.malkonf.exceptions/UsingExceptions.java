/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
 /*
O método que pode lançar uma exceção deve especificar o tipo com throws. Na chamada do método que pode lançar
a exceção deve estar em volto num bloco try. Se tiver um catch correspondente a exceção especificada no 
corpo do método o programa consegue capturar ela.

Exceções são relançadas qnd um bloco catch decide q n pode processar a exceção ou so pode processa-la parcialmente
Relançar uma exceção adia o tratamento de exceção para outro bloco catch associado com uma instrução try mais 
externa(é o que acontece na linha 30)
Ela é relançada com throw seguida por uma referencia ao obj de exceção que foi capturado: exception.*/
public class UsingExceptions {

    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception exception) {
            System.err.println("Exception handled in main");
        }

        doesNotThrowException();
    }

    public static void throwException() throws Exception {
        try {
            System.out.println("Method throwException");
            throw new Exception();
        } catch (Exception exception) {
            System.err.println(
                    "Exception handled in method throwException");
            throw exception;

        } finally {
            System.err.println("Finally executed in throwException");
        }

    }

    public static void doesNotThrowException() {
        try {
            System.out.println("Method doesNotThrowException");
        } catch (Exception exception) {
            System.err.println(exception);
        } finally {
            System.err.println(
                    "Finally executed in doesNotThrowException");
        }

        System.out.println("End of method doesNotThrowException");
    }
}
//Se os corpos de vários catch forem idênticos pode usar o multi catch: catch(tipo1 | tipo2 | tipo3 e)
//Uma excessão n capturada é uma exceção para a qual n existem blocos catch
//Exceções só tratam erros síncronos, erros assíncronos(chegada msg rede, clique no mouse) n são tratados.
//O único modo de um bloco finally n executar é se ele sair do bloco try com System.exit
