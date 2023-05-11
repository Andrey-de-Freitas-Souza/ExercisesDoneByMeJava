import javax.swing.JOptionPane;

public class Primeiros100numerosC { 
	public static void main (String[] args){
		int  num, cont;
		cont = 0;
		num = 0;
		
		do { 
			System.out.print(num + " ==> " ); 
		 	num += 1;
		   cont += 1;
		} while(cont == -1);
	}
}