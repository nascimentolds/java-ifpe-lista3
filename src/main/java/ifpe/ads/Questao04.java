package ifpe.ads;

// Questão 04: Escreva um programa com um método que receba o salário de um
// funcionário e calcule o imposto que ele deve pagar. Utilize os seguintes valores para
// calcular o imposto:
//  • Até R$ 2.000,00 – Isento de imposto
//  • De R$ 2.000,01 até R$ 3.500,00 – 15% de imposto
//  • De R$ 3.500,01 até R$ 5.000,00 – 22% de imposto
//  • Acima de R$ 5.000,01 – 30% de imposto

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salario;

        System.out.print("Digite o salário: ");
        salario = ler.nextDouble();

        System.out.printf("Imposto a pagar: %s.", imposto(salario));

        ler.close();
    }

    public static String imposto(double salario) {
        if (salario >= 5000.01) {
            return "30%";
        } else if (salario >= 3500.01) {
            return "22%";
        } else if (salario >= 2000.01) {
            return "15%";
        } else {
            return "Isento de impostos";
        }
    }
}
