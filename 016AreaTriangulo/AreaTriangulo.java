import javax.swing.JOptionPane;

public class AreaTriangulo {
	public static void main (String[] args) {
		double base, altura, area;
		
      base = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do tamanho da base?"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Qual é valor da altura do triangulo?"));
		
		area = (base * altura) / 2 ;
		
		JOptionPane.showMessageDialog(null,"A área do triãngulo é de: " + area);
	}
}