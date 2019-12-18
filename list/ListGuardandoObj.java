package list;

import java.util.*;

public class ListGuardandoObj {

    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
    }
}
