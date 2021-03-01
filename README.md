<p align="center">
	
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/EdileneLopes/accenture-java?color=%2304D361">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/EdileneLopes/accenture-java">
  
  <a href="https://github.com/EdileneLopes/accenture-java/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/EdileneLopes/accenture-java">
  </a>
    
  <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">
  <a href="https://github.com/EdileneLopes/accenture-java/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/EdileneLopes/accenture-java?style=social">
  </a>

  <a href="">
    <img alt="Feito pela GetSet" src="https://img.shields.io/badge/Grupo-Gamados por Java-tomato">
  </a>

<h4 align="center">🚧 Sistema de Gerenciamento de Alunos 🚀 🚧</h4>

<p align="center">
 <a href="#-sobre-o-projeto">Sobre</a> •
 <a href="#-documentação-completa">Documentação</a> •
 <a href="#-funcionalidades">Funcionalidades</a> •
 <a href="#-como-executar-o-projeto">Como executar</a> • 
 <a href="#-tecnologias">Tecnologias</a> • 
 <a href="#-contribuidores">Contribuidores</a> • 
 <a href="#-licença">Licença</a>
</p>

## 💻 Sobre o Projeto

:coffee: Sistema de Gerenciamento - É uma API que permite o Cadastro, Consulta, Inclusão e Exclusão de Alunos..

