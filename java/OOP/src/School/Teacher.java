package School;

public class Teacher {
    public String name;
    public String subject;
    int age;
    String gender;
    boolean isNewToSchool;
    static int noOfTeachers;

    public Teacher(String name){
        this.name = name;
    }

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public Teacher(String name, String subject, int age){
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public Teacher(String name, String subject, int age, String gender){
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.gender = gender;
    }

    public Teacher(String name, String subject, int age, String gender, boolean isNewToSchool){
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.gender = gender;
        this.isNewToSchool = isNewToSchool;
        noOfTeachers += 1;

    }

    public static int noOfTeachers(){
        return noOfTeachers;
    }
}
