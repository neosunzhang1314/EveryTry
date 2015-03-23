package templete;

/**
 * Created by zhangziyang on 14-9-18.
 */
public class MyItemCollection {
    private Comperators[] items;
    private int length;
    private int currentIndex;

    public MyItemCollection(int length){
        this.length=length;
        currentIndex=0;
        items=new Comperators[length];
    }

    public void addItem(Comperators item){
        if(currentIndex<length){
        items[currentIndex]=item;
        currentIndex++;
        }else {
            System.out.println("full collection");
        }
    }

    //1 4 2 3
    public void sort() throws Exception {
       for(int i=0;i<length;i++)
           for(int j=0;j<length-i-1;j++){
               if(items[j].compare(items[j+1])>0){
                   swap(items,j,j+1);
               }
           }
    }

    private void swap(Comperators[] pool,int x,int y){
        Comperators temp=pool[x];
        pool[x]=pool[y];
        pool[y]=temp;
    }

    public static void main(String[] args) {
        MyItemCollection pool=new MyItemCollection(4);
        Item a1=new Item(1);
        Item a2=new Item(4);
        Item a3=new Item(3);
        Item a4=new Item(2);
        pool.addItem(a1);
        pool.addItem(a2);
        pool.addItem(a3);
        pool.addItem(a4);
        try {
            pool.sort();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pool);


    }
}
