package application;

import java.util.Scanner;

public class Program_ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um numero inteiro: ");
        int n = sc.nextInt();

        while (n % 2 == 0) {

            System.out.print("Entre com outro numero: ");
            n = sc.nextInt();
        }

        sc.close();
    }
}