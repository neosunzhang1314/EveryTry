package adapterandfacade;

/**
 * Created by zhangziyang on 14-9-17.
 */
public class ListenerAdapter implements Adapter {
    private Listener listener;

    public  ListenerAdapter(Listener listener){
        this.listener=listener;
    }
    @Override
    public void specialAction() {
        System.out.println("do specialAction(interface adapter)");
       listener.action1();
    }
}
