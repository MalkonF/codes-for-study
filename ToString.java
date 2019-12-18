
class Frog {

    @Override
    public String toString() {
        return "Hello";
    }
}

public class ToString {

    public static void main(String[] args) {

        Frog frog1 = new Frog();
        System.out.println(frog1);
    }
}
//se n tiver um @Override do toString, ao se referenciar o objeto frog1 vai mostrar o hashcode da classe e o endereço de memória(Frog@4aa298b7)

