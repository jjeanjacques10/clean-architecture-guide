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

### Factories

Parecido com o padrão de projeto Factory Method, ou o padrão Builder. É uma classe responsável por criar um objeto (no
caso do tipo [Aluno](school/src/main/java/school/Aluno.java));

## Requisitos

- Java 11
- Maven 3

## Projeto

Exemplos desenvolvidos no projeto [School](./school) neste repositório.

## Fontes

- [Clean Architecture - Alura](https://cursos.alura.com.br/course/java-clean-architecture)
- [Descubra o que é e onde aplicar Arquitetura Limpa - ZUP](https://www.zup.com.br/blog/clean-architecture-arquitetura-limpa)
- [Value Object]( https://martinfowler.com/bliki/ValueObject.html)

---
Developed by [Jean Jacques](https://github.com/jjeanjacques10)
