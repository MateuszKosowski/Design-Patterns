package Facade;

import Facade.coplexSubsystem.DvdPlayer;
import Facade.coplexSubsystem.Projector;
import Facade.coplexSubsystem.Screen;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;

    public HomeTheaterFacade(Projector projector, Screen screen, DvdPlayer dvdPlayer){
        this.projector = projector;
        this.screen = screen;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie){
        screen.down();
        projector.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);

    }

    public void endMovie()
    {
        screen.up();
        projector.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
    }
}
