package Chars.Warrior;

import Chars.Char;
import Chars.CharTypes;
public class Warrior extends Char {

    private WarriorTypes warriorType;

    public Warrior(WarriorTypes warriorType, double basicAttackDamage, double attackSpeed, double baseHP, double baseDEF) {
        super(CharTypes.WARRIOR, basicAttackDamage, attackSpeed, baseHP, baseDEF);
        this.warriorType = warriorType;
    }

    @Override
    public String toString() {

        return  "---------------------------------------------------------\n" +
                "Your character has been created...\n\n" +
                "Character's " + "\n" +
                "Class: " + getCharType() + "\n" +
                getSimpleName() +"'s subclass: " + this.warriorType + "\n" +
                this.warriorType + " " +getSimpleName() + "'s" + "\n" +
                "Basic Attack Damage: " + getBasicAttackDamage() + "\n" +
                "Attack Speed: " + getAttackSpeed() + "\n" +
                "DPS: " + getBasicAttackDamage() * getAttackSpeed() + "\n" +
                "Base HP: " + getBaseHP() + "\n" +
                "Base Def: " + getBaseDEF() + "\n";

    }
}
