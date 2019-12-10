package comparator2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<Aluno> lista = new ArrayList<>();

        lista.add(new Aluno("aa"));
        lista.add(new Aluno("aaa"));
        lista.add(new Aluno("aaaa"));
        lista.add(new Aluno("a"));

        System.out.println(lista);

        Collections.sort(lista, new ComparaTamanho());

        System.out.println(lista);

    }

}
/*

Comparable: Se você tem controle sobre o código-fonte da classe, você pode implementar essa interface nela 
para definir uma estratégia de ordenação padrão. Exemplo: se você tem uma classe de Pessoa, você pode 
implementar Comparable nela definindo uma ordenação pelo nome, pois é um critério muito utilizado para 
ordenar Pessoas, logo, pode ser o padrão (natural).

Comparator: É útil quando você precisa criar ordenações personalizadas. Você pode ter uma classe com 
uma estratégia de ordenação padrão (implementando Comparable nela) e em situações que forem necessárias
ordenar de forma diferente, criar n classes que implementam Comparator para atender a esses casos que a
ordenação padrão da classe não atenda. Seguindo o exemplo da classe Pessoa que ordena por padrão pelo
nome, pode acontecer que em uma situação específica você precise ordenar, por exemplo, Pessoas por idade 
decrescente e pelo nome da mãe. Aí você implementa um Comparator para esta classe.

Resumo:

    Você tem uma estratégia padrão de ordenação e pode alterar a classe? Comparable é uma boa opção.
    Você precisa definir várias estratégias de ordenação ou não tem condições de definir a estratégia 
padrão de ordenação na classe porquê não pode alterá-la? Comparator.
Fonte: https://pt.stackoverflow.com/questions/342237/diferen%C3%A7a-entre-comparator-e-comparable
 */
