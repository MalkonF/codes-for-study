package fonts;

import javax.swing.JFrame;

public class Fonts {

    public static void main(String[] args) {
        // cria frame p FontJPanel
        JFrame frame = new JFrame("Using fonts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FontJPanel fontJPanel = new FontJPanel();
        frame.add(fontJPanel);
        frame.setSize(420, 150);
        frame.setVisible(true);
    }
}