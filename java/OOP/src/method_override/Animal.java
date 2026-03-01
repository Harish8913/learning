package method_override;

public class Animal {
    String animalName;
    int height;
    String totalSections;

    public Animal(String animalName, int height, String totalSections){
        this.animalName = animalName;
        this.height = height;
        this.totalSections = totalSections;
    }
    
    void move() {
        System.out.println("This animal is running");
    }

    @Override
    public String toString(){
        return "This is a custom modified method";
    }
}
