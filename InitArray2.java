
public class InitArray2 {

    public static void main(String[] args) {

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};//1 linha do array somente c 1 coluna

        System.out.println("Values in array1 by row are");
        outputArray(array1);

        System.out.println("\nValues in array2 by row are\n");/*Only printf accepts %n*/
        outputArray(array2);
    }

    public static void outputArray(int[][] array) {
        //percorre todas as casas de um array multidimensional
        for (int[] array1 : array) {
            for (int column = 0; column < array1.length; column++) {
                System.out.printf("%d ", array1[column]);
            }
            System.out.println();
        }
    }
}

/*OR - tem o mesmo resultado
for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d ", array[row][column]);*/
