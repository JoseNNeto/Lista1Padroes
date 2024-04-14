package phone;
import java.util.ArrayList;
import java.util.List;

import observers.CallObserver;
import observers.KeyPadObserver;
import observers.Observer;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen {
    private PhoneModel model;
    private List<Observer> observers;

    public Screen(PhoneModel model) {
        this.model = model;
        observers = new ArrayList<>();
        
        // Cria os observadores
        KeyPadObserver keyPadObserver = new KeyPadObserver(this, model);
        CallObserver callObserver = new CallObserver(this, model);
        
        // Adiciona observadores ao modelo
        model.addObserver(keyPadObserver);
        model.addObserver(callObserver);
    }

    public Screen() {
        this.model = null;
        this.observers = new ArrayList<>();
    }

    public void display(String message) {
        System.out.println(message);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
