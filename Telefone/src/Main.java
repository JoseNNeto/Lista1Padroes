import observers.CallObserver;
import observers.KeyPadObserver;
import phone.KeyPad;
import phone.PhoneModel;
import phone.Screen;

public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 12;

        // Build the object graph
        // Crie uma tela (Screen) e um modelo de telefone (PhoneModel)
        Screen screen = new Screen();
        PhoneModel model = new PhoneModel(screen);
        
        // Crie os observadores para a tela
        KeyPadObserver keypadObserver = new KeyPadObserver(screen, model);
        CallObserver callObserver = new CallObserver(screen, model);
        
        // Adicione os observadores à tela
        screen.addObserver(keypadObserver);
        screen.addObserver(callObserver);

        // Crie um teclado e passe o modelo de telefone a ele
        KeyPad keyPad = new KeyPad(model);

        // Simule pressões de tecla para inserir dígitos no modelo
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