Projeto desenvolvido durante o **Treinamento Java e Node** oferecida pela [Gama Academy](https://www.gama.academy/) em parceria com a [Accenture](https://www.accenture.com/br-pt).

---

---

## :+1: Aprendizados

Conceitos da linguagem Java, orientação a objetos, spring boot. Banco de dados.
Solidificamos experiências de cooperação, trabalho em equipe. Também persistência em encontrar soluções.

---

## 📃 Documentação Completa

- <a href="https://github.com/EdileneLopes/accenture-java/blob/master/cadastro.png.png">Back-End</a>

---

## ⚙️ Funcionalidades

- [x] Alunos podem se cadastrar na plataforma enviando:
  - Nome, Telefone, Matricula
  
- [x] Manipular na plataforma:
  - Acesso ao CRUD onde permite o gerenciamento
    - A Criação de Novos Alunos, Cursos, Disciplinas, Notas
    - Pesquisa e Leitura
    - Ediçao
    - Exclusão
    
---

## 🚀 Como executar o projeto

Este projeto está em uma unica parte:
1. Backend ([cadastro](https://github.com/EdileneLopes/accenture-java/tree/master/cadastro)) 

💡 O Backend deve estar sendo executado para funcionar.

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Java 8 (Java Runtime Environment JRE)](https://www.java.com/pt-BR/download/), [Java 11 (Java SE Development Kit JDK)](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html), [Node.js](https://nodejs.org/en/), [Docker](https://docs.docker.com/docker-for-windows/install/), [MySQL](https://dev.mysql.com/downloads/installer/). 
Além disto é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/), [Eclipse](https://www.eclipse.org/downloads/packages/).
E para testar e consumir os Endpoints use [Postman](https://www.postman.com/)

#### 🎲 Rodando o Backend (servidor)

```
# Clone este repositório
$ git clone https://github.com/EdileneLopes/accenture-java.git

# Acesse a pasta do projeto no terminal de sua preferencia bash/cmd
$ cd accenture-java.git

# Importe o projeto no Eclipse (Importar como um Exisng Maven Project)
```

<img src="https://i.imgur.com/tU11LLf.png" width="500px">

```
# Selecione a pasta do projeto e selecione o pom.xml e clique em FINISH
```

<img src="https://i.imgur.com/P8UFR0T.png" width="500px">

```
# A estrutura do nosso projeto importado para o eclipse fica de acordo com a imagem:
```

<img src="https://i.imgur.com/iEwwTEM.png" width="500px">

```
# Um passo antes da execução
$ Abra o arquivo application.properties
$ Troque a senha existente pela sua senha configurada no MySQL
```

<img src="https://i.imgur.com/te9Arr2.png" width="500px">

```
# Execute
$ Basta selecionar CadastroApplication.java, ir com o botão direito do Mouse na seguinte opção
$ Run As > Java Application
```

<img src="https://i.imgur.com/aoSV9Ho.png" width="500px">

```
# O servidor inciará na porta:8080 - Acesse: http://localhost:8080
```

[Acesse a Documentação com Swagger UI](http://localhost:8080/swagger-ui.html#/) ou http://localhost:8080/swagger-ui.html#/

```bash
# Para o consumo de API
Utilize o Postman https://www.postman.com/
$ Exemplos:

/cursos
    {
	"nome": "Java"
    }

/disciplinas
    {
   	"nome": "Lógica de Programação",
  	"curso":
  	 [
  	    {
 	    	"id": 1
  	    }
  	 ]

    }

/alunos
    {
	"nome": "Elson",
	"telefone": "977968299",
	"matricula": "987654321",
	"endereco": "Avenida Paulista",
	"cidade": "São Paulo",
	"uf": "SP",
	"cep": "01310100",
	"curso": 
        {
            "id": 1
        }
    }

/notas
    {
        "notaProva1": 10.0,
        "notaProva2": 10.0,
        "notaTrabalho": 0.0,
        "notaApresentacao": 0.0,
        "disciplina": 
	[
            {
              "id":1  
            }
        ],
        "aluno": 
	{
            "id":1
        }
    }
```


---

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

#### []()**Server**  ([Spring](https://spring.io/)  +  [Java](https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html))

-   **[Spring initializer](https://start.spring.io/):**
  -[Maven Project](https://www.baeldung.com/spring-with-maven);
  -[Spring Boot Dev Tools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html);
  -[Spring Web](https://spring.io/guides/gs/spring-boot/);
  -[Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference);
  -[MySQL Driver](https://www.baeldung.com/java-connect-mysql);
  -[Validation](https://www.baeldung.com/spring-boot-bean-validation);
-   **[Spring Boot](https://spring.io/projects/spring-boot)**
-   **[MySQL Workbench(8.0.22)](https://dev.mysql.com/downloads/workbench/)**
-   **[MySQL Server(8.0.22)](https://dev.mysql.com/downloads/mysql/)**

#### [](https://github.com/EdileneLopes/accenture-java#utilitarios)**Utilitários**

-   API:  **[Swagger UI](https://swagger.io/tools/swagger-ui/)**
-   Editor:  **[Visual Studio Code](https://code.visualstudio.com/)**, **[Eclipse](https://www.eclipse.org/)**
-   Markdown:  **[Markdown Emoji](https://gist.github.com/rxaviers/7360908)**
-   Teste de API:  **[Postman](https://www.postman.com/)**

---

## 👨‍💻 Contribuidores

💜 Um super thanks 👏 para essa galera que desenvolveu essa API:)

<table>
  <tr>
    <td align="center"><a href="https://github.com/EdileneLopes"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/60043558?v=4" width="150px;" alt=""/><br /><sub><b>Edilene Lopes</b></sub></a><br /><a href="https://www.linkedin.com/in/edilene-lopes/" title="Gamados por Java">:family: :books:</a></td>
    <td align="center"><a href="https://github.com/elsonss1988"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/45674699?v=4" width="150px;" alt=""/><br /><sub><b>Elson Santos</b></sub></a><br /><a href="https://www.linkedin.com/in/eng-elson/" title="Gamados por Java">:coffee:  :musical_note:</a></td>
    <td align="center"><a href="https://github.com/botelholarissa"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/67758775?v=4" width="150px;" alt=""/><br /><sub><b>Larissa Botelho</b></sub></a><br /><a href="https://www.linkedin.com/in/botelholarissa/" title="Gamados por Java">:seedling: :computer:</a></td>
    <td align="center"><a href="https://github.com/Rubenscode"><img style="border-radius: 50%;" src="https://avatars2.githubusercontent.com/u/40808539?v=4" width="150px;" alt=""/><br /><sub><b>Rubens Almeida</b></sub></a><br /><a href="https://www.linkedin.com/in/rubens-almeida-andrade/" title="Gamados por Java">👨‍🚀 :alien:</a></td>
  </tr>
</table>

## 💪 Como contribuir para o projeto

1. Faça um **fork** do projeto.
2. Crie uma nova branch com as suas alterações: `git checkout -b my-feature`
3. Salve as alterações e crie uma mensagem de commit contando o que você fez: `git commit -m "feature: My new feature"`
4. Envie as suas alterações: `git push origin my-feature`

---

---

## 📝 Licença

Este projeto esta sobe a licença [MIT](./LICENSE).

<p><a href="#"><g-emoji class="g-emoji" alias="arrow_up" fallback-src="https://github.githubassets.com/images/icons/emoji/unicode/2b06.png">⬆</g-emoji> Voltar ao topo</a><br></p>

---
