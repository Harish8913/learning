package abstraction.example2.classes;

public class Computer extends Devices {
    String deviceName;

    public Computer(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public String toString() {
        return "deviceName: " + deviceName;
    }
}
