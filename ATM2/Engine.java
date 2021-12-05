package ATM2;
import java.util.Scanner;


public class Engine {
    boolean session = true;
    int money;
    boolean checkingAccount = true;
    int checkingAmount;
    int savingsAmount;


    Engine(int startingCheckingAmount, int startingSavingsAmount){
        Scanner engineInput = new Scanner(System.in);
        while(session){
            System.out.println("Checking or Savings?");
            String account = engineInput.nextLine();
            if(account.toLowerCase().equals("savings")){
                System.out.println("Entering your Savings account.");
                checkingAccount = false;
                this.money = startingSavingsAmount;
            } else if (account.toLowerCase().equals("checking")){
                System.out.println("Entering your Savings account.");
                checkingAccount = true;
                this.money = startingCheckingAmount;
            } else {
                System.out.println("Bad input. Entering your Savings account.");
                checkingAccount = true;
                this.money = startingCheckingAmount;
            }
            System.out.println("Lets start some transactions. Would you like to deposit or withdraw?");
            String action = engineInput.nextLine();
            if(action.toLowerCase().equals("deposit")){
                System.out.println("How much would you like to deposit?");
                int amount = Integer.parseInt(engineInput.nextLine());
                this.money = deposit(amount);
                System.out.println("You have $" + this.money + " in your account.");
            } else if (action.toLowerCase().equals("withdraw")){
                System.out.println("How much would you like to withdraw?");
                int amount = Integer.parseInt(engineInput.nextLine());
                this.money = withdraw(amount);
                System.out.println("You have $" + this.money + " in your account.");
            } else if (action.toLowerCase().equals("exit")) {
                session = false;
                System.out.println("Good Bye. Loggin you out now.");
            } else {
                System.out.println("Bad input");
            }
        }
        engineInput.close();
    }
    public void hello(String x) {
        System.out.println(x);
    }

    public int withdraw(int withdrawAmount){
        return this.money - withdrawAmount;
    }

    public int deposit(int depositAmount){
        return this.money + depositAmount;
    }
}
