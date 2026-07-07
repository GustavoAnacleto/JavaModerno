# 📘 Resumo Aula 002 - Herança com `extends` em Java

## 🎯 Tema da aula

Herança em Java usando a palavra-chave `extends`.

Nesta aula, o professor apresentou o primeiro exemplo prático de herança, utilizando uma superclasse `Animal` e uma subclasse `Cachorro`.

O objetivo foi mostrar como uma classe filha pode herdar comportamentos de uma classe mãe.

---

## 🧠 Ideia principal

A herança permite criar uma nova classe a partir de uma classe já existente.

A classe existente é chamada de:

```text
superclasse
classe base
classe pai
```

A nova classe é chamada de:

```text
subclasse
classe derivada
classe filha
```

Os nomes mais usados no curso foram:

```text
superclasse
subclasse
```

---

## 🧬 Regra do “é um”

Para saber se a herança faz sentido, devemos aplicar a regra do:

```text
é um
```

Ou:

```text
é um tipo de
```

Se a subclasse realmente for um tipo da superclasse, a herança pode ser usada.

Exemplo da aula:

```text
Cachorro é um Animal.
```

Como essa frase faz sentido, podemos criar a classe `Cachorro` herdando da classe `Animal`.

---

## ✅ Relação entre as classes

Neste exemplo:

```text
Animal é a superclasse.
Cachorro é a subclasse.
```

A classe `Animal` possui um comportamento geral:

```text
comer
```

A classe `Cachorro` possui um comportamento específico:

```text
latir
```

Todo cachorro é um animal, então ele também pode comer.

Mas nem todo animal late, por isso o método `latir()` fica apenas na classe `Cachorro`.

---

## 💻 Código da aula

Neste exemplo, o professor colocou as três classes no mesmo arquivo.

Como existe uma classe pública chamada `TesteHeranca`, o arquivo deve ser salvo com o nome:

```text
TesteHeranca.java
```

Código completo:

```java
class Animal {

    public void comer() {
        System.out.println("O animal come.");
    }
}

class Cachorro extends Animal {

    public void latir() {
        System.out.println("O cachorro late.");
    }
}

public class TesteHeranca {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();

        dog.latir();
        dog.comer();
    }
}
```

---

## 🔎 Explicação do código

A classe `Animal` foi criada com o método `comer()`:

```java
class Animal {

    public void comer() {
        System.out.println("O animal come.");
    }
}
```

Esse método representa um comportamento comum a todos os animais.

Depois, foi criada a classe `Cachorro`:

```java
class Cachorro extends Animal
```

A palavra-chave `extends` indica que `Cachorro` herda de `Animal`.

Ou seja:

```text
Cachorro é um Animal.
Cachorro herda de Animal.
Cachorro pode usar comportamentos definidos em Animal.
```

Dentro da classe `Cachorro`, foi criado o método `latir()`:

```java
public void latir() {
    System.out.println("O cachorro late.");
}
```

Esse método é específico de cachorro.

---

## 🧪 Teste no método `main`

No método `main`, foi criado um objeto da classe `Cachorro`:

```java
Cachorro dog = new Cachorro();
```

Depois, foram chamados dois métodos:

```java
dog.latir();
dog.comer();
```

A chamada:

```java
dog.latir();
```

funciona porque o método `latir()` existe diretamente na classe `Cachorro`.

A chamada:

```java
dog.comer();
```

também funciona, mesmo o método `comer()` não estando escrito dentro da classe `Cachorro`.

Isso acontece porque `Cachorro` herda de `Animal`.

---

## 🧭 Como o Java encontra os métodos

Quando o código executa:

```java
dog.latir();
```

O Java procura o método `latir()` na classe `Cachorro`.

Como encontra o método, ele executa normalmente.

Quando o código executa:

```java
dog.comer();
```

O Java procura primeiro o método `comer()` na classe `Cachorro`.

Como não encontra, ele verifica se `Cachorro` herda de alguma classe.

Como existe:

```java
class Cachorro extends Animal
```

o Java procura o método `comer()` na classe `Animal`.

Como encontra, ele executa o método herdado.

---

## 📤 Saída esperada

Ao executar o programa, a saída será:

```text
O cachorro late.
O animal come.
```

---

## 🧱 Aprendizado principal

A subclasse herda características e comportamentos da superclasse.

Neste exemplo, `Cachorro` herda o método `comer()` da classe `Animal`.

Além disso, `Cachorro` também possui um comportamento próprio, que é o método `latir()`.

Resumo da relação:

```text
Animal
 └── Cachorro
```

Ou seja:

```text
Cachorro é um Animal.
```

---

## ⚠️ Erros comuns

Alguns erros comuns nesta etapa:

```text
1. Esquecer a palavra-chave extends.
2. Criar herança sem respeitar a regra do "é um".
3. Achar que o método precisa estar escrito dentro da subclasse para ser chamado.
4. Colocar mais de uma classe public no mesmo arquivo.
5. Salvar o arquivo com nome diferente da classe pública.
6. Confundir superclasse com subclasse.
```

---

## 🧠 Observação importante sobre arquivos Java

Em Java, quando existe uma classe pública, o nome do arquivo deve ser igual ao nome dessa classe.

Neste exemplo:

```java
public class TesteHeranca
```

Então o arquivo precisa se chamar:

```text
TesteHeranca.java
```

As classes `Animal` e `Cachorro` podem ficar no mesmo arquivo porque não foram declaradas como `public`.

Mais adiante, para projetos mais organizados, é comum separar cada classe em seu próprio arquivo:

```text
Animal.java
Cachorro.java
TesteHeranca.java
```

Mas, para esta aula inicial, manter tudo em um único arquivo é aceitável e didático.

---

## 🔗 Relação com projetos Java back-end

Esse mesmo raciocínio aparece em projetos reais quando temos classes mais gerais e classes mais específicas.

Exemplos:

```text
Pessoa -> Funcionario
Pessoa -> Cliente
Usuario -> Administrador
Produto -> ProdutoFisico
Produto -> ProdutoDigital
Conta -> ContaCorrente
Conta -> ContaPoupanca
```

A lógica sempre precisa respeitar o princípio:

```text
A subclasse é um tipo da superclasse?
```

Se a resposta for sim, a herança pode fazer sentido.

---

## ✅ Resumo rápido

```text
Herança permite criar uma classe a partir de outra.
A classe mãe é chamada de superclasse.
A classe filha é chamada de subclasse.
Em Java, usamos extends para aplicar herança.
A herança deve respeitar o princípio do "é um".
Cachorro é um Animal.
Cachorro herda o método comer() de Animal.
Cachorro também possui seu próprio método latir().
```

---

## 📝 Anotação pessoal

Nesta aula, o ponto mais importante foi entender que o objeto da subclasse pode acessar métodos definidos na superclasse.

Mesmo que `comer()` não esteja escrito dentro de `Cachorro`, o objeto `dog` consegue chamar esse método porque `Cachorro extends Animal`.

A herança permite reaproveitar código, mas precisa respeitar a lógica do domínio.

---


