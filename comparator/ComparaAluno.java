package comparator;

import java.util.Comparator;

public class ComparaAluno implements Comparator<Aluno> {

    public int compare(Aluno a, Aluno b) {
        return a.getNome().compareTo(b.getNome());
        /*Ele recebe dois objetos que são comparados e retorna um inteiro negativo, zero ou um inteiro positivo se o
    primeiro objeto é menor, igual ou maior que o segundo. */
    }
}
