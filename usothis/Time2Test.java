package usothis;

public class Time2Test {

    public static void main(String[] args) {
        
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);

        System.out.println("Construido com:");
        displayTime("t1:", t1);
        displayTime("t2:", t2);
        displayTime("t3:", t3);
        displayTime("t4:", t4);
        displayTime("t5:", t5);

        try {
            Time2 t6 = new Time2(27, 74, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializg t6: %s%n", e.getMessage());
        }
    }

    private static void displayTime(String header, Time2 t) {
        
        System.out.printf("%s%n %s%n  %s%n", header, t.toUniversalString(), t.toString());

    }
}
/*Construtores sobrecarregados permitem que objetos sejam inicializados de diferentes maneiras*/
