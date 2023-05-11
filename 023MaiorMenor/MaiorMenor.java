import javax.swing.JOptionPane;

public class MaiorMenor {
	public static void main (String[] args) {
		double num1, num2,maior;
		
		num1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(num1>num2) {
			maior = num1 ;
		}
		else {
			maior = num2 ;
		}
		
		JOptionPane.showMessageDialog(null," O maior número é " + maior);
	}	
}
		