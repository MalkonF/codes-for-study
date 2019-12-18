package mouseevents3;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter {

    public static void main(String[] args) {
        
        JFrame application = new JFrame("A simple paint program");

        PaintPanel paintPanel = new PaintPanel();
        application.add(paintPanel, BorderLayout.CENTER);

        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200);
        application.setVisible(true);
    }
} 
/*Método paintComponent é chamado qnd um componente Swing leve é exibido. P exibir um componente corretamente,
o programa deve determinar se o componente é transparente. O cód q determina isso está na implementação 
paintComponent da superclasse JComponent. Qnd um componente for transparente, paintComponent n limpará seu 
fundo qnd o programa exibir o componente. Qnd for opaco, paintComponent limpará o fundo do componente antes do
componente ser exibido. Por isso se deve chamar a versão da superclasse de paintComponent com super.

A transparência de um componente swing pode ser configurada com o método setOpaque. Argumento false indica que
o componente é transparente.*/
