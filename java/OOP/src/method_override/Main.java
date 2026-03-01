package method_override;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("aa", 12, "11222");
        Fish fish = new Fish("aa", 12, "11222");

        cat.move();
        fish.move();

        fish.printAllDetails();
    }
}
