
import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {

    public static void main(String[] args) throws IOException {
        
        PrintWriter outputFile = new PrintWriter("text");

        outputFile.println("Hi");
        outputFile.close();

    }

}
