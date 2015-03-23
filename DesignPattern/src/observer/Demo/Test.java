package observer.Demo;

/**
 * Created by zhangziyang on 14-9-4.
 */
public class Test {
    public static void main(String[] args) {
        Center center=new Center();
        CenterObserver centerObserver=new CenterObserver();
        center.regist(centerObserver);
        center.setChange(1,2);
    }
}
