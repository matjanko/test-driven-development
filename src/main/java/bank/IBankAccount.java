package bank;

public interface IBankAccount {
    int getAmount();
    void deposit(int money);
    void withdraw(int money);
}
