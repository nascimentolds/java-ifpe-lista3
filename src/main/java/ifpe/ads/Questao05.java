package ifpe.ads;

// Questão 05: Escreva um programa com métodos para calcular a área (b x h) e o
// perímetro de um retângulo (2b + 2h). Forneça as seguintes opções ao usuário:
//  1. Calcular a área do retângulo
//  2. Calcular o perímetro do retângulo

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;
        int b;
        int h;

        menu();

        System.out.print("Opção: ");
        opcao = ler.nextInt();

        System.out.print("Digite a base: ");
        b = ler.nextInt();

        System.out.print("Digite a altura: ");
        h = ler.nextInt();

        if (opcao == 1) {
            System.out.println("--------------------------------------");
            System.out.printf("Área do retângulo: %d", areaRetangulo(b, h));
        } else if (opcao == 2) {
            System.out.println("--------------------------------------");
            System.out.printf("Perímetro do retângulo: %d", perimetroRetangulo(b, h));
        } else {
            System.out.print("Opção inexistente.");
        }

        ler.close();

    }

    public static void menu() {
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("--------------------------------------");
        System.out.println("[1] Calcular a área do retângulo");
        System.out.println("[2] Calcular o perímetro do retângulo.");
        System.out.println("--------------------------------------");
    }

    public static int areaRetangulo(int b, int h) {
        return b * h;
    }

    public static int perimetroRetangulo(int b, int h) {
        return (2*b) + (2*h);
    }
}
