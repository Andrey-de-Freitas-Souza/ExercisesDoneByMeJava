import javax.swing.JOptionPane;

public class TotalDeEleitoresB {
	public static void main (String[] args) {
		double totalnum, brancos, nulos, validos, pb, pn, pv ; 
		
		brancos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram brancos? "));
		nulos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram nulos? "));
		validos = Double.parseDouble(JOptionPane.showInputDialog("Quantos votos foram validos? "));
		
		totalnum = brancos + nulos + validos ;
		pb = (brancos * 100) / totalnum ;
		pn = (nulos * 100) / totalnum;
		pv = (validos * 100) / totalnum;
		
		JOptionPane.showMessageDialog(null,"O total de votos foi: " + totalnum);
		JOptionPane.showMessageDialog(null,"O percentual de votos Brancos foi de: " + pb + "%");
		JOptionPane.showMessageDialog(null,"O percentual de votos nulos foi de: " + pn + "%");
		JOptionPane.showMessageDialog(null,"O percentual de votos válidos foi de: " + pv + "%");
	}
}