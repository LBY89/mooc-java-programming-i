
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           
            String textInput = scanner.nextLine();
            String[] textInputArray = textInput.split(" ");
            System.out.println(textInputArray[0]);
          
            if (textInput.isEmpty() || textInput.equals(" ")) {
                break;
            }
        }


    }
}


// String text = "Hello world";
// char character = text.charAt(0);
// system.out.println(character);