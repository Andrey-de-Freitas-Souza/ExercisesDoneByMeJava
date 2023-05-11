import javax.swing.JOptionPane;

public class Media {
	public static void main (String[] args) {
		double n1, n2, n3, media;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a primeria nota?"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a segunda nota?"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a terceira nota?"));
		
		media = (n1 + n2 + n3) / 3 ;
		
		JOptionPane.showMessageDialog(null ,"A média aritmética dessas notas é: " + media);
	}
}