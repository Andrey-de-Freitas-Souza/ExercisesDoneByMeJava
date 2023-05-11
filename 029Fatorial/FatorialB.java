import javax.swing.JOptionPane;

public class FatorialB{
	public static void main(String[] args) {
		int fatorial, num, cont, soma,suc ;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber eu fatorial: "));
		fatorial = 0;
		suc = 1;
		
		for(cont = 1; cont < num; cont +=1) {
			fatorial = suc * (cont + 1);
			suc = fatorial;
		}	
			
			JOptionPane.showMessageDialog(null,"O fatorial de " + num + " é " + fatorial);	
	}
}