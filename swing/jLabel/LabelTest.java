package swing.jLabel;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import javax.swing.JFrame;

public class LabelTest {

    public static void main(String[] args) {
        LabelFrame labelFrame = new LabelFrame();
        labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//por padrão qd clica no x, a janela é ocultada. P fechar deve se especificar
        labelFrame.setSize(260, 180);
        labelFrame.setVisible(true);
    }
}
/*A classe Component(pct awt) é uma superclasse q declara os recursos comuns dos componentes GUI dos pcts java.awt e javax.swing. Qlqr obj que é um Container pode ser usado p organizar Componentes anexando os Components ao Container. Containers podem ser colocados em outros Containers apra organizar uma GUI.
A classe JComponent é uma subclasse de Container. JComponent é a superclasse de tds os componentes leves de Swing e declara seus atributos e comportamentos comuns. 

Object - Component - Container - JComponent*/
