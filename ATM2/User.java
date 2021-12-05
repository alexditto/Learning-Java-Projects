package ATM2;

public class User {
    int pin;

    User(int startingCheckingAmount, int startingSavingAmount, int pin){
        System.out.println("User");
        this.pin = pin;
        this.printPin();
        new Engine(startingCheckingAmount, startingSavingAmount);
    }

    public void printPin() {
        System.out.println(this.pin);
    }
}
