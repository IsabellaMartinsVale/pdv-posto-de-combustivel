# ⛽ API - PDV Posto de Combustível (Backend)

Este é o módulo **Backend** do sistema de PDV para Posto de Combustível.  
É uma **API RESTful** desenvolvida em **Java 17** com **Spring Boot 3**, responsável por gerenciar toda a lógica de negócio, persistência de dados e integração com o banco de dados.

📌 **Status do Projeto:** Concluído ✅

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot 3** (Spring Web, Spring Data JPA, Spring Security)  
- **Banco de Dados:** PostgreSQL  
- **Autenticação:** JWT (via Spring Security) e **BCrypt** para criptografia de senhas  
- **Gerenciamento de Build:** Apache Maven  
- **IDE Recomendada:** IntelliJ IDEA  

---

## 📦 Estrutura do Projeto

src/
├── main/
│ ├── java/
│ │ └── com.br.pdvpostocombustivel/
│ │ ├── api/
│ │ ├── config/
│ │ ├── domain/
│ │ ├── enums/
│ │ ├── exception/
│ │ └── util/
│ └── resources/
└── test/


Principais pacotes:
- **api/** → Controladores REST  
- **config/** → Configurações de segurança e beans do Spring  
- **domain/** → Entidades e serviços principais  
- **exception/** → Classes para tratamento de erros personalizados  
- **util/** → Funções auxiliares (ex: validação de CPF)  

---

## 🔗 Endpoints Principais

O sistema expõe diversas rotas REST via **/api/v1/**:

| Endpoint | Descrição |
|-----------|------------|
| `/api/v1/auth` | Login e Registro de usuários |
| `/api/v1/pessoas` | CRUD de Pessoas |
| `/api/v1/produtos` | CRUD de Produtos e Combustíveis |
| `/api/v1/estoques` | Controle de Estoque |
| `/api/v1/precos` | CRUD de Preços |
| `/api/v1/custos` | Regras de Cálculo de Custos |
| `/api/v1/vendas` | Registro de Vendas |
| `/api/v1/contatos` | Cadastro de Contatos |
| `/api/v1/acessos` | Gerenciamento de Perfis e Permissões |

---

## 🚀 Como Rodar o Backend

### 1️⃣ Pré-requisitos

- Java 17 (JDK instalado)  
- PostgreSQL em execução  
- Maven configurado no sistema  

---

### 2️⃣ Configuração do Banco de Dados

Crie um banco no PostgreSQL (exemplo: `pdv_postocombustivel`):

```sql
CREATE DATABASE pdv_postocombustivel;
Edite o arquivo src/main/resources/application.properties com suas credenciais:

properties
Copiar código
spring.datasource.url=jdbc:postgresql://localhost:5432/pdv_postocombustivel
spring.datasource.username=seu_usuario_postgres
spring.datasource.password=sua_senha_postgres
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3️⃣ Rodando a Aplicação
Pelo terminal, dentro da pasta do projeto:

bash
Copiar código
mvn clean install
mvn spring-boot:run

A API ficará disponível em:
👉 http://localhost:8080

👩‍💻 Autora
Isabella Rodrigues Martins Vale
Estudante de Engenharia de Software - FATESG
📫 GitHub

⭐ Se este projeto te ajudou, deixe uma estrela no repositório!
