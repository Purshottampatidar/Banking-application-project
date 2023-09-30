package banking;

public class NoBank implements RBI{

    private String accNo;
    private int balance;
    private String pass;
    public static final int RateOfInterest=9;

    public NoBank(String accNo, int balance, String pass) {
        this.accNo = accNo;
        this.balance = balance;
        this.pass = pass;
    }

    public int checkBalance(String enteredPass) {
        if(enteredPass.equals(pass)){
            return balance;
        }
        return -1;
    }

    public String addMoney(String pass, int money) {
        if(pass.equals(this.pass)){
            balance+=money;
            return "new balance after adding money"+balance;
        }
        else{
            return "Invalid Password";
        }
    }

    public String withdraw(String pass, int money) {
        if(pass.equals(this.pass)){
            if(balance>=money){
                balance-=money;
                return "new balance after Withdraw money"+balance;
            }
            else{
                return "Insufficient balance Or please enter a valid amount";
            }

        }
        else{
            return "Invalid Password";
        }
    }

    public Double calculateInterest(int years) {
        return (RateOfInterest*balance*years*1.0)/100;
    }
}
