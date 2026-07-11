# Aula 168 - Regras de Interfaces - Parte 2

## 🎯 Objetivo da aula

Apresentar novas regras importantes sobre interfaces em Java.

Nesta aula, os principais pontos foram:

```text
- métodos de interface são public por padrão;
- métodos de interface também são abstract por padrão;
- a palavra abstract é opcional em métodos de interface;
- uma interface pode estender outra interface;
- uma interface pode estender mais de uma interface;
- classes que implementam uma interface precisam implementar todos os métodos exigidos;
- métodos implementados não podem ter visibilidade mais restritiva.
```

## 🧠 Conceito principal

Em uma interface, os métodos sem corpo são considerados automaticamente:

```java
public abstract
```

Isso significa que, mesmo escrevendo assim:

```java
interface Animal {
    void fazerSom();
}
```

O compilador entende como se fosse:

```java
interface Animal {
    public abstract void fazerSom();
}
```

Ou seja, o código mais simples funciona porque o compilador completa essas informações.

## 📌 Métodos de interface são public por padrão

Todo método abstrato declarado em uma interface é `public` por padrão.

Exemplo:

```java
interface Animal {
    void fazerSom();
}
```

Mesmo sem escrever `public`, o método `fazerSom()` é público.

Também seria possível escrever explicitamente:

```java
interface Animal {
    public void fazerSom();
}
```

Mas, como o `public` já é implícito, normalmente o código fica mais limpo sem essa repetição.

## ⚠️ Não usar private em método abstrato de interface

Um método abstrato de interface não pode ser `private`, porque ele precisa ser implementado por uma classe.

Exemplo incorreto:

```java
interface Animal {
    private void fazerSom(); // Erro
}
```

Isso não faz sentido para um contrato obrigatório, porque se o método fosse privado, a classe que implementa a interface não conseguiria implementá-lo corretamente.

A ideia da interface é justamente expor um comportamento que a classe concreta deverá cumprir.

## 🧩 A palavra abstract é opcional

Além de `public`, o compilador também entende que o método sem corpo da interface é `abstract`.

Então, estas duas formas são equivalentes:

```java
interface Animal {
    void fazerSom();
}
```

```java
interface Animal {
    public abstract void fazerSom();
}
```

A segunda forma deixa mais explícito o que está acontecendo.

A primeira forma é mais limpa e mais comum no dia a dia.

## 🧼 Código mais limpo

O professor mostrou que é possível deixar o código mais simples, removendo o que já é implícito.

Forma mais explícita:

```java
interface Animal {
    public abstract void fazerSom();
}
```

Forma mais limpa:

```java
interface Animal {
    void fazerSom();
}
```

As duas funcionam.

O importante é saber o que está acontecendo por baixo:

```text
Método de interface sem corpo = public abstract por padrão.
```

## 🔗 Interface pode estender outra interface

Uma interface pode herdar de outra interface usando `extends`.

Exemplo:

```java
interface SerVivo {
    void respirar();
}

interface Animal extends SerVivo {
    void fazerSom();
}
```

Nesse caso, a interface `Animal` herda o método `respirar()` da interface `SerVivo`.

Então, é como se `Animal` exigisse dois métodos:

```text
respirar()
fazerSom()
```

## 🐶 Classe implementando interface estendida

Se uma classe implementa `Animal`, ela precisa implementar tanto os métodos de `Animal` quanto os métodos herdados de `SerVivo`.

Exemplo:

```java
class Cachorro implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz au au");
    }

    @Override
    public void respirar() {
        System.out.println("O cachorro está respirando");
    }
}
```

A classe `Cachorro` implementa `Animal`.

Como `Animal` estende `SerVivo`, `Cachorro` precisa implementar:

```text
- fazerSom()
- respirar()
```

## 🐱 Outra classe implementando a mesma interface

A classe `Gato` também precisa implementar os dois métodos.

```java
class Gato implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O gato faz miau miau");
    }

    @Override
    public void respirar() {
        System.out.println("O gato está respirando");
    }
}
```

Isso reforça a ideia de contrato.

Se uma classe aceita implementar uma interface, ela precisa cumprir todas as exigências daquela interface, inclusive as herdadas de outras interfaces.

## ⚠️ Implementação não pode ser mais restritiva

Essa é uma regra muito importante.

Como métodos de interface são `public` por padrão, a classe que implementa esses métodos também precisa usar `public`.

Exemplo incorreto:

```java
class Cachorro implements Animal {

    @Override
    void respirar() {
        System.out.println("Respirando");
    }
}
```

Esse código não compila, porque `void respirar()` sem modificador de acesso fica com acesso `default`.

O acesso `default` é mais restritivo que `public`.

Como o método da interface é `public`, a implementação também precisa ser `public`.

