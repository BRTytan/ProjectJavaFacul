package testarelogio;
public class Relogio {
    //Atributos
    int hora;
    //Constructor
    public Relogio(){
    
    }
    //Metodos
    public int adicionarHora(){
        if(hora <= 23){
            hora += 1;
        }else{
            hora = 0;
        }
        return 0;
    }
    public int subtrairHora(){
        if(hora > 0){
            hora -= 0;
        }
        return hora;
    }
    public String mostrarHora(){
        System.out.println("A hora atual é: " + hora);
        return null;
    }
}
