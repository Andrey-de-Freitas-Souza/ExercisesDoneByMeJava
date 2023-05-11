import javax.swing.JOptionPane;

public class ParOuImpar {
	public static void main (String[] args) {
		int numero, resultado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para \n saber se ele é par ou impar:"));
		resultado = numero % 2 ;
		
		if (resultado == 0) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é par");
		}
		else {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar");
		}
	}	
}