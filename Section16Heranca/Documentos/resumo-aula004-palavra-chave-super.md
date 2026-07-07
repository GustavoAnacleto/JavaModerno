# 📘 Resumo Aula 004 - Palavra-chave `super` em Java

## 🎯 Tema da aula

Uso da palavra-chave `super` em Java dentro do contexto de herança.

Nesta aula, o professor mostrou que `super` permite acessar membros da superclasse imediata, como métodos e construtores.

---

## 🧠 Ideia principal

Em Java, a palavra-chave `super` representa uma referência à **superclasse imediata**.

Ou seja, ela aponta diretamente para a classe mãe da classe atual.

Exemplo:

```text
Animal
 └── Cachorro
```

Nesse caso:

```text
Animal é a superclasse imediata de Cachorro.
Cachorro é a subclasse de Animal.
```

Dentro da classe `Cachorro`, a palavra `super` representa a classe `Animal`.

---

## 🧬 O que é superclasse imediata?

A superclasse imediata é a classe que está diretamente acima da subclasse na hierarquia de herança.

Exemplo:

```text
SerVivo
 └── Animal
      └── Cachorro
```

Nesse exemplo:

```text
Animal é a superclasse imediata de Cachorro.
SerVivo é uma superclasse de Cachorro, mas não é a imediata.
```

Então, dentro de `Cachorro`, quando usamos `super`, estamos nos referindo diretamente a `Animal`.

---

## 🛠️ Para que serve `super`?

A palavra-chave `super` pode ser usada principalmente para:

```text
1. Chamar métodos da superclasse.
2. Chamar construtores da superclasse.
3. Acessar atributos da superclasse, quando o modificador de acesso permitir.
```

Nesta aula, o foco principal foi chamar um método da superclasse usando:

```java
super.fazerSom();
```

---

## 💻 Código base da aula

```java
class Animal {

    public String nome;

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println("O cachorro late.");
    }
}

public class TesteHeranca {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();

        dog.nome = "Rex";

        System.out.println("O nome do animal: " + dog.nome);

        dog.fazerSom();
    }
}
```

---

## 📤 Saída esperada

```text
O nome do animal: Rex
O animal faz um som.
O cachorro late.
```

---

## 🔎 Explicação do código

A classe `Animal` possui um atributo:

```java
public String nome;
```

E também possui um método:

```java
public void fazerSom() {
    System.out.println("O animal faz um som.");
}
```

A classe `Cachorro` herda de `Animal`:

```java
class Cachorro extends Animal
```

Isso significa que `Cachorro` herda os membros acessíveis da classe `Animal`.

Como o atributo `nome` foi declarado como `public`, ele pode ser acessado pelo objeto `dog`:

```java
dog.nome = "Rex";
```

Mesmo que o atributo `nome` não esteja escrito dentro da classe `Cachorro`, ele existe na superclasse `Animal` e foi herdado.

---

## 🧪 Chamada do método sobrescrito

A classe `Cachorro` sobrescreve o método `fazerSom()`:

```java
@Override
public void fazerSom() {
    super.fazerSom();
    System.out.println("O cachorro late.");
}
```

Ao executar:

```java
dog.fazerSom();
```

o Java chama o método `fazerSom()` da classe `Cachorro`, porque o objeto `dog` foi criado a partir da classe `Cachorro`.

Dentro desse método, existe esta linha:

```java
super.fazerSom();
```

Essa linha chama o método `fazerSom()` da superclasse `Animal`.

Depois disso, o método da própria classe `Cachorro` continua executando:

```java
System.out.println("O cachorro late.");
```

Por isso, a saída final mostra primeiro o som genérico do animal e depois o som específico do cachorro.

---

## 🧭 Ordem de execução

Quando o código executa:

```java
dog.fazerSom();
```

acontece a seguinte sequência:

```text
1. O Java procura fazerSom() na classe Cachorro.
2. Encontra o método sobrescrito em Cachorro.
3. Entra no método da classe Cachorro.
4. Executa super.fazerSom().
5. Chama o método fazerSom() da classe Animal.
6. Imprime: O animal faz um som.
7. Volta para o método da classe Cachorro.
8. Imprime: O cachorro late.
```

---

## 🧩 Por que usar `super`?

Usamos `super` quando queremos reaproveitar o comportamento da classe mãe, mas também adicionar algo específico na classe filha.

