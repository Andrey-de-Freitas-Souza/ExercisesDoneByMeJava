import javax.swing.JOptionPane;

public class ConversaoDolar{
	public static void main(String [] args){
		double cotacaoDolar, quantidadolar, resultado;
		cotacaoDolar = Double.parseDouble(JOptionPane.showInputDialog("Qual a cotação do dolar :"));
		quantidadolar = Double.parseDouble(JOptionPane.showInputDialog("quantos dólares serão convertidos?"));
		
		resultado = quantidadolar * cotacaoDolar;
		
		JOptionPane.showMessageDialog(null,"Voce tem R$ " + resultado);
	
		
	}
	
	
}