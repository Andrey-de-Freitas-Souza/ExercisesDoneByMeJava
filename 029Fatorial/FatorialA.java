import javax.swing.JOptionPane;

public class FatorialA{
	public static void main(String[] args) {
		int fatorial, num, cont, soma,suc ;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber eu fatorial: "));
		cont = 1;
		fatorial = 0;
		suc = 1;
		while(cont < num) {
			fatorial = suc * (cont + 1);
			suc = fatorial;
			cont += 1;
		}	
			
			
			JOptionPane.showMessageDialog(null,"O fatorial de " + num + " é " + fatorial);
	
	
	
	}
}