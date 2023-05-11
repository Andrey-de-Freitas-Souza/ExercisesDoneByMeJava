
import javax.swing.JOptionPane;


public class TesteCarro {
    public static void main (String[] args){
        //Criando objetos
        MoldeCarros carro1 = new MoldeCarros();
        MoldeCarros carro2 = new MoldeCarros();
        //adicionando atributos ao primeiro objeto
        
        
        String EntradaNomeCarro1 = JOptionPane.showInputDialog("Qual o nome do primeiro carro? ");
        carro1.setnomeDoCarro(EntradaNomeCarro1);
        
        
        
        String EntradaPortasCarro1 = JOptionPane.showInputDialog("Quantas portas o primeiro carro têm?");
        carro1.setquantidadePortas(EntradaPortasCarro1);
        //adicionando atributos ao segundo objeto
        
        
        String Entrada2 = JOptionPane.showInputDialog("Qual o nome do segundo carro? ");
        carro2.setnomeDoCarro(Entrada2);
        String quantidadePortas2 = JOptionPane.showInputDialog("Quantas portas o segundo carro têm?");
        carro2.setquantidadePortas(quantidadePortas2);
        
        //utilizando os métodos do primeiro objeto
        carro1.ligar();
        carro1.acelerar();
        carro1.desligar();
        //utilizando os métodos do segundo objeto
        carro2.ligar();
        carro2.desligar();        
    }
    
}
