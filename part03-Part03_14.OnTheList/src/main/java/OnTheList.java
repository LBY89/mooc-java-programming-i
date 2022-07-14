
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.print("Search for? ");
        String toBeSearched = scanner.nextLine();
        if (list.contains(toBeSearched)) {
            System.out.println(toBeSearched + " was found!");
        } else {
            System.out.println(toBeSearched + " was not found!");
        }
        scanner.close();
    }
}

// public static void print(ArrayList<String> list) {
//     for () {

//     }
// }

// public static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
//     for () {

//     }
// }