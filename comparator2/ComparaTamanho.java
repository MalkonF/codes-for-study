package comparator2;

import java.util.Comparator;

public class ComparaTamanho implements Comparator<Aluno> {
    
    @Override
    public int compare(Aluno a, Aluno b) {
     
        return a.getNome().length() - b.getNome().length();
        //aqui eu escolhi ordenar por numero de caracteres. Ele faz a aritmetica, a medida que for dando negativo
        //ele vai colocando como primeiros
    }
    
}
