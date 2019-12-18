package layout3;

import javax.swing.JFrame;

public class GridLayoutDemo {

    public static void main(String[] args) {
        GridLayoutFrame gridLayoutFrame = new GridLayoutFrame();
        gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridLayoutFrame.setSize(300, 200);
        gridLayoutFrame.setVisible(true);
    }
} 
/*Cada componente na grade(linhas e colunas) tem a mesma largura e altura*/
