# 📚 Resumo 01 — Introdução ao Java Collections Framework

## 🎯 Aulas 207 e 208

As aulas apresentam uma introdução ao **Java Collections Framework**, recurso muito importante para armazenar, recuperar e manipular grupos de objetos em Java.

Uma coleção pode ser entendida como um contêiner capaz de agrupar vários elementos em uma única estrutura. No desenvolvimento profissional, Collections são muito utilizadas por oferecerem flexibilidade e diversos métodos prontos para trabalhar com dados.

---

## 📦 Arrays e Collections

Arrays e Collections podem armazenar vários dados, mas possuem diferenças importantes.

### Arrays

- possuem tamanho fixo após a criação;
- podem armazenar tipos primitivos diretamente;
- oferecem uma estrutura simples;
- costumam ter bom desempenho para acesso por índice;
- continuam úteis quando a quantidade de elementos já é conhecida.

Exemplo:

```java
String[] nomes = new String[3];
```

### Collections

- geralmente podem aumentar ou diminuir durante a execução;
- armazenam objetos;
- oferecem métodos prontos para adicionar, remover, pesquisar e organizar dados;
- são mais flexíveis para aplicações em que a quantidade de elementos pode variar.

Exemplo:

```java
List<String> nomes = new ArrayList<>();
```

> Collections não aposentaram os arrays. Cada estrutura possui situações em que é mais adequada.

---

## 🧩 Java Collections Framework

O Java Collections Framework é um conjunto de interfaces e classes da API Java usado para representar diferentes formas de agrupamento de dados.

Entre os métodos comuns encontrados na interface `Collection`, estão:

```java
add()
remove()
clear()
size()
isEmpty()
contains()
```

Esses métodos formam parte do contrato que deve ser respeitado pelas estruturas pertencentes à hierarquia de `Collection`.

---

## 🌳 Hierarquia principal

A interface correta é `Collection`, no singular.

```text
Collection
├── List
│   └── ArrayList
├── Set
│   └── HashSet
└── Queue
```

Cada interface possui uma finalidade:

- `List`: representa uma sequência de elementos e aceita repetições;
- `Set`: representa um conjunto sem elementos duplicados;
- `Queue`: representa estruturas voltadas ao processamento em fila.

As classes concretas implementam essas interfaces. Por exemplo:

```java
List<String> lista = new ArrayList<>();
Set<String> conjunto = new HashSet<>();
```

A interface fica à esquerda, representando o contrato, e a classe concreta fica à direita, realizando a implementação.

---

## 🗺️ Onde o Map entra?

`Map` pertence ao Java Collections Framework, mas **não é uma subinterface de `Collection`**.

Sua hierarquia é separada:

```text
Map
└── HashMap
```

Isso acontece porque `Collection` trabalha com elementos individuais, enquanto `Map` trabalha com associações entre **chaves e valores**.

Exemplo:

```java
Map<String, Integer> pontuacoes = new HashMap<>();
```

Nesse caso:

```text
"Java" → 20
```

- `"Java"` é a chave;
- `20` é o valor.

Portanto:

- `ArrayList` pertence à hierarquia de `List` e `Collection`;
- `HashSet` pertence à hierarquia de `Set` e `Collection`;
- `HashMap` implementa `Map`, que possui uma hierarquia separada.

---

## ⚠️ Collection e Collections não são a mesma coisa

```java
Collection
```

É uma interface raiz do framework.

```java
Collections
```

É uma classe utilitária que oferece métodos prontos para operações como ordenação e manipulação de coleções.

Essa diferença de nome é importante para evitar confusão durante os estudos.

---

## 🔎 Aprofundamento realizado durante os estudos

Durante a revisão das aulas, foi identificado que `Map` não herda de `Collection`. Embora faça parte do mesmo framework, ele possui outro contrato por trabalhar com pares de chave e valor.

Também foi reforçado que cada implementação possui características próprias:

```text
ArrayList → lista ordenada, aceita duplicatas e trabalha com índices
HashSet   → conjunto sem duplicatas e sem ordem garantida
HashMap   → associação entre uma chave única e um valor
```

A escolha da estrutura deve ser feita de acordo com o problema que o programa precisa resolver.

---

## ✅ Resumo final

O Java Collections Framework fornece estruturas flexíveis para trabalhar com grupos de objetos. `Collection` é a interface raiz de estruturas como `List` e `Set`, enquanto `Map` possui uma hierarquia separada. Arrays continuam úteis, mas Collections oferecem mais possibilidades de manipulação e são muito frequentes no desenvolvimento Java profissional.
