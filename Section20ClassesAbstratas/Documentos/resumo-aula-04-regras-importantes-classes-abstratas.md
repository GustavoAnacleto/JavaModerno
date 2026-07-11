# 📘 Aula 04 — Regras importantes sobre classes abstratas

## 🎯 Objetivo da aula

Compreender as principais regras das classes abstratas em Java, especialmente sobre:

* instanciação;
* métodos abstratos e concretos;
* construtores;
* atributos;
* alteração de estado;
* implementação de interfaces.

---

## 1️⃣ Classes abstratas não podem ser instanciadas

Uma classe declarada com `abstract` não pode gerar objetos diretamente.

Exemplo:

```java
abstract class Carro {
}
```

A tentativa abaixo gera erro de compilação:

```java
Carro carro = new Carro();
```

Isso acontece porque `Carro` representa um modelo geral e incompleto.

Para criar um objeto, é necessário utilizar uma subclasse concreta:

```java
class Caminhao extends Carro {
}
```

```java
Caminhao caminhao = new Caminhao();
```

A classe concreta herda da classe abstrata e pode ser instanciada normalmente.

---

## 🔍 Erro de compilação

Ao tentar instanciar diretamente uma classe abstrata, o compilador informa que ela não pode ser instanciada.

Exemplo incorreto:

```java
abstract class Carro {
}

public class Teste {

    public static void main(String[] args) {

        Carro carro = new Carro();
    }
}
```

A restrição existe porque a classe abstrata foi criada para servir como base para outras classes.

---

## 2️⃣ Podem conter métodos abstratos e concretos

Uma classe abstrata pode reunir métodos sem implementação e métodos já implementados.

```java
abstract class Carro {

    abstract void acelerar();

    void frear() {
        System.out.println("O carro está freando.");
    }
}
```

Nesse exemplo:

* `acelerar()` é um método abstrato;
* `frear()` é um método concreto.

O método abstrato deverá ser implementado pela subclasse concreta.

O método concreto poderá ser herdado e utilizado diretamente.

---

## 🚚 Implementação na subclasse

```java
class Caminhao extends Carro {

    @Override
    void acelerar() {
        System.out.println("O caminhão está acelerando lentamente.");
    }
}
```

A classe `Caminhao` é obrigada a implementar `acelerar()`, pois esse método foi declarado como abstrato na superclasse.

Ela não precisa implementar novamente `frear()`, porque esse método já possui corpo.

---

## 3️⃣ Classes abstratas podem possuir construtores

Mesmo não podendo ser instanciada diretamente, uma classe abstrata pode possuir construtores.

Exemplo:

```java
abstract class Carro {

    String modelo;

    Carro(String modelo) {
        this.modelo = modelo;
    }
}
```

A princípio, isso pode causar dúvida:

> Se a classe abstrata não pode ser instanciada, por que ela possui construtor?

O construtor da classe abstrata é executado durante a criação de um objeto de uma subclasse concreta.

---

## 🔗 Uso de `super`

A subclasse pode chamar o construtor da classe abstrata utilizando `super`.

```java
class Caminhao extends Carro {

    Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }
}
```

Uso:

```java
Caminhao caminhao = new Caminhao("Volvo FH");
```

Durante a criação do objeto `caminhao`, o construtor de `Caminhao` chama o construtor de `Carro`.

A chamada:

```java
super(modelo);
```

precisa ser a primeira instrução do construtor da subclasse.

---

## 🧠 Papel do construtor da classe abstrata

O construtor da classe abstrata serve para inicializar atributos e comportamentos comuns às subclasses.

Exemplo:

```java
abstract class Carro {

    String modelo;
    int quantidadeRodas;

    Carro(String modelo, int quantidadeRodas) {
        this.modelo = modelo;
        this.quantidadeRodas = quantidadeRodas;
    }
}
```

```java
class Caminhao extends Carro {

    Caminhao(String modelo) {
        super(modelo, 6);
    }

    @Override
    void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }
}
```

Assim, a inicialização dos dados comuns fica centralizada na classe abstrata.

---

## 4️⃣ Classes abstratas podem possuir campos

Uma classe abstrata pode possuir atributos, também chamados de campos ou variáveis de instância.

```java
abstract class Carro {

    int codigo = 10;
}
```

Esses atributos podem ser herdados pelas subclasses.

```java
class Caminhao extends Carro {

    @Override
    void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }
}
```

```java
Caminhao caminhao = new Caminhao();

System.out.println(caminhao.codigo);
```

Saída:

```text
10
```

---

## 🔄 Alteração dos atributos

Diferentemente dos atributos declarados em uma interface, os campos de uma classe abstrata podem ser alterados, desde que não tenham sido declarados como `final`.

```java
Caminhao caminhao = new Caminhao();

System.out.println(caminhao.codigo);

caminhao.codigo = 888;

System.out.println(caminhao.codigo);
```

Saída:

```text
10
888
```

Isso demonstra que a classe abstrata pode possuir estado mutável.

---

## 🧱 Estado do objeto

O estado de um objeto é formado pelos valores armazenados em seus atributos.

Exemplo:

```java
abstract class Carro {

    int codigo;
    String modelo;
    double velocidade;
}
```

Cada objeto criado a partir de uma subclasse pode possuir seus próprios valores.

