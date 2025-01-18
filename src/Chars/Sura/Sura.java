package Chars.Sura;


import Chars.Char;
import Chars.CharTypes;

public class Sura extends Char {

    private SuraTypes suraType;


    public Sura(SuraTypes suraType, double basicAttackDamage, double attackSpeed, double baseHP, double baseDEF) {
        super(CharTypes.SURA, basicAttackDamage, attackSpeed, baseHP, baseDEF);
        this.suraType = suraType;
    }

    @Override
    public String toString() {

        return  "---------------------------------------------------------\n" +
                "Your character has been created...\n\n" +
                "Character's " + "\n" +
                "Class: " + getCharType() + "\n" +
                getSimpleName() +"'s subclass: " + this.suraType + "\n" +
                this.suraType + " " +getSimpleName() + "'s" + "\n" +
                "Basic Attack Damage: " + getBasicAttackDamage() + "\n" +
                "Attack Speed: " + getAttackSpeed() + "\n" +
                "DPS: " + getBasicAttackDamage() * getAttackSpeed() + "\n" +
                "Base HP: " + getBaseHP() + "\n" +
                "Base Def: " + getBaseDEF() + "\n";

    }
}
