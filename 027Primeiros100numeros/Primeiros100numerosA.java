import javax.swing.JOptionPane;

public class Primeiros100numerosA {
   public static void main(String[] args) {
		int num; 
		num = 0;
		for(int cont = 0; cont <= 100; cont += 10){
		   JOptionPane.showMessageDialog(null,"Número: " + num);
         num += 1;	
		} 
      
    }
}  
	

     