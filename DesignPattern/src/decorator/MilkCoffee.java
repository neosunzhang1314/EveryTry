package decorator;

/**
 * Created by zhangziyang on 14-9-5.
 */
public class MilkCoffee implements Coffee {

    public Coffee underDecorator;

    public MilkCoffee(Coffee underDecorator){
        this.underDecorator=underDecorator;
    }

    @Override
    public String getDescription() {
        return underDecorator.getDescription()+"   milk decorator";

    }

    @Override
    public double cost() {
        return underDecorator.cost()+20;
    }
}
