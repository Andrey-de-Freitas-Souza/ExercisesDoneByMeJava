
package ufc;

public class UFC {

    
    public static void main(String[] args) {
     Lutador l [] = new Lutador[6];
     l[0] = new Lutador("Conor McGregor","Irlanda", 33 , 1.75, 68.9,11,2,1);
     l[1] = new Lutador("Anderson Silva","Brasil", 46 , 1.88, 57.8,14,2,3);
     l[2] = new Lutador("Georges St-Pierre","Canadá", 40 , 1.78, 80.9,12,2,1);
     l[3] = new Lutador("Randy Couture"," Estados Unidos", 34 , 1.70, 81.6,13,0,2);
     l[4] = new Lutador("Brock Lesnar","Estados Unidos", 44 , 1.91, 119.3,5,4,3);
     l[5] = new Lutador("Ken Shamrock","França", 30 , 1.81, 105.7,12,2,4);
    
    Luta ufc1 = new Luta();
    ufc1.marcarLuta(l[0], l[1]);
    ufc1.lutar();
    l[0].status();
    l[1].status();
    
    }
    
}
