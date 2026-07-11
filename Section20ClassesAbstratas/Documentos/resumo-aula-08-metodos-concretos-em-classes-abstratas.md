# 📘 Aula 08 — Métodos concretos em classes abstratas

## 🎯 Objetivo da aula

Compreender que uma classe abstrata pode:

* implementar métodos de interfaces;
* possuir métodos concretos;
* fornecer comportamentos prontos para suas subclasses;
* promover reutilização de código por meio da herança.

---

## 🧠 Métodos em interfaces

As interfaces são utilizadas principalmente para definir contratos de comportamento.

Um método abstrato declarado em uma interface não possui corpo:

```java
interface Interface1 {

    void metodo1();
}
```

A classe que implementar essa interface deverá fornecer a implementação do método.

```java
class ClasseExemplo implements Interface1 {

    @Override
    public void metodo1() {
        System.out.println("Método 1");
    }
}
```

Interfaces também podem possuir métodos `default` e `static`, que têm implementação.

Porém, os métodos abstratos continuam representando comportamentos que deverão ser implementados pelas classes.

---

## 🏗️ Métodos concretos em classes abstratas

Uma classe abstrata pode implementar os métodos abstratos definidos por interfaces.

Exemplo:

```java
interface Interface1 {

    void metodo1();
}
```

```java
interface Interface2 {

    void metodo2();
}
```

```java
abstract class ClasseExemplo implements Interface1, Interface2 {

    @Override
    public void metodo1() {
        System.out.println("Método 1");
    }

    @Override
    public void metodo2() {
        System.out.println("Método 2");
    }
}
```

Mesmo sendo abstrata, `ClasseExemplo` pode fornecer implementações completas para os métodos das interfaces.

---

## 🔍 Classe abstrata não precisa deixar métodos pendentes

Uma classe abstrata não é obrigada a possuir métodos abstratos.

Ela pode ser abstrata mesmo que todos os seus métodos estejam implementados.

```java
abstract class ClasseExemplo {

    public void executar() {
        System.out.println("Executando.");
    }
}
```

Nesse caso, a palavra-chave `abstract` impede apenas que a classe seja instanciada diretamente.

Ela continua servindo como base para outras classes.

---

## ❌ Classe abstrata não pode ser instanciada

Mesmo que todos os métodos estejam implementados, não é permitido criar um objeto diretamente da classe abstrata.

Exemplo incorreto:

```java
ClasseExemplo exemplo = new ClasseExemplo();
```

Esse código gera erro de compilação.

A classe abstrata foi criada para ser herdada.

---

## 🔗 Criando uma subclasse concreta

Para utilizar os métodos implementados na classe abstrata, podemos criar uma subclasse concreta.

```java
class TesteInterfaceMultipla extends ClasseExemplo {
}
```

Como `ClasseExemplo` já implementou todos os métodos das interfaces, a subclasse não precisa implementá-los novamente.

Ela herda os comportamentos prontos.

---

## 🧪 Testando os métodos herdados

```java
public class Aplicacao {

    public static void main(String[] args) {

        TesteInterfaceMultipla teste =
                new TesteInterfaceMultipla();

        teste.metodo1();
        teste.metodo2();
    }
}
```

Saída esperada:

```text
Método 1
Método 2
```

Os métodos não foram declarados diretamente em `TesteInterfaceMultipla`.

Eles foram herdados da classe abstrata `ClasseExemplo`.

---

## 🔄 Funcionamento da herança

A estrutura do exemplo pode ser representada assim:

```text
Interface1 ─┐
            ├── ClasseExemplo
Interface2 ─┘          │
                       ▼
             TesteInterfaceMultipla
```

A classe abstrata:

* implementa `Interface1`;
* implementa `Interface2`;
* fornece o corpo de `metodo1()`;
* fornece o corpo de `metodo2()`.

A classe concreta:

* herda de `ClasseExemplo`;
* recebe os métodos já implementados;
* pode ser instanciada normalmente.

---

## ♻️ Reutilização de código

A implementação dos métodos foi escrita apenas uma vez:

```java
@Override
public void metodo1() {
    System.out.println("Método 1");
}
```

```java
@Override
public void metodo2() {
    System.out.println("Método 2");
}
```

Todas as subclasses concretas de `ClasseExemplo` poderão aproveitar esses comportamentos.

Exemplo:

```java
class ClasseConcretaA extends ClasseExemplo {
}
```

```java
class ClasseConcretaB extends ClasseExemplo {
}
```

As duas classes herdam `metodo1()` e `metodo2()`.

Isso reduz a repetição e facilita a manutenção do código.

