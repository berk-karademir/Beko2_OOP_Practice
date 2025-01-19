import Chars.Battle;
import Chars.Char;
import Chars.CharTypes;
import Chars.Ninja.Ninja;
import Chars.Ninja.NinjaTypes;
import Chars.Shaman.Shaman;
import Chars.Shaman.ShamanTypes;
import Chars.Sura.Sura;
import Chars.Sura.SuraTypes;
import Chars.Warrior.Warrior;
import Chars.Warrior.WarriorTypes;

public class Arena {
    public static void main(String[] args) {

        Char mentalWarr = new Warrior(WarriorTypes.MENTAL,7,1.5,125,40);
        System.out.println(mentalWarr);


        Char weaponSura = new Sura(SuraTypes.MAGIC_BLADE,6,1.5, 100, 20);
        System.out.println(weaponSura);


        Char assassin = new Ninja(NinjaTypes.ASSASSIN, 5, 3.5,80,15);
        System.out.println(assassin);

        Char bufferShaman = new Shaman(ShamanTypes.BUFFER, 4,1.5,125,30);
        System.out.println(bufferShaman);

        // abstract classtan sınıf oluşturamazsın
//        Char charFromChar = new Char(CharTypes.SURA,10,10,10,10);
//        System.out.println(charFromChar);

        lines();

        System.out.println(mentalWarr.getSimpleName() + " kills a monster");
        mentalWarr.gainXp(120);

        lines();

        System.out.println(weaponSura.getSimpleName() + " completes a quest");
        weaponSura.gainXp(50);

        lines();

        //battle characters
        //need some fixing, only champ2 attacks atm
        Battle.battle(assassin, bufferShaman);
    }

    public static void lines() {
        System.out.println("-------------------------");
    }
}