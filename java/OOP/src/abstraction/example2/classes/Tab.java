package abstraction.example2.classes;

public class Tab extends Devices {
    String deviceName;

    public Tab(String deviceName) {
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
