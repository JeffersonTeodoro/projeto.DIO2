package br.com.jefferson.banking.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void deveCriarContaComSaldoZero() {

        Account account = new Account("Jefferson");

        assertEquals(0.0, account.getBalance());
    }

    @Test
    void deveRealizarDeposito() {
        Account account = new Account("Jefferson");

        account.deposit(1000.00);

        assertEquals(1000.00, account.getBalance());
    }

    @Test
    void naoDevePermitirDepositoZero() {

        Account account = new Account("Jefferson");

        assertThrows(
                IllegalArgumentException.class,
                () -> account.deposit(0.0)
        );
    }

    @Test
    void deveRealizarSaque() {

        Account account = new Account("Jefferson");

        account.deposit(1000.00);
        account.withdraw(250.00);

        assertEquals(750.00, account.getBalance());
    }

    @Test
    void naoDevePermitirSaqueMaiorQueSaldo() {

        Account account = new Account("Jefferson");

        account.deposit(500.00);

        assertThrows(
                IllegalStateException.class,
                () -> account.withdraw(600.00)
        );
    }
}