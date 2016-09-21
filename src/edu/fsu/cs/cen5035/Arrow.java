package edu.fsu.cs.cen5035;
/**
 * Created by zaid on 9/17/16.
 */
public class Arrow extends BasicWeapon implements Weapon {

    public Arrow() { super(70);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
