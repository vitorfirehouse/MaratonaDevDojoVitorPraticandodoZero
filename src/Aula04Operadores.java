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

        // OPERADORES LÓGICOS
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDalei = idade  > 30 && salario > 4612;
        int idadePermitida = 18;
        boolean temIngresso = true;
        boolean podeEntrar = idadePermitida >= 18 && temIngresso;

        // Média necessária para passar

        double saldoNaconta = 500.00;
        double valorDacompra = 120.00;
        boolean cartaoInternacionalAceito = true;
        boolean compraAutorizada = saldoNaconta >= valorDacompra && cartaoInternacionalAceito;

//Verificando temperatura
        int temp1 = 10;
        int temp2 = 15;
        int temp3 = 35;
        boolean temperaturaPermitida = temp1 < 40 && temp2 < 40 && temp3 <40;

// Para ganhar desconto no cinema, o cliente precisa cumprir duas condições: ter a idade menor que 12 anos E a carteirinha de estudante precisa ser verdadeira (boolean temCarteirinha = true;). Crie as variáveis para um cliente e monte o boolean ganhouDesconto.
        int idadeParaCinema = 12;
        boolean temCarteirnhadeEstudante = true;
        boolean PodeEntrarse =  idadeParaCinema <= 12 && temCarteirnhadeEstudante;

// Sistema de login simples
        int usuarioCadastrado = 12345;
        int senhaCadastrada = 9999;
        int usuarioCorretoCadastrado = 12345;
        int senhaCadastradaCorreta  = 9999;
        boolean loginSucesso = usuarioCadastrado == usuarioCorretoCadastrado & senhaCadastrada == senhaCadastradaCorreta;

 // Validação de emprestimo bancário
        int idadedoClienteBancario = 60;
        double salarioEsseMes = 2500.0;
        boolean emprestimoAprovado = idadedoClienteBancario <= 60 && salarioEsseMes > 2500.0;
        System.out.println("O empréstimo foi aprovado para o cliente " + emprestimoAprovado);

// Classificação de Jogador de Futebol
        int idadeDoAtleta = 13;
        double alturaDoAtleta = 1.70;
        boolean categoriaJuvenil = idade >= 13 && alturaDoAtleta > 1.75;

 // Aprovador Automático de E-Commerce (Anti-Fraude)
        double valorDaCompra1 = 1200.00;
        double limiteDoCartão = 1500.00;
        int quantidadeDoMesmoItem = 3;
        int historicoBloqueios = 0;
        boolean compraLiberada = valorDaCompra1 <= limiteDoCartão && quantidadeDoMesmoItem < 3 && historicoBloqueios == 0;


// Controle de Acesso da Balada
        int idadePermitidaBalada = 19;
        boolean estaBanido = false;
        boolean entradaLiberada = (idadePermitidaBalada >= 18) && (estaBanido == false);
        System.out.println ("A entrada está liberada ? " +entradaLiberada);

//
    }


}
