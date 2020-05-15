package testatelefone;
public class Telefone {
    //Atributos
    int numeroMinutos;
    double preco;
    public Telefone() {
        this.preco = 2.0;
        this.numeroMinutos = 0;
    }
    public void duracaoLigacao(int vl){
        this.numeroMinutos = vl;
    }
    public void alterarPreco(double prc){
        this.preco = prc;
    }
    public void mostrarConta(){
        System.out.println("Valor da conta de telefone: " +"R$" +numeroMinutos * preco);
    }
}
