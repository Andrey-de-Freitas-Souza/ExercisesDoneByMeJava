import javax.swing.JOptionPane;

public class FatorialC{
	public static void main(String[] args) {
		int fatorial, num, cont, soma,suc ;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber eu fatorial: "));
		fatorial = 0;
		suc = 1;
		cont = 1;
		
		do {
			fatorial = suc * (cont + 1);
			suc = fatorial;
			cont += 1;
		}while(cont < num);	
			
			JOptionPane.showMessageDialog(null,"O fatorial de " + num + " é " + fatorial);	
	}
}