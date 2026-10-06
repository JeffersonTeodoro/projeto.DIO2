package br.com.jefferson.banking.facade;

import br.com.jefferson.banking.account.Account;
import br.com.jefferson.banking.strategy.DepositStrategy;
import br.com.jefferson.banking.strategy.WithdrawalStrategy;
import org.springframework.stereotype.Component;

@Component
public class BankFacade {

    private final DepositStrategy depositStrategy;
    private final WithdrawalStrategy withdrawalStrategy;

    public BankFacade(
            DepositStrategy depositStrategy,
            WithdrawalStrategy withdrawalStrategy
    ) {
        this.depositStrategy = depositStrategy;
        this.withdrawalStrategy = withdrawalStrategy;
    }

    public void deposit(Account account, double amount) {
        depositStrategy.execute(account, amount);
    }

    public void withdraw(Account account, double amount) {
        withdrawalStrategy.execute(account, amount);
    }

    public double getBalance(Account account) {
        return account.getBalance();
    }
}