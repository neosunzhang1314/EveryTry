package state;

/**
 * Created by zhangziyang on 14-9-28.
 */
public class State2 implements State {
    @Override
    public void action1() {
        System.out.println("State2:action1");
    }

    @Override
    public void action2() {
        System.out.println("State2:action2");
    }

    @Override
    public void action3() {
        System.out.println("State2:action3");
    }

    @Override
    public void action4() {
        System.out.println("State2:action4");
    }

    @Override
    public String toString() {
        return "State2";
    }
}
