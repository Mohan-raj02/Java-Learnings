//encapsulation
package learnings.oops.encapsulation;

public class BankAccount {
    private double balance;


//    setter
    public void deposit(int amount){
        System.out.println("print:"+ balance);
        if(amount > 0){
            balance += amount;
        }
    }

//    getter
    public double getBalance(){
        return balance;
    }
}




