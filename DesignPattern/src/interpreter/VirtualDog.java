package interpreter;

/**
 * Created by zhangziyang on 14-10-15.
 */
public class VirtualDog {

    int step;

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void goUp(){
        System.out.println("dog go up "+step+"steps");
    }

    public void goDown(){
        System.out.println("dog go down "+step+"steps");
    }
    public void goRight(){
        System.out.println("dog go right "+step+"steps");
    }
    public void goLeft(){
        System.out.println("dog go left "+step+"steps");
    }



}
