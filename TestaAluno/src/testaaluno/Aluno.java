package testaaluno;

import javax.swing.JOptionPane;

public class Aluno {

//Atributos
    String ra, nome, curso;

    Aluno() {
        ra = JOptionPane.showInputDialog("R.A.: ", ra);
        nome = JOptionPane.showInputDialog("Nome: ", nome);
        curso = JOptionPane.showInputDialog("Curso: ", curso);
    }
    
}
