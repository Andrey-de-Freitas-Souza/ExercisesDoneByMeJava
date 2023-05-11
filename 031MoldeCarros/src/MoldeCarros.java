
public class MoldeCarros {
    //Criando atributos
    private String nomeDoCarro;
    private String quantidadePortas; 
   //Criando Métodos
    
    public void ligar(){
        System.out.printf("%s com %s portas ligado! \n",getnomeDoCarro(),getquantidadePortas());
    }
    public void desligar(){
        System.out.printf( "%s com %s portas desligado!\n",getnomeDoCarro(), getquantidadePortas());
    }
    public void acelerar(){
        for(int contador = 5; contador <5; contador++){
            System.out.println("vrrruuummm");
        }
    }
    
    //Criando os GETS E SETS
    public String getnomeDoCarro(){
        return nomeDoCarro;   
    }
    public void setnomeDoCarro(String nomeDoCarro){
        this.nomeDoCarro = nomeDoCarro;
    }
    
    public String getquantidadePortas(){
        return quantidadePortas;
    }
    public void setquantidadePortas(String quantidadePortas){
        this.quantidadePortas = quantidadePortas;
    }
}
