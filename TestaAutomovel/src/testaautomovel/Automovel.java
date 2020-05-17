package testaautomovel;

public class Automovel {
    //Atributos
    String placa, cor, combustivel, renavam, chassi;
    int nrPortas, nrMarchas, velocidade;
    long quilometragem;
    boolean ligado;
    //Metodos
    public void Automovel(String nome, String placa, String cor, String combustivel, String renavam, String chassi, boolean ligado){
        System.out.print(" PLACA: " + placa);
        System.out.print(" COR: " + cor);
        System.out.print(" TIPO/COMBUSTIVEL: " + combustivel);
        System.out.print(" RENAVAM: " + renavam);
        System.out.print(" CHASSI: " + chassi);
        System.out.println(" CARRO " + ligado);
        System.out.println("------------------------------------");
        
        if(ligado == true){
            System.out.println(nome + " Ligado");
        }else{
            System.out.println(nome +" Desligado");
        }
    }
    public boolean ligaDesliga(){
        return ligado;
    }
}
