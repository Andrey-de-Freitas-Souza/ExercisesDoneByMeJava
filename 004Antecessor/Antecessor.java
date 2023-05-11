import javax.swing.JOptionPane;

public class Antecessor{
	public static void main (String[] args) {
		int numero, antecessor;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber seu antecessor: "));
		antecessor = numero - 1 ;
	
	JOptionPane.showMessageDialog(null, "O antecessor de "+ numero + " é "+ antecessor);
	
	}
	

}

