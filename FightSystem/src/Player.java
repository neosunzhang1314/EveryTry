/**
 * Created by zhangziyang on 14/10/22.
 */
public class Player {
   private OldSword oldSword;
   private int attack;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public OldSword getOldSword() {
        return oldSword;
    }

    public void setOldSword(OldSword oldSword) {
        this.oldSword = oldSword;
    }

    private void fireWeaponChange(){
        this.attack+=oldSword.getAttack();
    }

}
