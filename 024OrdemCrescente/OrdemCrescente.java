import javax.swing.JOptionPane;

public class OrdemCrescente {
	public static void main (String[] args) {   
		int num1, num2, num3;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
		
		if(num1 < num2 && num2 < num3) {
			JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num1 + " ==> "+ num2 + " ==> " + num3 );
		}
		else {
			if (num1 > num2 && num2 > num3) {
				JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num3+ " ==> " + num2 + " ==> " + num1 );
			}
			if(num1 < num3  && num3< num2) {
				JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num1+ " ==> " + num3 + " ==> " + num2 );
			}
			if(num2 < num1 && num1< num3) {
				JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num2+ " ==> " + num1 + " ==> " + num3 );
			}
			if(num2 < num3 && num3 < num1) {
				JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num2 + " ==> " + num3 + " ==> " + num1 );
			}
			if(num3 < num1 && num1 < num2) {
				JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num3 + " ==> " + num1 + " ==> "+  num2 );
			}
			
		}
		
		
	}	
}