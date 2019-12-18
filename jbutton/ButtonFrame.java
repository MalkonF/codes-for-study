package jbutton;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {

    private final JButton plainJButton;
    private final JButton fancyJButton;

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("bug1.GIF"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.GIF"));
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);//muda d img qnd o user posiciona o ponteiro do mouse em cima
        add(fancyJButton);

        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {//cd tipo de evento tem uma ou mais interfaces ouvintes de eventos correspondentes. P exemplo, ActionEvents são tratados por ActionListeners, MouseEvents por MouseListeners...

        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
                    "You pressed: %s", event.getActionCommand()));
            //Qnd o argumento de showMessageDialog n for null, ele representa o componente GUI pai do diálogo de msg e permite ao dialogo estar centralizado sobre esse componente qnd for exibido. ButtonFrame.this representa a ref this do obj de classe de primeiro nivel ButtonFrame
        }
    }
}
/* Muitos tipos diferentes de eventos podem ocorrer qnd o user interage com uma GUI. As inf de evento de componentes AWT e Swing são  armazenadas em um obj de uma classe q estende AWTEvent. Tipos que são exlusivos de componentes Swing  são declarados no pacote javax.swing.event

Origem do evento - componente GUI com qual o usuário interage. Ex TextFiel, JButton

Obj evento - encapsula inf sobre o evento que ocorreu, como uma ref a origem do evento e quaisquer informações especificas do evento q podem ser exigidas pelo ouvinte de eventos p tratar o evento. Event

Ouvinte de eventos - é um obj que é notificado pela origem de eventos qnd um evento ocorre.Handler

P cada tipo d obj de evento, há em geral uma interface ouvinte de eventos correspondente.Um ouvinte de evento p um evento GUI é um obj de uma classe que implementa uma ou mais das intefaces ouvintes de evento dos pacte java.awt.evento e javax.swing.event*/
