package testatelefone;

import javax.swing.JOptionPane;

public class TestaTelefone {
    public static void main(String[] args) {
        // TODO code application logic here
        //Objetos
        Telefone conta1 = new Telefone();
        //Atributos
        int numeroMinutos;
        double preco;
        preco = Double.valueOf(JOptionPane.showInputDialog("Preço por minuto ",conta1.preco));
        numeroMinutos = Integer.valueOf(JOptionPane.showInputDialog("Quantos minutos ",conta1.numeroMinutos));
        
        conta1.duracaoLigacao(numeroMinutos);
        System.out.println(numeroMinutos);
        conta1.alterarPreco(preco);
        System.out.println(preco);
        conta1.mostrarConta();   
    }
}
