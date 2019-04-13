/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
public class PackageDataTest {

    public static void main(String[] args) {
        PackageData packageData = new PackageData();

        System.out.printf("After instantiation:%n%s%n", packageData);

        packageData.number = 77;
        packageData.string = "Goodbye";

        System.out.printf("%nAfter changing values:%n%s%n", packageData);
    }
}

class PackageData {

    int number;//se n definir como private, os dados poderão ser acessados por outras classes que estão no mesmo pct, mesmo se deixar sem o public
    String string;

    public PackageData() {
        number = 0;
        string = "Hello";
    }

    public String toString() {
        return String.format("number: %d; string: %s", number, string);
    }
}
