package Chars;

import com.sun.jdi.CharType;

public abstract class Char {

    private CharTypes charType;
    private double basicAttackDamage;

    private double attackSpeed;
    private double baseHP;
    private double baseDEF;

    public Char(CharTypes charType, double basicAttackDamage, double attackSpeed, double baseHP, double baseDEF) {
        this.charType = charType;
        this.basicAttackDamage = basicAttackDamage;
        this.attackSpeed = attackSpeed;
        this.baseHP = baseHP;
        this.baseDEF = baseDEF;
    }

    public CharTypes getCharType() {
        return charType;
    }

    public double getBasicAttackDamage() {
        return basicAttackDamage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public double getBaseHP() {
        return baseHP;
    }

    public double getBaseDEF() {
        return baseDEF;
    }


    public String getSimpleName(){
       return getClass().getSimpleName();
    }

    @Override
    public String toString() {

        return  "This instance is created from parent class.\n"+
                "A " + charType + " has been created but its type did not specified!\n" +
                "charType=" + charType +
                ", basicAttackDamage=" + basicAttackDamage +
                ", attackSpeed=" + attackSpeed +
                ", baseHP=" + baseHP +
                ", baseDEF=" + baseDEF +
                '}';
    }
}
