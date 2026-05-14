# CRUD de Usuários com Spring Boot

Aplicação web simples para cadastro e listagem de usuários, construída com **Spring Boot**, **Spring MVC**, **Thymeleaf**, **Spring Data JPA** e banco em memória **H2**.

## Funcionalidades

- Cadastro de usuário com:
  - Nome
  - E-mail
  - Idade
- Listagem de usuários em tabela
- Persistência em banco H2 em memória

## Tecnologias

- Java 25
- Spring Boot 4.0.6
- Spring MVC
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven Wrapper (`mvnw`)

## Estrutura principal

- `src/main/java/com/example/teste/controller/UsuarioController.java` – endpoints web
- `src/main/java/com/example/teste/service/UsuarioService.java` – regras de serviço
- `src/main/java/com/example/teste/repository/UsuarioRepository.java` – acesso a dados
- `src/main/java/com/example/teste/model/Usuario.java` – entidade `Usuario`
- `src/main/resources/templates/usuarios.html` – página de cadastro/listagem
- `src/main/resources/application.properties` – configuração do banco H2

## Pré-requisitos

- JDK 25 instalado
- Maven (opcional, pois o projeto inclui Maven Wrapper)

## Como executar

No diretório do projeto, execute:

```bash
sh ./mvnw spring-boot:run
```

Depois, acesse:

- Aplicação: `http://localhost:8080/usuarios`
- Console H2: `http://localhost:8080/h2-console`

### Configuração H2 (padrão do projeto)

- JDBC URL: `jdbc:h2:mem:testedb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE`
- Usuário: `sa`
- Senha: *(vazia)*

## Como rodar testes

```bash
sh ./mvnw test
```

> Observação: o `pom.xml` está configurado com `java.version=25`.

## Próximos passos sugeridos

- Adicionar edição e remoção de usuários
- Incluir validações de domínio
- Criar testes de controller e service
- Melhorar o layout da página com CSS/Bootstrap
