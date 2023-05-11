import javax.swing.JOptionPane;

public class Reverso100numerosB {
   public static void main(String[] args) {
		int num, cont;
		cont = 0;
		num = 100;
		while(cont <= 100){
			System.out.print(num + " ==> " );
			//System.out.println(num);
			//JOptionPane.showMessageDialog(null,"Número:" + num);
			num -= 1;
		} 
    }
}  