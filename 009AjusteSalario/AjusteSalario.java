import javax.swing.JOptionPane;

public class AjusteSalario {
	public static void main (String[] args){
		double salario, percentual, reajustado;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário atual? "));
		percentual = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de ajuste? "));
		reajustado = salario + ((salario/100) * percentual);
		
		JOptionPane.showMessageDialog(null, "O salário reajustado é: " + reajustado);
	}
}