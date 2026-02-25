package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_ex02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Entre com o peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.6) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        sc.close();
    }
}