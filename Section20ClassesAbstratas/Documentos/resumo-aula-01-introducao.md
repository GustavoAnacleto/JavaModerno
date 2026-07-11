# 📘 Aula 01 — Introdução à Seção 20: Classes Abstratas

## 🎯 Objetivo da aula

Apresentar o conceito de **abstração** na programação orientada a objetos e explicar sua relação com generalização, especialização, organização e reutilização de código.

---

## 🧠 O que é abstração?

Abstração é um dos conceitos fundamentais da orientação a objetos.

Ela permite representar elementos de forma mais geral, destacando apenas as características e comportamentos essenciais para determinado contexto.

A abstração não é um conceito exclusivo do Java. Ela faz parte da programação orientada a objetos e pode ser aplicada em diferentes linguagens.

No Java, existem recursos específicos para transformar esse conceito em código, como:

* herança;
* classes abstratas;
* métodos abstratos;
* sobrescrita de métodos;
* polimorfismo.

---

## 🐶 Exemplo de abstração

Podemos começar com uma classe específica:

```text
Cachorro
```

Todo cachorro pode ser considerado um animal:

```text
Animal
└── Cachorro
```

Todo animal também pode ser considerado um ser vivo:

```text
SerVivo
└── Animal
    └── Cachorro
```

Nesse exemplo:

* `Cachorro` é um elemento mais específico;
* `Animal` é uma abstração de `Cachorro`;
* `SerVivo` é uma abstração ainda mais geral.

Quanto mais subimos nessa hierarquia, mais geral e abstrata fica a representação.

---

## ⬆️ Generalização

Quando subimos na hierarquia, saindo de algo específico para algo mais geral, estamos realizando uma **generalização**.

Exemplo:

```text
Cachorro → Animal → SerVivo
```

Nesse processo, identificamos características comuns entre diferentes elementos.

Por exemplo:

* um cachorro é um animal;
* um gato também é um animal;
* cachorro e gato podem compartilhar atributos e comportamentos definidos na classe `Animal`.

A generalização ajuda a evitar repetição de código.

---

## ⬇️ Especialização

Quando descemos na hierarquia, saindo de algo geral para algo mais específico, estamos realizando uma **especialização**.

Exemplo:

```text
SerVivo → Animal → Cachorro
```

A classe `Cachorro` é uma especialização de `Animal`, pois pode possuir características e comportamentos próprios.

Por exemplo:

```text
Animal
├── Cachorro
├── Gato
└── Cavalo
```

Todas essas classes representam animais, mas cada uma pode possuir comportamentos específicos.

---

## 🔄 Relação entre abstração e herança

A abstração está diretamente relacionada à herança.

Uma classe mais geral pode concentrar características e comportamentos comuns, enquanto as classes mais específicas herdam esses elementos e acrescentam suas próprias particularidades.

Exemplo conceitual:

```java
public class Animal {

    public void respirar() {
        System.out.println("O animal está respirando.");
    }
}
```

```java
public class Cachorro extends Animal {

    public void latir() {
        System.out.println("O cachorro está latindo.");
    }
}
```

Nesse exemplo, `Cachorro` herda o comportamento `respirar()` da classe `Animal` e possui seu próprio comportamento, representado pelo método `latir()`.

---

## ♻️ Reutilização de código

Um dos principais benefícios da abstração é aumentar a reutilização de código.

Em vez de repetir atributos e métodos em várias classes, podemos colocá-los em uma classe mais geral.

Exemplo:

```text
Animal
├── nome
├── idade
└── respirar()
```

As classes `Cachorro`, `Gato` e `Cavalo` podem herdar essas características.

Isso evita que cada classe tenha que declarar novamente os mesmos atributos e comportamentos.

---

## 🗂️ Organização do código

Uma hierarquia bem planejada ajuda a:

* reduzir repetição;
* melhorar a organização;
* facilitar a manutenção;
* representar melhor os elementos do sistema;
* aproveitar comportamentos comuns;
* criar classes mais específicas a partir de classes gerais.

Entretanto, a abstração deve ser usada com cuidado. Uma hierarquia desnecessariamente complexa pode dificultar a compreensão do código.

O objetivo não é criar o maior número possível de níveis, mas representar corretamente as relações existentes.

---

## 💡 Conceitos principais

| Conceito       | Significado                                                              |
| -------------- | ------------------------------------------------------------------------ |
| Abstração      | Representação das características essenciais de um elemento              |
| Generalização  | Subir na hierarquia, indo do específico para o geral                     |
| Especialização | Descer na hierarquia, indo do geral para o específico                    |
| Herança        | Permitir que uma classe receba características e comportamentos de outra |
| Reutilização   | Aproveitar código comum em diferentes classes                            |

---

## ⚠️ Observação importante

Abstração não significa apenas criar métodos sem implementação.

Esse é um recurso que pode ser usado em classes abstratas, mas o conceito de abstração é mais amplo.

Também existe abstração quando criamos uma classe geral, como `Animal`, para representar características comuns de classes mais específicas, como `Cachorro` e `Gato`.

---

## ✅ Resumo da aula

Nesta aula, foi apresentado o conceito inicial de abstração na programação orientada a objetos.

Foi possível compreender que:

* abstração representa elementos de forma mais geral;
* subir em uma hierarquia representa uma generalização;
* descer em uma hierarquia representa uma especialização;
* a abstração está relacionada à herança;
* classes mais gerais podem concentrar características comuns;
* classes mais específicas podem herdar e complementar esses comportamentos;
* uma boa abstração melhora a organização e a reutilização do código.

A partir das próximas aulas, o Java apresentará recursos específicos para implementar esses conceitos, principalmente por meio de classes e métodos abstratos.

---

## 📌 Principal aprendizado

> Quanto mais subimos em uma hierarquia, mais geral e abstrata fica a representação. Quanto mais descemos, mais específica e especializada ela se torna.
