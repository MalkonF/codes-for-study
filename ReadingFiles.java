
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ReadingFiles {

    public static void main(String[] args) throws IOException {

        int sum = 0;
        int count = 0;
        double average;

        File file = new File("OutputFile.txt");

        if (file.exists()) {
            
            Scanner inputFile = new Scanner(file);

            while (inputFile.hasNext()) {
                sum = sum + inputFile.nextInt();
                count++;
            }

            inputFile.close();

            average = sum / (double) count;

            JOptionPane.showMessageDialog(null, "Soma de todos os valores:" + sum + "\n"
                    + "O número de valores:" + count + "\n"
                    + "A média é: " + average);

        } else {
            JOptionPane.showMessageDialog(null, "O arquivo não existe");
        }
    }

}
