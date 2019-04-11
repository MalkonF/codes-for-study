//Implementar novas funcionalidades:ordenar os num, buscar jogos já sorteados e descartar eles

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.ArrayList;

public class MegaSena {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos jogos quer fazer?");

        int numeroJogos = entrada.nextInt();

        if (numeroJogos <= 0) {
            throw new IllegalArgumentException("Digite valores maiores que 0");//lançamento exceção
        }

        ArrayList<Integer> guardarNumSorteados = new ArrayList<Integer>();
        SecureRandom geraNumSorteados = new SecureRandom();

        int cont = 0;

        while (cont < numeroJogos) {
            while (guardarNumSorteados.size() <= 6) {
                int random = 1 + geraNumSorteados.nextInt(99);
                if (!guardarNumSorteados.contains(random)) {//evita num repetidos
                    guardarNumSorteados.add(random);
                }
            }

            for (int num = 1; num <= guardarNumSorteados.size() - 1; num++) {//mostra os num sorteados
                System.out.printf("%d ", guardarNumSorteados.get(num));
            }
            System.out.println();
            guardarNumSorteados.clear();
            cont++;
        }
    }
}
