import javax.swing.JOptionPane;

public class SalarioImpostosGratificacao {
	public static void main ( String[] args) { 
		double salariobase, salariofinal;
		
		salariobase = Double.parseDouble(JOptionPane.showInputDialog("Qual o sálario base do funcionário?"));
		
		salariofinal = (salariobase + ((salariobase/100) * 5)) - ((salariobase/100) * 7);
		
		JOptionPane.showMessageDialog(null,"O salário final que o funcionário vai receber \n após gratificação e impostos é de: \n" + salariofinal);
	}
}	