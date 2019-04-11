package get.set;

public class Person {

    String name;
    int age;

    public Person(String name) {
        this.name = name;
        System.out.println("Person created");
    }

    public void setInfo(String name, int age) {//método setInfo utiliza métodos setName e setAge para configurar var
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHelloTo(Person person) {//Objeto tipo Person como argumento
    
        System.out.println(this.getName() + " said hello to " + person.getName());
        //this.getName() chama o método getName da instância atual
    }

}
