package Facade;

import Facade.coplexSubsystem.DvdPlayer;
import Facade.coplexSubsystem.Projector;
import Facade.coplexSubsystem.Screen;



public class FacadeDemo {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Screen screen = new Screen();
        DvdPlayer dvdPlayer = new DvdPlayer();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(projector, screen, dvdPlayer);
        homeTheaterFacade.watchMovie("Inception");
        homeTheaterFacade.endMovie();
    }
}
