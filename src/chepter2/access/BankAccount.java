package chepter2.access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public 메서드: deposit
    public void deposit(int amount) {

        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드: withdraw
    public void withdraw(int amount) {

        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족.");
        }
    }

    // public 메소드: getBalance
    public int getBalance() {
        return balance;
    }

    // 내부 검증용
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
