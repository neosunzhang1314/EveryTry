package iterator;

/**
 * Created by zhangziyang on 14-9-23.
 */
public class Component implements MenuItem {
    public String name;
    public Component(String name){
        this.name=name;
    }
    public void print() {
        System.out.println("Component:"+name);
    }

    @Override
    public void getName() {
        System.out.println(name);
    }
}
