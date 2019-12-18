package colors;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(new Color(255, 0, 0));
        g.fillRect(15, 25, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 40);

        g.setColor(new Color(0.50f, 0.75f, 0.0f));
        g.fillRect(15, 50, 100, 20);
        g.drawString("Current RGB: " + g.getColor(), 130, 65);

        g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);//Os 2 primeiros valores representam a coordenada x sup esq e a coordenada y sup esq, os outros 2 arg são inteiros n negativos q representam a altura e a largura de um retângulo em pixels.
        g.drawString("Current RGB: " + g.getColor(), 130, 90);

        Color color = Color.MAGENTA;
        g.setColor(color);
        g.fillRect(15, 100, 100, 20);
        g.drawString("RGB values: " + color.getRed() + ", "
                + color.getGreen() + ", " + color.getBlue(), 130, 115);
    }
} 
/*Um contexto gráfico(paintComponent) permite desenhar na tela. Um objeto Graphics(classe abstrata Graphics g) gerencia um contexto gráfico e desenha pixels na tela que representam textos e outros objetos gráficos: linhas, ovais etc Ele que contém métodos para desenhar etc
Em Graphics g, g é uma ref a uma instancia da subclasse. É subclasse pq Graphics é abstrata então em diferentes s.o é implementado a sua maneira através de subclasses e só é disponibilizado interfaces(q n mudam) p gente usar.

Ao criar um app GUI uma das threads que compoe o programa é chamado de EDT(thread de despacho de evento).Qd um app GUI é executado, o conteiner de app chama o método paintComponent(na thread de despacho de evento) para cada componente leve a medida q a GUI é exibida. P q paintComponent possa ser chamado novamente, deve ocorrer um evento, como movimentar a janela.
P executar paintComponent sem q n ocorra nenhum evento, use repaint*/
