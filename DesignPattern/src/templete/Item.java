package templete;

/**
 * Created by zhangziyang on 14-9-18.
 */
public class Item implements Comperators {
    private Integer n;

    public Item(int n){
        this.n=n;
    }
    @Override
    public int compare(Object object) throws Exception {
        if(object!=null&&object instanceof Item){
            return this.n-((Item)object).n;
        }else{
            throw new Exception("can't compare");
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "n=" + n +
                '}';
    }
}
