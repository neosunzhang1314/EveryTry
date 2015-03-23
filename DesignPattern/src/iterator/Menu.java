package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zhangziyang on 14-9-23.
 */
public class Menu implements MenuItem {
    public ArrayList<MenuItem> components=new ArrayList<MenuItem>();
    public String name;

    public Menu(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("menu:"+name);
        Iterator<MenuItem> iterator=components.iterator();
        while(iterator.hasNext()){
            MenuItem temp=iterator.next();
            temp.print();
        }
    }

    @Override
    public void getName() {
        System.out.println(name);
    }


}
