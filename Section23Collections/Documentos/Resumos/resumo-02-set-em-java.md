# 📚 Resumo 02 — Set em Java

## 🎯 Aulas 209 e 210

As aulas apresentam a interface `Set` e sua implementação mais comum, `HashSet`. Essa estrutura é usada quando precisamos armazenar elementos **sem permitir duplicatas**.

---

## 📦 Importação de Set e HashSet

`Set` e `HashSet` pertencem ao pacote `java.util`, por isso precisam ser importados.

Importações específicas:

```java
import java.util.Set;
import java.util.HashSet;
```

Também é possível importar todas as classes e interfaces do pacote `java.util`:

```java
import java.util.*;
```

Usar `*` reduz a quantidade de linhas de importação, mas em códigos maiores costuma ser mais claro importar apenas o que será utilizado.

---

## 🧩 Interface e implementação

A declaração mais comum é:

```java
Set<String> conjunto = new HashSet<>();
```

Nesse código:

- `Set<String>` é o tipo da variável e representa o contrato;
- `HashSet<>` é a classe concreta que implementa `Set`;
- `String` define, por meio de Generics, o tipo de elemento aceito.

Assim, o conjunto aceita apenas objetos do tipo `String`.

---

## 🚫 Elementos duplicados

A principal característica de `Set` é não permitir elementos repetidos.

```java
conjunto.add("Java");
conjunto.add("Python");
conjunto.add("Java");
```

Mesmo tentando adicionar `"Java"` duas vezes, o conjunto manterá apenas uma ocorrência.

O método `add()` retorna um `boolean`:

```java
boolean foiAdicionado = conjunto.add("Java");
```

- `true`: o elemento foi adicionado;
- `false`: o elemento já existia e não foi adicionado novamente.

A operação falha de forma silenciosa: não lança erro apenas por causa da duplicidade, mas o conjunto não é alterado.

---

## 🛠️ Métodos principais

### `add()`

Adiciona um elemento ao conjunto.

```java
conjunto.add("Java");
```

### `contains()`

Verifica se determinado elemento existe.

```java
boolean contemJava = conjunto.contains("Java");
```

### `remove()`

Remove um elemento e retorna um `boolean`.

```java
boolean foiRemovido = conjunto.remove("Python");
```

- `true`: o elemento existia e foi removido;
- `false`: o elemento não existia.

### `size()`

Informa a quantidade de elementos.

```java
int quantidade = conjunto.size();
```

### `clear()`

Remove todos os elementos.

```java
conjunto.clear();
```

### `isEmpty()`

Verifica se o conjunto está vazio.

```java
boolean estaVazio = conjunto.isEmpty();
```

---

## 🔁 Percorrendo um Set

`Set` não trabalha com índices. Portanto, não existe acesso como `get(0)`.

Para percorrer os elementos, podemos usar `for-each`:

```java
for (String linguagem : conjunto) {
    System.out.println(linguagem);
}
```

> Embora a aula tenha comparado `Set` a um “array moderno”, essa comparação serve apenas para a ideia de armazenar vários elementos. Diferentemente de um array ou de uma `List`, um `Set` não possui posições acessíveis por índice.

---

## 🔀 Ordem dos elementos

`HashSet` não garante a ordem em que os elementos serão exibidos.

```java
Set<String> conjunto = new HashSet<>();

conjunto.add("Java");
conjunto.add("Python");
conjunto.add("C++");
```

A impressão pode aparecer em uma ordem diferente da inserção.

O código hash é usado internamente para organizar e localizar elementos, mas não deve ser usado como critério de ordenação.

---

## 🔎 Aprofundamento realizado durante os estudos

Além do conteúdo principal das aulas, foram pesquisadas outras implementações de `Set`.

### `HashSet`

```java
Set<String> conjunto = new HashSet<>();
```

- não permite duplicatas;
- não garante ordem;
- oferece operações rápidas de adição, remoção e busca.

### `LinkedHashSet`

```java
Set<String> conjunto = new LinkedHashSet<>();
```

- não permite duplicatas;
- mantém a ordem de inserção.

### `TreeSet`

```java
Set<String> conjunto = new TreeSet<>();
```

- não permite duplicatas;
- mantém os elementos em ordem natural crescente.

Para ordem decrescente:

```java
Set<String> conjunto =
        new TreeSet<>(Comparator.reverseOrder());
```

Resumo:

```text
HashSet       → não garante ordem
LinkedHashSet → mantém a ordem de inserção
TreeSet       → mantém os elementos ordenados
```

---

## 💻 Prática realizada

Durante os estudos, foram criados dois arquivos:

```text
ExemploSet.java
ExemploSetComplementar.java
```

O primeiro acompanhou o conteúdo do professor, praticando:

- criação de um `HashSet`;
- adição de elementos;
- verificação com `contains()`;
- remoção;
- tentativa de duplicidade;
- limpeza com `clear()`.

O exemplo complementar aprofundou:

- retorno `boolean` de `add()` e `remove()`;
- uso de `size()` e `isEmpty()`;
- percorrimento com `for-each`;
- comparação entre `HashSet`, `LinkedHashSet` e `TreeSet`;
- ordenação crescente e decrescente.

---

## ⚠️ Pontos de atenção

- `Set` não permite elementos duplicados;
- `HashSet` não garante ordem;
- `Set` não possui índices;
- `add()` e `remove()` retornam `boolean`;
- em uma condição booleana, prefira:

```java
if (foiAdicionado) {
    // código
}
```

Evite usar atribuição por engano:

```java
if (foiAdicionado = true) {
    // incorreto para comparação
}
```

---

## ✅ Resumo final

`Set` é uma interface usada para representar conjuntos de elementos únicos. `HashSet` é sua implementação mais comum e não garante ordem. Quando a ordem de inserção for importante, pode-se usar `LinkedHashSet`; quando for necessária ordenação, pode-se usar `TreeSet`. O aprendizado principal é escolher `Set` quando a regra do problema exigir ausência de duplicatas.
