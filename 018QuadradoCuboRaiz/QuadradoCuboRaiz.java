import javax.swing.JOptionPane;

public class QuadradoCuboRaiz {
	public static void main ( String[] args) { 
		double num, quadrado, cubo, raiz ; 
			num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para saber, \n seu quadrado, cubo e raiz quadrada! "));
			
			quadrado = num * num;
			cubo = num * num * num;
			raiz = num * (1/2);
			
			JOptionPane.showMessageDialog(null, "O quadrado de " + num + " é: " + quadrado);
			JOptionPane.showMessageDialog(null, "O cubo de " + num + " é: " + cubo);
			JOptionPane.showMessageDialog(null, "A raiz quadrada de " + num + " é: " + raiz);
	}
}