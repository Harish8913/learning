public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2024;
    double price = 58000;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("Car started !");
    }

    void stop(){
        isRunning = false;
        System.out.println("Car Stopped");
    }

    void drive(){
        isRunning = true;
        System.out.println( make + " " + model + " is moving and drived");
    }
}
