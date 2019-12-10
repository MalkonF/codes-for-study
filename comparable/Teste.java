package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno("Bismack"));
        lista.add(new Aluno("Liana"));
        lista.add(new Aluno("Top"));
        lista.add(new Aluno("Cao"));

        System.out.println(lista);

        Collections.sort(lista);

        System.out.println(lista);

    }

}
