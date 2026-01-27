package AbstractFactory.products;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void check() {
        System.out.println("Windows Checkbox Checked");
    }
}
