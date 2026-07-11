# JavaModerno – Diário de Estudos em Java

## 📌 Introdução

Neste repositório registro minha jornada de aprendizado em Java ao longo do curso **Java Moderno**, do prof. Arnaldo Sousa.

O objetivo deste projeto não é apenas concluir o curso, mas construir uma base sólida em Java, com organização, prática constante e evolução real como desenvolvedor.

Este repositório também funciona como um diário público de estudos, reunindo exercícios, códigos acompanhados em aula, resumos, anotações e pequenos projetos desenvolvidos ao longo da formação.

---

## 🎯 Objetivos do Repositório

- Consolidar os conteúdos aprendidos em cada seção do curso.
- Manter um histórico organizado de exercícios e práticas.
- Registrar minha evolução em Java de forma pública e transparente.
- Criar um portfólio técnico com foco em Java back-end.
- Desenvolver hábitos profissionais como organização de pastas, commits frequentes e documentação.
- Fortalecer fundamentos antes de avançar para frameworks como Spring Boot.

---

## 📚 Conteúdo Aprendido

Nesta seção, resumo os principais tópicos estudados em cada parte do curso.

### Seção 10 – Fundamentos da Programação em Java

- Estrutura básica de um programa Java.
- Uso de `class`, `main` e `System.out.println`.
- Declaração de variáveis e primeiros identificadores.
- Tipos primitivos: `int`, `double`, `boolean` e `char`.
- Inferência de tipos com `var`.
- Promoções automáticas de tipo.
- Primeiros exercícios práticos com lógica simples.

Principal aprendizado da seção: os fundamentos mostram como um programa Java nasce, desde a estrutura básica até o uso de variáveis, tipos e primeiras instruções de saída.

---

### Seção 11 – Operadores

- Operadores aritméticos: `+`, `-`, `*`, `/` e `%`.
- Operadores relacionais: `>`, `<`, `>=`, `<=`, `==` e `!=`.
- Operadores lógicos: `&&`, `||` e `!`.
- Precedência de operadores.
- Construção de expressões matemáticas e lógicas.
- Exercícios simples envolvendo cálculos e comparações.

Principal aprendizado da seção: operadores são a base para criar expressões, comparar valores e construir decisões dentro de um programa Java.

---

### Seção 12 – Controles de Fluxo

- Estruturas condicionais com `if`, `else if` e `else`.
- Uso de `switch`.
- Entrada de dados com `Scanner`.
- Validação de informações digitadas pelo usuário.
- Construção de decisões simples no programa.
- Exercícios práticos envolvendo regras e condições.

Principal aprendizado da seção: controles de fluxo permitem que o programa tome decisões diferentes conforme os dados recebidos e as regras definidas.

---

### Seção 13 – Loops

- Estruturas de repetição com `for`, `while` e `do-while`.
- Uso de `break` e `continue`.
- Controle de fluxo dentro das repetições.
- Criação de contadores.
- Validações repetidas.
- Exercícios práticos com repetição de comandos e lógica incremental.

Principal aprendizado da seção: loops permitem repetir tarefas de forma controlada, reduzindo repetição de código e fortalecendo a lógica de programação.

---

### Seção 14 – Princípios de Programação Orientada a Objetos (POO)

- Criação de classes, objetos, atributos e métodos.
- Uso de variáveis de instância.
- Construtores com e sem parâmetros.
- Sobrecarga de construtores e uso da palavra-chave `this`.
- Encapsulamento com `private`, getters, setters e validações.
- Modificadores de acesso: `public`, `private`, `protected` e default.
- Organização com pacotes, membros `static` e classes utilitárias.

Principal aprendizado da seção: a POO ajuda a organizar melhor o código, separando responsabilidades e aproximando a estrutura do programa de entidades do mundo real.

---

### Seção 15 – Arrays

