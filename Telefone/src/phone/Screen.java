package phone;
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }

    public void display(String message) {
        System.out.println(message);
    }
}
