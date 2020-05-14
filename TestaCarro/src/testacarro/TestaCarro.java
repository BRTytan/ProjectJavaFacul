package testacarro;
public class TestaCarro {
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carro1 = new Carro();
        carro1.acelerar();
        carro1.mostrarVelocidade();
        carro1.acelerar();
        carro1.mostrarVelocidade();
        carro1.acelerar();
        carro1.mostrarVelocidade();
        carro1.freiar();
        carro1.mostrarVelocidade();
    }
    
}
