package adapterandfacade;

/**
 * Created by zhangziyang on 14-9-17.
 */
public abstract class AbstractAdapter implements Listener {
    @Override
    public abstract void action1() ;

    @Override
    public abstract void action2() ;

    @Override
    public void action3() {
        System.out.println("action3 is covered by abstract classss");
    }
}
