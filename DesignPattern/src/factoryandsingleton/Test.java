package factoryandsingleton;

/**
 * Created by zhangziyang on 14-9-11.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory4=AbstractFactory.getFactoryInstance("fac2");
        AbstractFactory factory1=AbstractFactory.getFactoryInstance("fac2");
        AbstractFactory factory2=AbstractFactory.getFactoryInstance("fac2");
        AbstractFactory factory3=AbstractFactory.getFactoryInstance("fac2");
        System.out.println(factory1);
        System.out.println(factory2);
        System.out.println(factory3);
//        AbstractProduct product=factory4.createProduct("product2");
//        System.out.println(product.getName());
    }
}
