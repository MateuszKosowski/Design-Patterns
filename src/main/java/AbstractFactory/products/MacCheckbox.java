package AbstractFactory.products;

public class MacCheckbox implements Checkbox{
    @Override
    public void check() {
        System.out.println("Mac Checkbox Checked");
    }
}
