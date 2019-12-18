package layout2;

import javax.swing.JFrame;

public class BorderLayoutDemo {

    public static void main(String[] args) {
        
        BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300, 200);
        borderLayoutFrame.setVisible(true);
    }
} 

/*Um BordeLayout limita um Container a conter no max 5 componentes, um em cada região(NORTH, SOUTH ...). 
O componente colocado em cada região pode ser um Container ao qual outros componentes são anexados. 
NORTH e SOUTH estendem horizontalmente toda a região e EAST e WEST expandem verticalmente toda a região. 
CENTER  expande p preencher todo o espaço restante no layout.*/
