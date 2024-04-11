package Decorator;

import Cake.Cake;

public class Sprinkles extends CakeDecorator{
    private final int SPRINKLES_COST = 2;

    public Sprinkles(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return super.getCost() + SPRINKLES_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with sprinkles";
    }
}