```java
Caminhao caminhaoA = new Caminhao();
Caminhao caminhaoB = new Caminhao();

caminhaoA.codigo = 10;
caminhaoB.codigo = 20;
```

Os dois objetos possuem estados diferentes.

---

## 🤝 Diferença em relação às interfaces

Os atributos declarados em interfaces são, por padrão:

```java
public static final
```

Isso significa que eles funcionam como constantes.

Exemplo:

```java
interface Configuracao {

    int VELOCIDADE_MAXIMA = 200;
}
```

Esse atributo equivale a:

```java
public static final int VELOCIDADE_MAXIMA = 200;
```

Por ser `final`, seu valor não pode ser alterado:

```java
// Configuracao.VELOCIDADE_MAXIMA = 250;
```

Já uma classe abstrata pode possuir campos de instância comuns e mutáveis:

```java
abstract class Carro {

    int velocidadeMaxima = 200;
}
```

```java
Caminhao caminhao = new Caminhao();

caminhao.velocidadeMaxima = 120;
```

---

## 📊 Comparação dos atributos

| Característica                      | Classe abstrata           | Interface            |
| ----------------------------------- | ------------------------- | -------------------- |
| Pode possuir atributos de instância | Sim                       | Não                  |
| Pode possuir estado próprio         | Sim                       | Não da mesma maneira |
| Atributos são constantes por padrão | Não                       | Sim                  |
| Atributos podem ser alterados       | Sim, se não forem `final` | Não                  |
| Pode usar modificadores de acesso   | Sim                       | Campos são `public`  |

---

## 5️⃣ Classes abstratas podem implementar interfaces

Uma classe abstrata pode implementar uma interface utilizando `implements`.

```java
interface Veiculo {

    void acelerar();
}
```

```java
abstract class Carro implements Veiculo {
}
```

Como `Carro` é abstrata, ela pode deixar de implementar imediatamente o método `acelerar()`.

A obrigação pode ser transferida para uma subclasse concreta.

```java
class Caminhao extends Carro {

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }
}
```

Nesse caso:

```text
Veiculo
   ↑ implements
Carro
   ↑ extends
Caminhao
```

A classe abstrata participa tanto do contrato da interface quanto da hierarquia de classes.

---

## ⚠️ Classe concreta precisa cumprir o contrato

Uma classe abstrata pode adiar a implementação de um método da interface.

Entretanto, a primeira classe concreta da hierarquia precisa implementar todos os métodos abstratos ainda pendentes.

Exemplo:

```java
interface Veiculo {

    void acelerar();
}
```

```java
abstract class Carro implements Veiculo {
}
```

```java
class Caminhao extends Carro {

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }
}
```

Se `Caminhao` não implementar `acelerar()`, haverá erro de compilação.

---

## 🧩 Flexibilidade da classe abstrata

Uma classe abstrata pode reunir diferentes recursos em uma única estrutura:

* atributos;
* construtores;
* métodos concretos;
* métodos abstratos;
* implementação de interfaces;
* herança;
* estado compartilhado;
* comportamentos obrigatórios.

Essa combinação torna a classe abstrata uma base parcialmente pronta para as subclasses.

Porém, isso não significa que ela sempre seja melhor do que uma interface. Cada recurso possui um propósito diferente.

A classe abstrata é especialmente útil quando existe uma relação clara de herança e quando as subclasses precisam compartilhar estado ou implementação.

---

## ⚠️ Erros comuns

### Instanciar uma classe abstrata

Incorreto:

```java
Carro carro = new Carro();
```

Correto:

```java
Caminhao caminhao = new Caminhao();
```

---

### Esquecer de chamar o construtor correto

Se a superclasse abstrata possuir apenas um construtor com parâmetros:

```java
abstract class Carro {

    Carro(String modelo) {
    }
}
```

A subclasse deverá chamar esse construtor:

```java
class Caminhao extends Carro {

    Caminhao(String modelo) {
        super(modelo);
    }

    @Override
    void acelerar() {
    }
}
```

---

### Confundir atributo de classe abstrata com constante de interface

Classe abstrata:

```java
abstract class Carro {

    int codigo = 10;
}
```

O valor pode ser alterado.

Interface:

```java
interface Configuracao {

    int CODIGO = 10;
}
```

O valor é uma constante e não pode ser alterado.

---

## ✅ Resumo da aula

Nesta aula, foram apresentadas cinco regras importantes:

1. classes abstratas não podem ser instanciadas diretamente;
2. podem conter métodos abstratos e concretos;
3. podem possuir construtores;
4. podem possuir atributos e estado mutável;
5. podem implementar interfaces.

Também foi possível compreender que:

* os objetos são criados a partir das subclasses concretas;
* o construtor da classe abstrata é chamado durante a construção da subclasse;
* `super` permite acessar o construtor da superclasse;
* campos de classes abstratas podem ser alterados;
* campos de interfaces são constantes por padrão;
* uma classe abstrata pode adiar a implementação dos métodos de uma interface;
* uma subclasse concreta deve cumprir todos os contratos pendentes.

---

## 📌 Principal aprendizado

> Uma classe abstrata não pode gerar objetos diretamente, mas pode fornecer atributos, construtores, métodos e contratos que serão aproveitados e completados pelas subclasses concretas.
