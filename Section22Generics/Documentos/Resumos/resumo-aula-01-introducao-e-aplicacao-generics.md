# 📦 Introdução e aplicação de Generics em Java

> **Aulas 196 a 199 — Seção 22: Generics**

## 🎯 Objetivo

Compreender o problema que Generics resolve, aprender a criar uma classe genérica com `<T>` e reutilizar a mesma estrutura com tipos diferentes, mantendo a segurança de tipos durante a compilação.

## 🧠 O que é Generics?

Generics é um recurso introduzido no Java 5 que permite criar classes, interfaces e métodos capazes de trabalhar com diferentes tipos de objetos.

A ideia pode ser comparada a uma caixa. A estrutura e o comportamento da caixa continuam iguais, mas, ao utilizá-la, definimos o tipo de objeto que poderá ser guardado nela.

```java
Caixa<String> caixaDeTexto = new Caixa<>();
Caixa<Integer> caixaDeNumeros = new Caixa<>();
```

As duas variáveis utilizam a mesma classe `Caixa`, mas cada caixa possui um tipo definido:

- `caixaDeTexto` aceita e retorna `String`;
- `caixaDeNumeros` aceita e retorna `Integer`.

## 🛡️ Segurança de tipos

Sem a definição antecipada do tipo, um objeto poderia ser recuperado como um tipo diferente daquele que foi armazenado, provocando um erro somente durante a execução.

Generics permite que o compilador verifique determinadas incompatibilidades antes de o programa ser executado.

```java
Caixa<String> caixaDeTexto = new Caixa<>();

caixaDeTexto.guardar("Java"); // correto
caixaDeTexto.guardar(10);     // erro de compilação
```

Isso não significa que Generics elimina todos os erros de runtime. Ele ajuda especificamente a impedir usos incompatíveis de tipos e reduz a necessidade de casting manual.

## 🧩 Criando uma classe genérica

Uma classe genérica pode ser declarada assim:

```java
public class Caixa<T> {

    private T coisaNaCaixa;

    public void guardar(T coisa) {
        coisaNaCaixa = coisa;
    }

    public T pegar() {
        return coisaNaCaixa;
    }
}
```

O símbolo `<T>` declara um parâmetro de tipo.

Por convenção, utiliza-se a letra `T`, que representa *type* (tipo), mas outro identificador também poderia ser utilizado.

Dentro da classe, `T` aparece em três pontos importantes:

| Trecho | Função |
|---|---|
| `class Caixa<T>` | Declara que a classe possui um tipo genérico |
| `private T coisaNaCaixa` | Define o tipo do atributo |
| `guardar(T coisa)` | Define o tipo aceito pelo método |
| `public T pegar()` | Define o tipo devolvido pelo método |

## 📝 Criando uma caixa de textos

```java
Caixa<String> caixaDeTexto = new Caixa<>();

caixaDeTexto.guardar("Olá, mundo!");

String texto = caixaDeTexto.pegar();

System.out.println(texto);
```

Saída:

```text
Olá, mundo!
```

Ao declarar `Caixa<String>`, informamos ao compilador que, para esse objeto, o `T` representa `String`.

O operador `<>` utilizado na criação do objeto é chamado de **operador diamante**. O compilador deduz o tipo a partir da declaração feita no lado esquerdo.

## 🔢 Reutilizando a classe com números

A mesma classe também pode ser utilizada para guardar números inteiros:

```java
Caixa<Integer> caixaDeNumeros = new Caixa<>();

Integer numero = Integer.valueOf(3);
caixaDeNumeros.guardar(numero);

Integer valorResgatado = caixaDeNumeros.pegar();

System.out.println(valorResgatado);
```

Saída:

```text
3
```

Não foi necessário alterar a implementação da classe `Caixa`. Apenas definimos um tipo diferente no momento de utilizá-la.

Esse exemplo demonstra um benefício central de Generics: **reutilizar o mesmo código com diferentes tipos de objetos**.

## 🔄 Tipos primitivos e classes wrapper

Generics trabalha com tipos de referência e não aceita tipos primitivos diretamente.

Por isso, não podemos escrever:

```java
Caixa<int> caixaDeNumeros; // incorreto
```

Devemos utilizar a classe wrapper correspondente:

```java
Caixa<Integer> caixaDeNumeros; // correto
```

Algumas correspondências importantes são:

| Tipo primitivo | Classe wrapper |
|---|---|
| `int` | `Integer` |
| `long` | `Long` |
| `double` | `Double` |
| `float` | `Float` |
| `byte` | `Byte` |
| `short` | `Short` |
| `boolean` | `Boolean` |
| `char` | `Character` |

`String` não é uma classe wrapper. Ela já é uma classe e, por isso, pode ser utilizada diretamente como tipo genérico.

## ⚠️ Construtor obsoleto de `Integer`

Durante a aula, foi utilizado inicialmente:

```java
Integer numero = new Integer(3);
```

O código ainda podia ser compilado, mas o compilador apresentava um aviso porque esse construtor está obsoleto (*deprecated*) e não deve ser utilizado em códigos atuais.

A forma adequada apresentada foi:

```java
Integer numero = Integer.valueOf(3);
```

`valueOf()` é um método estático que devolve um objeto `Integer`. Diferentemente do construtor, ele não obriga a criação de um novo objeto e pode reutilizar uma instância existente.

Também é possível escrever:

```java
caixaDeNumeros.guardar(3);
```

Nesse caso, o Java converte automaticamente o `int` para `Integer`. Esse processo é chamado de **autoboxing**.

## 🔗 Relação com polimorfismo e casting

Quando uma estrutura utiliza `Object`, ela pode receber objetos de várias classes, mas normalmente precisamos verificar o tipo real e realizar casting para recuperar os métodos específicos.

Com Generics, o tipo é informado antecipadamente:

```java
Caixa<String> caixaDeTexto = new Caixa<>();
```

O método `pegar()` já devolve uma `String`:

```java
String texto = caixaDeTexto.pegar();
```

Assim, o código fica mais seguro, mais claro e com menos conversões manuais.

## ❌ Erros comuns

- Tentar utilizar um tipo primitivo em `<T>`:

```java
Caixa<double> caixa; // incorreto
```

- Guardar um tipo diferente daquele definido para a caixa:

```java
Caixa<String> caixa = new Caixa<>();
caixa.guardar(10); // incorreto
```

- Pensar que `T` é uma variável comum. Ele representa um tipo.
- Acreditar que a caixa se transforma no objeto armazenado. Ela continua sendo uma `Caixa`, parametrizada para trabalhar com determinado tipo.
- Utilizar construtores obsoletos, como `new Integer(3)`.

## ✅ Boas práticas

- Definir claramente o tipo ao declarar a estrutura genérica.
- Utilizar classes wrapper quando for necessário representar tipos primitivos.
- Preferir `Integer.valueOf()` ou autoboxing no lugar de `new Integer()`.
- Usar nomes claros para os objetos, como `caixaDeTexto` e `caixaDeNumeros`.
- Utilizar Generics quando o comportamento é o mesmo, mas o tipo do dado pode variar.

## 💡 Principal aprendizado

> Generics permite criar uma estrutura reutilizável e definir, no momento de sua utilização, qual tipo ela aceitará e devolverá. Com isso, o compilador consegue impedir tipos incompatíveis, o retorno já possui o tipo esperado e a necessidade de casting é reduzida.

