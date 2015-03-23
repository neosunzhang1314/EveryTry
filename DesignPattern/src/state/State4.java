package state;

/**
 * Created by zhangziyang on 14-9-28.
 */
public class State4 implements State {
    @Override
    public void action1() {
        System.out.println("State4:action1");
    }

    @Override
    public void action2() {
        System.out.println("State4:action2");
    }

    @Override
    public void action3() {
        System.out.println("State4:action3");
    }

    @Override
    public void action4() {
        System.out.println("State4:action4");
    }

    @Override
    public String toString() {
        return "State4";
    }
}
