import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = { "1) What is name of Harish ?", "2) What is the name of Karan ?", "3) What is the name of Sakib ?", "4) What is the name of Prakash ?" };

        String[][] options = {
            {"1. Harish", "2. Sakib", "3. Karan", "4. Prakash"},
            {"1. Harish", "2. Sakib", "3. Karan", "4. Prakash"},
            {"1. Harish", "2. Sakib", "3. Karan", "4. Prakash"},
            {"1. Harish", "2. Sakib", "3. Karan", "4. Prakash"},
        };

        int[] answers = {1, 3, 2, 4};
        int[] choices = new int[4];
        int totalScore = 0;

        for(int i = 0; i < questions.length; i++){
            String question = questions[i];
            System.out.println(question + "\n");

            String[] option = options[i];
            for(String opt: option){
                System.out.println(opt);
            }

            System.out.print("\nEnter your answer: ");
            int choice = scanner.nextInt();
            choices[i] = choice;
            if(answers[i] == choices[i]){
                totalScore++;
                System.out.println("Correct\n");
            }else{
                System.out.println("Incorrect\n");
            }
        }

        System.out.println("Your Total Score is: " + totalScore + " out of " + questions.length);

        scanner.close();
    }
}
