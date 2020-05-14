package testalampada;

import javax.swing.JOptionPane;

public class TestaLampada {
    public static void main(String[] args) {
        // TODO code application logic here
        Lampada lamp1 = new Lampada();
        int liga;
        
        liga = JOptionPane.showConfirmDialog(null,"Deseja Ligar a lampada ","Lampada", JOptionPane.YES_NO_OPTION);
        
        if(liga == JOptionPane.YES_OPTION ){
            lamp1.ligar();
        }else{
            lamp1.desligar();
        }
        lamp1.mostrarEstado();
    }
    
}
