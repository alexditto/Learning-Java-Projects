package pokemon;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Charmander {
    String name;
    int level;
    String[] type = new String[2];
    int hp;
    int attack;
    int defence;
    int spAttack;
    int spDef;
    int speed;

    Charmander(){
        this.name = "Charmander";
        this.level = 5;
        this.type[0] = "Fire";
        this.hp = 39;
        this.attack = 52;
        this.defence = 43;
        this.spAttack = 60;
        this.spDef = 50;
        this.speed = 65;


        System.out.println("New Charmander");
        String[] type = {"Fire"};
        new Pokemon("Charmander", 5, type, 39, 52, 43, 60, 50, 65);
    }

    public int growl() {
        int power = 0;
        System.out.println(this.name + " Growls!");
        return power;
    }

    public int scratch() {
        int power = 40;
        System.out.println(this.name + " Scratch!");
        return power;
    }

    public int ember() {
        int power = 45;
        System.out.println(this.name + " uses Ember!");
        return power;
    }

    public int fireFang() {
        int power = 90;
        System.out.println(this.name + " uses Fire Fang and ...");
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
