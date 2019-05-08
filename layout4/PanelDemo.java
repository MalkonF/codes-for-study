package layout4;

import javax.swing.JFrame;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
public class PanelDemo extends JFrame {

    public static void main(String[] args) {
        PanelFrame panelFrame = new PanelFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(450, 200);
        panelFrame.setVisible(true);
    }
}
