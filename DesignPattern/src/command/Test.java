package command;

/**
 * Created by zhangziyang on 14-9-12.
 */
public class Test {
    public static void main(String[] args) {
        Command on=new OnCommand();
        Command off=new OffCommand();
        Invoker invoker=new Invoker();
        invoker.setCommand(on);
        invoker.doAction();
        invoker.setCommand(off);
        invoker.doAction();

    }
}
