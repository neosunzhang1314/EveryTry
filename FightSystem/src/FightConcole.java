/**
 * Created by zhangziyang on 14/10/22.
 */
public class FightConcole {
    public static void main(String[] args) {
        Player player=new Player();
        OldSword oldSword=new OldSword(5);
        System.out.println("without sword: attack="+player.getAttack());
        player.setOldSword(oldSword);
        System.out.println("with sword: attack="+player.getAttack());
    }
    //todo  下面要解决的问题的是个人武器属性不只是只有attack还要添加magic、speed...
    //todo  还要能解决可以自由定义武器的问题，每个武器可以自由的出现magic、attack、speed属性
    //todo  自由的向系统里面添加武器，并提供武器的选择界面来购买和武器。
    //todo  并且提供个人的背包，进行武器的装配
    //todo  能够查看当前的个人的装备
    //todo  进行数据的持久话操作（oracle） 在下次登录系统的时候能够显示当前用户的情况。
    ////////////////////以上是第一次的程序迭代目标///////////

}
