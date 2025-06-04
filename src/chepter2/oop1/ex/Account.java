package chepter2.oop1.ex;

public class Account {

    int balance;



    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {

        if (balance < amount) {
            System.out.println("Insufficient balance");
            return;
        }

        balance -= amount;
    }
}
