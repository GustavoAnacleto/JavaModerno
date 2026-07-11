# 📘 Aula 07 — Implementações múltiplas de interfaces

## 🎯 Objetivo da aula

Compreender como uma classe Java pode implementar várias interfaces ao mesmo tempo e quais obrigações surgem a partir desses contratos.

---

## 🧠 Conceito principal

Java não permite que uma classe herde diretamente de várias classes.

Exemplo inválido:

```java
class ClasseExemplo extends ClasseA, ClasseB {
}
```

Porém, uma classe pode implementar várias interfaces:

```java
class ClasseExemplo implements Interface1, Interface2 {
}
```

Esse recurso é chamado de **implementação múltipla de interfaces**.

A classe assume os contratos definidos por todas as interfaces informadas após a palavra-chave `implements`.

---

## 🔗 Estrutura do exemplo

Foram criadas duas interfaces diferentes:

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

Cada interface define um comportamento obrigatório.

A classe concreta pode implementar as duas:

```java
class ClasseExemplo implements Interface1, Interface2 {

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

A separação das interfaces na declaração da classe é feita por vírgula:

```java
implements Interface1, Interface2
```

---

## 📜 Vários contratos na mesma classe

Ao implementar duas interfaces, a classe assume dois contratos.

```text
Interface1
└── metodo1()

Interface2
└── metodo2()

ClasseExemplo
├── implementa metodo1()
└── implementa metodo2()
```

Isso significa que `ClasseExemplo` precisa fornecer uma implementação para todos os métodos abstratos definidos pelas interfaces.

---

## 🧪 Testando a implementação

```java
public class TesteInterfaceMultipla {

    public static void main(String[] args) {

        ClasseExemplo exemplo = new ClasseExemplo();

        exemplo.metodo1();
        exemplo.metodo2();
    }
}
```

Saída esperada:

```text
Método 1
Método 2
```

O mesmo objeto consegue executar os comportamentos definidos pelas duas interfaces.

---

## ⚠️ Implementação obrigatória

Se a classe concreta deixar de implementar algum dos métodos das interfaces, o código não será compilado.

Exemplo incorreto:

```java
class ClasseExemplo implements Interface1, Interface2 {

    @Override
    public void metodo1() {
        System.out.println("Método 1");
    }
}
```

Nesse exemplo, o método `metodo2()` não foi implementado.

Como `ClasseExemplo` é concreta, ela precisa cumprir completamente os dois contratos.

---

## 🔄 Alternativa com classe abstrata

Uma classe pode deixar algum método pendente caso também seja declarada como abstrata:

```java
abstract class ClasseExemplo implements Interface1, Interface2 {

    @Override
    public void metodo1() {
        System.out.println("Método 1");
    }
}
```

Nesse caso, a implementação de `metodo2()` pode ficar para uma futura subclasse concreta.

```java
class ClasseConcreta extends ClasseExemplo {

    @Override
    public void metodo2() {
        System.out.println("Método 2");
    }
}
```

A primeira classe concreta da hierarquia precisa completar os métodos ainda não implementados.

---

## 🔢 Quantas interfaces uma classe pode implementar?

Uma classe pode implementar várias interfaces.

Exemplo:

```java
class ClasseExemplo
        implements Interface1, Interface2, Interface3 {
}
```

Na prática, devem ser implementadas apenas as interfaces que realmente representam comportamentos da classe.

Usar muitas interfaces sem uma necessidade clara pode deixar o código mais difícil de entender.

---

## 🆚 Diferença em relação à aula anterior

Na aula anterior, uma interface estendia outras interfaces:

```java
interface Interface3 extends Interface1, Interface2 {
}
```

Isso é chamado de **herança múltipla de tipo**.

Nesta aula, uma classe implementa diretamente várias interfaces:

```java
class ClasseExemplo implements Interface1, Interface2 {
}
```

Isso é chamado de **implementação múltipla de interfaces**.

---

## 📊 Comparação

| Situação                               | Exemplo                    |
| -------------------------------------- | -------------------------- |
| Herança simples entre classes          | `class B extends A`        |
| Herança múltipla entre classes         | Não permitida              |
| Interface herdando várias interfaces   | `interface C extends A, B` |
| Classe implementando várias interfaces | `class C implements A, B`  |

---

## 💡 Relação com polimorfismo

Uma classe que implementa várias interfaces pode ser tratada como qualquer um dos tipos implementados.

```java
ClasseExemplo objeto = new ClasseExemplo();

Interface1 tipo1 = objeto;
Interface2 tipo2 = objeto;
```

O mesmo objeto pode ser referenciado por tipos diferentes porque atende aos dois contratos.

Cada referência, porém, permite acessar apenas os comportamentos declarados em seu respectivo tipo.

```java
tipo1.metodo1();
tipo2.metodo2();
```

Essa possibilidade está relacionada ao polimorfismo.

---

## ⚠️ Erros comuns

### Usar `extends` para implementar interfaces

Incorreto:

```java
class ClasseExemplo extends Interface1, Interface2 {
}
```

Correto:

```java
class ClasseExemplo implements Interface1, Interface2 {
}
```

---

### Separar interfaces incorretamente

Incorreto:

```java
class ClasseExemplo
        implements Interface1 implements Interface2 {
}
```

Correto:

```java
class ClasseExemplo
        implements Interface1, Interface2 {
}
```

A palavra-chave `implements` aparece uma única vez. As interfaces são separadas por vírgulas.

---

### Esquecer um método obrigatório

Uma classe concreta deve implementar todos os métodos abstratos definidos pelas interfaces.

Caso algum método fique pendente, a classe precisa ser declarada como abstrata ou completar a implementação.

---

### Reduzir a visibilidade do método

Métodos de interfaces são `public` por padrão.

Por isso, a implementação também precisa ser pública:

```java
@Override
public void metodo1() {
    System.out.println("Método 1");
}
```

Não é permitido reduzir a visibilidade do método.

---

## ✅ Resumo da aula

Nesta aula, foi possível compreender que:

* Java não permite herança múltipla entre classes;
* uma classe pode implementar várias interfaces;
* as interfaces são separadas por vírgulas;
* cada interface representa um contrato;
* a classe concreta precisa implementar todos os métodos obrigatórios;
* deixar um método pendente provoca erro de compilação;
* uma classe abstrata pode adiar parte da implementação;
* o mesmo objeto pode ser tratado pelos diferentes tipos das interfaces implementadas;
* implementação múltipla de interfaces é diferente de herança múltipla de tipo.

---

## 📌 Principal aprendizado

> Uma classe Java só pode estender uma classe, mas pode assumir vários contratos implementando diversas interfaces ao mesmo tempo.
