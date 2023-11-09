package br.com.peddrobatista.view;

import br.com.peddrobatista.model.Calcular;

import java.util.Scanner;

public class Game {
    static Scanner teclado = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calc;

    public static void jogar() {
        System.out.println("Informe o nível de dificuldade desejada [1, 2, 3 ou 4]: ");
        int dificuldade = Game.teclado.nextInt();

        Game.calc = new Calcular(dificuldade);

        System.out.println("Informe o resultado para a seguinte operação: ");

        //somar
        if(calc.getOperacao() == 0) {
            System.out.println(calc.getValor1() + " + " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            if(calc.somar(resposta)) {
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s)!");
            }
        }
        //diminuir
        else if(calc.getOperacao() == 0) {
            System.out.println(calc.getValor1() + " - " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            if(calc.diminuir(resposta)) {
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s)!");
            }
        }
        //multiplicar
        else if(calc.getOperacao() == 0) {
            System.out.println(calc.getValor1() + " * " + calc.getValor2());
            int resposta = Game.teclado.nextInt();

            if(calc.multiplicar(resposta)) {
                // Ganha 1 ponto
                Game.pontos += 1;
                System.out.println("Você tem " + Game.pontos + " ponto(s)!");
            }
        } else {
            System.out.println("A operação " + calc.getOperacao() + " não é reconhecida!");
        }
        System.out.println("Deseja continuar? [1 - SIM, 0 - NÃO]");
        int continuar = Game.teclado.nextInt();

        if(continuar == 1) {
            Game.jogar();
        } else {
            System.out.println("Você fez " + Game.pontos + " ponto(s)");
            System.out.println("Até a próxima!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Game.jogar();
    }
}
