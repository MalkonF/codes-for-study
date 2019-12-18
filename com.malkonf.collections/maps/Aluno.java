package maps;

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
        return this.curso;
    }

    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

    public String getNome() {
        return this.nome;
    }

}
