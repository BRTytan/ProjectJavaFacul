package testapessoa;

import javax.swing.JOptionPane;

public class Pessoa {
    //Atributos
    String rg, cpf, nome, endereco, celular, email;
    double altura, peso;
    char sexo; 
    int idade;
    
    public Pessoa(){
        rg = JOptionPane.showInputDialog("RG: ", rg);
        cpf = JOptionPane.showInputDialog("CPF: ", cpf);
        nome = JOptionPane.showInputDialog("Nome: ", nome);
        endereco = JOptionPane.showInputDialog("Endereço: ", endereco);
        celular = JOptionPane.showInputDialog("Celular: ", celular);
        email = JOptionPane.showInputDialog("Email: ", email);
        altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: ", altura));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: ", peso));
        sexo = JOptionPane.showInputDialog("Sexo [M] ou [F]: ", sexo).toUpperCase().charAt(0);
        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: ", idade));
    }
    public String toString(){
            return "Sexo: "+ this.sexo;
	}
}
