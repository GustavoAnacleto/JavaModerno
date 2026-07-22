# 📚 Resumo 04 — Map em Java

## 🎯 Aulas 213, 214 e 215

As aulas apresentam a interface `Map`, sua relação com o Java Collections Framework e o uso da classe `HashMap` para armazenar dados em pares de **chave e valor**.

Embora `Map` faça parte do framework de coleções, ele não herda de `Collection`. Isso acontece porque sua estrutura e seus métodos são diferentes de `List` e `Set`.

---

## 🧩 Interface e implementação

A declaração mais comum é:

```java
Map<String, Integer> mapa = new HashMap<>();
```

Nesse código:

- `Map<String, Integer>` é o tipo da variável e representa o contrato;
- `HashMap<>` é a implementação concreta;
- `String` é o tipo da chave;
- `Integer` é o tipo do valor.

A ordem dos tipos deve ser sempre:

```java
Map<TipoDaChave, TipoDoValor>
```

Ao adicionar dados, usamos:

```java
mapa.put(chave, valor);
```

Exemplo:

```java
mapa.put("Java", 20);
```

Nesse par:

```text
"Java" → chave
20     → valor
```

---

## 🗺️ Map como um dicionário

Um `Map` pode ser comparado a um dicionário:

```text
palavra → significado
```

Em Java:

```text
chave → valor
```

Exemplos de relações possíveis:

```text
CPF → nome
código → produto
matrícula → funcionário
linguagem → pontuação
```

A chave serve para localizar o valor associado.

---

## 🔑 Chaves únicas e valores repetidos

Em um `Map`, as chaves devem ser únicas.

```java
idades.put("Gustavo", 38);
idades.put("Gustavo", 40);
```

O segundo `put()` não cria um novo registro. Ele substitui o valor anterior.

Resultado:

```text
Gustavo → 40
```

Já os valores podem se repetir:

```java
idades.put("Gustavo", 38);
idades.put("Carlos", 38);
idades.put("Ana", 38);
```

Resultado conceitual:

```text
Gustavo → 38
Carlos  → 38
Ana     → 38
```

Por isso, em um sistema real, é importante escolher uma chave que identifique o dado de forma única.

---

## 📦 Importações necessárias

`Map` e `HashMap` pertencem ao pacote `java.util`.

```java
import java.util.Map;
import java.util.HashMap;
```

A ordem dos imports não altera o funcionamento do programa.

---

## 🛠️ Métodos apresentados nas aulas

### `put(chave, valor)`

Adiciona um novo par ou atualiza o valor de uma chave existente.

```java
mapa.put("Java", 20);
```

Atualização:

```java
mapa.put("Java", 30);
```

---

### `containsKey(chave)`

Verifica se determinada chave existe.

```java
boolean contemJava = mapa.containsKey("Java");
```

Retorna `true` ou `false`.

---

### `get(chave)`

Retorna o valor associado à chave.

```java
Integer valorJava = mapa.get("Java");
```

Caso a chave não exista, o retorno será `null`.

---

### `remove(chave)`

Remove o par associado à chave.

```java
mapa.remove("Python");
```

---

### `clear()`

Remove todos os pares do mapa.

```java
mapa.clear();
```

Depois disso, o mapa ficará vazio:

```text
{}
```

---

## 🔀 Ordenação em Map

`HashMap` não garante ordem de exibição.

```java
Map<String, Integer> mapa = new HashMap<>();
```

Os pares podem aparecer em uma ordem diferente daquela em que foram adicionados. Essa ordem também pode mudar após inclusões ou remoções.

Isso não significa que os dados foram alterados. As chaves e os valores continuam associados corretamente.

Existem outras implementações para situações em que a ordem importa.

### `LinkedHashMap`

Mantém a ordem de inserção.

```java
Map<String, Integer> mapa = new LinkedHashMap<>();
```

### `TreeMap`

Mantém os pares ordenados pelas chaves.

```java
Map<String, Integer> mapa = new TreeMap<>();
```

Resumo:

```text
HashMap       → não garante ordem
LinkedHashMap → mantém a ordem de inserção
TreeMap       → ordena pelas chaves
```

A escolha entre elas depende da necessidade do programa. Manter ordenação pode exigir mais processamento e memória.