---

## 🔧 Sobrescrita opcional

Mesmo recebendo um método concreto por herança, uma subclasse pode sobrescrevê-lo quando precisar de outro comportamento.

```java
class ClasseConcretaA extends ClasseExemplo {

    @Override
    public void metodo1() {
        System.out.println(
            "Método 1 com comportamento específico."
        );
    }
}
```

Nesse caso:

* `metodo1()` recebe um comportamento específico;
* `metodo2()` continua utilizando a implementação herdada.

A sobrescrita não é obrigatória porque os métodos já possuem corpo.

---

## 🤝 Relação entre interface e classe abstrata

Nesse modelo, cada recurso possui uma responsabilidade diferente.

### Interface

Define os comportamentos que devem existir:

```java
interface Interface1 {

    void metodo1();
}
```

### Classe abstrata

Pode fornecer uma implementação comum:

```java
abstract class ClasseExemplo implements Interface1 {

    @Override
    public void metodo1() {
        System.out.println("Implementação comum.");
    }
}
```

### Subclasse concreta

Herda o comportamento e pode ser instanciada:

```java
class ClasseConcreta extends ClasseExemplo {
}
```

Essa combinação permite unir contrato, implementação compartilhada e especialização.

---

## 📊 Comparação dos métodos

| Característica                            | Interface                                        | Classe abstrata    |
| ----------------------------------------- | ------------------------------------------------ | ------------------ |
| Pode declarar método abstrato             | Sim                                              | Sim                |
| Pode possuir método concreto comum        | Com `default`                                    | Sim                |
| Pode possuir método `static`              | Sim                                              | Sim                |
| Método concreto precisa de `default`      | Sim, quando for método de instância na interface | Não                |
| Pode implementar métodos de interfaces    | Não se aplica                                    | Sim                |
| Métodos podem ser herdados por subclasses | Por implementação da interface                   | Sim, por `extends` |

---

## ⚠️ Erros comuns

### Instanciar a classe abstrata

Incorreto:

```java
ClasseExemplo exemplo = new ClasseExemplo();
```

Correto:

```java
TesteInterfaceMultipla teste =
        new TesteInterfaceMultipla();
```

---

### Acreditar que toda classe abstrata precisa ter método abstrato

Uma classe abstrata pode possuir apenas métodos concretos:

```java
abstract class ClasseBase {

    public void executar() {
        System.out.println("Executando.");
    }
}
```

Ela continua sendo abstrata e não pode ser instanciada.

---

### Reimplementar métodos sem necessidade

Se a classe abstrata já implementou o método:

```java
abstract class ClasseBase {

    public void executar() {
        System.out.println("Executando.");
    }
}
```

A subclasse pode apenas herdá-lo:

```java
class ClasseConcreta extends ClasseBase {
}
```

A sobrescrita só é necessária quando a subclasse precisa mudar o comportamento.

---

### Esquecer o `public` na implementação da interface

Métodos de interfaces são públicos por padrão.

A implementação precisa manter essa visibilidade:

```java
@Override
public void metodo1() {
    System.out.println("Método 1");
}
```

---

## 💡 Organização e manutenção

Classes abstratas ajudam a concentrar comportamentos comuns em um único local.

Se várias subclasses utilizarem a mesma implementação, uma alteração pode ser feita apenas na classe abstrata.

```java
abstract class ClasseBase {

    public void exibirMensagem() {
        System.out.println("Mensagem compartilhada.");
    }
}
```

Todas as subclasses passam a utilizar a versão atualizada do método.

Isso melhora:

* a reutilização;
* a legibilidade;
* a organização;
* a manutenção;
* a extensão do sistema.

---

## ✅ Resumo da aula

Nesta aula, foi possível compreender que:

* interfaces podem definir métodos abstratos;
* classes abstratas podem implementar métodos de interfaces;
* uma classe abstrata pode possuir métodos concretos;
* uma classe abstrata não precisa obrigatoriamente ter métodos abstratos;
* mesmo com todos os métodos implementados, ela não pode ser instanciada;
* uma subclasse concreta pode herdar os métodos prontos;
* métodos concretos não precisam ser sobrescritos;
* a sobrescrita pode ser feita quando houver necessidade de comportamento específico;
* classes abstratas ajudam a organizar e reutilizar implementações comuns;
* interfaces e classes abstratas podem trabalhar juntas.

---

## 📌 Principal aprendizado

> Uma interface pode definir o contrato, a classe abstrata pode fornecer a implementação comum e a subclasse concreta pode herdar esse comportamento ou adaptá-lo conforme sua necessidade.
