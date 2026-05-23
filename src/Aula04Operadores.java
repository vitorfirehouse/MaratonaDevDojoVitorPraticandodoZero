//Operadores Básicos de Matematica ( +-*/)

public class Aula04Operadores {
    static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 / numero02;

        // Testando equação

        int a = 1;
        int b = -5;
        int c = 6;
        double delta = (b*b)-(4*a*c);
        double x1 = (-b + Math.sqrt(delta)) / (2*a);
        System.out.println("A raiz quadrada de delta é " + x1);

        // Se na variavel resultado eu definir como double
        // O resultado de operações entre valores inteiros sempre resultará em um valor inteiro
        //Se uma variavel for inteiro e a outra double, o resultado não será inteiro
    }

}
