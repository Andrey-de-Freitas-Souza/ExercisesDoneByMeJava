import javax.swing.JOptionPane ;

public class SalarioConsessionaria {
	public static void main(String[] args) {
		double carrosvendidos, valorvendas, fixo, valorporcarro, salariototal ;
		carrosvendidos = Double.parseDouble(JOptionPane.showInputDialog("Quantos carros o funcionário vendeu? "));
		valorvendas = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o valor total das vendas desse funcionário? "));
		fixo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do salário fixo desse funcionário? "));
		valorporcarro = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor que esse funcionário ganha por carro vendido? "));
		
		salariototal = fixo + (carrosvendidos * valorporcarro) + ((valorvendas/100) * 5);
	
		JOptionPane.showMessageDialog(null, "O valor final do salário desse funcionário é de: \n" + salariototal);
	}
}