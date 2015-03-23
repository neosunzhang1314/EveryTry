package design;

/**
 * Created by zhangziyang on 14/10/28.
 */
public class Sword implements Weapon {
    private String description;
    private int attack;
    private int magic;
    private int speed;

    public Sword() {
        this.description ="a weapon that can cut everything off";
        this.magic=10;
        this.attack=100;
        this.speed=30;

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void equipToPlayer(Player player) {
          player.setAttack(player.getAttack()+this.attack);
          player.setMagic(player.getMagic()+this.magic);
          player.setSpeed(player.getSpeed()+this.speed);
    }

    @Override
    public String getName() {
        return "Sword";
    }
}
