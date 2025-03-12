Desafio Para Programador Java Backend Developer com Spring #001


2.	Requisitos Funcionais e Modelagem dos Dados
2.1.	Entidades e Modelo de Dados
  	
A API precisa gerenciar Livros e Empréstimos. Vamos começar pela modelagem do base de dados:

1.	Livro (Book):
○	id: Identificador único do livro.
○	Título: Título do livro.
○	Autor: Autor do livro.
○	Ano de Publicação: Ano de publicação do livro.
○	Número de páginas: Número de páginas do livro.
○	preço: Preço do livro.
○	status: Status do livro (disponível, emprestado, reservado).

2.	Empréstimo (Loan):
○	id: Identificador único do empréstimo.
○	livroId: Relacionamento com o livro emprestado.
○	cliente: Nome do cliente que realizou o empréstimo.
○	Data de Empréstimo: Data em que o livro foi emprestado.
○	Data de Devolução: Data em que o livro deve ser devolvido.
○	Data de Devolução Real: Data real de devolução do livro.
○	status: Status do empréstimo (em andamento, devolvido, atrasado).

3.	Usuário (User) (para autenticação e autorização):
○	id: Identificador único do usuário.
○	nome: Nome completo do usuário.
○	email: E-mail do usuário (usado para login).
○	senha: Senha criptografada do usuário.
○	roles: Funções ou permissões do usuário (ex: ADMIN, USER).

2.2.	Requisitos
➔	Registo de Livros
A API deve permitir cadastrar um novo livro, com as seguintes informações:
◆	Título
◆	Autor
◆	Ano de Publicação
◆	Número de Páginas
◆	Preço

➔	Listagem de Livros
A API deve permitir listar todos os livros cadastrados. Esta listagem deve ser paginada, com as opções de filtro por autor e ano de publicação.
Parâmetros de consulta:
●	autor (opcional): Filtrar livros pelo nome do autor.
●	ano (opcional): Filtrar livros pelo ano de publicação.
●	page (padrão 0): Número da página (paginamento).
●	size (padrão 10): Número de itens por página.

➔	Detalhes de um Livro
A API deve permitir visualizar os detalhes de um livro específico.

➔	Atualização de Livro
A API deve permitir atualizar as informações de um livro existente. Os campos que devem ser atualizados são: Título, Autor, Ano de Publicação, Número de Páginas, e Preço.

➔	Exclusão de Livro
A API deve permitir excluir um livro da biblioteca.

➔	Gestão de Empréstimos
A API deve permitir empréstimos de livros com controle de prazos de devolução.

➔	Empréstimo de Livro: O cliente pode emprestar um livro por um determinado período de tempo, com uma data de devolução associada.
Campos para o Empréstimo
●	Livro: (Referência ao livro que está sendo emprestado)
●	Data de Empréstimo: (Data em que o livro foi emprestado)
●	Cliente: (Referência do cliente que está realizando o empréstimo)

➔	Listagem de Empréstimos
A API deve permitir listar todos os empréstimos realizados, com os seguintes filtros:
○	Livro (opcional): Filtrar empréstimos por livro.
○	Cliente (opcional): Filtrar empréstimos por cliente.
○	Em andamento (opcional): Filtrar por empréstimos que ainda não foram devolvidos.

➔	Devolução de Livro
A API deve permitir a devolução de um livro emprestado, atualizando a data de devolução.

➔	Controle de Prazos de Devolução
A API deve permitir verificar se o livro foi devolvido dentro do prazo. Quando um livro for devolvido após a data de devolução, um aviso de atraso deve ser gerado.

**Tratamento de Erros**
●	A API deve ter um tratamento adequado de erros, com os seguintes casos:
○	404 Not Found: Quando um livro ou empréstimo não for encontrado.
○	400 Bad Request: Quando a requisição estiver malformada (ex.: campos obrigatórios ausentes).
○	500 Internal Server Error: Para erros inesperados no servidor.

**Swagger / OpenAPI 3**
●	Utilize o SpringDoc OpenAPI 3 para gerar a documentação automática da API com Swagger.
●	A documentação gerada deve ser acessível em http://localhost:8080/swagger-ui.html após o aplicativo ser iniciado.


