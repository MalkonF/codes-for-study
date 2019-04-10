package heranca;

public class Child extends Parent {//aqui está dizendo q a classe child vai herdar atributos métodos protected e public da classe Parent

    public static void main(String[] args) {

        Child c = new Child();

        System.out.println(c.eyeColor);
    }
}
//quando ta protected msm se n extender a classe que tem a var, mas se fazer parte do mesmo pact a var pode ser acessada
