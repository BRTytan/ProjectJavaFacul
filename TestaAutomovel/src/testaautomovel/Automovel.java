package testaautomovel;

import javax.swing.JOptionPane;

public class Automovel {
    //Atributos
    String placa, cor, combustivel, renavam, chassi;
    int nrPortas, nrMarchas, velocidade;
    long quilometragem;
    boolean ligado;
    //Metodos
    public void Automovel(){
        /*placa = JOptionPane.showInputDialog("Placa: ",placa);
        cor = JOptionPane.showInputDialog("Cor: ",cor);
        combustivel = JOptionPane.showInputDialog("Combustivel",combustivel);
        renavam = JOptionPane.showInputDialog("Renavam: ",renavam);
        chassi = JOptionPane.showInputDialog("Chassi: ", chassi);
        */
        ligado = Boolean.valueOf(JOptionPane.showInputDialog("Ligar ou Desligar carro: "));
    }
    public boolean ligaDesliga(){
        return ligado;
    }
}
