package jlist2;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {

    private final JList<String> colorJList;
    private final JList<String> copyJList;
    private JButton copyJButton;
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
        "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};

    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList));

        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                /* configura os itens exibidos em copyJList. getSelectedVa..retorna uma lista representando os
                itens selecionados em colorJList. O método toArray converte a lista em array de Strings q pode
                ser passado como arg p o método setListData. new String representa o tipo de array que o 
                método retornará*/
                copyJList.setListData(colorJList.getSelectedValuesList().toArray(new String[0]));
            }
        }
        );

        add(copyJButton);

        copyJList = new JList<String>();/*copyJList pode ser usado antes de ser instanciado pq o método 
        actionPerformed n executa até que o usuario pressione o copyJButton, o que só pode acontecer depois que
        o contrutor for executado. Nesse ponto todo o aplicativo já foi executado.*/
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100); // configura altura e largura pq se um JList n contiver itens ele n será exibido
        copyJList.setFixedCellHeight(15);
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList)); // add list with scrollpane
    }
}
