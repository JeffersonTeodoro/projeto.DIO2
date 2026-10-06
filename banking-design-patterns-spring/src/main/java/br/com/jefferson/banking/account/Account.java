package br.com.jefferson.banking.account;

public class Account {

    private final String holder;
    private double balance;

    public Account(String holder) {
        this.holder = holder;
        this.balance = 0.0;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "O valor do depósito deve ser maior que zero."
            );
        }

        balance += amount;
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            throw new IllegalStateException(
                    "Saldo insuficiente para realizar o saque."
            );
        }

        balance -= amount;
    }
}