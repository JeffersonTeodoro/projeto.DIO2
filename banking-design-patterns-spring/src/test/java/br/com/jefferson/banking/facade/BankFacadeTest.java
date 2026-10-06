package br.com.jefferson.banking.facade;

import br.com.jefferson.banking.account.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BankFacadeTest {

    @Autowired
    private BankFacade bankFacade;

    @Test
    void deveSerCriadoPeloSpring() {

        assertNotNull(bankFacade);
    }

    @Test
    void deveRealizarDeposito() {

        Account account = new Account("Jefferson");

        bankFacade.deposit(account, 1000.00);
    }


    @Test
    void deveRealizarSaque() {
        Account account = new Account("Jefferson");

        account.deposit(1000.00);

        bankFacade.withdraw(account, 250.00);

        assertEquals(750.00, account.getBalance());
    }

    @Test
    void deveRealizarDepositoESaque() {

        Account account = new Account("Jefferson");

        bankFacade.deposit(account, 1000.00);
        bankFacade.withdraw(account, 250.00);

        assertEquals(750.00, account.getBalance());
    }
}