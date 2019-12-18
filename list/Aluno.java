package list;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private String curso;
    double nota;

    Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String toString() {
        return this.nome;
    }

    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

    // Métodos getters e setters
    public String getNome() {
        return this.nome;
    }
    /*String é uma classe comparável, isto é, já implementa Comparable, por isso podemos ordenar pelo nome em 
    ordem alfabética*/

 /* Em certas situações precisamos de uma ordenação diferente da natural ou temos uma coleção de objetos de
    uma classe de terceiros que não é comparável, ou seja, não implementa Comparable. Nesses casos usamos a 
    interface Comparator.*/
}
