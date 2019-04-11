package get.set;

public class Driver {

    public static void main(String[] args) {

        Person john = new Person("John");
        //john.name = "John"; prática ruim, use métodos setters
        john.setAge(20);//boa prática
        Person bob = new Person("Bob");
        bob.age = 25;
        Person marie = new Person("Marie");
        marie.setInfo("Marie", 45);

        john.sayHelloTo(bob);
        bob.sayHelloTo(john);

        System.out.println(john.getName() + " is " + john.getAge() + " years old");
        System.out.println(bob.getName() + " is " + bob.getAge() + " years old");
        System.out.println(marie.getName() + " is " + marie.getAge() + " years old");
    }
}
