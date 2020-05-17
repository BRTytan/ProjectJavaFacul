package testapessoa;

import javax.swing.JOptionPane;

public class Pessoa {
    //Atributos
    String rg, cpf, nome, endereco, celular, email;
    double altura, peso;
    char sexo; 
    int idade;
    
    public Pessoa(String rg, String cpf, String nome, String endereco, String celular, String email, double altura, double peso, char sexo, int idade){
        System.out.print(" RG: " + rg);
        System.out.print(" CPF: " + cpf);
        System.out.println(" Nome: " + nome);
        System.out.print(" Endereço: " + endereco);
        System.out.print(" Celular: " + celular);
        System.out.print(" Email: " + email);
        System.out.print(" Altura: " + altura);
        System.out.print(" Peso: " + peso);
        System.out.print(" Sexo: " + sexo);
        System.out.println(" Idade: " + idade);
        System.out.println("-------------------------");
    }
}
