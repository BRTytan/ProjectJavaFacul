package testaordem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;

public class Ordem {
    //Atributos
    int x,y,z;
    public Ordem(int a, int b, int c){
        
        int [] list1 = {15, 10, 25};
        x=list1[0];
        y=list1[1];
        z=list1[2];
    }
    public void mostrarMaior(){
        if(x > y && x > z){
            System.out.println("Mostrar Maior: ");
            System.out.println("X"+ "(" + x + ")" + " > " + y + " e " + z);
            System.out.println("X é > que Y e Z");
            System.out.println("---------------------------");
        }
        else if(y > x && y > z){
            System.out.println("Mostrar Maior: ");
            System.out.println("Y"+ "(" + y + ")" + " > " + x + " e " + z);
            System.out.println("Y é > que X e Z");
            System.out.println("---------------------------");
        }
        else{
            System.out.println("Mostrar Maior: ");
            System.out.println("Z"+ "(" + z + ")" + " > " + x + " e " + y);
            System.out.println("Z é > que X e Y");
            System.out.println("---------------------------");
        }
    }
    public void mostrarMenor(){
        if(x < y && x < z){
            System.out.println("Mostrar Menor: ");
            System.out.println("X"+ "(" + x + ")" + " < " + y + " e " + z);
            System.out.println("X é < que Y e Z");
            System.out.println("---------------------------");
        }
        else if(y < x && y < z){
            System.out.println("Mostrar Menor: ");
            System.out.println("Y"+ "(" + y + ")" + " < " + x + " e " + z);
            System.out.println("Y é < que X e Z");
            System.out.println("---------------------------");
        }
        else{
            System.out.println("Mostrar Menor: ");
            System.out.println("Z"+ "(" + z + ")" + " < " + x + " e " + y);
            System.out.println("Z é < que X e Y");
            System.out.println("---------------------------");
        }
    }
    public void mostrarCrescente(){
        int [] list1 = {x,y,z};
        Arrays.sort(list1);
            System.out.println("Ordem Crescente: ");
            System.out.println(Arrays.toString(list1));
            System.out.println("---------------------------");
    }
    public void mostrarDecrescente(){
       
    }
}