Forma correta:

```java
class Cachorro implements Animal {

    @Override
    public void respirar() {
        System.out.println("Respirando");
    }
}
```

## 📌 Regra de visibilidade

A regra é:

```text
Ao implementar um método de interface, não posso reduzir a visibilidade do método.
```

Como o método da interface é `public`, a implementação também deve ser `public`.

Não pode ser:

```text
private
protected
default
```

Precisa ser:

```text
public
```

## 🔁 Diferença entre classe e interface na herança

Em Java, uma classe só pode estender uma classe.

Exemplo:

```java
class Cachorro extends Animal {
}
```

Uma classe não pode estender duas classes ao mesmo tempo.

Mas interfaces podem estender outras interfaces, inclusive mais de uma.

Exemplo:

```java
interface Animal extends SerVivo {
}
```

E, em um exemplo com mais interfaces:

```java
interface Animal extends SerVivo, Movel {
}
```

Esse ponto mostra uma diferença importante:

```text
Classe → herança simples.
Interface → pode estender uma ou mais interfaces.
```

## 💻 Código completo da aula com boas práticas

```java
interface SerVivo {
    void respirar();
}

interface Animal extends SerVivo {

    String DESCRICAO = "Animal é um ser vivo importante";

    void fazerSom();
}

class Cachorro implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz au au");
    }

    @Override
    public void respirar() {
        System.out.println("O cachorro está respirando");
    }
}

class Gato implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O gato faz miau miau");
    }

    @Override
    public void respirar() {
        System.out.println("O gato está respirando");
    }
}

public class TesteInterface {

    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();
        meuCachorro.fazerSom();
        meuCachorro.respirar();

        Gato meuGato = new Gato();
        meuGato.fazerSom();
        meuGato.respirar();

        System.out.println("Descrição da interface: " + Animal.DESCRICAO);
    }
}
```

## 🧪 Resultado esperado

```text
O cachorro faz au au
O cachorro está respirando
O gato faz miau miau
O gato está respirando
Descrição da interface: Animal é um ser vivo importante
```

## 🧱 Boas práticas observadas

Algumas boas práticas importantes desta aula:

```text
- manter métodos de interface simples e objetivos;
- usar nomes claros para interfaces e métodos;
- usar @Override ao implementar métodos;
- usar public nos métodos implementados;
- evitar escrever public abstract na interface quando o código limpo for suficiente;
- entender o que o compilador faz implicitamente;
- não reduzir a visibilidade dos métodos implementados.
```

## 🔗 Ligação com Java back-end

No Java back-end, essa ideia aparece muito quando temos contratos mais genéricos.

Por exemplo:

```java
interface Servico {
    void executar();
}

interface ServicoNotificacao extends Servico {
    void enviarMensagem();
}
```

Uma classe que implementasse `ServicoNotificacao` teria que implementar os métodos da própria interface e também os métodos herdados de `Servico`.

Neste momento, não precisa avançar para Spring Boot. O importante é entender que interfaces podem formar contratos maiores a partir de contratos menores.

## ⚠️ Erros comuns

Alguns erros comuns nesta aula:

```text
- achar que método de interface sem public não é público;
- esquecer que método de interface é abstract por padrão;
- tentar usar private em método abstrato de interface;
- implementar método de interface sem public;
- esquecer de implementar métodos herdados de outra interface;
- confundir extends em interface com extends em classe;
- achar que classe pode estender várias classes;
- não perceber que interface pode estender mais de uma interface.
```

## 🧱 Resumo rápido para revisão

```text
Métodos de interface são public por padrão.

Métodos sem corpo em interface são abstract por padrão.

Escrever public abstract é permitido, mas geralmente desnecessário.

Uma interface pode estender outra interface usando extends.

Uma interface pode estender mais de uma interface.

Se uma classe implementa uma interface que estende outra, ela precisa implementar todos os métodos exigidos.

A implementação do método não pode ser mais restritiva.

Como o método da interface é public, a implementação também precisa ser public.
```

## 📝 Anotação pessoal

Nesta aula, entendi que os métodos de uma interface são automaticamente `public abstract`, mesmo quando isso não está escrito.

Também entendi que uma interface pode estender outra interface usando `extends`. Quando isso acontece, uma classe que implementa a interface filha precisa implementar os métodos da interface filha e também os métodos herdados da interface mãe.

Outro ponto importante foi a regra de visibilidade. Como os métodos da interface são públicos, a implementação na classe também precisa ser pública. Se eu deixar sem `public`, o método fica com acesso default, que é mais restritivo, e o código não compila.

Ponto principal para guardar:

```text
Método de interface é public abstract por padrão.
Classe que implementa precisa usar public no método implementado.
Interface pode estender interface.
```
