package swing.textfield;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import javax.swing.JFrame;

public class TextFieldTest {

    public static void main(String[] args) {
        
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350, 100);
        textFieldFrame.setVisible(true);
    }
}
