package observers;

import java.util.List;

import phone.PhoneModel;
import phone.Screen;
public class CallObserver implements Observer{
    private Screen screen;
    private PhoneModel model;

    public CallObserver(Screen screen, PhoneModel model) {
        this.screen = screen;
        this.model = model;
    }

    @Override
    public void update() {
        StringBuilder phoneNumber = new StringBuilder();
        for (Integer digit : model.getDigits()) {
            phoneNumber.append(digit);
        }
        screen.display("Agora discando " + phoneNumber.toString() + "...");
    }
}
