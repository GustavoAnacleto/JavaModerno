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
### Seção 20 – Classes Abstratas

- Conceito inicial de abstração em Java.
- Diferença entre generalização e especialização.
- Criação de classes abstratas com a palavra-chave `abstract`.
- Impossibilidade de instanciar classes abstratas diretamente.
- Criação de métodos abstratos sem implementação.
- Implementação obrigatória dos métodos abstratos nas subclasses concretas.
- Uso de métodos concretos dentro de classes abstratas.
- Uso de atributos para representar o estado dos objetos.
- Criação de construtores em classes abstratas.
- Uso de `super` para chamar o construtor da superclasse.
- Herança de classes abstratas com `extends`.
- Sobrescrita de métodos com `@Override`.
- Reutilização de atributos e comportamentos comuns.
- Diferença entre classes abstratas e interfaces.
- Classes abstratas implementando interfaces.
- Implementação de várias interfaces por uma mesma classe.
- Diferença entre herança simples de classes e herança múltipla de tipos.
- Aplicação prática em exercícios com figuras geométricas e uma loja abstrata.
- Uso inicial do polimorfismo por meio de referências de classes abstratas.

Principal aprendizado da seção: uma classe abstrata funciona como uma base parcialmente pronta para outras classes. Ela pode armazenar estado, possuir construtores, fornecer comportamentos comuns e obrigar as subclasses concretas a implementar aquilo que varia. Também ficou mais clara a diferença entre classes abstratas e interfaces: a classe abstrata pode reunir estado e implementação compartilhada, enquanto a interface representa principalmente um contrato de comportamento.

---

### Seção 21 – Polimorfismo

- Conceito inicial de polimorfismo em Java.
- Significado da expressão “muitas formas”.
- Relação entre polimorfismo, herança, classes abstratas e interfaces.
- Diferença entre o tipo da referência e o tipo real do objeto.
- Uso de referências de superclasses apontando para objetos de subclasses.
- Entendimento de que o objeto não muda de classe por causa da referência utilizada.
- Uso de classes abstratas como tipos de referência.
- Uso de interfaces como tipos de referência.
- Sobrescrita de métodos com `@Override`.
- Execução da implementação correspondente ao tipo real do objeto.
- Escolha do método sobrescrito durante o runtime.
- Uso do mesmo método com comportamentos diferentes.
- Criação de métodos que recebem tipos mais gerais.
- Redução de repetição e aumento da flexibilidade do código.
- Estudo da classe `Object` como raiz da hierarquia de classes.
- Herança direta e indireta da classe `Object`.
- Uso de `Object` como tipo de referência.
- Diferença entre os métodos conhecidos pela referência e os comportamentos do objeto real.
- Conceito de upcasting para tipos mais gerais.
- Conceito de downcasting para tipos mais específicos.
- Conversão explícita de referências por meio de casting.
- Risco de `ClassCastException` em conversões incompatíveis.
- Uso de `instanceof` para verificar o tipo antes do downcasting.
- Diferença entre sobrescrita e sobrecarga.
- Aplicação prática em exercícios com gerenciamento de veículos e calculadora polimórfica.

Principal aprendizado da seção: o polimorfismo permite tratar objetos de classes diferentes por meio de um tipo mais geral compartilhado. O tipo da referência determina quais métodos podem ser acessados durante a compilação, enquanto o tipo real do objeto determina qual implementação sobrescrita será executada em runtime. Também ficou claro que o objeto não muda de classe: o que muda é a maneira como ele pode ser referenciado dentro de uma hierarquia. Esse recurso ajuda a reduzir repetição, criar métodos mais gerais e tornar o código mais flexível e fácil de estender.

---

### Seção 22 – Generics

- Introdução ao conceito de Generics em Java.
- Entendimento de que Generics foi introduzido no Java 5.
- Comparação entre o modelo antigo com `Object` e o modelo com Generics.
- Uso de `Object` para armazenar objetos de diferentes classes.
- Necessidade de `instanceof` e casting no modelo sem Generics.
- Risco de `ClassCastException` em conversões incompatíveis.
- Definição de classes genéricas com `<T>`.
- Uso de `T` como parâmetro de tipo.
- Aplicação do tipo genérico em atributos, parâmetros e retornos de métodos.
- Criação da classe genérica `Caixa<T>`.
- Implementação dos métodos `guardar()` e `pegar()`.
- Definição do tipo no momento de utilizar a classe genérica.
- Criação de objetos como `Caixa<String>` e `Caixa<Integer>`.
- Reutilização da mesma classe com diferentes tipos.
- Uso do operador diamante `<>`.
- Verificação de incompatibilidades durante a compilação.
- Redução da necessidade de `instanceof` e casting manual.
- Entendimento de que Generics trabalha com tipos de referência.
- Impossibilidade de utilizar tipos primitivos diretamente como parâmetros genéricos.
- Uso das classes wrapper `Integer`, `Double`, `Boolean` e `Character`.
- Entendimento de que `String` já é uma classe e pode ser utilizada diretamente.
- Identificação do construtor `new Integer()` como obsoleto.
- Uso de `Integer.valueOf()` para obter objetos do tipo `Integer`.
- Conceito de autoboxing entre tipos primitivos e classes wrapper.
- Comparação prática entre caixas com `Object` e caixas genéricas.
- Criação de classes próprias como `Carrinho` e `Boneca`.
- Uso de `CaixaGenerica<Carrinho>` e `CaixaGenerica<Boneca>`.
- Criação do exercício `Cesto<T>` para armazenar `Peixe` e `Polvo`.
- Recuperação dos objetos diretamente no tipo definido pelo cesto.
- Criação de uma caixa genérica baseada em array.
- Uso de capacidade e índices para armazenar e recuperar elementos.
- Entendimento da limitação de criação direta de arrays com `new T[]`.
- Criação de array genérico por meio de `(T[]) new Object[capacidade]`.
- Compreensão do aviso de conversão não verificada durante a compilação.
- Uso de `Caixa<Double>` para armazenar preços.
- Uso de `Caixa<Character>` para armazenar letras.
- Aplicação prática de Generics com segurança de tipos, reutilização de código e redução de conversões manuais.

Principal aprendizado da seção: Generics permite criar classes, interfaces e métodos reutilizáveis cujo tipo é definido no momento da utilização. Ao declarar estruturas como `Caixa<String>`, `Cesto<Peixe>` ou `Caixa<Double>`, o compilador passa a controlar quais objetos podem ser armazenados e qual tipo será devolvido. Isso reduz a necessidade de `Object`, `instanceof` e casting manual, antecipa incompatibilidades para o tempo de compilação e torna o código mais seguro, claro e reutilizável. Também ficou evidente que nem toda sintaxe pode ser deduzida apenas pela lógica: a criação de arrays genéricos possui limitações específicas da linguagem que precisam ser estudadas e compreendidas.

---

---


## 🗂️ Organização das Seções

A partir das seções práticas, venho mantendo uma estrutura parecida com esta:

```text
Section21Polimorfismo/
├── Documentos/
│   └── anotacoes.txt
├── Exercicios/
├── Fontes/
└── SolucoesExercicios/
