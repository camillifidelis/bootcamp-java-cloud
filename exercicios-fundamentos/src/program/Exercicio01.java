package program;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a sua data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = sc.nextLine();

        System.out.println("Olá, " + nome + "! Você nasceu em " + dataNascimento + ".");

        sc.close();

    }
}
