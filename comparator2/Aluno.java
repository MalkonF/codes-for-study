package comparator2;

public class Aluno {

    String nome;

    public Aluno(String nome) {

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + '}';
    }

}
