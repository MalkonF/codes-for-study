package jlist2;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import javax.swing.JFrame;

public class MultipleSelectionTest {

    public static void main(String[] args) {
        MultipleSelectionFrame multipleSelectionFrame
                = new MultipleSelectionFrame();
        multipleSelectionFrame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        multipleSelectionFrame.setSize(350, 150);
        multipleSelectionFrame.setVisible(true);
    }
}
