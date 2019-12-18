
import javax.swing.JOptionPane;

public class Dialog1 {

    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String num2 = JOptionPane.showInputDialog("Digite o segundo número:");
        
        int result = Integer.parseInt(num1) + Integer.parseInt(num2);
        String mensagem = String.format("O resultado é: %d", result);
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
