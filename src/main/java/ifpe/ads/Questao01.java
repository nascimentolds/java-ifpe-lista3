package ifpe.ads;

// Questão 01: Escreva um programa com um método que receba um número e determine
// se esse número é par ou ímpar.

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = ler.nextInt();


        System.out.print("O número digitado é " + parOuImpar(numero));

        ler.close();

    }
    
    public static String parOuImpar (int numero) {
        int resto = numero % 2;
        
        if (resto == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}
