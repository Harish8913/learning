public class Animal {
    String type = "Animal";
    String animalName;
    
    void eating(){
        System.out.println(animalName + " can eat");
    };

    void sleeping(){
        System.out.println(animalName + " is sleeping");
    }

    Animal(String animalName){
        this.animalName = animalName;  
    }
}
