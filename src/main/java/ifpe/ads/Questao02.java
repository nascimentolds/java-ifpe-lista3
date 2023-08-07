package ifpe.ads;

// Questão 02: Escreva um programa que leia 02 números a operação aritmética desejada.
// Se o usuário digitar:
//   1. Retornar a soma entre dois números;
//   2. Retornar a subtração entre dois números;
//   3. Retornar a multiplicação entre dois números;
//   4. Retornar a divisão entre dois números;
// Obs.: Cada opção deve ser um método diferente.

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero1;
        int numero2;
        String operador;

        System.out.print("Digite um número: ");
        numero1 = ler.nextInt();

        System.out.print("Digite outro número: ");
        numero2 = ler.nextInt();

        System.out.print("Escolha um operador (+, -, *, /): ");
        operador = ler.next();

        System.out.printf("%d %s %d = %f", numero1, operador, numero2, operacao(numero1, numero2, operador));

        ler.close();

    }

    public static double operacao(int numero1, int numero2, String op) {
        switch (op) {
            case "+" -> {
                return numero1 + numero2;
            }
            case "-" -> {
                return numero1 - numero2;
            }
            case "*" -> {
                return numero1 * numero2;
            }
            case "/" -> {
                return (double) numero1 / numero2;
            }
        }

        return 0;
    }
}
