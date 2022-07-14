import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String programName = scanner.nextLine();
            if (programName.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int programDuration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(programName, programDuration));

        }

        System.out.print("Program's maximum duration? ");
        int maximumDuration = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        for (TelevisionProgram eachProgram : programs) {
            if (eachProgram.getDuration() <= maximumDuration) {
                System.out.println(eachProgram);
            }
        }

    }
}
