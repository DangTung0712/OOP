package Lesson10.Lab.Lab041;

public class Program {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(500000,3000);
        checkAccount.deposit(30000);
        System.out.println("Số tiền sau khi gửi: "+checkAccount.getBalance());
        checkAccount.withDraw(50000);
        System.out.println("Số tiền sau khi rút: "+checkAccount.getBalance());
    }
}
