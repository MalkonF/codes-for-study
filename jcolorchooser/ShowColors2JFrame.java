package jcolorchooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ShowColors2JFrame extends JFrame {

    private final JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private final JPanel colorJPanel;

    public ShowColors2JFrame() {
        super("Using JColorChooser");

        // cria JPanel p exibir a cor
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);

        // configura o botão e registra seu event handler
        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(
                new ActionListener() // anonymous inner class
        {
            //método static. 3 arg: uma ref ao seu componente pai(janela no qual o componente é exibido, se for null vai centralizar no centro da tela, se for uma ref ao pai vai centralizar no meio da janela), uma string p barra título, e a cor inicial selecionado p diálogo
            @Override
            public void actionPerformed(ActionEvent event) {
                color = JColorChooser.showDialog(
                        ShowColors2JFrame.this, "Choose a color", color);

                if (color == null) {
                    color = Color.LIGHT_GRAY;
                }

                colorJPanel.setBackground(color);
            }
        } // end anonymous inner class
        ); // end call to addActionListener

        add(colorJPanel, BorderLayout.CENTER);
        add(changeColorJButton, BorderLayout.SOUTH);

        setSize(400, 130);
        setVisible(true);
    } // fim do constutor
}
