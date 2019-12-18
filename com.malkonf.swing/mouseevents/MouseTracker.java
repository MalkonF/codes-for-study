package mouseevents;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import javax.swing.JFrame;

public class MouseTracker {

    public static void main(String[] args) {

        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(300, 100);
        mouseTrackerFrame.setVisible(true);
    }
}
/*A interface ouvinte MouseInputListener estende as interfaces MouseListener e MouseMotionListener p criar uma
única interface q contém tds os métodos das 2 interfaces citadas acima. Os métodos são chamados qnd o mouse
interage c um Component se obj listener de evento forem registrados para esse Component*/

/*MouseEvent q é a fonte contém info sobre o evento q ocorreu, incluindo as coordenadas x e y da 
sua localização. Essas coordenadas são medidas do canto superior esquerdo do componente GUI em q o evento 
ocorreu. As coordenadas x iniciam em 0 e aumentam da esq para dir. As coordenadas y iniciam em 0 e aumentam 
de cima para baixo.Os métodos e as constantes de classe InputEvent(superclasse de MouseEvent) 
permitem determinar o botão do mouse em q o usuário clicou*/

//A interface MouseWheelListener permite que app respondam a rotação da roda de um mouse.
