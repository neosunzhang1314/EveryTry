package design;

/**
 * Created by zhangziyang on 14/10/28.
 */
public interface Weapon {
    String getDescription();
    void  equipToPlayer(Player player);
    String getName();
}
