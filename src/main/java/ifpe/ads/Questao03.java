package ifpe.ads;

// Questão 03: Escreva um programa com um método que receba uma String e retorne o
// número de vogais dessa String.

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = ler.next();

        System.out.printf("A palavra tem %d vogais.", numeroDeVogais(palavra));

        ler.close();

    }

    public static int numeroDeVogais(String palavra) {
        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;
    }
}
