import javax.swing.JOptionPane ;

public class IdadeEmAnosMeses {
	public static void main (String[] args) {
		int anos, meses, dias, totaldias ;
		
		JOptionPane.showMessageDialog(null, "Informe quantos anos, meses e dias você tem !");
		
		anos = Integer.parseInt(JOptionPane.showInputDialog("anos: ")) ;
		meses = Integer.parseInt(JOptionPane.showInputDialog("meses: ")) ;
		dias = Integer.parseInt(JOptionPane.showInputDialog("dias: ")) ;
		totaldias = (anos * 365) + (meses * 30) + dias ; 
		
		JOptionPane.showMessageDialog(null, "a sua idade em dias é : " + totaldias) ;
	}
}