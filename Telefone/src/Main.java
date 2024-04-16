import observers.CallObserver;
import observers.KeyPadObserver;
import phone.KeyPad;
import phone.PhoneModel;
import phone.Screen;

public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        KeyPad keyPad = new KeyPad(model);

        KeyPadObserver keyPadObserver = new KeyPadObserver(screen, model);
        CallObserver callObserver = new CallObserver(screen, model);
        model.addObserver(keyPadObserver);
        model.addObserver(callObserver);

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
