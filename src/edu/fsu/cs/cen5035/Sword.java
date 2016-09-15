package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class Sword implements Weapon {

    private final int HITPOINTS = 50;

    @Override
    public int hit() {
        return HITPOINTS;
    }

    @Override
    public int hit(int armor) {
        int damage = HITPOINTS - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
