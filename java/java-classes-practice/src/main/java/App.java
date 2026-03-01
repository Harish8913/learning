public class App {
    public static void main(String[] args){
        System.out.println("Hello World! This is a message from the java");

        Animal dog = new Animal("Dog");
        Animal cat = new Animal("Cat");

        dog.eating();
        dog.sleeping();

        cat.eating();
        cat.sleeping();
    }

    public void anotherMethod(){
        System.out.println("Hey there this is just for the testing");
    }
}