package mvc;

/**
 * Created by zhangziyang on 14-10-8.
 */
public class Controller {
    View view;
    Model model;
    SubController subController;
    public Controller(){
        model=new Model();
        view=new View(this,model);
        view.initView();
        view.display();
    }

    public void doAction(int op){
       if(op==4){
           try {
               subController= (SubController) ((Class)ControllerManager.controllerFactory.get("subController")).newInstance();
           } catch (InstantiationException e) {
               e.printStackTrace();
           } catch (IllegalAccessException e) {
               e.printStackTrace();
           }
       }
        model.setOp(op);
    }

    public static void main(String[] args) {
        try {
            Controller controller= (Controller) ((Class)ControllerManager.controllerFactory.get("mainController")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
