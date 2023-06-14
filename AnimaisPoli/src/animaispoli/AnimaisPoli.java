
package animaispoli;

public class AnimaisPoli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cachorro theo = new Cachorro();
        theo.reagir("Olá");
        theo.reagir("Vai Apanhar");
        theo.reagir(11,45);
        theo.reagir(21,00);
        theo.reagir(true);
        theo.reagir(false);
        theo.reagir(2,12.5f);
        theo.reagir(17, 4.5f);
        
    }
    
}
