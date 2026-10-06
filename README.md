# API Baozi Store 🥟

Projeto desenvolvido para o trabalho prático do curso de Análise e Desenvolvimento de Sistemas da Uninter. 

É uma API REST simples que simula o sistema de uma loja de pão chinês (Baozi Store), fazendo o controle de clientes, produtos e pedidos.

## Tecnologias que usei
* Java 17
* Spring Boot
* H2 Database (banco de dados em memória)
* Maven
* Testes feitos no Postman

## O que a API faz
O sistema possui os endpoints básicos para as três entidades do projeto (métodos POST, GET e DELETE, conforme pedido no trabalho):

1. **Clientes:** `/clientes`
2. **Produtos:** `/produtos`
3. **Pedidos:** `/pedidos`

## Como rodar o projeto
1. Faça o download ou clone o repositório.
2. Abra a pasta do projeto na sua IDE (foi usado o Eclipse/Spring Tools).
3. Rode o arquivo principal `BaozistoreApplication.java`.
4. A API vai subir na porta 8080 (`http://localhost:8080`).
