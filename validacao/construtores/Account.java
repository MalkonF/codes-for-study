package validacao.construtores;

public class Account {

    private String nome;

    public Account(String nome, int iniciar) {

        if (nome.equals("Malkon")) {
            this.nome = nome;
        }

        if (iniciar != 0) {
            System.out.println("Diferente de zero...");
        }
    }

    public void confNome(String nome) {
        this.nome = nome;
    }

    public String mostraNome() {
        return nome;
    }
}
