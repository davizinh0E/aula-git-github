import javax.swing.JOptionPane;
//edited
public class Main {
    public static void main(String args[]){
        String entrada;
        int numero1, numero2, soma;
        entrada = JOptionPane.showInputDialog("Digite o número: ");
       // Converte a entrada para inteiro e armazena em numero1
        numero1 = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog("Digite o número: ");
        // Converte a entrada para inteiro e armazena em numero2
       numero2 = Integer.parseInt(entrada);
       soma = numero1 + numero2;
       JOptionPane.showMessageDialog(null, "A soma é: " + soma);
       System.exit(0);
    }
}
