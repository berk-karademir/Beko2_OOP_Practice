package Chars.Ninja;


import Chars.Char;
import Chars.CharTypes;

public class Ninja extends Char {

    private NinjaTypes ninjaType;




    public Ninja(NinjaTypes ninjaType, double basicAttackDamage, double attackSpeed, double baseHP, double baseDEF) {
        super(CharTypes.NINJA, basicAttackDamage, attackSpeed, baseHP, baseDEF);
        this.ninjaType = ninjaType;
    }


    @Override
    public String toString() {
        return  "---------------------------------------------------------\n" +
                "Your character has been created...\n\n" +
                "Character's " + "\n" +
                "Class: " + getCharType() + "\n" +
                getSimpleName() +"'s subclass: " + this.ninjaType + "\n" +
                this.ninjaType + " " +getSimpleName() + "'s" + "\n" +
                "Basic Attack Damage: " + getBasicAttackDamage() + "\n" +
                "Attack Speed: " + getAttackSpeed() + "\n" +
                "DPS: " + getBasicAttackDamage() * getAttackSpeed() + "\n" +
                "Base HP: " + getBaseHP() + "\n" +
                "Base Def: " + getBaseDEF() + "\n";
    }
}
