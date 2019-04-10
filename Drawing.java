
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Drawing extends JFrame {

    public static void main(String[] args) {

        new Drawing(); //cria um objeto e chama o construtor mas sem ter var q guarda referencia a ele

    }

    public Drawing() {
        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
  
        super.paint(g);

        g.drawRect(50, 50, 100, 25);

        g.setColor(new Color(0, 0, 255));//usa construtor de Color para definir a cor
        g.drawOval(200, 50, 50, 50);

        g.setColor(Color.GREEN);
        g.fillRect(50, 200, 100, 25);

        g.drawString("My string", 200, 200);
    }

}
