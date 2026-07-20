# 🧸 Modelo com `Object` versus modelo com Generics

> **Aulas 200 a 202 — Seção 22: Generics**

## 🎯 Objetivo

Compreender como estruturas reutilizáveis eram implementadas com `Object`, `instanceof` e casting, além de comparar esse modelo com uma classe genérica que oferece segurança de tipos durante a compilação.

## 🧩 Preparação do exemplo

Para demonstrar os dois modelos, foram criadas as classes `Carrinho` e `Boneca`.

```java
class Carrinho {

    private String modelo;

    public Carrinho(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}

class Boneca {

    private String nome;

    public Boneca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
```

A classe principal instancia diretamente os dois tipos:

```java
public class Brinquedos {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho("Hot Wheels");
        Boneca boneca = new Boneca("Barbie");

        System.out.println("Carrinho: " + carrinho.getModelo());
        System.out.println("Boneca: " + boneca.getNome());
    }
}
```

Nesse primeiro momento, cada referência possui o mesmo tipo do objeto criado. Por isso, os métodos `getModelo()` e `getNome()` ficam disponíveis diretamente.

## 📦 Criando uma caixa reutilizável sem Generics

Antes de Generics, uma forma de criar uma estrutura capaz de guardar objetos de classes diferentes era utilizar `Object`.

```java
public class CaixaBrinquedos {

    private Object coisaNaCaixa;

    public void guardar(Object coisa) {
        coisaNaCaixa = coisa;
    }

    public Object pegar() {
        return coisaNaCaixa;
    }
}
```

Como todas as classes Java herdam direta ou indiretamente de `Object`, o método `guardar()` pode receber tanto um `Carrinho` quanto uma `Boneca`.

```java
CaixaBrinquedos caixaCarrinhos = new CaixaBrinquedos();
caixaCarrinhos.guardar(new Carrinho("Hot Wheels"));

CaixaBrinquedos caixaBonecas = new CaixaBrinquedos();
caixaBonecas.guardar(new Boneca("Barbie"));
```

Os objetos mantêm seus tipos reais:

- o primeiro objeto continua sendo um `Carrinho`;
- o segundo objeto continua sendo uma `Boneca`.

Entretanto, eles ficam armazenados e são devolvidos por referências do tipo `Object`.

## 🔍 Recuperando o tipo específico

O método `pegar()` foi declarado para retornar `Object`:

```java
public Object pegar() {
    return coisaNaCaixa;
}
```

Por isso, esta chamada não é permitida:

```java
caixaCarrinhos.pegar().getModelo(); // erro de compilação
```

O compilador enxerga o retorno como `Object`, e a classe `Object` não possui o método `getModelo()`.

Para recuperar os métodos específicos, são necessárias duas etapas:

1. verificar o tipo real com `instanceof`;
2. realizar o casting para o tipo específico.

### Verificação e casting de `Carrinho`

```java
if (caixaCarrinhos.pegar() instanceof Carrinho) {
    Carrinho carrinho = (Carrinho) caixaCarrinhos.pegar();
    System.out.println(carrinho.getModelo());
}
```

### Verificação e casting de `Boneca`

```java
if (caixaBonecas.pegar() instanceof Boneca) {
    Boneca boneca = (Boneca) caixaBonecas.pegar();
    System.out.println(boneca.getNome());
}
```

## ❓ O que faz o `instanceof`?

O operador `instanceof` verifica o tipo real do objeto durante a execução.

```java
caixaCarrinhos.pegar() instanceof Carrinho
```

Essa expressão pergunta:

> O objeto devolvido pela caixa é realmente uma instância de `Carrinho`?

O resultado será `true` ou `false`. Se a referência contiver `null`, o resultado também será `false`.

## 🔄 O que faz o casting?

O casting permite tratar uma referência geral como uma referência de um tipo mais específico.

```java
Carrinho carrinho = (Carrinho) caixaCarrinhos.pegar();
```

Nessa linha:

- `pegar()` devolve uma referência do tipo `Object`;
- `(Carrinho)` realiza o casting;
- a nova referência permite acessar os métodos de `Carrinho`.

O casting não transforma o objeto. Ele já era um `Carrinho`; apenas estava sendo acessado por uma referência do tipo `Object`.

## ⚠️ Risco do casting incorreto

Uma caixa baseada em `Object` aceita qualquer objeto. Portanto, o compilador permite situações perigosas:

