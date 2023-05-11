import javax.swing.JOptionPane;

public class Reverso100numerosA {
   public static void main(String[] args) {
		int num; 
		num = 100;
		for(int cont = 0; cont <= 100; cont += 1){
			System.out.print(num + " ==> " );
			//System.out.println(num);
			//JOptionPane.showMessageDialog(null,"Número:" + num);
			num -= 1;
		} 
    }
}  