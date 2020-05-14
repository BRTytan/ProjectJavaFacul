package testapontos;
public class TestaPontos {
    public static void main(String[] args) {
        // TODO code application logic here
        Pontuacao player1 = new Pontuacao();
        player1.ganharPartida();
        player1.mostrarPontuacao();
        player1.empatarPartida();
        player1.mostrarPontuacao();
        player1.perderPartida();
        player1.mostrarPontuacao();
    }
    
}
