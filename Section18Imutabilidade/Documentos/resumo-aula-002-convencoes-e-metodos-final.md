# Aula 002 - Convenções de constantes e métodos `final`

## 🎯 Objetivo da aula

Entender as convenções de nomenclatura usadas para constantes em Java e aprender como a palavra-chave `final` funciona quando aplicada a métodos.

Nesta aula, foram reforçados dois pontos importantes:

* como nomear constantes corretamente;
* como impedir que um método seja sobrescrito em uma subclasse.

## 🔠 Convenção de nomes para constantes

Em Java, constantes seguem uma convenção diferente das variáveis comuns.

Variáveis comuns normalmente usam `camelCase`:

```java
int quantidadeProdutos;
double taxaJuros;
String nomeCliente;
```

Já constantes costumam ser escritas com letras maiúsculas e palavras separadas por `_`:

```java
final int CODIGO_FIXO = 10;
final double TAXA_DE_JUROS = 0.05;
final String NOME_SISTEMA = "Sistema Java";
```

## 📌 Regras de nomeação

Os nomes em Java precisam seguir algumas regras:

* podem conter letras, números, `_` e `$`;
* não podem começar com número;
* não podem usar palavras reservadas da linguagem;
* devem ser únicos dentro do mesmo escopo.

Exemplos válidos:

```java
final int CODIGO_FIXO = 10;
final int _CODIGO = 20;
final int CODIGO_123 = 30;
```

Exemplos inválidos:

```java
final int 123CODIGO = 10; // inválido: começa com número
final int class = 20;     // inválido: class é palavra reservada
```

## ⚠️ Observação sobre `$`

Apesar de o Java permitir o uso de `$` em nomes, isso não é uma boa prática para código comum.

Na prática, é melhor usar nomes simples e claros:

```java
final int CODIGO_FIXO = 10;
```

Em vez de:

```java
final int CODIGO$FIXO = 10;
```

## 🧠 `final` aplicado a métodos

Um método declarado como `final` não pode ser sobrescrito por uma subclasse.

Isso significa que uma classe filha pode herdar o método, mas não pode alterar o comportamento dele usando `@Override`.

Exemplo:

```java
class ExemploFinal {

    final void meuMetodo() {
        System.out.println("Este é um método final.");
    }
}
```

Nesse caso, qualquer classe que herdar de `ExemploFinal` poderá usar o método `meuMetodo()`, mas não poderá sobrescrevê-lo.

## 💻 Exemplo com herança

```java
class ExemploFinal {

    final void meuMetodo() {
        System.out.println("Este é um método final.");
    }
}

public class TesteFinalKeyword extends ExemploFinal {

    public static void main(String[] args) {

        TesteFinalKeyword teste = new TesteFinalKeyword();

        teste.meuMetodo();
    }
}
```

Esse código funciona normalmente, porque a subclasse apenas herda e usa o método final.

## ❌ Tentativa de sobrescrita

Agora, se a subclasse tentar sobrescrever o método, ocorrerá erro de compilação:

```java
class ExemploFinal {

    final void meuMetodo() {
        System.out.println("Este é um método final.");
    }
}

public class TesteFinalKeyword extends ExemploFinal {

    @Override
    void meuMetodo() {
        System.out.println("Método sobrescrito.");
    }

    public static void main(String[] args) {

        TesteFinalKeyword teste = new TesteFinalKeyword();

        teste.meuMetodo();
    }
}
```

Esse código não compila, porque `meuMetodo()` foi declarado como `final` na classe pai.

## 🧩 Relação com `@Override`

Na seção anterior, foi estudado que `@Override` serve para indicar ao compilador que um método está sendo sobrescrito.

Aqui, o compilador identifica que existe uma tentativa de sobrescrever um método `final`, e por isso gera erro.

Ou seja:

```text
@Override confirma a intenção de sobrescrever.
final impede a sobrescrita.
```

Se os dois aparecem juntos nesse caso, o compilador bloqueia a operação.

## ✅ Quando usar método `final`?

Um método `final` pode ser usado quando você quer garantir que determinado comportamento não seja alterado por subclasses.

Exemplo de ideia:

```text
Uma classe pai possui um método com uma regra importante.
As classes filhas podem herdar esse método.
Mas nenhuma classe filha pode mudar essa regra.
```

Isso ajuda a proteger comportamentos importantes dentro do código.

## ⚠️ Cuidado importante

Nem todo método precisa ser `final`.

Usar `final` em excesso pode deixar o código rígido demais e dificultar reaproveitamento por herança.

O ideal é usar quando realmente existir uma regra que não deve ser modificada.

## 🧱 Resumo final

Nesta aula, foi visto que constantes em Java seguem a convenção de letras maiúsculas com palavras separadas por `_`.

Também foi estudado que um método `final` não pode ser sobrescrito por uma subclasse.

O principal aprendizado é:

```text
final em variável -> impede nova atribuição.
final em método   -> impede sobrescrita.
```

Esse conceito reforça a ideia de controle e proteção do comportamento do código, que é uma das bases para entender imutabilidade em Java.
