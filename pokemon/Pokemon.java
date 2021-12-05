package pokemon;

public class Pokemon {
    String name;
    int level;
    String[] type = new String[2];
    int hp;
    int attack;
    int defence;
    int spAttack;
    int spDef;
    int speed;

    Pokemon(String name, int level, String[] type, int hp, int attack, int defence, int spAttack, int spDef, int speed){
        this.name = name;
        this.level = level;
        for(int i = 0; i < type.length; i++){
            this.type[i] = type[i]; 
        }
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.spAttack = spAttack;
        this.spDef = spDef;
        this.speed = speed;
    }

    public void attack(){
        System.out.println(this.name + " attacks!");
    }

    public void run() {
        System.out.println(this.name + " runs away!");
    }


}
