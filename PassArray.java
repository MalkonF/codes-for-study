
public class PassArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        /*int[] myArray;
		myArray = new int[] {1, 2, 3, 4, 5, 6};*/

        System.out.printf(
                "%nEffects of passing reference to entire array:%n"
                + "The values of the original array are:%n");

        for (int value : array) {
            System.out.printf(" %d", value);
        }

        modifyArray(array);//passando a ref do array(objeto) os valores são modificados na origem

        System.out.printf("%n%nThe values of the modified array are:%n");

        for (int value : array) {
            System.out.printf(" %d", value);
        }

        System.out.printf(
                "%nEffects of passing array element value:%n"
                + "array[3] before modifyElement: %d%n", array[3]);

        modifyElement(array[3]);//passando um elemento do array(valor) somente a cópia é modificada, a origem n
        System.out.printf(
                "%narray[3] after modifyElement: %d%n", array[3]);
    }

    public static void modifyArray(int[] array2) {

        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }

    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf(
                "%nValue of element in modifyElement: %d%n", element);
    }
}
