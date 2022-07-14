import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Scanner scanner = new Scanner(System.in);
        int values = 0;
        int sum = 0;

        while (true) {
            System.out.println("Provide a value, a negative value ends the program");
            int value = Integer.valueOf(scanner.nextLine());
            if (value < 0) {
                break;
            }

            values = values + 1;
            sum = sum + value;
        }
        System.out.println("sum: "+sum);
        if (values == 0) {
            System.out.println("The average of the values could not be calculated.");
        } else {
            System.out.println(values);
            System.out.println("Average of values: " + (1.0 * sum / values));
        }
        scanner.close();
        
    }
}
