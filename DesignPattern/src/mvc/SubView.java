package mvc;

import java.util.Scanner;

/**
 * Created by zhangziyang on 14-10-9.
 */
public class SubView {
    SubController subController;
    SubModel subModel;

    public SubView(SubController subController,SubModel subModel){
        this.subController=subController;
        this.subModel=subModel;
    }

    public void initView(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要处理的数字");
        int temp=sc.nextInt();
        System.out.println("你输入的数字是"+temp);
        subController.doAction(temp);
    }

    public void display(){
        System.out.println("处理结果是："+subModel.handleNum());
    }
}
