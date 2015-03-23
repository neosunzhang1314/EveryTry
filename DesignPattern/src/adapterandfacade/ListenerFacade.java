package adapterandfacade;

/**
 * Created by zhangziyang on 14-9-17.
 */
public class ListenerFacade implements Facade {
    private Listener listener;
    public ListenerFacade(Listener listener){
        this.listener=listener;
    }
    @Override
    public void doAll() {
        System.out.println("do All action {facade}");
        listener.action1();
        listener.action2();
        listener.action3();
    }
}
