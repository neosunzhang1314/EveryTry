package mvc;

import java.util.Scanner;

/**
 * Created by zhangziyang on 14-10-8.
 */
public class View {
    Controller controller;
    Model model;
    public View(Controller controller,Model model){
       this.controller=controller;
       this.model=model;
    }

    public void initView(){
        Scanner sc =new Scanner(System.in);
        System.out.println("请选择你要做的动作:");
        System.out.println("1:动作1");
        System.out.println("2:动作2");
        System.out.println("3:动作3");
        System.out.println("4:动作4，打开下一个菜单");
        int temp=sc.nextInt();
        System.out.println("您是采取的动作"+temp);
        controller.doAction(temp);
    }

    public void display(){
        if(model.getOp()!=0){
            System.out.println("您执行的操作"+model.getOp());
        }
    }

}
