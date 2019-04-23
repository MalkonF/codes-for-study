package swing;
/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
import javax.swing.JOptionPane;

public class Addition {

    public static void main(String[] args) {
        String firstNumber
                = JOptionPane.showInputDialog("Enter first integer");
        String secondNumber
                = JOptionPane.showInputDialog("Enter second integer");

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int sum = number1 + number2;

        JOptionPane.showMessageDialog(null, "The sum is " + sum,
                "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
        //primeiro arg diz onde posicionar a cx diálogo em relação a janela pai. Null diz p posicionar no centro. 2 arg é a msg. 3 é o título da janela. 4 é o tipo de cx de diálogo exibir
    }
}

/*Existem 3 maneiras de ativas o nimbus:

Padrão p todos app - crie um arquivo de texto chamado de swing.properties na pasta lib de instalação do JDK, JRE, e uma pasta JRE dentro da JDK com o seguinte conteúdo:
swing.defaultlaf=com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel

Somente para certos app - execute com: -Dswing.defaultlaf=com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel*/