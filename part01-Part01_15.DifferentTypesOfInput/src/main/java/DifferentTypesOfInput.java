
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Give a string:");
        System.out.println("Give an integer:");
        System.out.println("Give a double:");
        System.out.println("Give a boolean:");

        String text = scanner.nextLine();
        System.out.println("You gave the string " + text); 
        int integerNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the integer " + integerNumber);
        double doubleNumber = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the double " + doubleNumber);
        boolean booleanInput = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the boolean " + booleanInput);   
        scanner.close();

    }
}
