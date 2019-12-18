package jcombobox;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
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

    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox<String>(names); //mostra a lista cb com os nomes
        imagesJComboBox.setMaximumRowCount(3); // número máx de itens que cb vai exibir

        imagesJComboBox.addItemListener(
                new ItemListener() /*classe interna anônima - classe que é declarada sem o nome e que 
                aparece dentro de um método. Uma classe interna anônima declarada em um método pode acessar as
                var de instância e métodos do obj de classe de primeiro nível, bem como as var locais do método.*/ {

            @Override
            public void itemStateChanged(ItemEvent event) {
                // determine whether item selected
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);//retorna em inteiro o index correspondente
                }
            }
        } // fim da classe anônima
        ); // fim da chamada p addItemListener

        add(imagesJComboBox);
        label = new JLabel(icons[0]); // exibe primeiro ícone
        add(label);
    }
}
