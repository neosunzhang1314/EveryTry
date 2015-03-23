package factoryandsingleton;

/**
 * Created by zhangziyang on 14-9-11.
 */
public class Factory2 extends AbstractFactory {
    @Override
    public AbstractProduct createProduct(String type) {
        if("product1".equals(type)){
            return new FAC2Product1();
        }else if("product2".equals(type)){
            return new FAC2Product2();
        }
        return null;
    }
}
