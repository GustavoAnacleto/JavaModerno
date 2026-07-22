# 📚 Resumo 03 — List em Java

## 🎯 Aula 212

A aula apresenta a interface `List` e a classe `ArrayList`, mostrando como criar uma lista, adicionar elementos, verificar conteúdos, combinar listas, remover dados, acessar posições e limpar a estrutura.

Durante os estudos, o conteúdo foi aprofundado no arquivo `ExemploListComplementar.java`, com métodos adicionais para inserção por índice, substituição, pesquisa de posições, percorrimento e ordenação.

---

## 📦 Importações necessárias

`List`, `ArrayList` e `Arrays` pertencem ao pacote `java.util`.

Importações específicas:

```java
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
```

Também é possível importar todas as classes do pacote:

```java
import java.util.*;
```

Em códigos maiores, imports específicos costumam deixar mais claro quais recursos estão sendo utilizados.

---

## 🧩 Interface e implementação

A declaração mais comum é:

```java
List<String> lista = new ArrayList<>();
```

Nesse código:

- `List<String>` é o tipo da variável e representa o contrato;
- `ArrayList<>` é a implementação concreta;
- `String` define o tipo de elemento aceito;
- a lista pode aumentar ou diminuir durante a execução.

`ArrayList` utiliza internamente uma estrutura baseada em array dinâmico.

---

## 🔁 Principais características de List

Uma `List`:

- mantém a ordem de inserção;
- permite elementos duplicados;
- trabalha com índices;
- permite acessar e alterar elementos por posição;
- começa sempre no índice `0`.

Exemplo:

```java
lista.add("Java");   // índice 0
lista.add("Python"); // índice 1
lista.add("C++");    // índice 2
```

Ao contrário de `Set`, adicionar novamente um elemento já existente é permitido:

```java
lista.add("Java");
lista.add("Java");
```

As duas ocorrências permanecem na lista.

---

## 🛠️ Métodos apresentados na aula

### `add()`

Adiciona um elemento ao final da lista.

```java
lista.add("Java");
lista.add("Python");
lista.add("C++");
```

### `contains()`

Verifica se um elemento existe.

```java
boolean contemJava = lista.contains("Java");
```

O resultado será `true` ou `false`.

### `Arrays.asList()`

Cria uma lista a partir de elementos informados.

```java
List<String> outraLista =
        Arrays.asList("JavaScript", "Ruby");
```

Essa lista possui tamanho fixo. Ela pode ser usada como fonte de dados, mas tentar adicionar ou remover elementos diretamente pode causar erro durante a execução.

### `addAll()`

Adiciona todos os elementos de outra coleção à lista principal.

```java
lista.addAll(outraLista);
```

Se a lista inicial contiver:

```text
[Java, Python, C++]
```

E a segunda:

```text
[JavaScript, Ruby]
```

O resultado será:

```text
[Java, Python, C++, JavaScript, Ruby]
```

A ordem é preservada.

### `remove(elemento)`

Remove a primeira ocorrência do elemento informado.

```java
lista.remove("Python");
```

### `get(indice)`

Obtém o elemento presente em uma posição.

```java
String elemento = lista.get(2);
```

Como os índices começam em zero, o índice `2` representa o terceiro elemento.

### `clear()`

Remove todos os elementos.

```java
lista.clear();
```

Depois da limpeza:

```text
[]
```

---

## 🔎 Aprofundamento realizado durante os estudos

Após acompanhar o código `ExemploList.java`, foi criado o arquivo `ExemploListComplementar.java` para praticar recursos adicionais e ampliar o domínio da sintaxe.

### `size()`

Retorna a quantidade de elementos.

```java
int quantidade = lista.size();
```

---

### `add(indice, elemento)`

Insere um elemento em uma posição específica.

```java
lista.add(1, "Progress4GL");
```

Os elementos que estavam naquela posição e nas seguintes são deslocados para a direita.

Exemplo:

```text
Antes:  [Java, Python, C++]
Depois: [Java, Progress4GL, Python, C++]
```

---

### `set(indice, elemento)`

Substitui o elemento de uma posição.

```java
lista.set(2, "JavaScript");
```

O tamanho da lista não aumenta. Apenas ocorre uma substituição.

