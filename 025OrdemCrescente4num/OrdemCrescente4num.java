import javax.swing.JOptionPane;

public class OrdemCrescente4num {
	public static void main (String[] args) {   
		int num1, num2, num3,num4;
		
		JOptionPane.showMessageDialog(null,"Digite 3 número em ordem crescente \n e um quarto fora da ordem crescente !");
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
		num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número: \n (Fora da ordem crescente)"));
		
		if(num4 < num1) {
			JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num4 + " ==> "+ num1 + " ==> " + num2  + " ==> " + num3);
		}
		else {
			if (num4 < num2 && num4 > num1) {
				JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num1+ " ==> " + num4 + " ==> " + num2 + " ==> " + num3 );
			}
			if(num4 < num3  && num4 > num2) {
				JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num1+ " ==> " + num2 + " ==> " + num4 + " ==> " + num3);
			}
			if(num4 > num3 ) {
				JOptionPane.showMessageDialog(null,"A ordem crescente desses números é: \n" + num1+ " ==> " + num2 + " ==> " + num3 + " ==> " + num4 );
			}
			
			
		}
			
	}	
}