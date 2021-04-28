package bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bank.Bank.SaldoInsuficiente;
import bank.Bank.InputValorNegativo;

public class TestBank {
    Bank bank;

    @BeforeEach
    public void setUp() throws InputValorNegativo {
        bank = new Bank();
        bank.deposito(50);
    }

    @Test
    public void saqueTest() throws SaldoInsuficiente, InputValorNegativo {
        assertEquals(bank.saldo() - 50, bank.saque(50));
        assertThrows(Bank.SaldoInsuficiente.class, () -> bank.saque(51));
        assertThrows(Bank.InputValorNegativo.class, () -> bank.saque(-50));
    }

    @Test
    public void depositoTest() throws InputValorNegativo {
        assertEquals(bank.saldo() + 50, bank.deposito(50));
        assertThrows(Bank.InputValorNegativo.class, () -> bank.deposito(-50));
    }

}