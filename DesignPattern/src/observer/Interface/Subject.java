package observer.Interface;

/**
 * Created by zhangziyang on 14-9-4.
 */
public interface Subject {
    public void regist(Observer observer);
    public void removeRegister(Observer observer);
}
