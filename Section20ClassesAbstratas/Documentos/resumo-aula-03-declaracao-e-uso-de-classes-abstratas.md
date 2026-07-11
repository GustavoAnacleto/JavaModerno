# 📘 Aula 03 — Declaração e uso de classes abstratas

## 🎯 Objetivo da aula

Compreender, na prática, como:

* declarar uma classe abstrata;
* criar métodos abstratos e concretos;
* herdar de uma classe abstrata;
* implementar métodos abstratos nas subclasses;
* reutilizar métodos concretos herdados;
* testar o comportamento das classes no método `main`.

---

## 🧠 Declarando uma classe abstrata

Para definir uma classe abstrata em Java, utilizamos a palavra-chave `abstract` antes de `class`.

```java
abstract class Carro {
}
```

A classe abstrata funciona como uma classe-base para outras classes.

Ela não representa, necessariamente, um objeto específico. Seu objetivo é reunir características e comportamentos comuns que serão utilizados pelas subclasses.

---

## 🔹 Método abstrato

Dentro de uma classe abstrata, podemos declarar métodos abstratos.

```java
abstract void acelerar();
```

Um método abstrato:

* utiliza a palavra-chave `abstract`;
* não possui corpo;
* termina com ponto e vírgula;
* define um comportamento obrigatório para as subclasses concretas.

O método informa o que precisa existir, mas não define como o comportamento será executado.

Cada subclasse concreta deverá criar sua própria implementação.

---

## 🔸 Método concreto

Uma classe abstrata também pode possuir métodos concretos, ou seja, métodos que já têm corpo e implementação.

```java
void frear() {
    System.out.println("O carro está freando.");
}
```

Esse método pode ser utilizado diretamente pelas subclasses.

Diferentemente de uma interface, não é necessário utilizar `default` para criar um método com corpo dentro de uma classe abstrata.

Ele é declarado como um método normal.

---

## 🚗 Classe abstrata `Carro`

A classe abstrata utilizada no exemplo possui:

* um método abstrato chamado `acelerar()`;
* um método concreto chamado `frear()`.

```java
abstract class Carro {

    abstract void acelerar();

    void frear() {
        System.out.println("O carro está freando.");
    }
}
```

O método `acelerar()` deverá ser implementado pelas subclasses.

O método `frear()` já está pronto e poderá ser herdado.

---

## 🏎️ Subclasse `CarroF1`

A classe `CarroF1` herda de `Carro` utilizando `extends`.

```java
class CarroF1 extends Carro {

    @Override
    void acelerar() {
        System.out.println(
            "O carro de Fórmula 1 está acelerando muito rapidamente."
        );
    }
}
```

Como `CarroF1` é uma classe concreta, ela é obrigada a implementar o método abstrato `acelerar()`.

A anotação `@Override` indica que o método está sobrescrevendo um método herdado da classe abstrata.

Ela não é obrigatória para o funcionamento do código, mas é uma boa prática porque ajuda o compilador a identificar possíveis erros.

---

## 🚚 Subclasse `Caminhao`

A classe `Caminhao` também herda de `Carro`.

```java
class Caminhao extends Carro {

    @Override
    void acelerar() {
        System.out.println("O caminhão está acelerando lentamente.");
    }
}
```

Mesmo que `CarroF1` já tenha implementado `acelerar()`, a classe `Caminhao` também precisa implementar esse método.

Cada subclasse concreta é responsável por fornecer sua própria implementação dos métodos abstratos herdados.

---

## ⚠️ Implementação obrigatória

Todas as classes concretas que herdam de `Carro` precisam implementar `acelerar()`.

```text
Carro
├── CarroF1 → implementa acelerar()
└── Caminhao → implementa acelerar()
```

A implementação feita em uma subclasse não é compartilhada automaticamente com outra subclasse.

Se uma classe herdar de `Carro` e não implementar `acelerar()`, o compilador apresentará um erro.

A única alternativa seria declarar essa nova classe também como abstrata.

```java
abstract class OutroCarro extends Carro {
}
```

Nesse caso, a implementação do método poderia ser deixada para uma subclasse concreta posterior.

---

## 🧪 Classe de teste

Para testar o comportamento, foram criados objetos das subclasses concretas.

```java
public class TestAbstract {

    public static void main(String[] args) {

        CarroF1 carroF1 = new CarroF1();
        Caminhao caminhao = new Caminhao();

        carroF1.acelerar();
        carroF1.frear();

        caminhao.acelerar();
        caminhao.frear();
    }
}
```

Não foi criado um objeto diretamente da classe `Carro`, pois uma classe abstrata não pode ser instanciada.

O código cria objetos apenas das classes concretas:

```java
new CarroF1();
new Caminhao();
```

---

## 🖥️ Saída esperada

```text
O carro de Fórmula 1 está acelerando muito rapidamente.
O carro está freando.
O caminhão está acelerando lentamente.
O carro está freando.
```

---

## 🔍 Análise das chamadas

