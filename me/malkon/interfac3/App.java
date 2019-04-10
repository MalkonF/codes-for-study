package me.malkon.interfac3;

public class App {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        Info info1 = new Machine();//a var ref info1 pode chamar só metodos implementados da interface em Machine
        info1.showInfo();

        Info info2 = person1;//pode atribuir a var de ref person1 pq a classe q ela instancia implementa a interface
        info2.showInfo();//chama método showInfo de Person

        outputInfo(mach1);
        outputInfo(person1);
    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }
}
