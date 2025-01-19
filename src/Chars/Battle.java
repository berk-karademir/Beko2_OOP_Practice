package Chars;

public class Battle {
    public static void battle(Char champ1, Char champ2) {
        double champ1Hp = champ1.getBaseHP();
        double champ2Hp = champ2.getBaseHP();
        double champ1Power = champ1.getBasicAttackDamage() * champ1.getAttackSpeed();
        double champ2Power = champ2.getBasicAttackDamage() * champ2.getAttackSpeed();

        System.out.println(champ1.getSimpleName() + " vs " + champ2.getSimpleName());

        while (champ1Hp > 0) {
            // Champ2 hits chamğ1
            System.out.println(champ2.getSimpleName() + " attacks " + champ1.getSimpleName());
            champ1Hp -= champ2Power;
            System.out.println(champ1.getSimpleName() + " Hp after attack: " + champ1Hp);

            // Check if champ1 died
            if (champ1Hp <= 0) {
                System.out.println(champ1.getSimpleName() + " died");
                // champ2 gains Xp
                champ2.gainXp(150);
                break;
            }
        }
    }
}
