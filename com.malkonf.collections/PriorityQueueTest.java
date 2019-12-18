//Em uma fila inclusões são feitas na parte de trás e exclusões na parte da frente

import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        /*Cria uma fila c a capacidade inicial de 11 elementos e os ordena de acordo c a ordem natural do objeto. 
        A classe Priority fornece 5 construtores adicionais onde um deles aceita um int e um objeto Comparator, 
        onde o int vai ser a capacidade e Comparator a lógica do ordenamento.*/

        PriorityQueue<Double> queue = new PriorityQueue<>();

        //insere elementos na fila
        queue.offer(5.4);
        queue.offer(9.8);
        queue.offer(3.2);

        System.out.print("Polling from queue: ");

        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek()); // mostra mas n remove o elemento c maior prioridade
            queue.poll(); // remove o elementos de mais alta prioridade
        }
    }
}
/*A interface Queue estende a interface Collection e fornece operações adicionais p fazer nos elementos da fila. 
PriorityQueue que implementa a interface Queue, ordena os elementos de acordo c sua ordem natural.
A classe PriorityQueue fornece funcionalidade q permitem inserções na ordem de classificação na estrutura de
dados e exclusões tb. Ao add elementos a uma PriorityQueue os elementos tem prioridades onde o elemento de
maior prioridade será o primeiro elemento removido.*/
