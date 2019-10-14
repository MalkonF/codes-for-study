
public class Array1 {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        int numbers2[] = new int[10];

        int[] numbers3, numbers4, numbers5; // 3 arrays do mesmo tipo
        int numbers6[], numbers7, numbers8; // numbers6 é um array e o restante var int

        int numbers9[] = {10, 20, 30};
        int[] numbers10 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers[0] = 5;
        numbers2[0] = 10;
        numbers3 = new int[10];
        numbers3[0] = 15;
        numbers4 = new int[10];
        numbers4[0] = 20;
        numbers6 = new int[10];
        numbers6[0] = 25;
        numbers7 = 30;
        
        numbers = numbers2;
        
        if(numbers == numbers2) // compara a mesma região da memória
            System.out.println("equal");
        else
            System.out.println("not equal");

    }
}
