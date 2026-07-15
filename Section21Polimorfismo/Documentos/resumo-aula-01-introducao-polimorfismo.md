# Aula 01 — Introdução ao Polimorfismo em Java

## 🎯 Objetivo da aula

Compreender o conceito inicial de **polimorfismo**, sua relação com a herança e como uma referência de uma superclasse pode apontar para um objeto de uma subclasse.

Nesta aula, o polimorfismo foi demonstrado com:

* uma classe abstrata `Animal`;
* as subclasses `Cachorro` e `Gato`;
* um método abstrato sobrescrito pelas subclasses;
* um método concreto herdado da superclasse;
* objetos declarados com o tipo `Animal` e instanciados como `Cachorro` ou `Gato`.

---

## 🧩 Pré-requisitos importantes

O polimorfismo está diretamente relacionado a conceitos estudados anteriormente:

* herança;
* superclasse e subclasse;
* classes abstratas;
* métodos abstratos;
* sobrescrita com `@Override`;
* relação **“é um”**.

Exemplos dessa relação:

* `Cachorro` **é um** `Animal`;
* `Gato` **é um** `Animal`;
* `Funcionario` **é uma** `Pessoa`;
* `Estagiario` **é uma** `Pessoa`.

Essa relação permite tratar objetos específicos por meio de um tipo mais geral.

---

## 🦎 O que é polimorfismo?

A palavra **polimorfismo** pode ser entendida como **“muitas formas”**.

Em Java, a ideia central é:

> Uma referência de um tipo mais geral pode apontar para objetos de diferentes tipos mais específicos pertencentes à mesma hierarquia.

Exemplo:

```java
Animal meuCachorro = new Cachorro();
Animal meuGato = new Gato();
```

Nos dois casos, o tipo da referência é `Animal`, mas os objetos criados são diferentes:

| Referência | Tipo da referência | Objeto criado |
|---|---|---|
| `meuCachorro` | `Animal` | `Cachorro` |
| `meuGato` | `Animal` | `Gato` |

Isso permite utilizar o mesmo tipo geral para trabalhar com diferentes objetos específicos.

### ⚠️ O objeto não muda de classe

Dizer que o objeto “assume várias formas” não significa que um objeto `Cachorro` deixa de ser cachorro e se transforma em outro objeto.

Em:

```java
Animal meuCachorro = new Cachorro();
```

* `Animal` é o **tipo da referência**;
* `Cachorro` é o **tipo real do objeto**;
* o objeto continua sendo um `Cachorro` durante toda a sua existência.

Ele está apenas sendo acessado por uma referência mais geral, do tipo `Animal`.

---

## 📝 Sintaxe básica

A forma inicial apresentada para criar uma referência polimórfica foi:

```java
Superclasse referencia = new Subclasse();
```

Exemplo:

```java
Animal animal = new Cachorro();
```

Podemos resumir assim:

> Declara-se a referência com a superclasse e instancia-se o objeto com a subclasse.

Essa atribuição é válida porque um `Cachorro` **é um** `Animal`.

---

## 💻 Exemplo completo

```java
abstract class Animal {

    public abstract void fazerSom();

    public void exibirTipoGeral() {
        System.out.println("Objeto do tipo Animal");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz au au");
    }
}

class Gato extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O gato faz miau miau");
    }
}

public class TestePolimorfismo {

    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.fazerSom();
        meuGato.fazerSom();

        meuCachorro.exibirTipoGeral();
        meuGato.exibirTipoGeral();
    }
}
```

### Saída esperada

```text
O cachorro faz au au
O gato faz miau miau
Objeto do tipo Animal
Objeto do tipo Animal
```

---

## 🔄 O mesmo método, comportamentos diferentes

As duas referências chamam o mesmo método:

```java
meuCachorro.fazerSom();
meuGato.fazerSom();
```

Entretanto, o resultado é diferente:

* o objeto `Cachorro` executa `Cachorro.fazerSom()`;
* o objeto `Gato` executa `Gato.fazerSom()`.

Isso acontece porque `fazerSom()` foi sobrescrito nas subclasses. Em tempo de execução, o Java verifica o tipo real do objeto e escolhe a implementação correspondente.

Esse mecanismo é chamado de **despacho dinâmico de métodos**.

### Compilação e execução

O processo pode ser entendido em duas etapas:

1. **Durante a compilação:** o Java verifica se o método existe no tipo da referência.
2. **Durante a execução:** se o método foi sobrescrito, o Java escolhe a implementação de acordo com o tipo real do objeto.

No exemplo:

```java
Animal meuCachorro = new Cachorro();
meuCachorro.fazerSom();
```

* o compilador verifica se `Animal` possui `fazerSom()`;
* durante a execução, o Java identifica que o objeto é um `Cachorro`;
* então executa o método sobrescrito pela classe `Cachorro`.

---

## 🧱 Método concreto herdado da superclasse

A classe `Animal` também possui um método concreto:

```java
public void exibirTipoGeral() {
    System.out.println("Objeto do tipo Animal");
}
```

Como `Cachorro` e `Gato` herdam esse método e não o sobrescrevem, ambos executam a implementação definida em `Animal`:

```java
meuCachorro.exibirTipoGeral();
meuGato.exibirTipoGeral();
```

Saída:

```text
Objeto do tipo Animal
Objeto do tipo Animal
```

Assim, uma superclasse pode:

