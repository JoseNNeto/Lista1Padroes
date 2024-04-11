package Cake;
public class StrawberryCake extends Cake{

    private final int CAKE_COST = 20;

    @Override
    public int getCost() {
        return CAKE_COST;
    }

    @Override
    public String getDescription() {
        return "Strawberry Cake";
    }
}
