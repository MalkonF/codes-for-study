package maps;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        Map<String, Aluno> mapa = new TreeMap<String, Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Benedito Silva", "OpenOffice", 0);
        mapa.put("João da Silva", a);
        mapa.put("Antonio Sousa", b);
        mapa.put("Lúcia Ferreira", c);
        mapa.put("Benedito Silva", d);
        System.out.println(mapa);// aqui ele vai chamar o toString e mostar o atributo implementado
        System.out.println(mapa.get("Lúcia Ferreira"));

        Collection<Aluno> alunos = mapa.values();
        for (Aluno e : alunos) {
            System.out.println(e);
        }
    }

}
