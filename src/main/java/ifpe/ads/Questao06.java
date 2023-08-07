package ifpe.ads;

// Questão 06: Escreva um programa com métodos que façam a conversão de Fahrenheit
// para Celsius (C = 5(F-32) / 9) e de Kelvin para Celsius (C = (K - 237)). Forneça as
// seguintes opções ao usuário:
//  1. Transformar de Fahrenheit para Celsius
//  2. Transformar de Kelvin para Celsius

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int opcao;
        int graus;

        menu();

        System.out.print("Opção: ");
        opcao = ler.nextInt();

        System.out.print("Graus: ");
        graus = ler.nextInt();

        if (opcao == 1) {
            System.out.println("--------------------------------------");
            System.out.printf("Fahrenheit: %d x Celsius: %d", graus, fahrenheitParaCelsius(graus));
        } else if (opcao == 2) {
            System.out.println("--------------------------------------");
            System.out.printf("Kelvin: %d x Celsius: %d", graus, kelvinParaCelsius(graus));
        } else {
            System.out.print("Opção inexistente.");
        }

        ler.close();
    }

    public static void menu() {
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("--------------------------------------");
        System.out.println("[1] Transformar de Fahrenheit para Celsius.");
        System.out.println("[2] Transformar de Kelvin para Celsius.");
        System.out.println("--------------------------------------");
    }

    public static int fahrenheitParaCelsius(int graus) {
        return  (5 * (graus-32)) / 9;
    }

    public static int kelvinParaCelsius(int graus) {
        return  graus - 273;
    }
}
