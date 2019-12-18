package swing.jLabel;

import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class LabelFrame extends JFrame {//estender p herdar recursos da janela

    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    // LabelFrame constructor adds JLabels to JFrame
    public LabelFrame() {
        super("Testing JLabel");//passa o txt p o construtor de Jframe utilizar no título da janela
        setLayout(new FlowLayout()); // set frame layout. São posicionados da esq p dir na ordem em q são add. setLayout é herdado de Container e serve p definir o layout.

        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1); // add label1 to JFrame

        // getClass recupera uma ref ao obj LabelFrame.class e getResource retorna a localização da img como uma url. Como a img está no mesmo diretório de LabelFrame o getClass retorna o endereço que a classe(e a img)e estão localizadas.
        Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
        label2 = new JLabel("Label with text and icon", bug,
                SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2); // add label2 to JFrame

        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug); // add icon to JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
/*JFrame é uma subclasse indireta da classe Windows que fornece os atributos e comportamentos de uma janela(minimizar, fechar,miximizar)*/
