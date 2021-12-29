# Clean Architecture Guide

Arquitetura são as práticas e fundamentos de como organizamos um sistema. Tem relação e como os componentes estão
relacionados entre em si e também nos requisitos de negócio de nossa aplicação. Auxilia na evolução do software, pois
ajuda a manter o código limpo e organizado. Também estão relacionados com arquitetura os seguintes **Requisitos não
funcionais**:

- Performance
- Escalabilidade
- Disponibilidade
- Confiabilidade
- Segurança
- Manutenibilidade
- Extensibilidade (adicionar novas funcionalidades)

**Clean Architecture** é uma arquitetura de software que visa resolver os problemas de maneira organizada e eficiente.
Facilita a isolar o código de domínio da aplicação.

<img src="https://secureservercdn.net/198.71.233.31/36q.76e.myftpupload.com/wp-content/uploads/2021/10/Clean-Architecture-3.png" width=600>

Principais vantagens observadas no uso de Clean Architecture:

- Isolar o código de domínio da aplicação
- Inversão de dependências
- Favorece boas práticas de Orientação a Objetos
- Código de domínio com alta "testabilidade"
- Independência de frameworks e detalhes de infraestrutura

#### Factories

Parecido com o padrão de projeto Factory Method, ou o padrão Builder. É uma classe responsável por criar um objeto (no
caso do tipo [Aluno](school/src/main/java/school/Aluno.java));

#### Domínio

É o coração do negócio, onde estão as regras da nossa aplicação.

- [DDD](https://fullcycle.com.br/domain-driven-design/)

**Domain Driven Design**: Conceito de modelar a aplicação pensando inicialmente no domínio. Facilitando assim as
alterações realizadas nas "bordas" da aplicação, por exemplo, facilitar a alteração na forma como interagimos com o
sistema, sendo por API, linha de comando ou etc.

#### Repositório

Termo utilizado para falar sobre persistência de dados. Utilizando esta abordagem isolamos o domínio da infraestrutura.

#### Serviço

Representar uma classe que executa alguma ação que não pertence a nenhuma Entidade ou Value Object.

## Projeto

Exemplos desenvolvidos no projeto [School neste repositório](./school).

## Fontes

- [Clean Architecture - Alura](https://cursos.alura.com.br/course/java-clean-architecture)
- [Descubra o que é e onde aplicar Arquitetura Limpa - ZUP](https://www.zup.com.br/blog/clean-architecture-arquitetura-limpa)
- [Value Object]( https://martinfowler.com/bliki/ValueObject.html)
- [Screaming Architecture](https://blog.cleancoder.com/uncle-bob/2011/09/30/Screaming-Architecture.html)
- [Livro: Arquitetura limpa](https://www.amazon.com.br/Arquitetura-Limpa-Artes%C3%A3o-Estrutura-Software/dp/8550804606/ref=asc_df_8550804606/?tag=googleshopp00-20&linkCode=df0&hvadid=379787347388&hvpos=&hvnetw=g&hvrand=7370705991265482562&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001773&hvtargid=pla-809227152896&psc=1)

---
Developed by [Jean Jacques](https://github.com/jjeanjacques10)
