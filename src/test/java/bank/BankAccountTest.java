package bank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    IBankAccount bankAccount;

    @Before
    public void before() {
        bankAccount = new BankAccount();
    }

    @Test
    public void getStartAmountTest() {
        assertEquals(0, bankAccount.getAmount());
    }

    @Test
    public void depositIncreaseAmountTest() {
        // when
        bankAccount.deposit(1000);

        assertEquals(1000, bankAccount.getAmount());
    }

    @Test
    public void withdrawDecreaseAmountTest() {
        // when
        bankAccount.withdraw(1000);

        assertEquals(-1000, bankAccount.getAmount());
    }
}
