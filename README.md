# Gerenciamento de Produtos - Spring Boot CRUD

## Descrição
Este projeto é uma aplicação desenvolvida em **Spring Boot** para gerenciar um cadastro de produtos. A aplicação fornece operações CRUD (Create, Read, Update, Delete) para manipular os produtos armazenados em um banco de dados.

## Objetivo
O objetivo deste projeto é praticar o desenvolvimento de APIs REST com **Spring Boot**, incluindo a implementação de validações, persistência de dados e boas práticas de desenvolvimento.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Banco de Dados H2 (pode ser substituído por outro SGBD como MySQL ou PostgreSQL)
- Maven
- Lombok

## Requisitos da Aplicação
A aplicação permite a gestão de produtos com os seguintes atributos:
- **id** (Long): Identificador único do produto.
- **nome** (String): Nome do produto.
- **preco** (Double): Preço do produto.
- **quantidadeEmEstoque** (Integer): Quantidade disponível no estoque.

### Funcionalidades da API
A API oferece os seguintes endpoints:

| Método | Endpoint            | Descrição |
|---------|--------------------|-------------|
| POST    | `/produtos`        | Cadastrar um novo produto |
| GET     | `/produtos`        | Listar todos os produtos |
| GET     | `/produtos/{id}`   | Buscar um produto pelo ID |
| PUT     | `/produtos/{id}`   | Atualizar um produto pelo ID |
| DELETE  | `/produtos/{id}`   | Remover um produto pelo ID |

### Validação dos Campos
- O **preço** do produto não pode ser negativo.
- A **quantidade em estoque** não pode ser menor que zero.
- O **nome** do produto é obrigatório e deve conter pelo menos 3 caracteres.

## Como Executar o Projeto
### 1. Clonar o Repositório
```bash
git clone https://github.com/gustavochm1412/crud-j.git
cd crud-j
```

### 2. Configurar o Banco de Dados (Opcional)
Por padrão, a aplicação utiliza o banco de dados **H2** em memória. Caso deseje alterar para **MySQL** ou **PostgreSQL**, edite o arquivo `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 3. Executar a Aplicação
```bash
mvn spring-boot:run
```
A API estará disponível em: **http://localhost:8080**

## Exemplos de Requisições
### Criar um Produto (POST)
```json
{
  "nome": "Teclado Mecânico",
  "preco": 150.00,
  "quantidadeEmEstoque": 10
}
```

### Atualizar um Produto (PUT)
```json
{
  "nome": "Mouse Gamer",
  "preco": 200.00,
  "quantidadeEmEstoque": 5
}
```

## Contribuição
Sinta-se à vontade para contribuir com melhorias no projeto! Para isso:
1. Fork o repositório.
2. Crie uma branch com sua feature (`git checkout -b minha-feature`).
3. Commit suas alterações (`git commit -m 'Adiciona minha feature'`).
4. Faça um push para a branch (`git push origin minha-feature`).
5. Abra um Pull Request.

## Autor
Desenvolvido por **Gustavo**.

## Licença
Este projeto é licenciado sob a MIT License - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

