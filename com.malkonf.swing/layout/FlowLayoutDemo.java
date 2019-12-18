package layout;

import javax.swing.JFrame;

public class FlowLayoutDemo {

    public static void main(String[] args) {
        
        FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
        flowLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flowLayoutFrame.setSize(300, 75);
        flowLayoutFrame.setVisible(true);
    }
}
/*Há 3 maneiras de de organizar os componentes em uma GUI:
Posicionamento absoluto - Configurando o layout de um Container como null, vc pode especificar a posição 
absoluta dos componentes e o tamanho.
Gerenciadores de layout -  n pode definir tamanho e posicionamento preciso dos componentes
Gerador de cód IDE - 

Gerenciadores de layout 

FlowLayout - alinha os componentes da esquerda p direita na ordem que foram add

BorderLayout - organiza os componentes em 5 áreas: NORTH, SOUTH, EAST, WEST e  CENTER

GridLayout - Organiza os componentes em linhas e colunas */
