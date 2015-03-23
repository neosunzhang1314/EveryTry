package command;

/**
 * Created by zhangziyang on 14-9-12.
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    public void doAction(){
        command.execute();
    }
}
