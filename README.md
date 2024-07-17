<h1>Literalura</h1>
<p>Literalura é uma aplicação de gerenciamento de livros que utiliza Spring Boot, JPA e PostgreSQL para gerenciar uma coleção de livros e autores. A aplicação oferece funcionalidades como buscar livros por título, listar livros e autores registrados, e muito mais.</p>
    
<h2>Requisitos</h2>
<ul>
<li>Java 17 ou superior</li>
<li>Maven 3.8.1 ou superior</li>
<li>PostgreSQL 12 ou superior</li>
</ul>
    
<h2>Configuração do Banco de Dados</h2>
<p>Certifique-se de ter o PostgreSQL instalado e em execução. Crie um banco de dados chamado <code>book_collection</code>.</p>
    
<h2>Configuração do Projeto</h2>
<ol>
<li>Clone o repositório:</li>
</ol>
<pre>
<code>
git clone https://github.com/sucloudflare/desafio-livro-alura.git
cd desafio-livro-alura
</code>
</pre>
<p>Atualize o arquivo <code>application.properties</code> com as informações do seu banco de dados:</p>
<pre>
<code>
spring.application.name=literalura
spring.datasource.url=jdbc:postgresql://bookstore-db-server/book_collection
spring.datasource.username=lib_admin
spring.datasource.password=B00kP@ssw0rd!
spring.datasource.driver-class-name=org.postgresql.Driver
hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
</code>
</pre>
    
<h2>Executando a Aplicação</h2>
<p>Para compilar e executar a aplicação, use o Maven:</p>
<pre>
<code>
mvn spring-boot:run
</code>
</pre>
<p>A aplicação estará disponível em <a href="http://localhost:8080">http://localhost:8080</a>.</p>
    
<h2>Estrutura do Projeto</h2>
    
<h3>Classes Principais</h3>
<ul>
<li><strong>LiteraluraApplication</strong>: Classe principal que inicia a aplicação Spring Boot.</li>
<li><strong>Principal</strong>: Classe responsável por exibir o menu e interagir com o usuário.</li>
</ul>
    
<h3>Modelos</h3>
<ul>
<li><strong>Autor</strong>: Representa um autor com atributos como nome, ano de nascimento, ano de morte e lista de livros.</li>
<li><strong>DadosAutor</strong>: Representa os dados de um autor obtidos de uma API externa.</li>
<li><strong>Livro</strong>: Representa um livro com atributos como título, idioma, autor e número de downloads.</li>
<li><strong>DadosLivro</strong>: Representa os dados de um livro obtidos de uma API externa.</li>
</ul>
    
<h3>Repositórios</h3>
<ul>
<li><strong>AutorRepository</strong>: Interface para operações CRUD e consultas personalizadas com autores.</li>
<li><strong>LivroRepository</strong>: Interface para operações CRUD e consultas personalizadas com livros.</li>
</ul>
    
<h3>Serviços</h3>
<ul>
<li><strong>ConsumoAPI</strong>: Serviço para consumir APIs externas.</li>
<li><strong>ConverteDados</strong>: Serviço para converter dados de APIs externas para os modelos da aplicação.</li>
</ul>
    
<h2>Funcionalidades</h2>
<ul>
<li><strong>Buscar livro pelo título</strong>: Permite buscar um livro pelo título.</li>
<li><strong>Listar livros registrados</strong>: Exibe todos os livros registrados no banco de dados.</li>
<li><strong>Listar autores registrados</strong>: Exibe todos os autores registrados no banco de dados.</li>
<li><strong>Listar autores vivos em um determinado ano</strong>: Exibe autores que estavam vivos em um ano específico.</li>
<li><strong>Listar livros em um determinado idioma</strong>: Exibe livros em um idioma específico.</li>
<li><strong>Buscar autor por nome</strong>: Permite buscar um autor pelo nome.</li>
<li><strong>Top 10 livros mais baixados</strong>: Exibe os 10 livros mais baixados.</li>
</ul>
    
<h2>Autor</h2>
<p>Projeto desenvolvido por Bruno.</p>
    
<h2>Licença</h2>
<p>Este projeto está licenciado sob os termos da licença MIT. Consulte o arquivo LICENSE para obter mais detalhes.</p>
