package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBank {
    Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
        bank.setSaldo(50);
    }

    @Test
    public void saqueTest() {
        assertEquals(bank.saldo() - 50, bank.saque(50));
    }

    @Test
    public void depositoTest() {
        assertEquals(bank.saldo() + 50, bank.deposito(50));
    }
}