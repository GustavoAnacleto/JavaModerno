# 📘 Aula 02 — Classes Abstratas

## 🎯 Objetivo da aula

Compreender o que é uma **classe abstrata**, por que ela é utilizada como base para outras classes e como pode reunir características comuns e comportamentos específicos dentro de uma hierarquia.

---

## 🧠 O que é uma classe abstrata?

Uma classe abstrata é uma classe criada principalmente para servir como base para outras classes.

Ela representa um modelo mais geral, que reúne atributos e comportamentos comuns entre diferentes subclasses.

Em Java, uma classe abstrata é declarada com a palavra-chave `abstract`:

```java
public abstract class Carro {
}
```

Uma classe abstrata não representa necessariamente um objeto completo e específico. Ela representa uma ideia mais geral que será especializada pelas classes filhas.

---

## 🚗 Exemplo do jogo de corrida

Imagine um jogo que possui diferentes tipos de veículos:

* carro esportivo;
* carro de Fórmula 1;
* caminhão.

Todos esses veículos possuem características em comum, como:

* motor;
* rodas;
* capacidade de acelerar;
* capacidade de frear.

Em vez de repetir essas características em cada classe, podemos criar uma classe abstrata chamada `Carro`.

```text
Carro
├── CarroEsportivo
├── CarroFormula1
└── Caminhao
```

A classe `Carro` funciona como um modelo geral para as demais classes.

---

## ♻️ Compartilhamento de características

A classe abstrata pode concentrar aquilo que é comum entre todas as subclasses.

Exemplo:

```java
public abstract class Carro {

    private String modelo;
    private int quantidadeRodas;

    public void frear() {
        System.out.println("O carro está freando.");
    }
}
```

As subclasses podem herdar os atributos e métodos definidos na classe abstrata.

Isso ajuda a:

* evitar repetição de código;
* melhorar a organização;
* facilitar a manutenção;
* representar melhor a hierarquia de classes.

---

## 🔹 Métodos abstratos

Uma classe abstrata pode possuir métodos abstratos.

Um método abstrato não possui corpo e termina com ponto e vírgula:

```java
public abstract void acelerar();
```

Esse método informa que todo carro deve saber acelerar, mas não define como essa aceleração será realizada.

A responsabilidade de implementar o comportamento fica com as subclasses concretas.

---

## 🔸 Métodos concretos

Uma classe abstrata também pode possuir métodos concretos, ou seja, métodos que já possuem uma implementação.

```java
public void frear() {
    System.out.println("O carro está freando.");
}
```

Esse comportamento pode ser herdado diretamente pelas subclasses.

Portanto, uma classe abstrata pode conter:

* métodos abstratos, sem implementação;
* métodos concretos, com implementação.

---

## 🏎️ Implementação nas subclasses

Cada tipo de carro pode acelerar de uma maneira diferente.

```java
public class CarroFormula1 extends Carro {

    @Override
    public void acelerar() {
        System.out.println("O carro de Fórmula 1 acelerou rapidamente.");
    }
}
```

```java
public class Caminhao extends Carro {

    @Override
    public void acelerar() {
        System.out.println("O caminhão acelerou lentamente.");
    }
}
```

As duas classes herdam de `Carro`, mas implementam o método `acelerar()` de maneiras diferentes.

Isso permite que cada subclasse tenha seu próprio comportamento.

---

## 🔗 Uso de `extends`

Uma classe herda de uma classe abstrata utilizando a palavra-chave `extends`.

```java
public class CarroEsportivo extends Carro {
}
```

A relação pode ser lida da seguinte forma:

> `CarroEsportivo` é um tipo de `Carro`.

Essa relação deve fazer sentido dentro do contexto do sistema.

---

## 🤝 Semelhança com interfaces

Classes abstratas e interfaces podem declarar métodos sem implementação.

Exemplo em uma classe abstrata:

```java
public abstract void acelerar();
```

Nesse ponto, elas possuem uma semelhança: ambas podem exigir que uma classe concreta implemente determinado comportamento.

Porém, uma classe abstrata também pode possuir:

* atributos de instância;
* construtores;
* métodos concretos;
* estado compartilhado entre as subclasses.

Por isso, classe abstrata e interface não são a mesma coisa.

---

## 🧩 Modelo parcialmente pronto

Uma classe abstrata pode ser entendida como um modelo parcialmente pronto.

Ela pode fornecer:

* características comuns;
* comportamentos já implementados;
* comportamentos que ainda precisam ser implementados pelas subclasses.

Exemplo:

```java
public abstract class Carro {

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public abstract void acelerar();
}
```

Nesse caso:

* `frear()` já possui uma implementação;
* `acelerar()` deverá ser implementado pelas classes filhas.

---

## ⚠️ Observação importante

Nem todos os veículos aceleram da mesma forma.

Um carro de Fórmula 1 pode acelerar rapidamente, enquanto um caminhão pode acelerar de forma mais lenta.

Por isso, alguns comportamentos não devem ser definidos de maneira única na classe abstrata.

A classe abstrata pode apenas declarar que o comportamento precisa existir, permitindo que cada subclasse defina sua própria implementação.

---

## ✅ Resumo da aula

Nesta aula, foi apresentado que:

* uma classe abstrata serve como base para outras classes;
* ela representa um modelo mais geral;
* pode reunir características comuns entre as subclasses;
* pode possuir métodos abstratos;
* pode possuir métodos concretos;
* métodos abstratos não possuem corpo;
* subclasses concretas devem implementar os métodos abstratos;
* a herança de uma classe abstrata é realizada com `extends`;
* cada subclasse pode implementar um comportamento de maneira diferente;
* classes abstratas ajudam na organização e na reutilização do código.

---

## 📌 Principal aprendizado

> Uma classe abstrata representa um modelo parcialmente pronto: ela pode fornecer aquilo que é comum e obrigar as subclasses a implementar aquilo que varia.
