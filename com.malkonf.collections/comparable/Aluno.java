package comparable;

/*O Comparable permite que uma determinada classe diga como uma instância dela deverá ser comparada
com outras instâncias dela mesma.*/
public class Aluno implements Comparable<Aluno> {

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

    @Override
    public int compareTo(Aluno o) {
        return nome.compareTo(o.getNome());//neste caso escolhemos o nome para ser o atributo a ser comparado
    }

}
