package program;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa 1: ");
        String nome1 = sc.nextLine();

        System.out.printf("Digite a idade de %s:  ", nome1);
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome da pessoa 2: ");
        String nome2 = sc.nextLine();

        System.out.printf("Digite a idade de %s:  ", nome2);
        int idade2 = sc.nextInt();

        if (idade1 > idade2) {
            int diferenca = idade1 - idade2;
            System.out.printf("%s é %d anos mais velha que %s.", nome1, diferenca, nome2);
        } else if (idade1 < idade2) {
            int diferenca = idade2 - idade1;
            System.out.printf("%s é %d anos mais velha que %s.", nome2, diferenca, nome1);
        } else {
            System.out.println("As duas pessoas têm a mesma idade.");
        }

        sc.close();
    }

}
