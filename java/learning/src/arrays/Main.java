package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of foods you want to enter: ");

        int numberOfFruits = scanner.nextInt();
        scanner.nextLine();
        String[] fruits = new String[numberOfFruits];

        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter your fruit name: ");
            String newFruit = scanner.nextLine();
            fruits[i] = newFruit;
        }

        Arrays.sort(fruits);
        Arrays.fill(fruits, "Tempered");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        scanner.close();
    }
}

class varargs {
    public static void main(String[] args){
        int result = add(1,2,3,4,5,6,7,8,9,10);
        System.out.println(result);
    }

    static int add(int... numbers){
        int initial = 0;
        for(int num: numbers){
            initial += num;
        }

        return initial;
    }
}