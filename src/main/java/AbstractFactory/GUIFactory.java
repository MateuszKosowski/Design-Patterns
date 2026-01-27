package AbstractFactory;

import AbstractFactory.products.Button;
import AbstractFactory.products.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
