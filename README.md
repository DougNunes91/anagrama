# Anagrama API

API Spring Boot para geração de anagramas e processamento de pagamentos.

## Tecnologias

- Java 17
- Spring Boot 3.4.1
- Maven

## Funcionalidades

- Geração de anagramas a partir de letras distintas
- Processamento de pagamentos com adaptador PayFast
- Prevenção de SQL Injection

## Configuração

```bash
# Clone o repositório
git clone https://github.com/DougNunes91/anagrama.git

# Instale as dependências
mvn install

# Execute os testes
mvn test

# Inicie a aplicação
mvn spring-boot:run
```

## Estrutura do Projeto

```
src/
├── main/
│   └── java/
│       └── com/
│           └── example/
│               └── anagrama/
│                   ├── AnagramaApplication.java
│                   ├── model/
│                   │   └── Produto.java
│                   └── service/
│                       ├── GeradorAnagrama.java
│                       ├── ProcessadorPagamentoPayFast.java
│                       ├── PayFastAPI.java
│                       └── ServicoVenda.java
│ 
└── test/
    └── java/
        └── com/
            └── example/
                └── anagrama/
                    └── AnagramaApplicationTests.java
```
