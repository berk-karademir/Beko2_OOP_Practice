package Chars;

import com.sun.jdi.CharType;

public abstract class Char {

    private CharTypes charType;
    private double basicAttackDamage;

    private double attackSpeed;
    private double baseHP;
    private double baseDEF;

    //new instance values for leveling up
    private int level;
    private int currentXp;
    private int xpToLevelUp;

    public Char(CharTypes charType, double basicAttackDamage, double attackSpeed, double baseHP, double baseDEF) {
        this.charType = charType;
        this.basicAttackDamage = basicAttackDamage;
        this.attackSpeed = attackSpeed;
        this.baseHP = baseHP;
        this.baseDEF = baseDEF;
        this.level = 1;
        this.currentXp = 0;
        this.xpToLevelUp = 100;
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

    //new getter for leveling instances
    public int getLevel() {
        return level;
    }

    public int getCurrentXp() {
        return currentXp;
    }

    public int getXpToLevelUp() {
        return xpToLevelUp;
    }

    public String getSimpleName(){
       return getClass().getSimpleName();
    }

    //method for levelling up
    private void levelUp() {
        this.level++;
        this.currentXp -= this.xpToLevelUp;
        this.xpToLevelUp += 50;

        this.basicAttackDamage += 5;
        this.baseHP += 20;
        this.baseDEF += 5;

        System.out.println("Leveled up! " + getSimpleName() + " reached Level " + getLevel());
        System.out.println("New Attack Damage: " + basicAttackDamage);
        System.out.println("New HP: " + baseHP);
        System.out.println("New DEF: " + baseDEF);
        System.out.println("Xp to next Level: " + getXpToLevelUp());
    }

    //method for gaining xp
    public void gainXp(int xp) {
        currentXp += xp;
        System.out.println("Gained " + xp + " Xp. Current Xp is now " + currentXp + "/" + xpToLevelUp);

        // Check if we can level up, if yes level up
        if (currentXp >= xpToLevelUp) {
            levelUp();
        }
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
