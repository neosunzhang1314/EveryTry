package iterator;

import java.util.List;

/**
 * Created by zhangziyang on 14-9-20.
 */
public class Tree {

    public Tree() {

    }

    public void addNode(Item parent,Item child){
        parent.addChild(child);
    }

    public void printStructure(Item item){
        item.print();
        if(item.hasChild()){
            List<Item> child=item.getChildren();
            for(Item itemTemp:child){
                printStructure(itemTemp);
            }
        }else{
            return;
        }
    }

    public static void main(String[] args) {
        Tree tree=new Tree();
        Item headerNode=new Item("我的第一本书的目录");
        Item first=new Item("第一章");
        first.addChild(new Item("第一章 第1小节"));
        first.addChild(new Item("第一章 第2小节"));
        first.addChild(new Item("第一章 第3小节"));
        Item  second=new Item("第二章");
        second.addChild(new Item("第一章 第1小节"));
        second.addChild(new Item("第一章 第2小节"));
        second.addChild(new Item("第一章 第3小节"));
        tree.addNode(headerNode,first);
        tree.addNode(headerNode,second);
        tree.printStructure(headerNode);
    }

}
