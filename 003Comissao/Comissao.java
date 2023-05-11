import javax.swing.JOptionPane;

public class Comissao{
	public static void main (String[] args ) {
		double precopeca, quantidadepeca, resultado;
		precopeca = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço da peça?"));
		quantidadepeca = Double.parseDouble(JOptionPane.showInputDialog("Quantas peças foram vendidas?"));
		
		resultado = ((precopeca * quantidadepeca)/100) * 5;
		
		JOptionPane.showMessageDialog(null, "A comissão será de R$ "+ resultado);
	}

}

