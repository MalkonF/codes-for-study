package jlist;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame {

    private final JList<String> colorJList;
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
        "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    private static final Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
        Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};

    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames);
        colorJList.setVisibleRowCount(5);

        // n permite seleção múltipla
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // add um JScrollPane que contém um JList para JFrame. Isso dá a um JList a capacidade de rolagem
        add(new JScrollPane(colorJList));
        /*getContentPane retorna uma ref ao painel de conteudo do JFrame.
        Td JFrame é composto por 3 camadas: o fundo, o painel de conteúdo(onde os componenetes 
        GUI são exibidos. Ele oculta o fundo) e o painel transparente(p exibir dicas e 
        outras coisas que tem que estar na frente dos componentes GUI).*/
        colorJList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                getContentPane().setBackground(colors[colorJList.getSelectedIndex()]);
            }
        }
        );
    }
}
