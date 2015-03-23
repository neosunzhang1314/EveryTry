package design;

import java.util.List;
import java.util.Scanner;

/**
 * Created by zhangziyang on 14/10/28.
 */
public class WeaponStoreView {

    private WeaponStore weaponStore;
    private WeaponStoreController weaponStoreController;
    private Selector selector;

    public WeaponStoreView(WeaponStoreController weaponStoreController,WeaponStore weaponStore) {
        this.weaponStore=weaponStore;
        this.weaponStoreController=weaponStoreController;
        this.selector=new Selector();
    }

    public Selector getSelector() {
        return selector;
    }

    public void init(){
        System.out.println("请选择你需要的武器：");
        List<Weapon> weapons=weaponStore.getWeapons();
        for(int i=0;i<weapons.size();i++){
            Weapon weapon=weapons.get(i);
            System.out.println("编号 "+i+": "+weapon.getName()+" Description : "+weapon.getDescription());
        }
        System.out.println("请输入你要装备的武器的编号：");
        selector.register("weaponid");
        weaponStoreController.handle();

    }

}
