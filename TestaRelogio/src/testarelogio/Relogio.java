package testarelogio;

import javax.swing.JOptionPane;

public class Relogio {
    //Atributos
    int hora;
    //Constructor
    public Relogio(){
        hora = 22;
    }
    //Metodos
    public void adicionarHora(){
        
        if(hora < 23){
            hora=hora+1 ;
        }else{
            hora = 0;
        }
    }
    public void subtrairHora(){
        if(hora > 0){
            hora -= 1;
        }
    }
    public String mostrarHora(){
        System.out.println("A hora atual é: " + hora+"H00M");
        return null;
    }
}
