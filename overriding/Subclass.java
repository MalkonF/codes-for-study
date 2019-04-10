package overriding;

public class Subclass extends Base {

    public static void main(String[] args) {

        Subclass s = new Subclass();

    }

    public Subclass() {
        sayHello();
    }

    @Override
    public void sayHello() {

        super.sayHello();//chama o método da superclasse, se comentarmos ai vai aparecer so o Hi, mudando a funcionalidade do método
        System.out.println("Hi");
    }
}
