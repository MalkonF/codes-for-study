
class Constructor2 {

    private String name;

    public Constructor2() {
        this("João"); //chama o construtor com argumento string novamente
        System.out.println("No arguments");
    }

    public Constructor2(String name) {
        System.out.println("String argument");
    }

}

public class Constructor {

    public static void main(String[] args) {

        Constructor2 cons = new Constructor2("");

        Constructor2 cons2 = new Constructor2();
    }
}
