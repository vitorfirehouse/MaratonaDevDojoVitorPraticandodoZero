/* Crie variáveis para os campos descritos abaixo entre <>
 e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo
que recebi o salário de <salario>, na data <data>.*/

public class Aula03TiposPrimitivosExercicio {
}
public static void main (String[] args){
    String nome = "Vitor";
    String endereco = "Rua das farinhas";
    double salario = 5431.12;
    String dataRecebimentoSalario = "22/05/2026";
    String relatorio = "Eu "+nome+" morando no endereco "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;
    String nomeAluno = "Vitor Santos";
    int numeroAluno = 12345;
    String curso = "Direito";
    int media = 10;


    System.out.println("O aluno  "+nomeAluno+ " inscrito no numero de identificação " + numeroAluno+ " estudante do curso de " +curso+ " obteve nota suficiente para passar, sendo sua média " +media);

}
