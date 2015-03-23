package design;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by zhangziyang on 14/10/30.
 */
public class Selector {
    private Map buffer;

    public Selector(){
        buffer=new HashMap();
    }

    public void register(String key){
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        buffer.put(key,value);
    }

    public Object getValue(String key){
        return buffer.get(key);
    }


}
