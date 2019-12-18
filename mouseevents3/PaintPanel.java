package mouseevents3;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {

    private final ArrayList<Point> points = new ArrayList<>();//armazena coordenadas x-y

    public PaintPanel() {

        addMouseMotionListener(
                new MouseMotionAdapter() // classe interna anônima
        {
            @Override
            public void mouseDragged(MouseEvent event) {
                points.add(event.getPoint());
                repaint();
            }
        }
        );
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Point point : points) {
            g.fillOval(point.x, point.y, 4, 4);//x e y var instância pública da classe Point
        }
    }
}
