package br.com.jefferson.banking.strategy;

import br.com.jefferson.banking.account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithdrawalStrategyTest {

    @Test
    void deveRealizarSaque() {

        Account account = new Account("Jefferson");
        account.deposit(1000.00);

        WithdrawalStrategy strategy = new WithdrawalStrategy();

        strategy.execute(account, 250.00);

        assertEquals(750.00, account.getBalance());
    }
}