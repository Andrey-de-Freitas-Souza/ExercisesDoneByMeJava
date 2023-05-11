import javax.swing.JOptionPane;
public class AreaCirculo {
	public static void main (String[] args) {
		double raio, area;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do raio da circunferência? "));
		
		area = 3.14 * (raio * raio);
		
		JOptionPane.showMessageDialog(null, "A área da circunferência é: " + area);
		
	}
}