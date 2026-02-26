import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {

        int option;

        do {
            showMenu();
            option = sc.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> petMachine.showWater();
                case 5 -> petMachine.showShampoo();
                case 6 -> petMachine.showPetStatus();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (option != 0);

        sc.close();
    }

    private static void showMenu() {
        System.out.println("=== Escolha uma das opções ===");
        System.out.println("1 - Dar banho no pet");
        System.out.println("2 - Abastecer a máquina com água");
        System.out.println("3 - Abastecer a máquina com shampoo");
        System.out.println("4 - Verificar água da máquina");
        System.out.println("5 - Verificar shampoo da máquina");
        System.out.println("6 - Verificar se tem pet na máquina");
        System.out.println("7 - Colocar pet na máquina");
        System.out.println("8 - Retirar pet da máquina");
        System.out.println("9 - Limpar máquina");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
    }

    private static void setPetInMachine() {
        String name = "";

        while (name.isBlank()) {
            System.out.print("Informe o nome do pet: ");
            name = sc.next();
        }

        Pet pet = new Pet(name);
        petMachine.setPet(pet);
    }
}
