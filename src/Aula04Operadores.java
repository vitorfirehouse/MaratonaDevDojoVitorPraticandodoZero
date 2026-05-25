//Operadores Básicos de Matematica ( +-*/)
public class Aula04Operadores {
    static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 / numero02;
        System.out.println(resultado);
        // Se na variavel resultado eu definir como double
        // O resultado de operações entre valores inteiros sempre resultará em um valor inteiro
        //Se uma variavel for inteiro e a outra double, o resultado não será inteiro


        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMenorQueVinte);
    }

}
