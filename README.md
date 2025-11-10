# ⛽ API - PDV Posto de Combustível (Backend)

Este é o módulo **Backend** do sistema de PDV para Posto de Combustível.  
É uma **API RESTful** desenvolvida em **Java 17** com **Spring Boot 3**, responsável por gerenciar toda a lógica de negócio, persistência de dados e integração com o banco de dados.

📌 **Status do Projeto:** Concluído ✅

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot ** (Spring Web, Spring Data JPA, Spring Security)  
- **Banco de Dados:** PostgreSQL  
- **Autenticação:** JWT (via Spring Security) e **BCrypt** para criptografia de senhas  
- **Gerenciamento de Build:** Apache Maven  
- **IDE Recomendada:** IntelliJ IDEA  


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

A API ficará disponível em:
👉 http://localhost:8080

👩‍💻 Autora
Isabella Rodrigues Martins Vale
Estudante de Engenharia de Software - FATESG
📫 GitHub

⭐ Se este projeto te ajudou, deixe uma estrela no repositório!
