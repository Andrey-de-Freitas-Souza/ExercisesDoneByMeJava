import javax.swing.JOptionPane;

public class PesoIdeal {
	public static void main (String[] args) {
		double altura,  imc, Pesoideal ;
		
		 String sexo = JOptionPane.showInputDialog("qual o seu sexo? \n (1 para masculino e 2 para feminino)");
		 altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura?"));
		
			if (sexo.equals("m")) {
				Pesoideal  = (72.7 * altura) - 58;
				}
			else {
				Pesoideal  = (62.1 * altura) - 44.7;
			}
		JOptionPane.showMessageDialog(null,"Seu peso ideal é de " + Pesoideal);
	}
}
