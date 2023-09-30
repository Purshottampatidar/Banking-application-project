package banking;

public interface RBI {

    public int checkBalance(String pass);
    public String addMoney(String pass,int money);
    public String withdraw(String pas,int money);
    public Double calculateInterest(int years);
}
