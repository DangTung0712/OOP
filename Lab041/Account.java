package Lesson10.Lab.Lab041;

public class Account {
    private double balance;

    public Account(double initialize){
        this.balance = initialize;
    }
    public void deposit(double money){
        balance += money;
        System.out.println("Gửi tiền thành công");
    }
    public void withDraw(double money){
        balance -= money;
        System.out.println("Rút tiền thành công");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
