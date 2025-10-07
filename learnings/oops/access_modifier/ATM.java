package learnings.oops.access_modifier;

public class ATM extends BankDetails{
//    public ATM(int bankBalance , String statement){
//        super(bankBalance,statement);
//    }

        public ATM(int bankBalance , String statement){
        super(bankBalance,statement);
    }

    public static void main(String[] args) {
        ATM obj = new ATM(100, "today credit");
        System.out.println(obj instanceof BankDetails);
    }

}


