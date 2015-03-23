package mvc;

/**
 * Created by zhangziyang on 14-10-9.
 */
public class SubController {
    SubModel subModel;
    SubView  subView;

    public SubController(){
        subModel=new SubModel();
        subView=new SubView(this,subModel);
        subView.initView();
        subView.display();
    }

    public void doAction(int num){
        subModel.setNum(num);
    }

}
