import javax.swing.JOptionPane;

public class AreaRetangulo{
	public static void main (String[] args){
		double base, altura, area ;
		base = Double.parseDouble(JOptionPane.showInputDialog("Qual a base do retângulo? "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura do retângulo? "));
		area = base * altura ;
	
	JOptionPane.showMessageDialog(null,"A área do retângulo é : " + area );
	
	}
}