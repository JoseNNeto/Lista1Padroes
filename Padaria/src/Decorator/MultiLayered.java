package Decorator;

import Cake.Cake;

public class MultiLayered extends CakeDecorator{
    private final int LAYER_COST = 5;

    public MultiLayered(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return super.getCost() + LAYER_COST;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with multiple layers";
    }
    
}
