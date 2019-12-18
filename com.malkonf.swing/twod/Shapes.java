package twod;

import javax.swing.JFrame;

public class Shapes {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Drawing 2D shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ShapesJPanel shapesJPanel = new ShapesJPanel();
        frame.add(shapesJPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);
    }
}
/*O nome Arc2D.Double. Essa classe representa uma forma com as dimensões especificadas em double. 
Double nesse caso é uma classe public static aninhada da classe especificada a esquerda do ponto.*/