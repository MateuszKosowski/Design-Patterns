package Bridge.abstraction;

public class Radio implements Device {
    @Override
    public void on() {
        System.out.println("Turning on Radio");
    }
    @Override
    public void off() {
        System.out.println("Turning off Radio");
    }
    @Override
    public void adjustVolume(int percentage) {
        System.out.println("Adjusting volume to "+percentage+"%");
    }
}
