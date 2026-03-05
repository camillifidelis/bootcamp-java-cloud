import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        GeometricForm geometricForm;

        while(true) {
            System.out.println("Escolha a forma geométrica para calcular a área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("4 - Sair do programa.");

            option = sc.nextInt();

            if (option == 1) {
                geometricForm = createSquare();
            }
            else if (option == 2) {
                geometricForm = createRectangle();
            }
            else if (option == 3){
                geometricForm = createCircle();
            }
            else if (option == 4){
                break;
            } else {
                System.out.println("Opção inválida.");
                continue;
            }

            System.out.println("O resultado do cálculo da área foi " + geometricForm.getArea());
        }
    }

    private static GeometricForm createSquare(){
        System.out.print("Informe o tamanho dos lados: ");
        var side = sc.nextDouble();
        return new Square(side);
    }

    private static GeometricForm createRectangle(){
        System.out.print("Informe a altura: ");
        var height = sc.nextDouble();
        System.out.print("Informe a base: ");
        var base = sc.nextDouble();
        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle(){
        System.out.print("Informe o raio: ");
        var radius = sc.nextDouble();
        return new Circle(radius);
    }


}