package application;

import java.util.Scanner;

public class Program_ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            int multiplicacao = number * i;
            System.out.printf("%d x %d = %d%n", number, i, multiplicacao);
        }

        sc.close();
    }
}
