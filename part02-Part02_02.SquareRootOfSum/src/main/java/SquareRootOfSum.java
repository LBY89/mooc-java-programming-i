
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(" ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int result = (int) Math.sqrt(firstNumber + secondNumber);
        System.out.println(result);
        scanner.close();

    }
}
