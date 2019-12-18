package twod2;
/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import java.awt.Color;
import javax.swing.JFrame;

public class Shapes2
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Drawing 2D Shapes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      Shapes2JPanel shapes2JPanel = new Shapes2JPanel(); 
      frame.add(shapes2JPanel); 
      frame.setBackground(Color.WHITE);
      frame.setSize(315, 330);
      frame.setVisible(true);
   } 
} 