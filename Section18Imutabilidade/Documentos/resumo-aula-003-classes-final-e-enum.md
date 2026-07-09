# Aula 003 - Classes `final` e introdução a `enum`

## 🎯 Objetivo da aula

Entender como a palavra-chave `final` funciona quando aplicada a classes e conhecer uma introdução ao conceito de `enum` em Java.

Nesta aula, foram estudados dois pontos principais:

* classe `final`;
* introdução a `enum`.

## 🧱 Classe `final`

Uma classe declarada como `final` não pode ser herdada.

Isso significa que nenhuma outra classe poderá usar `extends` para criar uma subclasse a partir dela.

Exemplo:

```java
final class MinhaClasseFinal {

    void exibirMensagem() {
        System.out.println("Esta é uma classe final.");
    }
}
```

Se outra classe tentar herdar dela, ocorrerá erro de compilação:

```java
class MinhaSubclasse extends MinhaClasseFinal {
}
```

Esse código não compila, porque `MinhaClasseFinal` foi declarada como `final`.

## ❌ Exemplo de erro

```java
final class ExemploFinal {

    void meuMetodo() {
        System.out.println("Método da classe final.");
    }
}

public class TesteFinalKeyword extends ExemploFinal {

    public static void main(String[] args) {

        TesteFinalKeyword teste = new TesteFinalKeyword();

        teste.meuMetodo();
    }
}
```

Esse código gera erro de compilação porque a classe `ExemploFinal` é `final` e não pode ser estendida.

## 🔒 Para que serve uma classe `final`?

Uma classe `final` é útil quando queremos impedir que outras classes herdem dela e alterem seu comportamento por meio de herança.

Isso ajuda a manter determinada classe como uma entidade fechada para extensão.

A ideia é:

```text
Quem quiser usar a classe, pode usar.
Mas ninguém pode herdar dela para modificar seu comportamento.
```

Isso pode ajudar a manter mais controle e ordem no código.

## ⚠️ Observação importante

Uma classe `final` não significa, sozinha, que seus objetos são imutáveis.

Exemplo:

```java
final class Produto {

    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

A classe `Produto` não pode ser herdada, porque é `final`.

Mas o objeto ainda pode ser alterado, porque existe um método `setNome()`.

Portanto:

```text
Classe final -> impede herança.
Objeto imutável -> impede alteração de estado depois da criação.
```

São conceitos relacionados, mas não são a mesma coisa.

## 🔁 Revisão do uso de `final`

Até aqui, vimos três usos principais da palavra-chave `final`:

```text
final em variável -> impede nova atribuição.
final em método   -> impede sobrescrita.
final em classe   -> impede herança.
```

Cada uso protege uma parte diferente do código.

## 🧩 Introdução a `enum`

`enum`, ou enumeração, é um tipo especial em Java usado para representar um conjunto fixo de valores constantes.

Em vez de usar `class`, usamos a palavra-chave `enum`.

Exemplo:

```java
enum DiaDaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}
```

Nesse exemplo, `DiaDaSemana` só pode assumir um dos valores definidos no próprio `enum`.

## 💻 Exemplo de uso de `enum`

```java
enum DiaDaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}

public class ExemploEnum {

    public static void main(String[] args) {

        DiaDaSemana dia = DiaDaSemana.SEGUNDA;

        System.out.println("Hoje é " + dia);
    }
}
```

Saída:

```text
Hoje é SEGUNDA
```

## 📌 O que acontece nesse exemplo?

A variável `dia` é do tipo `DiaDaSemana`.

Isso significa que ela só pode receber valores definidos dentro do `enum`.

Exemplo válido:

```java
DiaDaSemana dia = DiaDaSemana.SEGUNDA;
```

Exemplo inválido:

```java
DiaDaSemana dia = "segunda";
```

Esse segundo exemplo não funciona, porque `"segunda"` é uma `String`, não um valor do enum `DiaDaSemana`.

## ⚠️ Observação sobre nomes com acento

Embora o Java aceite alguns caracteres Unicode em identificadores, como letras com acento, é melhor evitar acentos em nomes de constantes, classes, métodos e variáveis.

Por isso, é mais seguro usar:

```java
TERCA
SABADO
```

Em vez de:

```java
TERÇA
SÁBADO
```

Essa escolha melhora a compatibilidade, evita problemas de codificação e segue uma prática mais comum no mercado.

## 🧠 Relação entre `enum` e constantes

Os valores definidos em um `enum` funcionam como constantes.

Por exemplo:

```java
DiaDaSemana.SEGUNDA
DiaDaSemana.TERCA
DiaDaSemana.QUARTA
```

Cada um desses valores representa uma opção fixa dentro do tipo `DiaDaSemana`.

Na prática, `enum` é muito útil quando temos uma lista fechada de opções.

Exemplos:

```text
Dias da semana
Meses do ano
Status de um pedido
Tipos de usuário
Níveis de prioridade
Estados de uma venda
```

## 🧩 Relação futura com Java back-end

Em Java back-end, `enum` aparece bastante para representar valores fixos de domínio.

Exemplo simples:

```java
enum StatusPedido {
    PENDENTE,
    PAGO,
    CANCELADO
}
```

Isso evita o uso de textos soltos como:

```java
String status = "pago";
```

Usar `enum` ajuda a reduzir erros de digitação e deixa o código mais seguro.

Mas, por enquanto, basta entender que `enum` representa um conjunto fixo de constantes.

## ✅ Boas práticas observadas

* Usar `final` em classe quando ela não deve ser herdada.
* Entender que classe `final` impede herança, não necessariamente alteração de estado.
* Usar nomes de constantes em letras maiúsculas.
* Separar palavras com `_` em constantes comuns.
* Em `enum`, também usar nomes em maiúsculas.
* Evitar acentos em identificadores Java.
* Usar `enum` quando existe um conjunto fixo de opções.

## 🧱 Resumo final

Nesta aula, foi visto que uma classe `final` não pode ser estendida.

Isso impede que outras classes herdem dela e modifiquem seu comportamento por meio de sobrescrita de métodos.

Também foi apresentada uma introdução a `enum`, que é usado para representar conjuntos fixos de valores constantes.

O principal aprendizado da aula é:

```text
final em classe impede herança.
enum representa um conjunto fixo de valores.
```

Esses conceitos ajudam a escrever códigos mais controlados, previsíveis e organizados.
