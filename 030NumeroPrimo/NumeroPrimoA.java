import javax.swing.JOptionPane;

public class NumeroPrimoA{
	public static void main(String[] args){
		int num,totdiv;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número, para saber se ele é primo: "));
		totdiv = 0;
		
		for(int cont = 1; cont <= num; cont += 1) {
			if(num % cont == 0) {
				totdiv += 1;
			}
		}
		
		if( totdiv > 2) {
			JOptionPane.showMessageDialog(null,"O número " + num + " NÃO É PRIMO!");
		}
		else {
			JOptionPane.showMessageDialog(null,"O número " + num + " É PRIMO!");
		}
	}
}