import javax.swing.JOptionPane;

public class ValorCarro {
	public static void main (String[] args) {
	 double custofabrica, percentualdistribuidor, impostos, total;
	 custofabrica = Double.parseDouble(JOptionPane.showInputDialog("Qual o custo de fÃ¡brica do veÃ­culo?"));
	 percentualdistribuidor = (custofabrica/100) * 28;
	 impostos = (custofabrica/ 100) * 45;
	 total = custofabrica + percentualdistribuidor + impostos;
	
	JOptionPane.showMessageDialog(null, "o valor final do carro Ã© de: \n"  + total);
	}
}

