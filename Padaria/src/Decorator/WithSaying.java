package Decorator;

import Cake.Cake;

public class WithSaying extends CakeDecorator{
    String saying;

    public WithSaying(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with saying '" + saying + "'";
    }
    
}