* fornecer comportamentos comuns por meio de métodos concretos;
* declarar comportamentos variáveis por meio de métodos abstratos;
* permitir que cada subclasse implemente sua própria versão do comportamento variável.

---

## 👤 Exemplo com `Pessoa`

Considere a seguinte hierarquia:

```text
Pessoa
├── Funcionario
├── Estagiario
└── Terceiro
```

Como todos são tipos de `Pessoa`, um único método pode receber o tipo mais geral:

```java
public static void imprimirDados(Pessoa pessoa) {
    pessoa.exibirDados();
}
```

Esse método poderá receber objetos diferentes:

```java
imprimirDados(new Funcionario());
imprimirDados(new Estagiario());
imprimirDados(new Terceiro());
```

Se cada subclasse sobrescrever `exibirDados()`, o Java executará a implementação correspondente ao objeto recebido.

Sem o polimorfismo, poderiam ser necessários vários métodos específicos, como:

```java
imprimirFuncionario(...);
imprimirEstagiario(...);
imprimirTerceiro(...);
```

Com o polimorfismo, um único método pode trabalhar com todos os objetos pertencentes à hierarquia de `Pessoa`.

---

## ♻️ Benefícios do polimorfismo

O polimorfismo favorece:

* reutilização de código;
* redução de repetição;
* métodos capazes de receber diferentes tipos relacionados;
* maior flexibilidade;
* facilidade para adicionar novas subclasses;
* código orientado a tipos mais gerais.

Por exemplo, se futuramente for criada a classe `Passaro`, o código que trabalha com `Animal` poderá receber um `Passaro`, desde que a nova classe respeite a hierarquia e implemente os comportamentos obrigatórios.

```java
Animal meuPassaro = new Passaro();
```

---

## 🔗 Relação entre herança e polimorfismo

| Conceito | Função |
|---|---|
| Herança | Cria a relação entre superclasse e subclasse. |
| Classe abstrata | Define uma base comum e pode exigir comportamentos das subclasses. |
| Sobrescrita | Permite que cada subclasse forneça sua própria implementação. |
| Polimorfismo | Permite tratar diferentes subclasses por meio de um tipo mais geral. |

O polimorfismo apresentado nesta aula depende da existência de uma relação válida de herança.

---

## ⏱️ Observação sobre o runtime

A escolha da implementação sobrescrita acontece durante a execução do programa, ou seja, em **runtime**.

Entretanto, isso não significa que o polimorfismo normalmente provoque erros apenas durante a execução. O compilador ainda verifica vários problemas, como:

* tipos incompatíveis;
* métodos inexistentes no tipo da referência;
* ausência da implementação obrigatória de um método abstrato.

Alguns problemas relacionados a conversões incorretas de tipos podem aparecer em runtime, mas esse assunto será estudado com mais clareza quando surgirem **downcasting** e `instanceof`.

Portanto, a ideia mais precisa neste momento é:

> No polimorfismo, a implementação sobrescrita que será executada é escolhida em runtime com base no tipo real do objeto.

---

## ⚠️ Erros comuns

### 1. Pensar que o objeto mudou de tipo

```java
Animal animal = new Cachorro();
```

O objeto não se transformou em `Animal`. Ele continua sendo um `Cachorro`, mas está sendo referenciado como `Animal`.

### 2. Inverter a relação

Isto não é válido:

```java
Cachorro cachorro = new Animal();
```

Nem todo `Animal` é um `Cachorro`. Além disso, no exemplo estudado, `Animal` é uma classe abstrata e não pode ser instanciada.

### 3. Esquecer a implementação do método abstrato

Uma subclasse concreta deve implementar os métodos abstratos herdados:

```java
@Override
public void fazerSom() {
    System.out.println("O cachorro faz au au");
}
```

Caso contrário, ocorrerá erro de compilação.

### 4. Tentar acessar diretamente um método exclusivo da subclasse

Se `Cachorro` possuir um método `buscarBola()`, mas `Animal` não declarar esse método, o código abaixo não compilará:

```java
Animal animal = new Cachorro();
animal.buscarBola();
```

O tipo da referência determina quais membros podem ser acessados diretamente durante a compilação.

### 5. Confundir sobrescrita com sobrecarga

* **Sobrescrita:** a subclasse redefine um método herdado com a mesma assinatura.
* **Sobrecarga:** existem métodos com o mesmo nome, mas listas de parâmetros diferentes.

O comportamento polimórfico demonstrado nesta aula utiliza **sobrescrita**.

---

## ✅ Boas práticas observadas

* usar uma superclasse quando existir uma relação real de generalização;
* representar corretamente a relação **“é um”**;
* utilizar `@Override` nos métodos sobrescritos;
* declarar métodos comuns na superclasse;
* manter nas subclasses os comportamentos específicos;
* preferir nomes claros para classes, métodos e referências.

---

## 🧠 Principal aprendizado da aula

> Polimorfismo permite que uma referência de um tipo mais geral aponte para objetos de tipos mais específicos. Quando um método sobrescrito é chamado, o Java executa, em runtime, a implementação correspondente ao tipo real do objeto.

No exemplo estudado:

```java
Animal meuCachorro = new Cachorro();
Animal meuGato = new Gato();
```

As duas referências são do tipo `Animal`, mas cada objeto apresenta o comportamento definido por sua própria classe ao executar `fazerSom()`.
