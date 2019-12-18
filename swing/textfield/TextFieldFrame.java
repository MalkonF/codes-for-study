package swing.textfield;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame {

    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing JTextField and JPasswordField");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Enter text here");
        add(textField2);

        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);//mesmo JTextField n sendo editável ele pode gerar um evento
        add(textField3);

        passwordField = new JPasswordField("Hidden text");
        add(passwordField);

        // registra a rotina de tratamento de evento para cada um dos obj.
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);//recebe como arg um obj ActionListener, q pode ser qualquer classe que implemente ActionListener
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    // classe aninhadas internas. Um obj da classe interna deve ser criado por um obj da classe q contém a classe interna. Cada obj da classe interna tem implicitamente uma ref a um obj da classe d 1 nível. O obj da classe interna pode usar essa ref implícita p acessar diretamente tds as var e met da classe de 1 nível. Uma classe aninhada q é static n exige um obj de sua classe de primeiro nivel e n tem implicitamente uma ref a um obj da classe de 1 nivel
    //Cada evento é representado por uma classe e pode ser processado apenas pelo tipo de rotina d tratamento d evento apropriado. Qnd o enter é pressionado em um JTextField, ocorre um ActionEvent. Um evento assim é processado por um obj q implementa a interface ActionListener.O método actionPerformed especifica quais tarefas fazer qnd ocorrer um ActionEvent.
    //P sabermos qual obj gerou o evento, o sistema cria um obj ActionEvent único q contém inf únicas sobre o evento q acabou de ocorrer, como a origem do evento e o txt no campo do obj. O sistema passa esse obj p o método actionPerformed. O método getSource retorna uma ref a fonte do evento
    private class TextFieldHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {//qnd tecla enter p método é chamado
            String string = "";
            if (event.getSource() == textField1) {//textField1 é a origem do evento?
                string = String.format("textField1: %s",
                        event.getActionCommand());//obtém o texto que o user digitou no campo do textField
            } else if (event.getSource() == textField2) {
                string = String.format("textField2: %s",
                        event.getActionCommand());
            } else if (event.getSource() == textField3) {
                string = String.format("textField3: %s",
                        event.getActionCommand());
            } else if (event.getSource() == passwordField) {
                string = String.format("passwordField: %s",
                        event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, string);
        }
    }
}

/*Rotina de tratamento de evento - cód q realiza uma tarefa em resposta a um evento. Crie uma classe q representa a rotina d tratamento de evento e implementa uma interface apropriada
Tratamento de evento - como vai responder ao evento. Indique q um obj da classe deve ser notificado qnd o evento ocorre.

 */
