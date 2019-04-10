
public class TypeAndVariables {

    public static void main(String[] args) {

        int myVariable; //alocou espaço ram
        myVariable = 5; //preencheu espaço

        double x = 2.5;

        //myVariable = x; // n pode add double para int, tem que fazer typecasting
        myVariable = (int) x; // perde o número após o .
        System.out.println(x);
        System.out.println(myVariable);

        x = myVariable; //o contrário pode, mas é tranformado para double
        System.out.println(x);
    }

}
