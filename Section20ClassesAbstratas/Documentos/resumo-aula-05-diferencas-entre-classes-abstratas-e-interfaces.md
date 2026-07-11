# 📘 Aula 05 — Diferenças entre classes abstratas e interfaces

## 🎯 Objetivo da aula

Compreender duas diferenças importantes entre classes abstratas e interfaces em Java:

* o armazenamento do estado do objeto;
* o uso de construtores.

---

## 🧠 Estado do objeto

Uma classe abstrata pode possuir atributos de instância, também chamados de campos.

Esses atributos armazenam dados próprios de cada objeto criado a partir das subclasses concretas.

Exemplo:

```java
abstract class Carro {

    int codigo;
}
```

O atributo `codigo` representa parte do estado do objeto.

Cada objeto pode possuir um valor diferente:

```java
Caminhao caminhaoA = new Caminhao(1000);
Caminhao caminhaoB = new Caminhao(2000);
```

Nesse caso:

```text
caminhaoA.codigo = 1000
caminhaoB.codigo = 2000
```

Cada instância possui seu próprio estado.

---

## 🔄 Estado mutável

Os atributos de uma classe abstrata podem ser alterados, desde que não tenham sido declarados com `final`.

```java
caminhaoA.codigo = 888;
```

Isso significa que a classe abstrata pode possuir estado mutável.

O valor armazenado no objeto pode mudar durante a execução do programa.

---

## 🤝 Como funciona em uma interface

Uma interface não possui atributos de instância como uma classe abstrata.

Os campos declarados dentro de uma interface são automaticamente:

```java
public static final
```

Isso significa que funcionam como constantes.

Exemplo:

```java
interface Configuracao {

    int CODIGO_PADRAO = 100;
}
```

Essa declaração equivale a:

```java
public static final int CODIGO_PADRAO = 100;
```

O valor não pode ser alterado:

```java
// Configuracao.CODIGO_PADRAO = 888;
```

Essa tentativa provoca erro de compilação.

---

## 📊 Comparação sobre estado

| Característica                        | Classe abstrata | Interface                   |
| ------------------------------------- | --------------- | --------------------------- |
| Pode possuir atributos de instância   | Sim             | Não                         |
| Cada objeto pode ter valores próprios | Sim             | Não                         |
| Pode possuir estado mutável           | Sim             | Não por meio de seus campos |
| Campos são constantes por padrão      | Não             | Sim                         |
| Campos são `static` por padrão        | Não             | Sim                         |
| Campos são `final` por padrão         | Não             | Sim                         |

---

## 🏗️ Construtores em classes abstratas

Uma classe abstrata pode possuir construtores.

Exemplo:

```java
abstract class Carro {

    int codigo;

    Carro(int codigo) {
        this.codigo = codigo;
    }
}
```

Mesmo que `Carro` não possa ser instanciada diretamente, seu construtor pode ser executado durante a criação de um objeto de uma subclasse.

---

## 🚚 Construtor da subclasse

A classe `Caminhao` herda de `Carro` e utiliza `super` para chamar o construtor da classe abstrata.

```java
class Caminhao extends Carro {

    Caminhao(int codigo) {
        super(codigo);
    }
}
```

O valor recebido pelo construtor de `Caminhao` é enviado para o construtor de `Carro`.

```java
super(codigo);
```

Essa chamada inicializa o atributo herdado.

---

## 🧪 Criando o objeto

O objeto é criado a partir da classe concreta:

```java
Caminhao caminhao = new Caminhao(1000);
```

Durante essa criação, acontece a seguinte sequência:

```text
new Caminhao(1000)
        ↓
construtor de Caminhao
        ↓
super(1000)
        ↓
construtor de Carro
        ↓
codigo recebe 1000
```

Depois, o valor pode ser exibido:

```java
System.out.println("Código: " + caminhao.codigo);
```

Saída:

```text
Código: 1000
```

---

## 🔗 Papel da palavra-chave `super`

A palavra-chave `super` permite acessar elementos da superclasse.

Dentro do construtor, ela é utilizada para chamar o construtor da classe pai:

```java
super(codigo);
```

