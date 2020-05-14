package testalampada;

import javax.swing.JOptionPane;

public class Lampada {
    //Atributos
    boolean estado;
    public boolean ligar(){
        
        return estado = true;
    }
    public boolean desligar(){
        
        return estado = false;
    }
    public boolean mostrarEstado(){
        if(estado==true){
            JOptionPane.showMessageDialog(null, "Lampada Ligada");
        }else{
            JOptionPane.showMessageDialog(null, "Lampada Desligada");
        }
        return false;
    }
}
