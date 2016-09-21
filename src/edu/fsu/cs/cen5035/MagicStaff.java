package edu.fsu.cs.cen5035;
/**
 * Created by zaid on 9/17/16.
 */
public class MagicStaff extends BasicWeapon implements Weapon {

    public MagicStaff (){super(80);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (armor * 20/100);
        if (damage < 0) {
            return 0;
        }
        return damage;
    } 
}

