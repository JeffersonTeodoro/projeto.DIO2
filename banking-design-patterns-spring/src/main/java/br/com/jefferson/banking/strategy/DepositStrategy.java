package br.com.jefferson.banking.strategy;

import br.com.jefferson.banking.account.Account;
import org.springframework.stereotype.Component;

@Component
public class DepositStrategy {

    public void execute(Account account, double amount) {
        account.deposit(amount);
    }
}