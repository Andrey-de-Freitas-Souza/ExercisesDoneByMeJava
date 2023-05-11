import javax.swing.JOptionPane;

public class DescontoDezPorCento {
	public static void main ( String[] args) { 
		int preco, ajustado; 
			preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto? "));
			
			ajustado = preco - ((preco/100) * 10); // poderia ser (preco/10)
			
			
			JOptionPane.showMessageDialog(null, "O valor do produto com 10% de desconto é: " + ajustado );
	}
}	