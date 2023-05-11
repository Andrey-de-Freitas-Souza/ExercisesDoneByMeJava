import  javax.swing.JOptionPane;

public class AumentoSalario {
	public static void main (String[] args) {
		double salario, percentual, aumento, ajustado;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do sálario do funcionário?"));
		percentual = Double.parseDouble(JOptionPane.showInputDialog("Qual será o pecentual de aumento?"));
		
		aumento = (salario / 100) * percentual;
		ajustado = salario + aumento;
		
		JOptionPane.showMessageDialog(null,"O funcionário vai receber R$" + aumento + " de aumento \n sendo assim o salário vai ser de R$" + ajustado);
	}
}