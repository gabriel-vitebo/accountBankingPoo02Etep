# Atividade POO ETEP - Conta Bancária

## Regras de Negócio

- [x] O usuário pode cadastrar uma conta bancária.

### Para cadastrar a conta, o usuário deve:
  
  - [x] Informar o **número da conta**.
  - [x] Informar o **nome do titular da conta**.
  - [x] Caso queira, o usuário pode fazer um **depósito inicial**; caso contrário, o saldo inicial será **R$ 0,00**.
  - [x] O **número da conta** **não** poderá ser alterado.
  - [x] O **nome do titular da conta** poderá ser alterado.

### Regras sobre o saldo da conta:

  - O saldo **não** pode ser alterado livremente, sendo necessário obedecer às seguintes regras:
    - [x] O saldo **só pode aumentar** por meio de **depósitos**.
    - [x] O saldo **só pode diminuir** por meio de **saques** realizados.
    - [x] O banco deverá cobrar uma **taxa de R$ 5,00** por saque.
    - [x] A conta pode ter saldo negativo caso o saldo não seja suficiente para cobrir o valor do saque e/ou da taxa.

### Funcionamento do Programa

- O programa deve permitir:
  - O **cadastro de uma conta**, dando a opção de informar ou não o valor de depósito inicial.
  - Realizar um **depósito** ou um **saque**, sempre mostrando os **dados atualizados da conta** após cada operação.
  - O programa só encerra se o usuário escolher a opção "**Fechar Operação**".
