package observer.Demo;

import observer.Interface.Display;
import observer.Interface.Observer;

/**
 * Created by zhangziyang on 14-9-4.
 */
public class CenterObserver implements Observer, Display {
    private int x;
    private int y;
    public void update(int x, int y) {
        this.x=x;
        this.y=y;
        display();
    }

    public void display() {
        System.out.println("observer x="+x+"observer y="+y);
    }
}
