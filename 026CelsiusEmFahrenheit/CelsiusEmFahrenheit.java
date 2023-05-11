import javax.swing.JOptionPane;

public class CelsiusEmFahrenheit {
	public static void main (String[] args) {   
		double celsius, fahrenheit;
		
		celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus celsius,\n para sabe-la em fahrenheit:"));
		fahrenheit =  celsius * (9.0/5.0) + 32;
		
		JOptionPane.showMessageDialog(null, celsius + " graus celsius, são " + fahrenheit + " fahrenheits");
	}
}