---

## 💻 Prática realizada na aula

No arquivo `ExemploMap.java`, foram praticados:

```text
put()
containsKey()
get()
remove()
clear()
```

Também foi reforçado que:

- uma chave não pode se repetir;
- inserir novamente uma chave atualiza seu valor;
- valores podem ser duplicados;
- `HashMap` não garante ordem.

Exemplo:

```java
Map<String, Integer> mapa = new HashMap<>();

mapa.put("Java", 20);
mapa.put("Python", 10);
mapa.put("C++", 15);

System.out.println(mapa.containsKey("Java"));
System.out.println(mapa.get("Java"));

mapa.remove("Python");
mapa.put("Java", 30);
```

---

## 🔎 Aprofundamento realizado durante os estudos

Após acompanhar o código da aula, foi criado o arquivo `ExemploMapComplementar.java` para ampliar o domínio de `Map`.

### `containsValue(valor)`

Verifica se determinado valor existe.

```java
boolean contemValor = mapa.containsValue(20);
```

Diferentemente de `containsKey()`, ele pesquisa os valores.

---

### `getOrDefault(chave, valorPadrao)`

Retorna o valor associado à chave ou um valor padrão quando ela não existe.

```java
Integer valor = mapa.getOrDefault("PHP", 0);
```

Se `"PHP"` não existir, o resultado será `0`.

O valor padrão não é inserido automaticamente no mapa.

Exemplo real:

```java
String nome = pessoasPorCpf.getOrDefault(
        cpfDigitado,
        "CPF inexistente"
);
```

---

### `putIfAbsent(chave, valor)`

Adiciona o par somente se a chave ainda não existir.

```java
mapa.putIfAbsent("Java", 100);
```

Se `"Java"` já estiver no mapa, seu valor não será alterado.

---

### `replace(chave, valor)`

Substitui o valor somente quando a chave existe.

```java
mapa.replace("Java", 30);
```

---

### `keySet()`

Retorna um conjunto com todas as chaves.

```java
for (String chave : mapa.keySet()) {
    System.out.println(chave);
}
```

O retorno é um `Set` porque as chaves são únicas.

---

### `values()`

Retorna uma coleção com todos os valores.

```java
for (Integer valor : mapa.values()) {
    System.out.println(valor);
}
```

Os valores podem aparecer repetidos.

---

### `entrySet()`

Retorna os pares de chave e valor.

```java
for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
    System.out.println(
            entrada.getKey() + " → " + entrada.getValue()
    );
}
```

Esse recurso é útil quando precisamos acessar a chave e o valor ao mesmo tempo.

---

## 🔗 Relação entre Map e JSON

Um objeto JSON também é formado por pares de chave e valor.

Exemplo:

```json
{
  "nome": "Gustavo",
  "idade": 38
}
```

Uma representação possível em Java seria:

```java
Map<String, Object> dados = new HashMap<>();

dados.put("nome", "Gustavo");
dados.put("idade", 38);
```

Quando a estrutura do JSON é conhecida, normalmente é melhor convertê-la para uma classe Java. Quando os dados são mais dinâmicos, um `Map<String, Object>` pode ser útil.

---

## ⚠️ Pontos de atenção

- a ordem é sempre `chave, valor`;
- as chaves devem ser únicas;
- os valores podem se repetir;
- repetir uma chave atualiza seu valor;
- `HashMap` não garante ordem;
- `get()` retorna `null` quando a chave não existe;
- `getOrDefault()` retorna um valor alternativo sem alterar o mapa;
- `Map` pertence ao Collections Framework, mas não herda de `Collection`.

---

## ✅ Resumo final

`Map` é uma interface usada para armazenar associações entre chaves e valores. `HashMap` é sua implementação mais comum e oferece operações eficientes de inclusão, busca, atualização e remoção.

O aprendizado principal foi compreender que a chave funciona como uma identificação única para localizar um valor. Quando a ordem for importante, podem ser usadas implementações como `LinkedHashMap` ou `TreeMap`.

O aprofundamento realizado no `ExemploMapComplementar.java` permitiu ir além do conteúdo básico das aulas e conhecer métodos importantes para manipulação real de dados em aplicações Java.
