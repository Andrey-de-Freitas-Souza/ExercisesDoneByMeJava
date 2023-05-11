import javax.swing.JOptionPane;

public class Quadradonumeros{
	public static void main(String [] args){
		int primeiro, segundo, terceiro, quarto, resultado;
		primeiro = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		segundo = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		terceiro = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
		quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número: "));
		resultado = (primeiro * primeiro) + (segundo * segundo) + (terceiro * terceiro) + ( quarto * quarto);
		
		JOptionPane.showMessageDialog(null,"A soma dos quadrados desses números é " + resultado);
	}
}