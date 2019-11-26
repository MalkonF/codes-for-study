package set;

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

    public boolean equals(Object o) {
        Aluno a = (Aluno) o;
        return this.nome.equals(a.getNome());
    }

    public int hashCode() {
        return this.nome.hashCode();
    }

    public String getNome() {
        return this.nome;
    }
}
/*HashSet usa o código hash do objeto – dado pelo método hashCode()  para saber onde deve por e onde buscar o
mesmo no conjunto set. Antes ele verifica se não existe outro objeto no Set com o mesmo código hash. Se não 
há código hash igual, então ele sabe que o objeto a ser inserido não está duplicado. Dessa forma, classes cujas
instâncias são elementos de HashSet devem implementar o método hashCode(). Como consequência disso, a classe 
Aluno, no nosso exemplo, deve sobrescrever o método hashCode().

Conforme o contrato geral de hashCode(), que consta na especificação da classe Object, se dois objetos são
diferentes de acordo com equals() então não é obrigatório que seus códigos hash sejam diferentes

Portanto, objetos que retornam o mesmo código hash não são necessariamente iguais. Assim, quando encontra no 
conjunto um objeto com o mesmo código hash do objeto a ser inserido, HashSet faz uma chamada ao método
equals() para verificar se os dois objetos são iguais. Dessa forma, a classe Aluno deve sobrescrever o método 
equals() também*/
