import School.Student;
import School.Teacher;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you enrolled or not: (true / false): ");
        boolean isEnrolled = scanner.nextBoolean();


        Student student = new Student(userName, age, gpa, isEnrolled);

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gpa);
        System.out.println(student.isEnrolled);

        scanner.close();
    }
}

class OtherCode {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Kalyani", "English", 12, "female", false);
        Teacher teacher2 = new Teacher("Sapna", "Hindi", 30, "female", false);
        Teacher teacher3 = new Teacher("Pradnya", "History", 35, "female", false);
        Teacher teacher4 = new Teacher("Neelima", "Science", 30, "female", true);

        Teacher[] teachers = { teacher1, teacher2, teacher3, teacher4 };
        for(Teacher teacher: teachers){
            System.out.println("Teacher name: " + teacher.name);
            System.out.println("Subject: " + teacher.subject);
        }

        System.out.println(Teacher.noOfTeachers());
    }
}
