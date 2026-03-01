package method_override;

public class Fish extends Animal {
    public Fish(String fishName, int height, String totalSections){
        super(fishName, height, totalSections);
    }

    void printAllDetails(){
        System.out.println(this.animalName + " " + this.height + " " + this.totalSections);
    }

    @Override
    void move(){
        System.out.println("This animal is swimming");
    }

    @Override
    public String toString(){
        return "This is a modified version of the toString method";
    }
}
