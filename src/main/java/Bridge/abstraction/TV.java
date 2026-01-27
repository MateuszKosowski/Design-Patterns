package Bridge.abstraction;

public class TV implements Device {
    @Override
    public void on() {
        System.out.println("Turning on TV");
    }

    @Override
    public void off() {
        System.out.println("Turning off TV");
    }

    @Override
    public void adjustVolume(int percentage) {
        System.out.println("Adjusting volume to "+percentage+"%");
    }
}
