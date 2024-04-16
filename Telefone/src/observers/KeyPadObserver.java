package observers;
import phone.PhoneModel;
import phone.Screen;

public class KeyPadObserver implements Observer{
    private Screen screen;
    private PhoneModel model;

    public KeyPadObserver(Screen screen, PhoneModel model) {
        this.screen = screen;
        this.model = model;
    }

    @Override
    public void update(int digit) {
        screen.display("" + digit);
    }
    
}
