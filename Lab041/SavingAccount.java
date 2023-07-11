package Lesson10.Lab.Lab041;

public class SavingAccount extends Account{
    private double rate;

    public SavingAccount(double initialize, double rate) {
        super(initialize);
        this.rate = rate;
    }
    public double getInterest(){
        return rate*super.getBalance();
    }
}
