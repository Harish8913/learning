import java.util.ArrayList;

public class TheArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        numbers.add(1);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
