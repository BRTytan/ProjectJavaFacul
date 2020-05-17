package testaautomovel;

import javax.swing.JOptionPane;

public class Automovel {
    //Atributos
    String nome, placa, cor, combustivel, renavam, chassi;
    int nrPortas, nrMarchas, velocidade;
    long quilometragem;
    boolean ligado;
    //Metodos
    public void Automovel(String nome, String placa, String cor, String combustivel, String renavam, String chassi, boolean ligado){
        System.out.print("Nome: " + nome);
        System.out.print(" PLACA: " + placa);
        System.out.print(" COR: " + cor);
        System.out.print(" TIPO/COMBUSTIVEL: " + combustivel);
        System.out.print(" RENAVAM: " + renavam);
        System.out.print(" CHASSI: " + chassi);
        System.out.println(" CARRO " + ligado);
        
        if(ligado == true){
            System.out.println(nome + " Está ligado");
            System.out.println("------------------------------------");
        }else{
            System.out.println(nome + " Está desligado");
            System.out.println("------------------------------------");
        }
    }
    public void ligaDesliga(){
        ligado = Boolean.valueOf(JOptionPane.showInputDialog("Ligar(true) ou Desligar(false)", ligado));
        System.out.print(ligado);
    }
}