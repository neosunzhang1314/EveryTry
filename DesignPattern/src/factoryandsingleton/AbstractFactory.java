package factoryandsingleton;

/**
 * Created by zhangziyang on 14-9-11.
 */
public abstract class AbstractFactory {
    private static AbstractFactory factory;
    public  AbstractFactory(){}

    public static AbstractFactory getFactoryInstance(String facString){
        if("fac1".equals(facString)){
            if(factory!=null&&factory instanceof Factory1){
                return factory;
            }else{
                factory=new Factory1();
            }

        }else if("fac2".equals(facString)){
            if(factory!=null&&factory instanceof Factory2){
                return factory;
            }else{
                factory= new Factory2();
            }
        }else{
            factory=null;
        }
        return factory;
    }


    public abstract AbstractProduct createProduct(String type);
}
