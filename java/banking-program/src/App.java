import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int selectedOption = 0;
        float balance = 0;
        Scanner scanner = new Scanner(System.in);
        String[] options = { "Show Balance", "Deposit", "Withdraw", "Exit" };

        System.out.println("\n\nHello and welcome to our banking program");

        do {
            System.out.println("\nPlease choose an option:");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ") " + options[i]);
            }

            System.out.print("\nEnter your choice from (1 - 4): ");

            if (scanner.hasNextInt()) {
                selectedOption = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next();
                continue;
            }

            switch (selectedOption) {
                case 1:
                    System.out.println(showBalance(balance));
                    break;

                case 2:
                    balance += depositMoney(scanner);
                    break;

                case 3:
                    balance -= withdrawAmount(scanner, balance);
                    break;

                case 4:
                    System.out.println("Thanks for using our program!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }

        } while (selectedOption != 4);

        scanner.close();
    }

    static String showBalance(float balance) {
        return "Your current balance is " + balance + " $";
    }

    static float depositMoney(Scanner scanner) {
        System.out.print("How much money do you want to deposit ($): ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Please enter a valid amount: ");
            scanner.next();
        }
        float amount = scanner.nextFloat();
        System.out.println("Amount: " + amount + " $ deposited successfully");
        return amount;
    }

    static float withdrawAmount(Scanner scanner, float balance) {
        System.out.print("How much money do you want to withdraw ($): ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Please enter a valid amount: ");
            scanner.next();
        }
        float amount = scanner.nextFloat();

        if (amount > balance) {
            System.out.println("Withdrawal canceled: Insufficient funds.");
            return 0;
        }

        System.out.println("Amount: " + amount + " $ withdrawn successfully");
        return amount;
    }
}