### `carroF1.acelerar()`

```java
carroF1.acelerar();
```

O objeto pertence à classe `CarroF1`.

Por isso, é executada a implementação de `acelerar()` definida dentro dessa classe.

```text
O carro de Fórmula 1 está acelerando muito rapidamente.
```

---

### `carroF1.frear()`

```java
carroF1.frear();
```

A classe `CarroF1` não declarou seu próprio método `frear()`.

Então, o Java procura esse método na superclasse `Carro`.

Como o método está implementado na classe abstrata, ele é herdado e executado normalmente.

```text
O carro está freando.
```

---

### `caminhao.acelerar()`

```java
caminhao.acelerar();
```

É executada a implementação de `acelerar()` definida dentro da classe `Caminhao`.

```text
O caminhão está acelerando lentamente.
```

---

### `caminhao.frear()`

```java
caminhao.frear();
```

A classe `Caminhao` também não declarou seu próprio método `frear()`.

Por isso, utiliza a implementação herdada de `Carro`.

```text
O carro está freando.
```

---

## ♻️ Reutilização do método concreto

O método `frear()` foi escrito apenas uma vez:

```java
void frear() {
    System.out.println("O carro está freando.");
}
```

Mesmo assim, ele foi utilizado por dois tipos diferentes de carro:

```java
carroF1.frear();
caminhao.frear();
```

Isso demonstra reutilização de código.

Sem a classe abstrata, seria necessário repetir o mesmo método dentro de cada classe.

---

## 🎭 Comportamentos comuns e específicos

A classe abstrata permite separar dois tipos de comportamento.

### Comportamento comum

O comportamento funciona da mesma maneira para todas as subclasses.

```java
void frear() {
    System.out.println("O carro está freando.");
}
```

Nesse caso, ele pode ser implementado diretamente na classe abstrata.

### Comportamento específico

O comportamento existe em todas as subclasses, mas funciona de maneira diferente em cada uma.

```java
abstract void acelerar();
```

Nesse caso, a classe abstrata apenas declara o método, e cada subclasse fornece sua implementação.

---

## 🏗️ Organização do código

Esse modelo melhora a estrutura do programa porque:

* evita repetição de métodos comuns;
* define comportamentos obrigatórios;
* separa responsabilidades;
* facilita a criação de novos tipos de carro;
* torna o código mais fácil de entender;
* melhora a manutenção quando o sistema cresce.

Em um programa pequeno, seria possível colocar todo o código em uma única classe.

Entretanto, conforme o sistema cresce, essa abordagem dificulta a manutenção e aumenta a repetição.

A orientação a objetos permite distribuir responsabilidades entre classes relacionadas.

---

## ⚠️ Erros comuns

### Colocar corpo em um método abstrato

Incorreto:

```java
abstract void acelerar() {
    System.out.println("Acelerando.");
}
```

Um método abstrato não pode possuir corpo.

Correto:

```java
abstract void acelerar();
```

---

### Esquecer o ponto e vírgula

Incorreto:

```java
abstract void acelerar()
```

Correto:

```java
abstract void acelerar();
```

---

### Não implementar o método abstrato

Incorreto:

```java
class CarroF1 extends Carro {
}
```

Como `CarroF1` é concreta, ela precisa implementar `acelerar()`.

Correto:

```java
class CarroF1 extends Carro {

    @Override
    void acelerar() {
        System.out.println("O carro de Fórmula 1 está acelerando.");
    }
}
```

---

### Tentar instanciar a classe abstrata

Incorreto:

```java
Carro carro = new Carro();
```

Uma classe abstrata não pode ser instanciada diretamente.

É necessário instanciar uma subclasse concreta:

```java
CarroF1 carroF1 = new CarroF1();
```

---

## 💡 Boa prática: utilizar `@Override`

Ao implementar um método abstrato, é recomendado utilizar `@Override`.

```java
@Override
void acelerar() {
    System.out.println("O caminhão está acelerando lentamente.");
}
```

Isso deixa claro que o método veio da superclasse e ajuda o compilador a conferir se a sobrescrita foi feita corretamente.

---

## ✅ Resumo da aula

Nesta aula, foi possível compreender que:

* uma classe abstrata é declarada com `abstract`;
* métodos abstratos não possuem corpo;
* métodos abstratos terminam com ponto e vírgula;
* classes abstratas também podem possuir métodos concretos;
* subclasses herdam de classes abstratas com `extends`;
* cada subclasse concreta deve implementar os métodos abstratos;
* métodos concretos podem ser herdados sem nova implementação;
* uma implementação feita por uma subclasse não vale automaticamente para as outras;
* classes abstratas ajudam a organizar e reutilizar código;
* a orientação a objetos facilita a manutenção de sistemas maiores.

---

## 📌 Principal aprendizado

> A classe abstrata pode fornecer comportamentos comuns já implementados e, ao mesmo tempo, obrigar cada subclasse concreta a implementar os comportamentos que variam.
