package lambda;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame {

    private final JComboBox<String> imagesJComboBox;
    private final JLabel label;

    private static final String[] names = {"bug1.GIF", "bug2.GIF", "travelbug.gif", "buganim.gif"};
    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))};

    // ComboBoxFrame constructor adiciona JComboBox p JFrame
    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox<String>(names);
        imagesJComboBox.setMaximumRowCount(3); // mostra 3

        add(imagesJComboBox); // add combobox p JFrame
        label = new JLabel(icons[0]);
        add(label); // add label p JFrame
        imagesJComboBox.addItemListener(event -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
            }
        }); // end call to addItemListener
    }
}
/*Interfaces funcionais são interfaces onde se tem um único método abstrato que também pode conter 
métodos default e static. 

Interfaces funcionais são usados na programação funcional porque agem como um modelo orientado a 
objetos para uma função. 

A programação funcional é realizada com expressões Lambdas. Uma expressão lambda representa um método
anônimo. O tipo de uma expressão lambda é o tipo da interface funcional que a expressão lambda 
implementa. Essas expressões lambdas podem ser usadas em qualquer lugar em que interfaces funcionais
são esperadas.

As interfaces funcionais podem ter somente um método abstrato porque quando você usa uma expressão
lambda no lugar que ela é esperada a expressão lambda vai ser designada para realizar uma 
só tarefa. De acordo com o método. 

Uma expressão lambda consiste em uma lista de parâmetros seguida pelo símbolo de seta(->) e um corpo 
após o ->.


 */