Também é possível guardar o elemento anterior:

```java
String elementoAnterior =
        lista.set(2, "JavaScript");
```

---

### `indexOf(elementoProcurado)`

Procura o elemento informado e retorna o índice da **primeira ocorrência**.

```java
int primeiroIndiceJava = lista.indexOf("Java");
```

Esse método não retorna o elemento. Ele retorna sua posição.

Caso o elemento não exista:

```text
-1
```

---

### `lastIndexOf(elemento)`

Retorna o índice da última ocorrência.

```java
int ultimoIndiceJava =
        lista.lastIndexOf("Java");
```

Isso é útil quando existem elementos duplicados.

---

### `remove(indice)`

Remove o elemento localizado em uma posição e retorna o objeto removido.

```java
String elementoRemovido = lista.remove(1);
```

É importante diferenciar:

```java
lista.remove("Java"); // remove pelo conteúdo
lista.remove(1);      // remove pelo índice
```

Em uma `List<Integer>`, essa diferença exige atenção, pois um número inteiro pode ser interpretado como índice.

---

## 🔁 Percorrendo uma List

### Com `for-each`

Use quando precisar apenas dos elementos:

```java
for (String linguagem : lista) {
    System.out.println(linguagem);
}
```

### Com `for` tradicional

Use quando também precisar dos índices:

```java
for (int indice = 0;
        indice < lista.size();
        indice++) {

    System.out.println(
            "Índice " + indice
                    + ": " + lista.get(indice)
    );
}
```

---

## 🔤 Ordenação da lista

### Ordem crescente

```java
Collections.sort(lista);
```

Para textos, aplica a ordem alfabética natural.

### Ordem decrescente

```java
Collections.reverse(lista);
```

Esse método inverte a ordem atual da lista.

Se a lista tiver sido ordenada de forma crescente antes, o resultado será uma ordem decrescente.

Também seria possível usar:

```java
lista.sort(Collections.reverseOrder());
```

Essa é uma alternativa, mas o estudo principal utilizou `sort()` seguido de `reverse()`.

---

## 🧹 Verificação de lista vazia

`isEmpty()` retorna um `boolean` indicando se a lista está sem elementos.

```java
boolean estaVazia = lista.isEmpty();
```

Após:

```java
lista.clear();
```

O resultado de `isEmpty()` será `true`.

---

## ⚠️ Pontos de atenção

### Índices começam em zero

```text
índice 0 → primeiro elemento
índice 1 → segundo elemento
índice 2 → terceiro elemento
```

Acessar um índice inexistente causa erro em tempo de execução.

### `Arrays.asList()` possui tamanho fixo

```java
List<String> lista =
        Arrays.asList("Java", "Python");
```

É possível substituir elementos com `set()`, mas `add()` e `remove()` não são permitidos nessa lista.

### Elementos duplicados são permitidos

`List` não impede repetições. Essa é uma diferença central em relação a `Set`.

---

## 💻 Prática realizada

Foram criados dois arquivos:

```text
ExemploList.java
ExemploListComplementar.java
```

O primeiro acompanhou a aula e praticou:

- `add()`;
- `contains()`;
- `Arrays.asList()`;
- `addAll()`;
- `remove()`;
- `get()`;
- `clear()`.

O segundo foi criado como aprofundamento por iniciativa própria e praticou:

- `size()`;
- inserção com índice;
- substituição com `set()`;
- `indexOf()` e `lastIndexOf()`;
- remoção por índice;
- percorrimento com `for-each` e `for`;
- ordenação crescente e decrescente;
- `isEmpty()`.

Esse aprofundamento foi realizado para ir além da reprodução do código da aula e consolidar o uso real de listas em Java.

---

## ✅ Resumo final

`List` representa uma coleção ordenada, aceita elementos duplicados e permite acesso por índice. `ArrayList` é uma das implementações mais utilizadas. Além das operações básicas de inclusão, busca, remoção e limpeza, listas podem ser alteradas por posição, percorridas de diferentes formas e ordenadas conforme a necessidade.

A escolha de `List` é adequada quando a ordem dos dados é importante, quando repetições são permitidas ou quando é necessário acessar elementos por posição.
