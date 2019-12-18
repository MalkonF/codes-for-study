package TextFileApps;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

    private static Formatter output;      

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            output = new Formatter("/media/anonymous/46f8a10f-f298-4201-8ff1-296f11356171/backup/projetos/codes/java/codes-for-study/TextFileApps/clients.txt");
            /* se o arquivo n existir ele será criado.
            Se estiver aberto todo seu conteúdo será truncado*/
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);//passando 1 significa q n foi bem sucedida a saída do programa
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");

        while (input.hasNext()) // fica em loop até indicar o fim de arquivo
        {
            try {
                output.format("%d %s %s %.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException elementException) {//exceção é acionada se digitar int onde é esperado outro tipo
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // descarta as entradas erradas e pede p inserir novamente
            }

            System.out.print("? ");
        }
    }

    public static void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}
/*Se nenhum caminho for especificado, a jvm assume que o arquivo está no diretório a partir do
qual o programa é executado.*/
