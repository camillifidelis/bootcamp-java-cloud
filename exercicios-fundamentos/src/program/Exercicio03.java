package program;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado do retângulo: ");
        int lado = sc.nextInt();

        System.out.print("Digite o valor da altura do retângulo: ");
        int altura = sc.nextInt();

        int area = lado * altura;

        System.out.println("A área do retângulo é: " + area);

        sc.close();
    }

}
