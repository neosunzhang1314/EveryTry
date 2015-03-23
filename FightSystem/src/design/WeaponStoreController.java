package design;

/**
 * Created by zhangziyang on 14/10/28.
 */
public class WeaponStoreController {

    private WeaponStore weaponStore;
    private WeaponStoreView weaponStoreView;

    public WeaponStoreController(){
        this.weaponStore=new WeaponStore();
        this.weaponStoreView=new WeaponStoreView(this,weaponStore);
        weaponStoreView.init();
    }

    public void handle(){
        Player player=new Player();
        Integer weaponid= (Integer) weaponStoreView.getSelector().getValue("weaponid");
        Weapon selectedWeapon=weaponStore.getWeapon(weaponid);
        System.out.println("选择的武器"+selectedWeapon.getDescription());
        System.out.println("before Equipment attack:"+player.getAttack()+" magic:"+player.getMagic()+" speed:"+player.getSpeed());
        player.equipWeapon(selectedWeapon);
        System.out.println("after Equipment attack:"+player.getAttack()+" magic:"+player.getMagic()+" speed:"+player.getSpeed());

    }

    public static void main(String[] args) {
        WeaponStoreController weaponStoreController=new WeaponStoreController();
    }

}
