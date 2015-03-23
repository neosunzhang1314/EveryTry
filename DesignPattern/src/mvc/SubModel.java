package mvc;

/**
 * Created by zhangziyang on 14-10-9.
 */
public class SubModel {
    int num;

    public int handleNum() {
        return num*2;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
