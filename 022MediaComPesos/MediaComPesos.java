import  javax.swing.JOptionPane;

public class MediaComPesos {
	public static void main (String[] args) {
		double trabalholab, avaliacao,exame, media;
		
		trabalholab = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a nota do aluno no trabalho de laboratório?"));
		avaliacao = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a nota do aluno na avaliação semestral?"));
		exame = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a nota do aluno no exame final?"));
		
		media = ((trabalholab * 2) + (avaliacao * 3) + (exame * 5)) / 10 ;
		
		JOptionPane.showMessageDialog(null,"A média do aluno foi: " + media );
	}
}	