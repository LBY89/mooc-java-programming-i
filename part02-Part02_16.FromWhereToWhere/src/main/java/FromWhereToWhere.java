
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Where to?");
        int numberStart = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int numberFrom = Integer.valueOf(scanner.nextLine());
        for (int a = numberFrom;  a <= numberStart; a++) {
            System.out.println(a);
        }
        scanner.close();
    }
}
