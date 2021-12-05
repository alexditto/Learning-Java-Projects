package pokemon;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Squirtle {
    String name;
    int level;
    String[] type = new String[2];
    int hp;
    int attack;
    int defence;
    int spAttack;
    int spDef;
    int speed;

    Squirtle(){
        this.name = "Squirtle";
        this.level = 5;
        this.type[0] = "Water";
        this.hp = 44;
        this.attack = 48;
        this.defence = 65;
        this.spAttack = 50;
        this.spDef = 65;
        this.speed = 43;

        System.out.println("New Squirtle");
        new Pokemon(name, level, type, hp, attack, defence, spAttack, spDef, speed);
    }

    public int tackle() {
        int power = 40;
        System.out.println(this.name + " Tackle!");
        return power;
    }

    public int tailWhip() {
        int power = 0;
        System.out.println(this.name + " Tail Whip!");
        return power;
    }

    public int waterGun() {
        int power = 40;
        System.out.println(this.name + " uses Water Gun!");
        return power;
    }

    public int aquaTail() {
        int power = 90;
        System.out.println(this.name + " uses Aqua Tail and ...");
        pause(3);
        if(attackChance() <= 90){
            System.out.println(this.name + " Hits!!!");
            pause(1);
            return power;
        } else {
            System.out.println(this.name + " Misses!!!");
            pause(1);
            return 0;
        }
    }

    public int attackChance(){
        Random rand = new Random();
        int chance = 100;
        int randomNumber = rand.nextInt(chance);
        return randomNumber;
    }

    public void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
