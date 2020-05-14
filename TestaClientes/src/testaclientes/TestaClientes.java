package testaclientes;

import javax.swing.JOptionPane;
import view.JFramePrincipal;

public class TestaClientes {
    public static void main(String[] args) {
        Clientes  cl1 = new Clientes();
        new JFramePrincipal().setVisible(true);
        if(cl1.nome.equals("felippe")){
            JOptionPane.showMessageDialog(null, "Olá, " + cl1.nome);
        }else{
            JOptionPane.showMessageDialog(null, "quem é você?, " + cl1.nome);
        }
        
    }
    
}
