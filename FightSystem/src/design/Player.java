package design;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangziyang on 14/10/27.
 */
public class Player {
    private int attack;
    private int magic;
    private int speed;
    private List<Weapon> weapons;

    public Player() {
        this.attack =50;
        this.magic = 50;
        this.speed = 50;
        weapons=new ArrayList<Weapon>();
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void equipWeapon(Weapon weapon){
        weapons.add(weapon);
        weapon.equipToPlayer(this);
    }



}
