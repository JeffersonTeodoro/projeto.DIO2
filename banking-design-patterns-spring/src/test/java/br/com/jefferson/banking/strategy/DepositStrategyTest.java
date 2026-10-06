package br.com.jefferson.banking.strategy;

import br.com.jefferson.banking.account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepositStrategyTest {

    @Test
    void deveRealizarDeposito() {

        Account account = new Account("Jefferson");

        DepositStrategy strategy = new DepositStrategy();

        strategy.execute(account, 1000.00);

        assertEquals(1000.00, account.getBalance());
    }
}