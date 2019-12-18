package jtextarea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame {

    private final JTextArea textArea1;
    private final JTextArea textArea2;
    private final JButton copyJButton;

    public TextAreaFrame() {
        super("TextArea Demo");
        Box box = Box.createHorizontalBox();
        String demo = "This is a demo string to\n"
                + "illustrate copying text\nfrom one textarea to \n"
                + "another textarea using an\nexternal event\n";

        textArea1 = new JTextArea(demo, 10, 15);//10 linhas e 15 colunas
        //textArea1.setLineWrap(true); //quebra de linha automática
        box.add(new JScrollPane(textArea1)); // add scrollpane p JTextArea ter barra de rolagem

        copyJButton = new JButton("Copy >>>");
        box.add(copyJButton);
        copyJButton.addActionListener(new ActionListener() {
            // retorna o texto selecionado em textArea1 e seta para textArea2
            @Override
            public void actionPerformed(ActionEvent event) {
                textArea2.setText(textArea1.getSelectedText());
            }
        } // fim da classe interna anônima
        ); // fim para a chamada de addActionListener

        textArea2 = new JTextArea(10, 15);
        textArea2.setEditable(false);
        box.add(new JScrollPane(textArea2));

        add(box); // add box p frame
    }
}
/*Por padrão JScrollPane só exibe barras de rolagem se elas forem necessárias. Para modificar pode ser usado
os métodos:

setHorizontalScrollBarPolicy
setVerticalScrollBarPolicy

com as constantes:

VERTICAL_SCROLLBAR_ALWAYS
HORIZONTAL_SCROLLBAR_ALWAYS

VERTICAL_SCROLLBAR_AS_NEEDED
HORIZONTAL_SCROLLBAR_AS_NEEDED

VERTICAL_SCROLLBAR_NEVER
HORIZONTAL_SCROLLBAR_NEVER
 */
