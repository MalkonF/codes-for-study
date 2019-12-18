package keyboard;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {

    private String line1 = "";
    private String line2 = "";
    private String line3 = "";
    private JTextArea textArea;

    public KeyDemoFrame() {
        super("Demonstrating Keystroke Events");

        textArea = new JTextArea(10, 15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        add(textArea);

        addKeyListener(this); // registra a classe p tratar seus próprios eventos
    }

    @Override
    public void keyPressed(KeyEvent event) {
        line1 = String.format("Key pressed: %s",
                KeyEvent.getKeyText(event.getKeyCode())); // getKeyCode retorna o código da tecla e getKeyText o nome da tecla de acordo com o código
        setLines2and3(event);
    }

    // chamado qnd a tecla é liberada
    @Override
    public void keyReleased(KeyEvent event) {
        line1 = String.format("Key released: %s",
                KeyEvent.getKeyText(event.getKeyCode()));
        setLines2and3(event);
    }

    // é chamado qnd precisamos qlqr tecla q n seja uma tecla de ação
    @Override
    public void keyTyped(KeyEvent event) {
        line1 = String.format("Key typed: %s", event.getKeyChar());//mostra código  unicode do caractere digitado
        setLines2and3(event);
    }

    private void setLines2and3(KeyEvent event) {
        line2 = String.format("This key is %san action key",
                (event.isActionKey() ? "" : "not "));

        String temp = KeyEvent.getKeyModifiersText(event.getModifiers());//verifica se foi pressionada alguma tecla modificadora(alt, shift e ctrl)

        line3 = String.format("Modifier keys pressed: %s",
                (temp.equals("") ? "none" : temp));

        textArea.setText(String.format("%s\n%s\n%s\n",
                line1, line2, line3));
    }
}
