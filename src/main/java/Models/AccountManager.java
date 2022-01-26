package Models;

public class AccountManager {

    private double Ammount;

    public AccountManager(){
        Ammount = 0.0;
    }

    public AccountManager(double ammount) {
        Ammount = ammount;
    }

    public double getAmmount() {
        return Ammount;
    }

    public void setAmmount(double ammount) {
        Ammount = ammount;
    }

    public void deposite(Account account, double ammnt){

        double finalAmmount = ammnt;
        double initAmmount = account.getAmount();
        finalAmmount += initAmmount;
        account.setAmount(finalAmmount);


    }
}
