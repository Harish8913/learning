import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("Lets play ROCK-PAPER-SCISSORS");

        String[] entities = { "ROCK", "PAPER", "SCISSORS" };
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean wantToExit = false;

        while (!wantToExit) {
            int randomIndex = random.nextInt(0, 3);
            System.out.print("Enter your move: ");

            String userMove = scanner.nextLine().toLowerCase();
            String computerChoice = entities[randomIndex].toLowerCase();

            if (userMove.equals("rock") && computerChoice.equals("paper")) {
                System.out.println("You choose " + userMove + " and Computer choose " + computerChoice);
                System.out.println("Computer won !");
            } else if (userMove.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("You choose " + userMove + " and Computer choose " + computerChoice);
                System.out.println("You Won !");
            } else if (userMove.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You choose " + userMove + " and Computer choose " + computerChoice);
                System.out.println("You Won !");
            } else if (userMove.equals("paper") && computerChoice.equals("scissors")) {
                System.out.println("You choose " + userMove + " and Computer choose " + computerChoice);
                System.out.println("Computer Won");
            } else if (userMove.equals("scissors") && computerChoice.equals("rock")) {
                System.out.println("You choose " + userMove + " and Computer choose " + computerChoice);
                System.out.println("Computer Won");
            } else if (userMove.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You Won !");
            } else if (userMove.equals(computerChoice)) {
                System.out.println("You choose " + userMove + " and Computer choose " + computerChoice);
                System.out.println("Its a draw");
            } else {
                System.out.println("Enter a valid entry");
            }

            System.out.print("Do you want to  exit (yes / no): ");
            String exit = scanner.nextLine();

            if(exit.toLowerCase().equals("yes")){
                wantToExit = true;
            }

        }

        scanner.close();

    }
}