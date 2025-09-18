# AWPag API - AlgaWorks

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red)

API RESTful para um sistema de gestão de pagamentos, desenvolvido como parte do ecossistema de cursos da **AlgaWorks**. O projeto foca em boas práticas de desenvolvimento, arquitetura de APIs e utilização do ecossistema Spring.

## 🚀 Sobre o Projeto

A **AWPag API** é um back-end que fornece endpoints para gerenciar clientes e registrar parcelamentos (cobranças). A aplicação é construída com uma arquitetura moderna, utilizando o Spring Boot para facilitar a configuração e o desenvolvimento.

### ✨ Funcionalidades Principais

* **Gestão de Clientes (CRUD):**
    * Listar todos os clientes.
    * Buscar um cliente específico por ID.
    * Cadastrar um novo cliente.
    * Atualizar dados de um cliente existente.
    * Excluir um cliente.
* **Gestão de Parcelamentos:**
    * Listar parcelamentos.
    * Buscar um parcelamento por ID.
    * Cadastrar um novo parcelamento para um cliente.

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído com as seguintes tecnologias e bibliotecas:

* **[Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html):** Versão LTS mais recente da linguagem.
* **[Spring Boot 3](https://spring.io/projects/spring-boot):** Framework principal para a construção da aplicação.
* **[Spring Data JPA](https://spring.io/projects/spring-data-jpa):** Para persistência de dados de forma simplificada.
* **[Hibernate](https://hibernate.org/):** Implementação da especificação JPA para mapeamento objeto-relacional (ORM).
* **[H2 Database](https://www.h2database.com/):** Banco de dados em memória para ambiente de desenvolvimento e testes.
* **[Flyway](https://flywaydb.org/):** Ferramenta para versionamento e migração de banco de dados.
* **[Lombok](https://projectlombok.org/):** Para reduzir código boilerplate (getters, setters, construtores, etc.).
* **[ModelMapper](http.modelmapper.org/):** Mapeamento de objetos para DTOs.
* **[Maven](https://maven.apache.org/):** Gerenciador de dependências e build do projeto.

## ⚙️ Pré-requisitos

Antes de começar, você vai precisar ter as seguintes ferramentas instaladas em sua máquina:
* [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) ou superior.
* [Maven](https://maven.apache.org/download.cgi)
* Um cliente de API, como [Postman](https://www.postman.com/) ou [Insomnia](https://insomnia.rest/).

## ▶️ Como Executar o Projeto

Siga os passos abaixo para executar a aplicação localmente:

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/jdecdomingues/awpag-api.git
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd awpag-api
    ```

3.  **Execute o projeto com o Maven:**
    ```bash
    mvn spring-boot:run
    ```

4.  **Acesse a API:**
    * A aplicação estará rodando em `http://localhost:8080`.
    * Você pode acessar a documentação (se configurada) ou testar os endpoints com um cliente de API.

## 📝 Endpoints da API

Aqui estão os principais endpoints disponíveis na aplicação:

#### Clientes

* `GET /clientes` - Lista todos os clientes.
* `GET /clientes/{clienteId}` - Busca um cliente pelo ID.
* `POST /clientes` - Cadastra um novo cliente.
* `PUT /clientes/{clienteId}` - Atualiza um cliente existente.
* `DELETE /clientes/{clienteId}` - Exclui um cliente.

#### Parcelamentos

* `GET /parcelamentos` - Lista todos os parcelamentos.
* `GET /parcelamentos/{parcelamentoId}` - Busca um parcelamento pelo ID.
* `POST /parcelamentos` - Cadastra um novo parcelamento.

---

Feito com ❤️ por **Jonathan Domingues**, com o apoio da **[AlgaWorks](https://www.algaworks.com/)**.
