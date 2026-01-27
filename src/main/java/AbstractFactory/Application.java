package AbstractFactory;

import AbstractFactory.products.Button;
import AbstractFactory.products.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render(){
        button.click();
        checkbox.check();
    }

}
