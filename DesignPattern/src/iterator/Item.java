package iterator;

import java.util.ArrayList;

/**
 * Created by zhangziyang on 14-9-20.
 */
public class Item {
    private Item parent;
    private String message;
    private ArrayList<Item> children;

    public Item() {
        parent=new Item();
        children=new ArrayList<Item>();
    }

    public Item(String message) {
        this.message = message;
    }

    public void print(){
        System.out.println((parent!=null?parent.getMessage()+"-:-":"")+message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addChild(Item item){
        if(children==null){
            children=new ArrayList<Item>();
        }
        item.setParent(this);
        children.add(item);
    }

    public void removeChild(Item item){
        if(children==null){
            return;
        }
        children.remove(item);
    }

    public Item getParent() {
        return parent;
    }

    public void setParent(Item parent) {
        this.parent = parent;
    }

    public boolean hasChild(){
        if(children==null||children.size()==0){
            return false;
        }else {
            return true;
        }
    }


    public ArrayList<Item> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Item> children) {
        this.children = children;
    }
}
