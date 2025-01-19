package Mobs;

public abstract class Mob {
    private Mobs mob;
    private double basicAttackDamage;
    private double attackSpeed;
    private double baseHP;
    private double baseDef;
    private MobLevels mobLevel;

    public Mob(Mobs mob, MobLevels mobLevel, double basicAttackDamage, double attackSpeed, double baseHP, double baseDef) {
        this.mob = mob;
        this.basicAttackDamage = basicAttackDamage;
        this.attackSpeed = attackSpeed;
        this.baseHP = baseHP;
        this.baseDef = baseDef;
        this.mobLevel = mobLevel;

        // Level scaling
        if (mobLevel == MobLevels.WILD) {
            this.basicAttackDamage *= 1.5;
            this.attackSpeed *= 1.5;
            this.baseHP *= 1.5;
            this.baseDef *= 1.5;
        } else if (mobLevel == MobLevels.HELL) {
            this.basicAttackDamage *= 2;
            this.attackSpeed *= 2;
            this.baseHP *= 2;
            this.baseDef *= 2;
        }
    }

    public Mobs getMob() {
        return mob;
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

    public double getBaseDef() {
        return baseDef;
    }

    public MobLevels getMobLevel() {
        return mobLevel;
    }

    @Override
    public String toString() {
        return "-------------------------------------------\n" +
                "A " + mobLevel + " " + mob + " has been created.\n" +
                "Attack damage: " + basicAttackDamage + "\n" +
                "Attack Speed: " + attackSpeed + "\n" +
                "HP: " + baseHP + "\n" +
                "Defense: " + baseDef + "\n";
    }
}
