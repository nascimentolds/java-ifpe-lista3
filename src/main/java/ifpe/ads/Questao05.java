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
            areaRetangulo(b, h);
        } else if (opcao == 2) {
            System.out.println("--------------------------------------");
            perimetroRetangulo(b, h);
        } else {
            System.out.print("Opção inexistente.");
        }

    }

    public static void menu() {
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("--------------------------------------");
        System.out.println("[1] Calcular a área do retângulo");
        System.out.println("[2] Calcular o perímetro do retângulo.");
        System.out.println("--------------------------------------");
    }

    public static String areaRetangulo(int b, int h) {
        int area = b * h;

        return System.out.printf("Área do retângulo: %d", area).toString();
    }

    public static String perimetroRetangulo(int b, int h) {
        int perimetro = (2*b) + (2*h);

        return System.out.printf("Perímetro do retângulo: %d", perimetro).toString();
    }
}
