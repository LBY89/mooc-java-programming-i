
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           
            String textInput = scanner.nextLine();
            String[] textInputArray = textInput.split(" ");
            for (int i = 0; i < textInputArray.length; i ++) {
                System.out.println(textInputArray[i]);
            }
            if (textInput.isEmpty() || textInput.equals(" ")) {
                break;
            }
        }
        
        
    }
    
}
