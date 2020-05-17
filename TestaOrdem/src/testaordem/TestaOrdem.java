package testaordem;
public class TestaOrdem {
    public static void main(String[] args) {
        // TODO code application logic here
        //Objetos
        Ordem ord1 = new Ordem(); 
        ord1.Ordem(10, 30, 20);
        ord1.mostrarMaior();
        ord1.mostrarMenor();
        ord1.mostrarCrescente();
        ord1.Ordem(30, 10, 20);
        ord1.mostrarMaior();
        ord1.mostrarMenor();
        ord1.mostrarCrescente();
        ord1.Ordem(10, 10, 20);
        ord1.mostrarMaior();
        ord1.mostrarMenor();
        ord1.mostrarCrescente();
    }
    
}
