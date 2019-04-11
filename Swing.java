
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing {

    public static void main(String[] args) {

        JFrame window = new JFrame(); //usando JFrame sem estender
        window.setVisible(true);
        window.setSize(800, 600);
        window.setTitle("My Window");

        JLabel label = new JLabel();
        label.setText("My label");

        window.add(label);

    }

}
