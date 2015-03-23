package iterator;

/**
 * Created by zhangziyang on 14-9-24.
 */
public class Test {
    public static void main(String[] args) {
        Menu content=new Menu("book");
        Menu chapter1=new Menu("chapter1");
        Menu chapter2=new Menu("chapter2");
        MenuItem paper11=new Component("paper11");
        MenuItem paper12=new Component("paper12");
        MenuItem paper21=new Component("paper21");
        MenuItem paper22=new Component("paper22");
        chapter1.components.add(paper11);
        chapter1.components.add(paper12);
        chapter2.components.add(paper21);
        chapter2.components.add(paper21);
        content.components.add(chapter1);
        content.components.add(chapter2);
//        content.print();
        System.out.println("---------------------------");
        ComponentIterator iterator=new ComponentIterator(content.components.iterator());
        while(iterator.hasNext()){
            MenuItem item= (MenuItem) iterator.next();
            item.getName();
        }
    }
}
