package drawline;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import javax.swing.JFrame;

public class TestDraw {

    public static void main(String[] args) {

        DrawPanel panel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
