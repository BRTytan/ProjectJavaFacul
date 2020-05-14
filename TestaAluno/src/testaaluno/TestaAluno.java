package testaaluno;

import javax.swing.JOptionPane;

public class TestaAluno {

    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        
        if(!(aluno1.nome == null ? null == aluno2.nome : aluno1.nome.equals(aluno2.nome))){
            JOptionPane.showMessageDialog(null, aluno1.nome);
            JOptionPane.showMessageDialog(null, aluno2.nome);
        }else{
            JOptionPane.showMessageDialog(null, aluno3.nome);
        }
    }
    
}
