import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {


    private BankAccount account;

    @BeforeEach
    void setUp() {
        // Set up instance-level resources before each test method
        account = new BankAccount(1000, "John Doe");
    }

    @AfterEach
    void tearDown() {
        // Clean up instance-level resources after each test method
        account = null;
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }


    @Test
    void testDepositWithNegativeAmountAndThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-200); // This should throw an exception
        });
    }
}
