package Chars.Shaman;


import Chars.Char;
import Chars.CharTypes;

public class Shaman extends Char {

    private ShamanTypes shamanType;


    public Shaman(ShamanTypes shamanType, double basicAttackDamage, double attackSpeed, double baseHP, double baseDEF) {
        super(CharTypes.SHAMAN, basicAttackDamage, attackSpeed, baseHP, baseDEF);
        this.shamanType = shamanType;
    }

    @Override
    public String toString() {

        return  "---------------------------------------------------------\n" +
                "Your character has been created...\n\n" +
                "Character's " + "\n" +
                "Class: " + getCharType() + "\n" +
                getSimpleName() +"'s subclass: " + this.shamanType + "\n" +
                this.shamanType + " " +getSimpleName() + "'s" + "\n" +
                "Level: " + getLevel() + "\n" +
                "Xp: " + getCurrentXp() + "/" + getXpToLevelUp() + "\n" +
                "Basic Attack Damage: " + getBasicAttackDamage() + "\n" +
                "Attack Speed: " + getAttackSpeed() + "\n" +
                "DPS: " + getBasicAttackDamage() * getAttackSpeed() + "\n" +
                "Base HP: " + getBaseHP() + "\n" +
                "Base Def: " + getBaseDEF() + "\n";

    }
}
