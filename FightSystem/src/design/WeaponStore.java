package design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangziyang on 14/10/28.
 */
public class WeaponStore {
    private List<Weapon> weapons;

    public WeaponStore() {
        this.weapons = Arrays.asList(new Gun(),new Sword());
    }

    public void addWeapon(Weapon weapon){
        if(weapon==null){
            weapons=new ArrayList<Weapon>();
        }
        weapons.add(weapon);
    }

    public void removeWeapon(Weapon weapon){
        weapons.remove(weapon);
    }

    public Weapon getWeapon(int i){
        return weapons.get(i);
    }


    public List<Weapon> getWeapons(){
        return weapons;
    }

}
