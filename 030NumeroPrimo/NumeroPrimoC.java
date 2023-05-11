import javax.swing.JOptionPane;

public class NumeroPrimoC {
	public static void main(String[] args){
		int num,totdiv,cont;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número, para saber se ele é primo: "));
		totdiv = 0;
		cont = 1;
		
		do{
			if(num % cont == 0) {
				totdiv += 1;
			}
			cont += 1;
		}while(cont <= num);
		
		if( totdiv > 2) {
			JOptionPane.showMessageDialog(null,"O número " + num + " NÃO É PRIMO!");
		}
		else {
			JOptionPane.showMessageDialog(null,"O número " + num + " É PRIMO!");
		}
	}
}