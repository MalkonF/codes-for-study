
import java.util.Stack;
import java.util.EmptyStackException;

public class StackTest {

    public static void main(String[] args) {

        Stack<Number> stack = new Stack<>();
        /*cria uma Stack vazia de Number. Number e os objetos de qlqr
        classe q estende Numbers podem ser colocados na pilha*/

        stack.push(12L); // coloca literal inteiro 12L na stack
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push(34567);
        System.out.println("Pushed 34567");
        printStack(stack);
        stack.push(1.0F);
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678);
        System.out.println("Pushed 1234.5678 ");
        printStack(stack);

        try {
            Number removedObject = null;

            while (true) {
                removedObject = stack.pop();
                /*pop remove os elementos da pilha. Qd n houver nenhum elementos 
                na Stack o método pop lança uma exceção EmptyStackException que acaba com o loop*/
                System.out.printf("Popped %s%n", removedObject);
                printStack(stack);
            }
        } catch (EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }

    private static void printStack(Stack<Number> stack) {
        if (stack.isEmpty()) {//checa se a pilha está vazia
            System.out.printf("stack is empty%n%n");
        } else {
            System.out.printf("stack contains: %s (top)%n", stack);
        }
    }
}
