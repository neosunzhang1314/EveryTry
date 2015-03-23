package decorator;

/**
 * Created by zhangziyang on 14-9-5.
 */
public class Test {

    public static void main(String[] args) {
        Coffee coffee=new BlackCoffee("black coffee",20);
        System.out.println("description:"+coffee.getDescription()+"cost:"+coffee.cost());
        Coffee milkCoffee=new MilkCoffee(coffee);
        System.out.println("description:"+milkCoffee.getDescription()+"cost:"+milkCoffee.cost());

    }
}
