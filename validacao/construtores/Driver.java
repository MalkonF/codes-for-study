package validacao.construtores;

//import java.lang é o unico pacote que n requer uma declaração import
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account minhaConta = new Account("Malkon", 0);//n mostra msg "Diferente de zero...", mas mostra nome
        Account minhaConta2 = new Account("Dani", 1);//mostra msg "Dif de zero...", mas n mostra nome

        System.out.printf("Nome inicial é: %s%n", minhaConta.mostraNome());
        System.out.printf("Nome inicial do segundo objeto é:%s%n", minhaConta2.mostraNome());

        System.out.println("Qual é seu nome?");
        String nome = input.nextLine();
        minhaConta.confNome(nome);

        System.out.printf("O nome é: %s%n", minhaConta.mostraNome()); //% é portavel entre # S.O

    }
}
