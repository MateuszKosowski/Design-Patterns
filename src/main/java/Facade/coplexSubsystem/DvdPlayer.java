package Facade.coplexSubsystem;

public class DvdPlayer {
    public void on() { System.out.println("DVD Player: Turned ON."); }
    public void play(String movie) { System.out.println("DVD Player: Playing \"" + movie + "\""); }
    public void stop() { System.out.println("DVD Player: Stopped."); }
    public void eject() { System.out.println("DVD Player: Ejecting disc."); }
    public void off() { System.out.println("DVD Player: Turned OFF."); }
}
