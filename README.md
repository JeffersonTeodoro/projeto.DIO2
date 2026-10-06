# 🏦 Banking Design Patterns with Spring Boot

Projeto desenvolvido para praticar **Design Patterns em Java utilizando Spring Boot**, aplicando padrões de projeto a um domínio bancário simplificado.

Esta versão representa uma evolução do projeto inicial, trazendo uma estrutura baseada em **Spring Boot**, configuração de componentes e uma suíte de testes automatizados.

## 🎯 Objetivo

O projeto tem como objetivo demonstrar a aplicação prática de padrões de projeto em uma aplicação Java baseada em Spring Boot.

O domínio utilizado é um sistema bancário simplificado, com operações como:

* Depósito
* Saque
* Gerenciamento de conta
* Configuração bancária

Os padrões trabalhados são:

* **Strategy**
* **Facade**
* **Configuration / Singleton**

Além da implementação, o projeto conta com testes automatizados para validar os principais componentes.

## 🛠️ Tecnologias

* ☕ Java
* 🍃 Spring Boot
* 📦 Maven
* 🧪 JUnit
* 🧩 Design Patterns
* 🏗️ Programação Orientada a Objetos

## 🧩 Design Patterns

### Strategy Pattern

O padrão **Strategy** permite encapsular diferentes algoritmos ou comportamentos e torná-los intercambiáveis.

Neste projeto, as operações bancárias são representadas por estratégias específicas:

```text
strategy/
├── DepositStrategy.java
└── WithdrawalStrategy.java
```

Isso facilita a separação das regras de cada operação e torna o código mais organizado e extensível.

### Facade Pattern

O padrão **Facade** é utilizado para fornecer uma interface simplificada para as operações bancárias.

```text
facade/
└── BankFacade.java
```

A `BankFacade` centraliza o acesso às operações e reduz a necessidade de o código cliente conhecer detalhes internos da implementação.

### Configuration

A configuração do banco é centralizada através da classe:

```text
config/
└── BankConfiguration.java
```

Essa abordagem permite utilizar os recursos de configuração e gerenciamento de componentes fornecidos pelo Spring.

## 📂 Estrutura do projeto

```text
src/
├── main/
│   ├── java/
│   │   └── br/com/jefferson/banking/
│   │       │
│   │       ├── BankingDesignPatternsSpringApplication.java
│   │       │
│   │       ├── account/
│   │       │   └── Account.java
│   │       │
│   │       ├── config/
│   │       │   └── BankConfiguration.java
│   │       │
│   │       ├── facade/
│   │       │   └── BankFacade.java
│   │       │
│   │       └── strategy/
│   │           ├── DepositStrategy.java
│   │           └── WithdrawalStrategy.java
│   │
│   └── resources/
│       └── application.properties
│
└── test/
    └── java/
        └── br/com/jefferson/banking/
            ├── BankingDesignPatternsSpringApplicationTests.java
            │
            ├── account/
            │   └── AccountTest.java
            │
            ├── config/
            │   └── BankConfigurationTest.java
            │
            ├── facade/
            │   └── BankFacadeTest.java
            │
            └── strategy/
                ├── DepositStrategyTest.java
                └── WithdrawalStrategyTest.java
```

## 🧪 Testes automatizados

O projeto possui uma suíte de testes para validar os principais componentes da aplicação:

* `BankingDesignPatternsSpringApplicationTests`
* `AccountTest`
* `BankConfigurationTest`
* `BankFacadeTest`
* `DepositStrategyTest`
* `WithdrawalStrategyTest`

Para executar os testes:

```powershell
.\mvnw.cmd test
```

O Maven executará os testes e apresentará o resultado no terminal.

## ▶️ Como executar o projeto

### Pré-requisitos

* Java 21 ou versão compatível com o projeto
* Maven ou Maven Wrapper

Clone o repositório:

```bash
git clone https://github.com/JeffersonTeodoro/projeto.DIO2.git
```

Entre no diretório:

```bash
cd projeto.DIO2
```

Execute os testes:

```powershell
.\mvnw.cmd test
```

Para iniciar a aplicação:

```powershell
.\mvnw.cmd spring-boot:run
```

Também é possível executar a classe principal:

```text
br.com.jefferson.banking.BankingDesignPatternsSpringApplication
```

## 🏗️ Arquitetura

A organização do projeto busca manter cada responsabilidade isolada:

```text
Account
   │
   ├── DepositStrategy
   │
   └── WithdrawalStrategy
            │
            ▼
       BankFacade
            │
            ▼
    BankConfiguration
```

Essa separação permite estudar como diferentes padrões podem trabalhar juntos dentro de uma aplicação Java.

## 📚 Conceitos praticados

Durante o desenvolvimento foram praticados conceitos importantes para desenvolvimento backend:

* Java
* Spring Boot
* Programação Orientada a Objetos
* Design Patterns
* Strategy Pattern
* Facade Pattern
* Configuração com Spring
* Inversão de Controle
* Gerenciamento de componentes
* Testes unitários
* Maven
* Organização de código
* Separação de responsabilidades

## 🔄 Evolução em relação ao projeto anterior

Este projeto é uma evolução do projeto `projeto.DIO-`.

A primeira versão foi construída utilizando Java e Maven para explorar os padrões de projeto de forma mais direta.

Nesta segunda versão, os mesmos conceitos são aplicados dentro do ecossistema **Spring Boot**, permitindo estudar como os padrões podem ser integrados a uma estrutura utilizada em aplicações backend profissionais.

### Projeto anterior

🔗 [projeto.DIO-](https://github.com/JeffersonTeodoro/projeto.DIO-)

### Projeto atual

🔗 [projeto.DIO2](https://github.com/JeffersonTeodoro/projeto.DIO2)

## 🚀 Próximos passos

Possíveis evoluções para o projeto:

* Criar uma API REST para as operações bancárias
* Adicionar persistência com PostgreSQL
* Implementar Spring Data JPA
* Adicionar validações de entrada
* Implementar tratamento global de exceções
* Adicionar documentação com OpenAPI/Swagger
* Criar testes de integração
* Adicionar CI/CD
* Implementar autenticação e autorização

## 👨‍💻 Autor

**Jefferson França Teodoro**

Full Stack Developer com foco em:

**Java • Spring Boot • JavaScript • React • APIs REST • PostgreSQL • Arquitetura de Software**

🔗 GitHub: [JeffersonTeodoro](https://github.com/JeffersonTeodoro)

---

⭐ Se este projeto foi útil para seus estudos, considere deixar uma estrela no repositório!