```java
CaixaBrinquedos caixa = new CaixaBrinquedos();
caixa.guardar(new Boneca("Barbie"));

Carrinho carrinho = (Carrinho) caixa.pegar();
```

O código pode compilar porque o retorno é `Object`, mas o objeto real é uma `Boneca`. Durante a execução ocorrerá:

```text
ClassCastException
```

O `instanceof` reduz esse risco ao verificar o tipo antes do casting.

## 🧬 Criando o modelo com Generics

Com Generics, a classe recebe um parâmetro de tipo `<T>`:

```java
public class CaixaGenerica<T> {

    private T coisaNaCaixa;

    public void guardar(T coisa) {
        coisaNaCaixa = coisa;
    }

    public T pegar() {
        return coisaNaCaixa;
    }
}
```

O `T` representa o tipo que será escolhido quando a caixa for utilizada.

## 🚗 Caixa de carrinhos

```java
CaixaGenerica<Carrinho> caixaCarrinhos = new CaixaGenerica<>();

caixaCarrinhos.guardar(new Carrinho("Nascar"));

Carrinho carrinho = caixaCarrinhos.pegar();

System.out.println(carrinho.getModelo());
```

Ao declarar `CaixaGenerica<Carrinho>`, o compilador passa a controlar que:

- o método `guardar()` recebe `Carrinho`;
- o método `pegar()` devolve `Carrinho`.

## 🎎 Caixa de bonecas

```java
CaixaGenerica<Boneca> caixaBonecas = new CaixaGenerica<>();

caixaBonecas.guardar(new Boneca("Branca de Neve"));

Boneca boneca = caixaBonecas.pegar();

System.out.println(boneca.getNome());
```

Nesse objeto, o `T` representa `Boneca`. A mesma classe genérica é reutilizada sem alterações.

## 🛡️ Verificação durante a compilação

Depois de definir uma caixa de carrinhos, o compilador impede que uma boneca seja armazenada nela:

```java
CaixaGenerica<Carrinho> caixaCarrinhos = new CaixaGenerica<>();

caixaCarrinhos.guardar(new Boneca("Barbie")); // erro de compilação
```

O problema é identificado antes da execução porque o tipo permitido foi definido como `Carrinho`.

## 📊 Comparação dos modelos

| Modelo com `Object` | Modelo com Generics |
|---|---|
| A caixa aceita qualquer objeto | Cada caixa aceita o tipo definido em `<T>` |
| `pegar()` retorna `Object` | `pegar()` retorna o tipo específico |
| Exige verificação com `instanceof` | O compilador controla o tipo |
| Exige casting manual | Normalmente dispensa casting |
| Um erro pode aparecer em runtime | Tipos incompatíveis são rejeitados na compilação |
| O código fica mais extenso | O código fica mais conciso e legível |

## 🔗 Relação com polimorfismo

No modelo antigo, esta operação é possível por causa do polimorfismo:

```java
Object objeto = new Carrinho("Hot Wheels");
```

A referência é do tipo `Object`, mas o objeto real é um `Carrinho`. O problema não está no polimorfismo, e sim na possibilidade de realizar posteriormente um casting para o tipo errado.

Generics acrescenta uma regra de tipo à estrutura e permite que o compilador impeça combinações incompatíveis.

## ❌ Erros comuns

- Pensar que o objeto deixa de ser `Carrinho` quando é armazenado como `Object`.
- Acreditar que `instanceof` realiza a conversão. Ele apenas verifica o tipo.
- Fazer casting sem ter certeza do tipo real do objeto.
- Esquecer de informar o tipo ao utilizar uma classe genérica.
- Acreditar que `T` é uma variável comum. Ele representa um tipo.
- Tentar guardar uma `Boneca` em uma `CaixaGenerica<Carrinho>`.

## ✅ Boas práticas

- Utilizar `instanceof` antes de um casting quando o tipo real não for conhecido.
- Evitar casting desnecessário quando o tipo puder ser definido antecipadamente.
- Utilizar Generics para estruturas cujo comportamento permanece igual, mas cujo tipo armazenado pode variar.
- Escolher nomes claros, como `caixaCarrinhos` e `caixaBonecas`.
- Manter a segurança de tipos sempre que a linguagem permitir.

## 💡 Principal aprendizado

> O modelo com `Object` permite guardar objetos diferentes, mas devolve uma referência geral e exige `instanceof` e casting para recuperar os métodos específicos. Com Generics, o tipo é definido antecipadamente, o compilador impede usos incompatíveis e o método `pegar()` já devolve o tipo correto.

