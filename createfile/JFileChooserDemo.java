package createfile;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame {

    private final JTextArea outputArea;

    public JFileChooserDemo() throws IOException {
        super("JFileChooser Demo");
        outputArea = new JTextArea();
        add(new JScrollPane(outputArea));
        analyzePath();
    }

    public void analyzePath() throws IOException {
        // obtém o caminho do diretorio ou arquivo que foi selecionado através do metodo getFileOrDirectoryPath
        Path path = getFileOrDirectoryPath();

        if (path != null && Files.exists(path)) {

            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s:%n", path.getFileName()));
            builder.append(String.format("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not"));
            builder.append(String.format("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not"));
            builder.append(String.format("Last modified: %s%n", Files.getLastModifiedTime(path)));
            builder.append(String.format("Size: %s%n", Files.size(path)));
            builder.append(String.format("Path: %s%n", path));
            builder.append(String.format("Absolute path: %s%n", path.toAbsolutePath()));

            if (Files.isDirectory(path)) {
                builder.append(String.format("%nDirectory contents:%n"));

                // obj para interagir com o conteudo do dir selecionado
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream) {
                    builder.append(String.format("%s%n", p));
                }
            }

            outputArea.setText(builder.toString()); // mostra infos de builder
        } else // Path n existe
        {
            JOptionPane.showMessageDialog(this, path.getFileName()
                    + " does not exist.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Path getFileOrDirectoryPath() {

        JFileChooser fileChooser = new JFileChooser();
        //permite selecionar arquivos ou diretorios
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        //exibe a cx de dialogo p selecionar o dir ou arquivo. this especifica a posição q vai aparecer a janela
        //this representa a propria classe JFileChooser que especifica p posiocionar na posição da janela pai
        int result = fileChooser.showOpenDialog(this);//retorna um inteiro de acordo com a opção q foi selecionada

        if (result == JFileChooser.CANCEL_OPTION) {
            System.exit(1);
        }

        // getSelected obtem um obj que representa o local q foi selecionado e toPath retorna um obj Path
        return fileChooser.getSelectedFile().toPath();
    }
}
