package Decorator;
import Cake.Cake;

public class CakeDecorator extends Cake{
    private Cake cake;

    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return cake.getCost();
    }

    @Override
    public String getDescription() {
        return cake.getDescription();
    }
}
