import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the times you want to roll the dice: ");
        int rollDiceTimes = scanner.nextInt();
        int total = 0;

        System.out.println("\nRolling the dice " + rollDiceTimes + " times");

        while (rollDiceTimes > 0) {
            int dotsNumber = createDiceRoll();
            rollDiceTimes -= 1;
            total += dotsNumber;
        }

        System.out.println("Total Count: " + total);
        scanner.close();
    }

    static int createDiceRoll(){
        Random random = new Random();
        int randomNumber = random.nextInt(1, 6);
        String visual = "";
        int number = 0;

        

        for(int i = 1; i <= randomNumber; i++){
            number += 1;
        }
        
        switch (number) {
            case 1 -> visual += dice1;
            case 2 -> visual += dice2;
            case 3 -> visual += dice3;
            case 4 -> visual += dice4;
            case 5 -> visual += dice5;
            case 6 -> visual += dice6;
        }

        System.out.println(visual);
        System.out.println("You rolled: " + number);
        return number;
    }

    static String dice1 = """
            -------
           |       |
           |   ●   |
           |       |
            -------
            """;

    static String dice2 = """
            -------
           | ●     |
           |       |
           |     ● |
            -------
            """;

    static String dice3 = """
            -------
           | ●     |
           |   ●   |
           |     ● |
            -------
            """;

    static String dice4 = """
            -------
           | ●   ● |
           |       |
           | ●   ● |
            -------
            """;

    static String dice5 = """
            -------
           | ●   ● |
           |   ●   |
           | ●   ● |
            -------
            """;

    static String dice6 = """
            -------
           | ●   ● |
           | ●   ● |
           | ●   ● |
            -------
            """;
}
