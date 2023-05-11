import javax.swing.JOptionPane;

public class Reverso100numerosC {
   public static void main(String[] args) {
		int num, cont;
		cont = 0;
		num = 100;
		do{
			System.out.print(num + " ==> " );
			//System.out.println(num);
			//JOptionPane.showMessageDialog(null,"Número:" + num);
			num -= 1;
			cont += 1;
		} while(cont <= 100);
    }
}  