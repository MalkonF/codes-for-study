package SerializationApps;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {

    private static ObjectInputStream input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile() {
        try {//retorna um InputStream que pode ser usado p ler a partir do arquivo. 
            //ObjectInputStream empacote um InputStream pq os dados devem ser lidos do arquivo no mesmo formato em que foram gravados.
            input = new ObjectInputStream(
                    Files.newInputStream(Paths.get("/home/clients.ser")));
        } catch (IOException ioException) {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }

    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");

        try {
            while (true) // loop continua até uma EOFException
            {
                Account record = (Account) input.readObject();

                // mostra o conteúdo gravado
                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch (EOFException endOfFileException) {
            System.out.printf("%nNo more records%n");
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Invalid object type. Terminating.");
        } catch (IOException ioException) {
            System.err.println("Error reading from file. Terminating.");
        }
    }

    public static void closeFile() {
        try {
            if (input != null) {
                input.close();
            }
        } catch (IOException ioException) {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }
}