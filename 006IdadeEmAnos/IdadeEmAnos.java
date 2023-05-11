import javax.swing.JOptionPane;

public class IdadeEmAnos {
	public static void main (String[] args) { 
		double anos , dias ;
		anos = Double.parseDouble(JOptionPane.showInputDialog("Quantos anos você têm?")) ;
		dias = anos * 365 ;
	
	JOptionPane.showMessageDialog(null, anos + " são " + dias + " dias" );
	
	}
}