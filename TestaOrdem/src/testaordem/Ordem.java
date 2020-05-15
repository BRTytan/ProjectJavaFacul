package testaordem;

import javax.swing.JOptionPane;

public class Ordem {
    //Atributos
    int x,y,z;
    public void Ordem(int a, int b, int c){
        x = a;
        y = b;
        z = c;
        /*x = Integer.parseInt(JOptionPane.showInputDialog(a));
        y = Integer.parseInt(JOptionPane.showInputDialog(b));
        z = Integer.parseInt(JOptionPane.showInputDialog(c));
        */
    }
    public void mostrarMaior(){
        if(x > y && x > z){
            System.out.println("X"+ "(" + x + ")" + " > " + y + " e " + z);
        }
        else if(y > x && y > z){
            System.out.println("Y"+ "(" + y + ")" + " > " + x + " e " + z);
        }
        else{
            System.out.println("Z"+ "(" + z + ")" + " > " + x + " e " + y);
        }
    }
    public void mostrarMenor(){
        if(x < y && x < z){
            System.out.println("X"+ "(" + x + ")" + " < " + y + " e " + z);
        }
        else if(y < x && y < z){
            System.out.println("Y"+ "(" + y + ")" + " < " + x + " e " + z);
        }
        else{
            System.out.println("Z"+ "(" + z + ")" + " < " + x + " e " + y);
        }
    }
    public void mostrarCrescente(){
        if(x < y && x < z){
            System.out.println("X"+ "(" + x + ")" + " < " + y + " e " + z);
        }
        else if(y < x && y < z){
            System.out.println("Y"+ "(" + y + ")" + " < " + x + " e " + z);
        }
        else{
            System.out.println("Z"+ "(" + z + ")" + " < " + x + " e " + y);
        }
    }
}
