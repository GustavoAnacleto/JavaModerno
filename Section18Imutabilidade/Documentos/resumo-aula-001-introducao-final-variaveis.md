# Aula 001 - Introdução à Imutabilidade e uso de `final` em variáveis

## 🎯 Objetivo da aula

Entender a ideia inicial de **imutabilidade em Java** e começar pelo uso da palavra-chave `final` aplicada a variáveis.

Nesta aula, o foco principal foi perceber que o Java oferece mecanismos para impedir certas alterações no código, como:

* impedir que uma variável receba outro valor;
* impedir que um método seja sobrescrito;
* impedir que uma classe seja herdada;
* proteger comportamentos importantes contra alterações indevidas.

## 🧠 Ideia principal da seção

Imutabilidade, de forma simples, significa tornar algo **fixo**, ou seja, algo que depois de definido não pode mais ser modificado.

No Java, essa ideia pode aparecer em diferentes contextos:

```text
Variável -> impedir nova atribuição
Método   -> impedir sobrescrita
Classe   -> impedir herança
Objeto   -> impedir alteração de estado
```

Nesta aula, o foco ficou principalmente em **variáveis finais**, usando a palavra-chave `final`.

## 🔑 O que é `final`?

A palavra-chave `final` é usada em Java para indicar que determinado elemento não poderá ser alterado depois da sua definição inicial.

Ela pode ser aplicada em:

* variáveis;
* métodos;
* classes.

Nesta aula, o professor mostrou principalmente o uso com **variáveis**.

## 📌 `final` aplicado a variáveis

Quando uma variável é declarada com `final`, ela só pode receber valor uma vez.

Exemplo:

```java
final int CODIGO_FIXO = 10;
```

Depois dessa atribuição, não é permitido alterar o valor:

```java
CODIGO_FIXO = 555; // erro de compilação
```

O compilador impede essa alteração, porque a variável foi marcada como `final`.

## 💻 Exemplo da aula

```java
class ExemploFinal {

    final int CODIGO_FIXO = 10;

    final void metodoFinal() {
        System.out.println("Este é um método final.");
    }
}

public class TesteFinalKeyword {

    public static void main(String[] args) {

        ExemploFinal testeFinal = new ExemploFinal();

        System.out.println("Valor da constante: " + testeFinal.CODIGO_FIXO);

        testeFinal.metodoFinal();

        // testeFinal.CODIGO_FIXO = 555;
        // Erro de compilação: não é possível alterar uma variável final.
    }
}
```

## 🧪 Teste com variável local

Também é possível usar `final` em uma variável local, ou seja, uma variável criada dentro de um método.

Exemplo:

```java
public class TesteFinalKeyword {

    public static void main(String[] args) {

        final int testeFinalVariavelLocal = 777;

        System.out.println("Valor da variável local: " + testeFinalVariavelLocal);

        // testeFinalVariavelLocal = 333;
        // Erro de compilação: variável final não pode receber outro valor.
    }
}
```

## ⚠️ Erro comum

Um erro comum é pensar que `final` sempre significa “imutabilidade completa”.

Na verdade, nesta aula o `final` está impedindo principalmente a **reatribuição** da variável.

Exemplo:

```java
final int numero = 10;
numero = 20; // erro
```

Como `int` é um tipo primitivo, o valor realmente fica fixo.

Mas, quando usamos `final` com objetos, o assunto exige mais cuidado. Uma referência final não pode apontar para outro objeto, mas o objeto ainda pode ser alterado se ele for mutável.

Esse ponto será aprofundado melhor nas próximas aulas.

## ✅ Boas práticas observadas

* Usar `final` quando uma variável não deve mudar.
* Usar nomes claros para variáveis.
* Para constantes, é comum usar letras maiúsculas com `_`, como `CODIGO_FIXO`.
* Testar tanto a compilação quanto a execução do programa.
* Deixar exemplos de erro comentados pode ajudar no aprendizado.

## 🧩 Relação com imutabilidade

Esta aula introduz a base da imutabilidade, mas ainda não trata de objeto imutável completo.

O principal aprendizado é:

```text
final impede uma nova atribuição.
```

Ou seja, depois que uma variável final recebe um valor, ela não pode receber outro.

Isso é uma parte importante do caminho para entender imutabilidade, mas uma classe ou objeto imutável envolve outros cuidados, como encapsulamento, atributos privados, ausência de setters e controle sobre objetos mutáveis internos.

## 🧱 Resumo final

A palavra-chave `final` é um mecanismo importante do Java para proteger partes do código contra alterações.

Nesta aula, foi visto que uma variável `final` não pode ter seu valor modificado depois da atribuição inicial.

Esse conceito será usado como base para entender imutabilidade de forma mais completa nas próximas aulas.

