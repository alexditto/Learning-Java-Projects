package ATM2;
import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args){
        System.out.println("Started");
        Scanner myInput = new Scanner(System.in);
        System.out.println("What is your starting Checking Amount?");
        int startingCheckingAmount = myInput.nextInt();
        System.out.println("What is your starting Saving Amount?");
        int startingSavingAmount = myInput.nextInt();
        System.out.println("What is your pin?");
        int pin = myInput.nextInt();
        new User(startingCheckingAmount, startingSavingAmount, pin);
        
    }

}

