package Lesson10.Lab.Lab041;

public class CheckAccount extends Account{
    private double feeTransfer;
    public CheckAccount(double initialize,double feeTransfer) {
        super(initialize);
        this.feeTransfer = feeTransfer;
    }

    @Override
    public void deposit(double money) {
        super.deposit(money);
        super.setBalance(super.getBalance()-feeTransfer);
    }

    @Override
    public void withDraw(double money) {
        super.withDraw(money);
        super.setBalance(super.getBalance()-feeTransfer);
    }
}
