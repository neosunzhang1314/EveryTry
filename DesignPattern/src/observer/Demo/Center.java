package observer.Demo;

import observer.Interface.Observer;
import observer.Interface.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangziyang on 14-9-4.
 */
public class Center implements Subject {
    private List<Observer> registers=new ArrayList<Observer>();


    @Override
    public void regist(Observer observer) {
        registers.add(observer);
    }

    @Override
    public void removeRegister(Observer observer) {
        registers.remove(observer);
    }

    public void setChange(int x,int y){
        for(Observer observer:registers){
            observer.update(x,y);
        }
    }
}
