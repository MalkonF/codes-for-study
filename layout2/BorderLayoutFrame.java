package layout2;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
//a classe implementa ActionListener então BorderLayoutFrame que tratará dos eventos de JButtons, por essa razão  a referência this é passada p o método addActionListener

public class BorderLayoutFrame extends JFrame implements ActionListener {

    private final JButton[] buttons; // array of buttons to hide portions
    private static final String[] names = {"Hide North", "Hide South",
        "Hide East", "Hide West", "Hide Center"};
    private final BorderLayout layout;

    public BorderLayoutFrame() {
        super("BorderLayout Demo");

        layout = new BorderLayout(5, 5); // define o espaçamento de 5 px
        setLayout(layout);
        buttons = new JButton[names.length];

        for (int count = 0; count < names.length; count++) {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
        }
        //add os componentes em cada região
        add(buttons[0], BorderLayout.NORTH);
        add(buttons[1], BorderLayout.SOUTH);
        add(buttons[2], BorderLayout.EAST);
        add(buttons[3], BorderLayout.WEST);
        add(buttons[4], BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        for (JButton button : buttons) {
            if (event.getSource() == button) {
                button.setVisible(false);
            } else {
                button.setVisible(true);
            }
        }

        layout.layoutContainer(getContentPane());
    }
}
