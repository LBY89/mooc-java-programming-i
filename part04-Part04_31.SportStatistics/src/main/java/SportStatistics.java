
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int counterForTeam = 0;
        int teamWins = 0;
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(teamName)) {
                    counterForTeam += 1;
                }
                String[] parts = line.split(",");
                if (teamName.equals(parts[0])) {
                    if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                        teamWins += 1;
                    }
                } else if (teamName.equals(parts[1])) {
                    if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                        teamWins += 1;
                    }
                }
            }

            System.out.println("Games: " + counterForTeam);
            System.out.println("Wins: " + teamWins);
            System.out.println("Losses: " + (counterForTeam - teamWins));


        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }


    

}