Sem `super`, o método da classe `Cachorro` substituiria totalmente o comportamento da classe `Animal`.

Com `super`, conseguimos fazer os dois:

```text
1. Executar o comportamento geral da superclasse.
2. Executar o comportamento específico da subclasse.
```

---

## ⚠️ Observação sobre o termo correto

Na aula, apareceu a ideia de um método que sofreu alteração na classe filha.

O termo correto para isso é:

```text
override
overriding
sobrescrita de método
```

Não confundir com:

```text
overload
sobrecarga de método
```

Nesta aula, o caso estudado é **sobrescrita**, porque o método `fazerSom()` existe na superclasse e foi redefinido na subclasse.

---

## 🔐 Observação sobre atributo `public`

Neste exemplo, o atributo `nome` foi declarado como `public` para facilitar a explicação inicial:

```java
public String nome;
```

Isso permite acessar diretamente:

```java
dog.nome = "Rex";
```

Para fins didáticos, isso ajuda a visualizar a herança.

Mas, em projetos mais organizados, o ideal é proteger os atributos usando `private` e acessar por meio de métodos, como getters e setters.

Exemplo mais adequado para etapas futuras:

```java
private String nome;

public void setNome(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}
```

Por enquanto, o mais importante é entender o conceito de herança e o funcionamento do `super`.

---

## ✅ Exemplo com `super` no método

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        super.fazerSom();
        System.out.println("O cachorro late.");
    }
}
```

Neste exemplo:

```text
super.fazerSom();
```

chama o método da classe `Animal`.

Já esta linha:

```java
System.out.println("O cachorro late.");
```

representa o comportamento específico da classe `Cachorro`.

---

## 🔗 Relação com projetos Java back-end

Em projetos reais, `super` pode aparecer quando uma classe filha precisa aproveitar uma regra geral da classe mãe e acrescentar uma regra específica.

Exemplo conceitual:

```text
Classe Funcionario:
- calcula informações gerais de uma pessoa da empresa.

Classe Gerente:
- reaproveita o cálculo geral de Funcionario.
- acrescenta regras específicas de gerente.
```

Outro exemplo:

```text
Classe Conta:
- possui método exibirResumo().

Classe ContaCorrente:
- chama super.exibirResumo().
- acrescenta informações específicas da conta corrente.
```

Essa ideia é útil quando queremos evitar repetição, mas sem perder o comportamento específico de cada subclasse.

---

## ⚠️ Erros comuns

```text
1. Achar que super aponta para qualquer classe acima na hierarquia.
2. Esquecer que super aponta para a superclasse imediata.
3. Confundir super com this.
4. Usar super sem necessidade.
5. Achar que super só serve para métodos.
6. Esquecer que super também pode chamar construtores.
7. Confundir sobrescrita com sobrecarga.
8. Achar que atributo public é boa prática em qualquer situação.
```

---

## 🔁 Diferença entre `this` e `super`

```text
this  -> representa o objeto atual.
super -> representa a superclasse imediata.
```

Exemplo:

```java
this.fazerSom();
```

Chama o método do próprio objeto atual.

Exemplo:

```java
super.fazerSom();
```

Chama o método da superclasse imediata.

---

## 🧱 Aprendizado principal

A palavra-chave `super` permite acessar membros da superclasse imediata.

Ela é útil quando a subclasse sobrescreve um método, mas ainda quer reaproveitar o comportamento original da superclasse.

No exemplo da aula, `Cachorro` sobrescreve `fazerSom()`, mas usa:

```java
super.fazerSom();
```

para chamar também o método da classe `Animal`.

---

## ✅ Resumo rápido

```text
super representa a superclasse imediata.
Animal é a superclasse imediata de Cachorro.
super pode chamar métodos da superclasse.
super também pode chamar construtores da superclasse.
super.fazerSom() chama o método fazerSom() da classe Animal.
A subclasse pode sobrescrever um método e ainda chamar o método original da superclasse.
```

---

## 📝 Anotação pessoal

Nesta aula, o ponto mais importante foi entender que a sobrescrita não impede o acesso ao método da classe mãe.

Mesmo quando `Cachorro` sobrescreve `fazerSom()`, ainda é possível chamar o método original de `Animal` usando `super.fazerSom()`.

Isso mostra que a herança permite reaproveitamento, mas também oferece controle sobre o comportamento específico da subclasse.

---


