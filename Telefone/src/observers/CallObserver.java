package observers;
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
    public void update(int number) {
        String phoneNumber = "";
        
        for (Integer digit : model.getDigits()) {
            phoneNumber += digit;
        }
        
        if (phoneNumber.length() == 12) {
            screen.display("Agora discando " + phoneNumber + "...");
        }
    }
}
