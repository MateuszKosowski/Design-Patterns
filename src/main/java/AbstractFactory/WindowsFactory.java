package AbstractFactory;

import AbstractFactory.products.Button;
import AbstractFactory.products.Checkbox;
import AbstractFactory.products.WindowsButton;
import AbstractFactory.products.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