- Criação e uso de arrays em Java.
- Armazenamento de múltiplos valores em uma única estrutura.
- Acesso aos elementos por índice.
- Percorrendo arrays com estruturas de repetição.
- Relação entre arrays e organização de dados.
- Exercícios simples para reforçar lógica e manipulação de conjuntos de valores.

Principal aprendizado da seção: arrays permitem trabalhar com vários valores relacionados dentro de uma mesma estrutura, reforçando a lógica de repetição e acesso por posição.

---

### Seção 16 – Herança

- Uso da palavra-chave `extends`.
- Conceito de superclasse e subclasse.
- Princípio do “é um”.
- Reaproveitamento de atributos e métodos.
- Sobrescrita de métodos e uso de `@Override`.
- Uso da palavra-chave `super` em métodos e construtores.
- Exercícios práticos com `Veiculo` e `Carro`, `Funcionario` e `Assistente`, `Pessoa` e `Estudante`.

Principal aprendizado da seção: herança não deve ser usada apenas para reaproveitar código. Antes de usar `extends`, é necessário existir uma relação real de especialização entre as classes.

---

### Seção 17 – Annotations

- Conceito de annotations em Java.
- Diferença entre annotation e comentário.
- Annotations como metadados no código.
- Uso de annotations predefinidas da linguagem.
- Uso de `@Override`, `@Deprecated` e `@SuppressWarnings`.
- Relação entre annotations, compilador e avisos de código.
- Primeira visão sobre o uso de annotations em frameworks Java back-end.

Principal aprendizado da seção: annotations não são comentários decorativos. Elas fornecem informações úteis para o compilador, ferramentas, bibliotecas e frameworks.

---

### Seção 18 – Imutabilidade

- Conceito inicial de imutabilidade em Java.
- Uso da palavra-chave `final`.
- Aplicação de `final` em variáveis, métodos e classes.
- Criação de constantes e convenção de nomes em letras maiúsculas.
- Diferença entre `private` e `final`.
- Relação entre `final`, `@Override`, herança e sobrescrita.
- Introdução ao uso de `enum` como conjunto fixo de constantes.

Principal aprendizado da seção: `final` pode ser usado em diferentes contextos. Em variáveis, impede nova atribuição; em métodos, impede sobrescrita; em classes, impede herança. Também ficou claro que `private` controla acesso, enquanto `final` controla alteração.

---

### Seção 19 – Interfaces

- Conceito inicial de interfaces em Java.
- Uso da palavra-chave `interface`.
- Uso de `implements` para implementar uma interface.
- Diferença entre `extends` e `implements`.
- Interfaces como contratos de comportamento.
- Criação de métodos abstratos em interfaces.
- Implementação obrigatória dos métodos nas classes concretas.
- Uso de `@Override` ao implementar métodos de uma interface.
- Regras importantes de interfaces:
  - interfaces não podem ser instanciadas diretamente;
  - atributos em interfaces são `public static final` por padrão;
  - métodos abstratos em interfaces são `public abstract` por padrão.
- Herança entre interfaces com `extends`.
- Implementação de métodos herdados de outras interfaces.
- Uso de métodos `default` em interfaces.
- Uso de métodos `static` em interfaces.
- Diferença entre método abstrato, método `default` e método `static`.
- Aplicação prática de interfaces em exercícios com veículos, pedidos de restaurante e controle de estoque.

Principal aprendizado da seção: interfaces funcionam como contratos de comportamento. Elas definem o que uma classe deve fazer, mas quem implementa o comportamento real é a classe concreta. Também ficou claro que `implements` é usado para implementar interfaces, enquanto `extends` é usado para herança. A seção foi desafiadora, especialmente no entendimento inicial do conceito, mas ajudou a reforçar a organização do código e a importância de separar contrato e implementação.

---

---


## 🗂️ Organização das Seções

A partir das seções práticas, venho mantendo uma estrutura parecida com esta:

```text
SectionXXNomeDaSecao/
├── Documentos/
├── Exercicios/
├── Fontes/
├── SolucoesExercicios/
