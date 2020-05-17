package testaautomovel;

public class TestaAutomovel {
    public static void main(String[] args) {
        // TODO code application logic here
        Automovel carro1 = new Automovel();
        Automovel carro2 = new Automovel();
        Automovel carro3 = new Automovel();
        
        carro1.Automovel("FIAT","FFJ4045", "PRETO", "ALCOOL", "123456", "DHJIL", true);
        carro2.Automovel("GOL","FFJ4045", "AZUL", "GASOLINA", "123456", "DHJIL", false);
        carro3.Automovel("AUDI","FFJ4045", "PRETO", "ALCOOL", "123456", "DHJIL", true);
        
        carro1.ligaDesliga();
    }
}
