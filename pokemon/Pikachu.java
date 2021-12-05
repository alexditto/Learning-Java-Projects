package pokemon;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Pikachu {
    String name;
    int level;
    String[] type = new String[2];
    int hp;
    int attack;
    int defence;
    int spAttack;
    int spDef;
    int speed;

    Pikachu(){
        this.name = "Pikachu";
        this.level = 5;
        this.type[0] = "Electric";
        this.hp = 35;
        this.attack = 55;
        this.defence = 40;
        this.spAttack = 50;
        this.spDef = 50;
        this.speed = 90;

        System.out.println("New Pikachu");
        new Pokemon(name, level, type, hp, attack, defence, spAttack, spDef, speed);
    }

    public int growl() {
        int power = 0;
        System.out.println(this.name + " Growl!");
        return power;
    }

    public int quickAttack() {
        int power = 40;
        System.out.println(this.name + " Quick Attack!");
        return power;
    }

    public int thunderShock() {
        int power = 40;
        System.out.println(this.name + " uses Thunder Shock!");
        return power;
    }

    public int thunderbolt() {
        int power = 90;
        System.out.println(this.name + " uses Thunderbolt and ...");
        pause(3);
        if(attackChance() <= 95){
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
