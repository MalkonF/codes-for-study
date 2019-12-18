package label;

import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDriver {

    public static void main(String[] args) {

        JLabel label1 = new JLabel("North");
        //cria um ícone a partir de uma imagem
        URL image = LabelDriver.class.getResource("GUItip.gif");//procura no CLASSPATH a imagem e retorna a URL
        //System.out.println(image);debug
        ImageIcon imagemLabel = new ImageIcon(image);

        // coloca o ícona no jlabel
        JLabel label2 = new JLabel(imagemLabel);

        JLabel label3 = new JLabel(imagemLabel);//cria o jLabel com o icone

        label3.setText("South");

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //organiza os componentes na tela 
        application.add(label1, BorderLayout.NORTH);
        application.add(label2, BorderLayout.CENTER);
        application.add(label3, BorderLayout.SOUTH);

        application.setSize(300, 300);
        application.setVisible(true);
    }
}
