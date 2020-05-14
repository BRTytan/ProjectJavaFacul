package testaautomovel;

public class TestaAutomovel {
    public static void main(String[] args) {
        // TODO code application logic here
        //Atributos
        boolean ligado,ligado1,ligado2;
        
        
        Automovel carro1 = new Automovel();
        Automovel carro2 = new Automovel();
        Automovel carro3 = new Automovel();
        
        carro1.Automovel();
        carro2.Automovel();
        carro3.Automovel();
        
        ligado = carro1.ligado;
        ligado1 = carro2.ligado;
        ligado2 = carro3.ligado;
        
        if(ligado == true){
            System.out.println("Carro1 Ligado");
        }else{
            System.out.println("Carro1 Desligado");
        }if(ligado1 == true){
            System.out.println("Carro2 Ligado");
        }else{
            System.out.println("Carro2 Desligado");
        }if(ligado2 == true){
            System.out.println("Carro3 Ligado");
        }else{
            System.out.println("Carro3 Desligado");
        }
    }
    
}
