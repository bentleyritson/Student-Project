import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {

    @Test
    void deposit() {
        CurrentAccount TestCurrentAccount = new CurrentAccount(100, 1000);
        TestCurrentAccount.deposit(-200);
        assertEquals(100, TestCurrentAccount.getBalance() );
    }

    @Test
    void withdraw() {
    }
}