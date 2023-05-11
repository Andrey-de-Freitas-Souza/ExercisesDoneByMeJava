import javax.swing.JOptionPane;

public class SomaInt {
	public static void main (String[] args) {
		double n1, n2, n3,soma;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro:"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro:"));
		n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro valor inteiro:"));
		
		soma = n1 + n2 + n3;
		JOptionPane.showMessageDialog(null ,"A soma dos três números inteiros é : " + soma);
	}
}