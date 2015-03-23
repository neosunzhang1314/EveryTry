package decorator;

/**
 * Created by zhangziyang on 14-9-5.
 */
public class BlackCoffee implements Coffee {

    private String description;
    private double cost;

    public BlackCoffee(String description,double cost){
         this.description=description;
         this.cost=cost;
    }


    public String getDescription() {
        return this.description;
    }

    public double cost() {
        return this.cost;
    }
}
