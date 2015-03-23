package interpreter;

import java.util.Scanner;

/**
 * Created by zhangziyang on 14-10-15.
 */
public class TestDrive {
    public static void main(String[] args) {
        VirtualDog virtualDog=new VirtualDog();
        OldInterpreter oldInterpreter=new OldInterpreter(virtualDog);
        while(true){
            System.out.println("请输入指令：");
            Scanner scanner=new Scanner(System.in);
            String command=scanner.nextLine();
            oldInterpreter.doCommand(command);
        }
    }
}
