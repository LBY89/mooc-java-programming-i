import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int bookPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookTitle, bookPages, publicationYear));

        }

        System.out.println("");
        System.out.print("What information will be printed? ");
        String orderInput = scanner.nextLine();
        //System.out.println("orderInput " + orderInput);
        if (orderInput.equals("everything")) {
            //string comparision, to use .equals(string)
            for (Book eachBook : books) {
                System.out.println(eachBook);
            }
        } else if (orderInput.equals("name")) {
            for (Book eachBook : books) {
                System.out.println(eachBook.getName());
            }
        }
        scanner.close();

    }
}
