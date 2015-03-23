package design;

/**
 * Created by zhangziyang on 14/10/28.
 */
public class Gun implements Weapon {
    private String description;
    private int attack;
    private int magic;

    public Gun() {
        this.description ="a damn dangerous weapon that damage everything into pieces";
        this.attack=50;
        this.magic=20;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void equipToPlayer(Player player) {
        player.setAttack(player.getAttack()+this.attack);
        player.setMagic(player.getMagic()+this.magic);
    }

    @Override
    public String getName() {
        return "gun";
    }


}
