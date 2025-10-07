package learnings.oops.access_modifier;

import java.util.Arrays;

public class BankDetails {
    private int bankBalance;
    String statement;
    int[] amount_transaction;

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public BankDetails(int bankBalance , String statement) {
        this.bankBalance = bankBalance;
        this.statement = statement;
        this.amount_transaction = new int[bankBalance];
    }

//    public BankDetails() {
//        this.bankBalance = -10;
//    }

    void bankVisit(){
        System.out.println("yesteerday morning");
    }

    @Override
    public String toString() {
        return "BankDetails{" +
                "bankBalance=" + bankBalance +
                ", statement='" + statement + '\'' +
                ", amount_transaction=" + Arrays.toString(amount_transaction) +
                '}';
    }
}
