package command;

/**
 * Created by zhangziyang on 14-9-12.
 */
public class OffCommand implements Command {
    @Override
    public void execute() {
        System.out.println("this is off command");
    }
}
