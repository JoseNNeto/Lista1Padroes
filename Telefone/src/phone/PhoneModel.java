package phone;
import java.util.ArrayList;
import java.util.List;

import observers.Observer;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers();
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(digits.get(digits.size() - 1));
        }
    }
}
