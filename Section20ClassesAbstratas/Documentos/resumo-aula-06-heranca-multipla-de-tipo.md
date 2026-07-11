# 📘 Aula 06 — Herança múltipla de tipo com interfaces

## 🎯 Objetivo da aula

Compreender:

* os diferentes termos usados no cotidiano profissional;
* por que Java não permite herança múltipla entre classes;
* o que significa herança múltipla de tipo;
* como uma interface pode herdar de várias interfaces;
* por que a classe concreta precisa implementar todos os métodos herdados.

---

## 🗣️ Termos utilizados no mercado

Durante o estudo de Java, um mesmo conceito pode aparecer com nomes diferentes.

Alguns exemplos:

| Termo           | Outro termo possível             |
| --------------- | -------------------------------- |
| Campo           | Atributo                         |
| Variável-membro | Variável de instância            |
| Classe pai      | Superclasse                      |
| Classe filha    | Subclasse                        |
| Implementação   | Corpo ou comportamento do método |

Esses termos podem variar conforme:

* a empresa;
* o professor;
* a documentação;
* a equipe de desenvolvimento;
* o contexto da conversa.

É importante aprender os termos técnicos, mas também se acostumar com as formas utilizadas no cotidiano profissional.

---

## 🧬 Herança simples entre classes

Em Java, uma classe pode herdar diretamente de apenas uma classe.

Exemplo:

```java
class Animal {
}
```

```java
class Cachorro extends Animal {
}
```

A classe `Cachorro` possui somente uma superclasse direta: `Animal`.

Essa regra também vale quando a superclasse é abstrata:

```java
abstract class Animal {
}
```

```java
class Cachorro extends Animal {
}
```

A palavra-chave utilizada continua sendo `extends`, e a classe concreta continua podendo herdar diretamente de apenas uma classe.

---

## ❌ Herança múltipla entre classes

Java não permite que uma classe estenda duas ou mais classes ao mesmo tempo.

Exemplo inválido:

```java
class Cachorro extends Animal, SerVivo {
}
```

Essa sintaxe provoca erro de compilação.

Portanto, Java não possui herança múltipla de implementação entre classes.

Uma classe pode ter apenas uma superclasse direta.

---

## 🧠 Por que Java evita herança múltipla entre classes?

Se uma classe pudesse herdar implementações de várias classes, poderiam surgir ambiguidades.

Imagine que duas superclasses possuam o mesmo método:

```java
class ClasseA {

    void executar() {
        System.out.println("Execução da classe A");
    }
}
```

```java
class ClasseB {

    void executar() {
        System.out.println("Execução da classe B");
    }
}
```

Se outra classe pudesse herdar das duas, o Java precisaria decidir qual implementação de `executar()` utilizar.

Para evitar conflitos desse tipo, Java trabalha com herança simples entre classes.

---

## 🔗 Herança entre interfaces

Uma interface pode herdar de outra interface utilizando `extends`.

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

Além disso, uma interface pode estender várias interfaces ao mesmo tempo:

```java
interface Interface3 extends Interface1, Interface2 {

    void metodo3();
}
```

Nesse caso, `Interface3` reúne os contratos definidos em:

* `Interface1`;
* `Interface2`;
* na própria `Interface3`.

Esse mecanismo é chamado de **herança múltipla de tipo**.

---

## 🧩 Estrutura do exemplo

```text
Interface1
   └── metodo1()

Interface2
   └── metodo2()

Interface3 extends Interface1, Interface2
   └── metodo3()
```

A `Interface3` herda os métodos das duas interfaces anteriores.

Conceitualmente, ela passa a representar um tipo que reúne três comportamentos obrigatórios:

```text
metodo1()
metodo2()
metodo3()
```

---

## 🏗️ Classe que implementa a interface

Uma classe concreta pode implementar a `Interface3`:

```java
class ClasseExemplo implements Interface3 {

    @Override
    public void metodo1() {
        System.out.println("Método 1");
    }

    @Override
    public void metodo2() {
        System.out.println("Método 2");
    }

    @Override
    public void metodo3() {
        System.out.println("Método 3");
    }
}
```

Embora a classe declare apenas:

```java
implements Interface3
```

ela precisa implementar também os métodos herdados por `Interface3`.

Isso acontece porque `Interface3` carrega os contratos de `Interface1` e `Interface2`.

---

## ⚠️ Modificador `public`

Os métodos abstratos de uma interface são `public` por padrão.

Por isso, ao implementá-los em uma classe concreta, os métodos também precisam ser declarados como `public`.

Correto:

```java
@Override
public void metodo1() {
    System.out.println("Método 1");
}
```

Incorreto:

```java
@Override
void metodo1() {
    System.out.println("Método 1");
}
```

A implementação não pode reduzir a visibilidade do método definido pela interface.

---

## 🧪 Classe de teste

