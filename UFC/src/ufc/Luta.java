
package ufc;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
            aprovada = true;
            desafiado = l1;
            desafiante = l2;            
        }
        else{
         aprovada = false;
         desafiado = null;
         desafiante = null;
        }
    }
    public void lutar(){
        if(aprovada){
            System.out.println("======Desafiado======");
            desafiado.apresentar();
            System.out.println("======Desafiante======");
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empatou");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome()+ " ganhou");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome()+ " ganhou");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                    
            }
        }
        else{
            System.out.println("Luta não pode acontecer");
        }
    }
}
