package arcs;
/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import javax.swing.JFrame;

public class DrawArcs {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArcsJPanel arcsJPanel = new ArcsJPanel();
        frame.add(arcsJPanel);
        frame.setSize(300, 210);
        frame.setVisible(true);
    }
}
