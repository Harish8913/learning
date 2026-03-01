package abstraction.example2.classes;

public abstract class Devices {
    abstract String getDeviceName();

    void commonMethod() {
        System.out.println("This is the common method in all classes");
    }
}
