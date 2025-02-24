# Sistema de Vendas com Estratégia de Descontos

Este projeto implementa um sistema de vendas onde diferentes formas de desconto podem ser aplicadas conforme as promoções vigentes. O usuário pode escolher entre três tipos de desconto:

- **Percentual fixo de desconto**: um valor definido que pode vir de um banco de dados.
- **Desconto progressivo**: baseado no valor da compra (valor da compra / 25), com limite máximo de 20%.
- **Desconto de aniversário**: 15% de desconto na data de aniversário do cliente.

O sistema utiliza o **Padrão de Projeto Strategy** para permitir a troca dinâmica do algoritmo de cálculo de desconto sem modificar a lógica principal da aplicação.

## Tecnologias Utilizadas
- **Java**
- **Paradigma Orientado a Objetos**
- **Padrão Strategy**

## Estrutura do Projeto

O projeto está organizado nas seguintes classes:

- **Cliente**: representa o cliente da venda.
- **Venda**: representa uma venda, contendo informações sobre o cliente, data e valor total.
- **DescontoStrategy** (Interface): define um contrato para os diferentes tipos de desconto.
- **DescontoStrategyAniversario**: aplica 15% de desconto caso seja o aniversário do cliente.
- **DescontoStrategyProgressivo**: aplica um desconto proporcional ao valor da compra, respeitando o limite de 20%.
- **DescontoStrategyDefinido**: aplica um percentual fixo de desconto.
- **Principal**: classe principal para teste do sistema.

## Perguntas e Respostas

### 1. Qual padrão de projeto pode ser utilizado no desenvolvimento de uma solução?
O padrão **Strategy** é o mais adequado, pois permite a definição de diferentes estratégias de desconto que podem ser alteradas em tempo de execução sem modificar a estrutura da aplicação.

### 2. Como poderíamos implementar estes tipos de desconto sem utilizar Padrões de Projetos?
Sem utilizar padrões, poderíamos implementar os descontos dentro da classe `Venda`, utilizando condicionais (`if` ou `switch`).

### 3. Quais os problemas que tal implementação traria?
Essa abordagem geraria **código rígido e difícil de manter**, pois qualquer alteração nos cálculos de desconto exigiria modificar a classe `Venda`, violando o **Princípio Aberto-Fechado (OCP)** da Programação Orientada a Objetos. Além disso, dificultaria a adição de novos tipos de desconto sem impactar o código existente.

### 4. Implemente o projeto e envie o link para repositório no GitHub, onde o README deve conter as respostas.
Link para o repositório: [Calculo de Desconto](https://github.com/hemmerson/DescontoStrategy)

