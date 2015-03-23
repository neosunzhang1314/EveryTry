package iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by zhangziyang on 14-9-24.
 */
public class ComponentIterator implements Iterator {

    public Stack iteratorStack=new Stack();

    public ComponentIterator(Iterator iterator){
        iteratorStack.push(iterator);
    }

    @Override
    public boolean hasNext() {
       if(iteratorStack.isEmpty()){
           return false;
       }else{
           Iterator iterator= (Iterator) iteratorStack.peek();
           if(!iterator.hasNext()){
               iteratorStack.pop();
               return hasNext();
           }else{
               return true;
           }
       }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator= (Iterator) iteratorStack.peek();
            MenuItem item= (MenuItem) iterator.next();
            if(item instanceof Menu){
                iteratorStack.push(((Menu)item).components.iterator());
            }
                return item;
        }else{
            return null;
        }
    }

    @Override
    public void remove() {

    }
}
