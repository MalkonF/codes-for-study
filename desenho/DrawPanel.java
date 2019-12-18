package desenho;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    private int choice;

    public DrawPanel(int userChoice) {
        
        choice = userChoice;
    }

    public void paintComponent(Graphics g) //método deve ser sempre declarado senão o sistema n o chamará. Esse método é chamado qnd um JPanel é exibido pela 1º vez ou qnd a janela é redimensionada. Ele requer um arg q é um objeto de graphics q usa p desenhar
    {
        super.paintComponent(g); //sempre tem q colocar p asseguar q vai desenhar

        int width = getWidth();
        int height = getHeight();

        switch (choice) {
            case 1:
                g.drawLine(0, 0, width, height);
                g.drawLine(0, height, width, 0);
                break;
            case 2:
                g.drawRect(10, 10, 50, 50);
                break;
            case 3:
                g.drawOval(30, 30, 30, 30);
                break;
            case 4:
                g.setColor(Color.YELLOW);
                g.fillOval(10, 10, 200, 200);
                g.setColor(Color.BLACK);
                g.fillOval(55, 65, 30, 30);
                g.fillOval(50, 110, 120, 60);
                g.setColor(Color.YELLOW);
                g.fillRect(50, 110, 120, 30);
                g.fillOval(50, 120, 120, 40);
                break;
        }
    }

}
