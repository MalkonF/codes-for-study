
public class InitArray {

    public static void main(String[] args) {
        
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];//inicializa elementos int com 0
        int[] array2 = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "Index", "Value");//%8s espaço de oito caracteres

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
            System.out.printf("%5d%8d%n", counter, array2[counter]);
        }
    }
}
