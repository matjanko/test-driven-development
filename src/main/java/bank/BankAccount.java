package bank;

public class BankAccount implements IBankAccount{

    private int amount = 0;

    public int getAmount() {
        return amount;
    }

    public void deposit(int money) {
        amount += money;
    }

    public void withdraw(int money) {
        amount -= money;

        if (amount < -1000)
            throw new IllegalStateException();
    }
}
