package application;

import java.util.Scanner;

public class Program_ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Entre com o segundo número (maior que o primeiro): ");
        double num2 = sc.nextDouble();

        sc.nextLine();
        System.out.print("Escolha entre impar ou par: ");
        String escolha = sc.nextLine();

        if (escolha.equals("par")) {
            for (double i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (escolha.equals("impar")) {
            for (double i = num1; i <= num2; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }

            sc.close();
        }
    }
}