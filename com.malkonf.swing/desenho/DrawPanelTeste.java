package desenho;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DrawPanelTeste {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Entre 1 p desenhar linhas / 2 pra retângulos "
                + "/ 3 para formas ovais / 4 para um pirata :)");

        int choice = Integer.parseInt(input);

        DrawPanel panel = new DrawPanel(choice);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para permitir encerrar a aplicação no x

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);//necessário p a janela aparecer
    }
}
