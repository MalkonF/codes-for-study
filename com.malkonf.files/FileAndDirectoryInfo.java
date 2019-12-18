
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter file or directory name:");
        // cria um obj Path convertendo uma string em um path
        Path path = Paths.get(input.nextLine());

        if (Files.exists(path)) // se o caminho existe
        {
            System.out.printf("%n%s exists%n", path.getFileName());
            System.out.printf("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not");
            System.out.printf("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not");
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path));
            System.out.printf("Size: %s%n", Files.size(path));
            System.out.printf("Path: %s%n", path);
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());

            if (Files.isDirectory(path)) {
                System.out.printf("%nDirectory contents:%n");

                // obtém um DirectoryStream contendo obj path ao conteúdo do diretório
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream) {
                    System.out.println(p);
                }
            }
        } else // caminho passado não existe
        {
            System.out.printf("%s does not exist%n", path);
        }
    }
}
/*Um programa java que processa fluxo de bytes recebe uma indicação do s.o qnd ele alcança o 
fim desse fluxo de bytes(arquivo). Em alguns casos a indicação do fim do arquivo ocorre como uma 
exceção.

Fluxos baseados em bytes geram e inserem dados em um formato binário. São chamados arquivo binário.
Fluxos baseados em caractere geram e inserem dados com uma sequencia de caracteres na qual cada 
caractere tem dois bytes. Ex: 2000000000 requer 20 bytes, 10 caracteres a dois bytes por caractere.
É chamado de arquivo de texto.
Arquivos binários só podem ser lidos por pgramas que entendem o conteúdo especifico do arquivo e
seu ordenamento. Enqt que arquivos de texto podem ser lidos por editores de texto.

Um programa java abre um arquivo criando e associando um objeto ao fluxo de bytes ou de caracteres.

Interface path - os objetos das classes que implementam essa interface representam o local de um arquivo
Classes path - fornece os métodos static utilizados para obter um obj path representando um local
de um obj ou diretório.
Classes files - oferece os métodos static para manipulação de arquivos e diretórios comuns, como copiar
criar, excluir etc
Interface DirectoryStream - os objetos das classes que implementam essa interface possibilitam que um pograma
itere pelo conteúdo de um diretório

Ao criar strings que representam informações de caminho, utilize File.separator para obter
o caractere de separador adequado do computador local, em vez de utilizar diretamente / ou \
 */
