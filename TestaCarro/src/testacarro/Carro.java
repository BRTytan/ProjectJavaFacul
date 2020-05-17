package testacarro;
public class Carro {
    double velocidade;
    public Carro(){
    }
    public void acelerar(){
        velocidade = velocidade + 10;
        System.out.println("Acelera o carro em 10Km/h");
    }
    public void freiar(){
        velocidade = velocidade - 10;
        System.out.println("Reduz a velocidade do carro em 10Km/h");
    }
    public void mostrarVelocidade(){
        System.out.println("Velocidade atual: " + velocidade + "Km/h");
    }
}