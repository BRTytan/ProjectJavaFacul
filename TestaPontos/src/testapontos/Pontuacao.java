package testapontos;
public class Pontuacao {
        //Atributos
        int pontosGanhos;
    public void Pontuacao(){
        
    }
    public void ganharPartida(){
        pontosGanhos += 6;
        System.out.println("Você ganhou 6 pontos");
    }
    public void empatarPartida(){
        pontosGanhos += 3;
        System.out.println("Você empatou e ganhou 3 pontos");
    }
    public void perderPartida(){
        pontosGanhos += 0;
        System.out.println("Você perdeu e não ganhou pontos");
    }
    public void mostrarPontuacao(){
        System.out.println("Sua pontuação atual é: " + pontosGanhos);
    }
}