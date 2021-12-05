package pokemon;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Bulbasaur {
    String name;
    int level;
    String[] type = new String[2];
    int hp;
    int attack;
    int defence;
    int spAttack;
    int spDef;
    int speed;

    Bulbasaur(){
        this.name = "Bublbasaur";
        this.level = 5;
        this.type[0] = "Grass";
        this.type[1] = "Posion";
        this.hp = 45;
        this.attack = 49;
        this.defence = 49;
        this.spAttack = 65;
        this.spDef = 65;
        this.speed = 45;


        System.out.println("New Bulbasaur");
        new Pokemon(name, level, type, hp, attack, defence, spAttack, spDef, speed);
    }

    public int growl() {
        int power = 0;
        System.out.println(this.name + " Growls!");
        return power;
    }
    
    public int tackle() {
        int power = 40;
        System.out.println(this.name + " uses Tackle!");
        return power;
    }

    public int vineWhip() {
        int power = 45;
        System.out.println(this.name + " uses Vine Whip!");
        return power;
    }

    public int razorLeaf() {
        int power = 55;
        System.out.println(this.name + " uses Razor Leaf and ...");
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
