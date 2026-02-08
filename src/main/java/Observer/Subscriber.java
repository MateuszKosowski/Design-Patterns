package Observer;

public class Subscriber implements Observer{
    private String name;
    private String lastVideoTitle;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        lastVideoTitle = videoTitle;
        System.out.println("User " + name + ": Ding! New video \"" + lastVideoTitle + "\" available.");
    }
}
