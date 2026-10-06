package br.com.jefferson.banking.config;

import org.springframework.stereotype.Component;

@Component
public class BankConfiguration {

    private String environment;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
