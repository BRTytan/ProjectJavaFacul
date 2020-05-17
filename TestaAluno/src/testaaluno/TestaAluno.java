/*1 (0,5 ponto) Escreva uma classe em Java para as seguintes especificações:
- Nome da classe: Aluno
- Atributos
- RA : String
- Nome : String
- Curso : String
- Escreva um método construtor em Java para a classe Aluno que receba como parâmetros:
- RA, Nome e Curso
- Os atributos devem ter receber os valores dos parâmetros
Escreva uma classe em Java chamada TesteAluno, que contenha um método "main", e instancie 3 objetos diferentes do "tipo" Aluno.
*/

package testaaluno;

public class TestaAluno {

    public static void main(String[] args) {
        // TODO code application logic here
        Aluno aluno1 = new Aluno("D9503B0", "FELIPPE", "CIÊNCIA DA COMPUTAÇÃO");
        Aluno aluno2 = new Aluno("D9503B3", "ALINE", "CIÊNCIA DA COMPUTAÇÃO");
        Aluno aluno3 = new Aluno("D9503B2", "JOÃO", "CIÊNCIA DA COMPUTAÇÃO");
    }
    
}
