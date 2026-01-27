package AbstractFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        String os = "Mac";
        GUIFactory factory = os.equals("Mac") ? new MacFactory() : new WindowsFactory();
        Application app = new Application(factory);
        app.render();
    }
}
