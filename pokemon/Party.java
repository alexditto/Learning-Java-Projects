package pokemon;

public class Party {
    String[] party = new String[6];
    String newMember;

    Party(){
        // this.newMember = pokemon;
        // party = addX(party.length, party, newMember);
    }

    public void addPokemon(String newMember){
        // party = addX(party.length, party, newMember);
        for(int i = 0; i < party.length; i++){
            if(party[i] == null){
                party[i] = newMember;
                System.out.println(newMember + " was added to your party.");
                return;
            }
        }
        System.out.println("No room in party. Please remove a pokemon first.");
    }

    public void removePokemon(String removedMember){
        for(int i = 0; i < party.length; i++){
            if(party[i] == removedMember){
                party[i] = null;
                System.out.println(newMember + " was removed from your party.");
                return;
            }
        }
        System.out.println(removedMember + " is not currently in the party.");
    }

    public void checkPartyLength() {
        int count = 0;
        String pokemonList = "";
        for(int i = 0; i < party.length; i++){
            if(party[i] != null){
                count ++;
                pokemonList += party[i] + " ";
            }
        }
        System.out.println("The current party has " + count + " members.");   
        System.out.println("The current party is " + pokemonList);
    }

    public static String[] addX(int n, String arr[], String x){
        int i;
        String newArr[] = new String[n+1];
        for (i=0; i<n; i++){
            newArr[i] = arr[i];
        }
        newArr[n] = x;

        return newArr;
    }
}
