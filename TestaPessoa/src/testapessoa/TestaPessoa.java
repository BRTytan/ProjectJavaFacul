package testapessoa;
public class TestaPessoa {
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pessoa1 = new Pessoa();
        if(pessoa1.sexo == 'M' || pessoa1.sexo == 'F'){
            System.out.println(pessoa1.toString());
        }else{
            System.out.println("Sexo Invalido");
        }
    }   
}