package abstraction.example2;

import abstraction.example2.classes.*;;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Alienware");
        Mobile mobile = new Mobile("Samsung");
        Tab tab = new Tab("Apple");

        System.out.println(computer.getDeviceName());
        System.out.println(mobile.getDeviceName());
        System.out.println(tab.getDeviceName());
    }
}
