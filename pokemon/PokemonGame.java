package pokemon;

public class PokemonGame {
    
    public static void main(String[] args){
        Party myParty = new Party();
        Bulbasaur p1 = new Bulbasaur();
        System.out.println(p1.name + " does " + p1.razorLeaf() + " damage.");
        myParty.addPokemon(p1.name);
        Charmander p2 =new Charmander();
        p2.fireFang();
        myParty.addPokemon(p2.name);
        Squirtle p3 = new Squirtle();
        p3.aquaTail();
        myParty.addPokemon(p3.name);
        Pikachu p4 = new Pikachu();
        p4.thunderbolt();
        myParty.addPokemon(p4.name);
        myParty.addPokemon(p4.name);
        myParty.addPokemon(p4.name);
        myParty.addPokemon(p4.name);
        myParty.removePokemon(p4.name);
        myParty.checkPartyLength();
    }

}