```java
public class TesteInterfaceMultipla {

    public static void main(String[] args) {

        ClasseExemplo exemplo = new ClasseExemplo();

        exemplo.metodo1();
        exemplo.metodo2();
        exemplo.metodo3();
    }
}
```

Saída esperada:

```text
Método 1
Método 2
Método 3
```

O objeto foi criado a partir da classe concreta `ClasseExemplo`.

Essa classe consegue executar os três métodos porque implementou todos os contratos herdados.

---

## ❌ Esquecendo um método obrigatório

Imagine que a classe deixe de implementar `metodo1()`:

```java
class ClasseExemplo implements Interface3 {

    @Override
    public void metodo2() {
        System.out.println("Método 2");
    }

    @Override
    public void metodo3() {
        System.out.println("Método 3");
    }
}
```

Esse código não compila.

A classe concreta precisa implementar todos os métodos abstratos ainda pendentes:

```text
metodo1()
metodo2()
metodo3()
```

O compilador identifica que o contrato está incompleto.

---

## 🔄 Alternativa: manter a classe abstrata

Uma classe poderia deixar de implementar algum método da interface se também fosse declarada como abstrata:

```java
abstract class ClasseExemplo implements Interface3 {

    @Override
    public void metodo2() {
        System.out.println("Método 2");
    }

    @Override
    public void metodo3() {
        System.out.println("Método 3");
    }
}
```

Nesse caso, a obrigação de implementar `metodo1()` seria transferida para uma futura subclasse concreta.

---

## 📚 Herança múltipla de tipo

A expressão **herança múltipla de tipo** significa que uma interface pode reunir vários tipos ou contratos.

```java
interface Interface3 extends Interface1, Interface2 {
}
```

A `Interface3` passa a ser considerada também dos tipos:

* `Interface1`;
* `Interface2`;
* `Interface3`.

Uma classe que implemente `Interface3` poderá ser tratada por qualquer um desses tipos.

Exemplo:

```java
ClasseExemplo objeto = new ClasseExemplo();

Interface1 tipo1 = objeto;
Interface2 tipo2 = objeto;
Interface3 tipo3 = objeto;
```

O mesmo objeto atende aos três contratos.

Essa é uma conexão importante com o polimorfismo.

---

## ➕ Implementação de várias interfaces

Uma classe também pode implementar várias interfaces diretamente:

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

Isso não significa que a classe esteja herdando implementações de várias classes.

Ela está assumindo vários contratos de comportamento.

---

## 📊 Comparação

| Situação                                 | Permitida em Java? |
| ---------------------------------------- | ------------------ |
| Uma classe estender uma classe           | Sim                |
| Uma classe estender duas classes         | Não                |
| Uma classe abstrata estender uma classe  | Sim                |
| Uma interface estender uma interface     | Sim                |
| Uma interface estender várias interfaces | Sim                |
| Uma classe implementar várias interfaces | Sim                |

---

## 📝 Atenção em provas e certificações

É importante diferenciar as afirmações:

> Java permite herança múltipla entre classes.

Essa afirmação está errada.

> Java permite herança múltipla de tipo por meio de interfaces.

Essa afirmação está correta.

O detalhe pode aparecer em provas, entrevistas técnicas ou certificações.

---

## ⚠️ Erros comuns

### Tentar estender várias classes

```java
class ClasseC extends ClasseA, ClasseB {
}
```

Java não permite essa operação.

---

### Usar `implements` entre interfaces

Incorreto:

```java
interface Interface3 implements Interface1 {
}
```

Correto:

```java
interface Interface3 extends Interface1 {
}
```

Interfaces herdam de interfaces com `extends`.

---

### Usar `extends` para implementar uma interface em uma classe

Incorreto:

```java
class ClasseExemplo extends Interface3 {
}
```

Correto:

```java
class ClasseExemplo implements Interface3 {
}
```

Uma classe implementa uma interface com `implements`.

---

### Não implementar todos os métodos

Uma classe concreta deve implementar todos os métodos abstratos herdados direta ou indiretamente das interfaces.

---

## ✅ Resumo da aula

Nesta aula, foi possível compreender que:

* diferentes termos podem representar o mesmo conceito no mercado;
* Java permite apenas herança simples entre classes;
* uma classe não pode estender várias classes;
* essa regra também se aplica às classes abstratas;
* interfaces podem estender várias interfaces;
* esse recurso é chamado de herança múltipla de tipo;
* uma interface herda os contratos das interfaces que estende;
* uma classe concreta precisa implementar todos os métodos herdados;
* métodos implementados de interfaces precisam ser `public`;
* uma classe pode implementar várias interfaces;
* interfaces permitem combinar vários contratos sem herdar múltiplas implementações de classes.

---

## 📌 Principal aprendizado

> Java não permite que uma classe herde de várias classes, mas permite que interfaces reúnam vários contratos, formando uma herança múltipla de tipo.
