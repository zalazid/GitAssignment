/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
       /*
       * behavior of weapon with 20 points armors point and with no armor for:
       * 1- sword
       * 2- arrow
       * 3- MagicStaff
       * 4- Axe
       * */

       // sword no armor
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        // sword 20 armors points
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");

       // arrow no armor
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        // arrow 20 armor points
         armor = 20;
        System.out.println("Arrow was able to do " + arrow.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        //MagicStaff no armor
        Weapon magicstaff = WeaponFactory.getWeapon("magicstaff");
        System.out.println("MagicStaff has " + magicstaff.hit() + " of damage.");
        //MagicStaff 20 armor points
        armor = 20;
        System.out.println("MagicStaff was able to do " + magicstaff.hit(armor) + " of damage due to an armor with "+armor+ " points.");

        //Axe no armor
        Weapon axe = WeaponFactory.getWeapon("axe");
        System.out.println("Axe has " + axe.hit() + " of damage.");
        //Axe 20 armor points
        armor = 20;
        System.out.println("Axe was able to do " + axe.hit(armor) + " of damage due to an armor with "+armor+ " points.");
    }
}
