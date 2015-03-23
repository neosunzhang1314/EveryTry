package mvc;

import java.util.Scanner;

/**
 * Created by zhangziyang on 14-10-8.
 */
public class TraditionalAction {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请选择你要做的动作:");
        System.out.println("1:动作1");
        System.out.println("2:动作2");
        System.out.println("3:动作3");
        int temp=sc.nextInt();
        System.out.println("您是采取的动作"+temp);
        if(temp==1){
            System.out.println("这是执行动作1");
        }else if(temp==2){
            System.out.println("这是执行动作2");
        }else if(temp==3){
            System.out.println("这是执行动作3");
        }
        System.out.println("感谢您的操作！");
    }
}
