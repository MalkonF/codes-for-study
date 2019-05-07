package mouseevents2;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import javax.swing.JFrame;

public class MouseDetails {

    public static void main(String[] args) {
        MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
        mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseDetailsFrame.setSize(400, 150);
        mouseDetailsFrame.setVisible(true);
    }
}
/*Uma classe d adaptadores implementa uma interface e fornece uma implementação padrão d cada método na interface. Vc pode estender uma classe d adaptadores p herdar a implementação padrão e depois sobrescrever somente os métodos necessários.*/

 /*Qd uma classe implementa uma interface, a classe tem um relacionamento é um com essa interface. Portanto, um obj de uma classe que estender uma classe de adaptadores de evento é um obj do tipo ouvinte de eventos correspondente(por exemplo, um obj de uma subclasse de MouseAdapter é um MouseListener)*/
