package br.com.jefferson.banking.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class BankConfigurationTest {

    @Autowired
    private BankConfiguration config1;

    @Autowired
    private BankConfiguration config2;

    @Test
    void deveSerSingletonGerenciadoPeloSpring() {

        assertSame(config1, config2);
    }
}