public class CoreSyntax {
    public static void main(String[] args) {
        String name = "Harish";
        int age = 21;
        char someLetter = 'H';

        for (int i = 0; i < age; i++) {
            System.out.println(i);
        }

        while (age >= 1) {
            System.out.println(age);
            age--;
        }

        if (age > 18) {
            System.out.println("Your age is above 18");
        } else {
            System.out.println("Your age is under 18");
        }
    }

    static void anotherMethod() {
        System.out.println("This is the static method of the class");
    }
}