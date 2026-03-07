import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a operação que deseja realizar (1 = sum, 2 = subtraction)");
        var operationOption = sc.nextInt();

        while (operationOption > 2 || operationOption < 1){
            System.out.println("Escolha uma opção válida (1 = sum, 2 = subtraction");
            operationOption = sc.nextInt();
        }

        var selectedOperation = Operation.values()[operationOption - 1];
        System.out.println("Informe os números que serão usados separados por vírgula (ex.: 1,2,3,4");
        var numbers = sc.next();
        var numberArray = Arrays.stream(numbers.split(","))
                .mapToLong(Long::parseLong)
                .toArray();

        var result = selectedOperation.getOperationCallback().exec(numberArray);
        var operationToSho = numbers.replaceAll(","," " + selectedOperation.getSignal() + " ");
        System.out.printf("O resultado da operação %s = %s /n", operationToSho, result);

    }
}