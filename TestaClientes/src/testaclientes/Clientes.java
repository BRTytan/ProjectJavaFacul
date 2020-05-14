package testaclientes;
import javax.swing.JOptionPane;
public class Clientes {
    //Atributos
    String nome, sobrenome;
    int idade;
    //Metodos

    public Clientes() {
        nome = JOptionPane.showInputDialog("Nome: ");
        sobrenome = JOptionPane.showInputDialog("Sobrenome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        JOptionPane.showMessageDialog(null, nome + " " + sobrenome);
        JOptionPane.showMessageDialog(null, idade);
    }
    public void Voar(){
        
    }
}
