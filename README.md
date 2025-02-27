# Simulador de CDB

Este é um simulador de CDB (Certificado de Depósito Bancário) simples, que permite ao usuário calcular o saldo acumulado, o lucro e o valor total investido ao longo do tempo. O programa utiliza um cálculo de juros compostos para simular a rentabilidade do investimento.

## Tabela de Conteúdo
- [Tecnologias](#tecnologias)
- [Funcionalidades](#funcionalidades)
- [Como Executar](#como-executar)
- [Exemplos de Uso](#exemplos-de-uso)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Tecnologias

- **Java**: Linguagem de programação utilizada.
- **Scanner**: Para entrada de dados do usuário.
- **NumberFormat**: Para formatação dos valores monetários.

## Funcionalidades

- Calcula o saldo acumulado ao longo dos meses.
- Mostra o valor total investido, o lucro total e o valor final (investimento + lucro).
- Entrada de dados segura, com validação para garantir que os valores inseridos sejam positivos.

## Como Executar

### 1. Clone o Repositório

```sh
git clone https://github.com/rafa-e-alves/simulador-cdb.git
```

### 2. Entre no Diretório do Projeto

```sh
cd simulador-cdb
```

### 3. Compile e execute o código em Java

```sh
javac SimuladorCDB.java
java SimuladorCDB
```

## Exemplos de Uso

```sh
Informe o investimento inicial (R$): 1000
Informe o aporte mensal (R$): 200
Informe a taxa de juros anual (%): 6
Informe o prazo do investimento (meses): 12
```

Saída esperada:

```
Valor total investido: R$ 3400.00
Lucro total ao final de 12 meses: R$ 268.57
Valor total (investimento + lucro): R$ 3668.57
```

## Contribuição

Sinta-se à vontade para contribuir com melhorias no código ou na documentação. Para isso, abra um *issue* ou envie um *pull request* com as suas alterações.

## Licença

Este projeto está licenciado sob a MIT License - Consulte o [MIT](https://opensource.org/license/MIT) para mais detalhes.