Quando utilizada dessa forma, a chamada deve ser a primeira instrução do construtor da subclasse.

Exemplo correto:

```java
Caminhao(int codigo) {
    super(codigo);
}
```

---

## ❌ A classe abstrata continua sem poder ser instanciada

Mesmo possuindo construtor, a classe abstrata não pode ser instanciada diretamente.

Incorreto:

```java
Carro carro = new Carro(1000);
```

Correto:

```java
Caminhao caminhao = new Caminhao(1000);
```

O construtor da classe abstrata existe para ajudar na construção das subclasses, não para permitir a criação direta de objetos da classe abstrata.

---

## 🤔 Por que uma classe abstrata possui construtor?

O construtor da classe abstrata pode ser usado para inicializar dados comuns às subclasses.

Exemplo:

```java
abstract class Carro {

    int codigo;
    String modelo;

    Carro(int codigo, String modelo) {
        this.codigo = codigo;
        this.modelo = modelo;
    }
}
```

```java
class Caminhao extends Carro {

    Caminhao(int codigo, String modelo) {
        super(codigo, modelo);
    }
}
```

Nesse caso, qualquer subclasse pode aproveitar a mesma lógica de inicialização.

Isso evita repetir a atribuição dos atributos comuns em todas as classes filhas.

---

## 🚫 Interfaces não possuem construtores

Uma interface não pode possuir construtor.

Isso acontece porque interfaces não são responsáveis pela criação ou pela inicialização do estado de objetos.

Uma interface define principalmente um contrato de comportamento.

Exemplo:

```java
interface Veiculo {

    void acelerar();
}
```

A classe que implementa a interface é responsável por seus atributos e construtores:

```java
class Caminhao implements Veiculo {

    private int codigo;

    Caminhao(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }
}
```

---

## 🧩 Exemplo completo da aula

```java
abstract class Carro {

    int codigo;

    Carro(int codigo) {
        this.codigo = codigo;
    }
}
```

```java
class Caminhao extends Carro {

    Caminhao(int codigo) {
        super(codigo);
    }
}
```

```java
public class TestAbstract {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao(1000);

        System.out.println("Código: " + caminhao.codigo);
    }
}
```

Saída:

```text
Código: 1000
```

---

## ⚠️ Erros comuns

### Tentar instanciar a classe abstrata

```java
Carro carro = new Carro(1000);
```

Isso não é permitido.

---

### Não chamar o construtor da superclasse

Se a classe abstrata possuir apenas um construtor com parâmetros:

```java
abstract class Carro {

    Carro(int codigo) {
    }
}
```

A subclasse precisa chamar esse construtor:

```java
class Caminhao extends Carro {

    Caminhao(int codigo) {
        super(codigo);
    }
}
```

---

### Esquecer o tipo do parâmetro

Incorreto:

```java
Caminhao(codigo) {
    super(codigo);
}
```

Correto:

```java
Caminhao(int codigo) {
    super(codigo);
}
```

Todo parâmetro precisa possuir um tipo declarado.

---

### Confundir campo de interface com atributo de objeto

Interface:

```java
interface Configuracao {

    int CODIGO = 10;
}
```

Esse valor é uma constante compartilhada.

Classe abstrata:

```java
abstract class Carro {

    int codigo;
}
```

Esse atributo pertence ao estado de cada objeto.

---

## ✅ Resumo da aula

Nesta aula, foi possível compreender que:

* classes abstratas podem possuir atributos de instância;
* os atributos podem representar o estado dos objetos;
* cada instância pode armazenar valores diferentes;
* os atributos podem ser alterados quando não são `final`;
* campos de interfaces são constantes por padrão;
* classes abstratas podem possuir construtores;
* interfaces não possuem construtores;
* o construtor da classe abstrata é chamado pela subclasse com `super`;
* uma classe abstrata continua sem poder ser instanciada diretamente;
* o construtor da classe abstrata ajuda a inicializar dados comuns às subclasses.

---

## 📌 Principal aprendizado

> A classe abstrata pode armazenar e inicializar o estado dos objetos herdados, enquanto a interface define contratos e possui apenas constantes em seus campos.
