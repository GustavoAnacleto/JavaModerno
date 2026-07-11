# Aula 169 - Métodos Default e Static em Interfaces

## 🎯 Objetivo da aula

Apresentar dois casos especiais de métodos em interfaces Java:

```text id="b5dxkg"
- métodos default;
- métodos static.
```

Até aqui, a ideia principal era que interfaces possuíam métodos abstratos, ou seja, métodos sem corpo, que deveriam ser implementados pelas classes.

Nesta aula, foi mostrado que interfaces também podem ter métodos com implementação.

## 🧠 Conceito principal

Em uma interface Java, podemos ter:

```text id="r5y2qt"
1. Métodos abstratos
2. Métodos default
3. Métodos static
```

Cada um tem um comportamento diferente.

```text id="19ixv4"
Método abstrato → não tem corpo e deve ser implementado pela classe.

Método default → tem corpo na interface e pode ser sobrescrito pela classe.

Método static → pertence à interface e deve ser chamado pelo nome da interface.
```

## 📌 Método abstrato em interface

O método abstrato é o tipo mais tradicional em uma interface.

Ele não possui corpo e termina com ponto e vírgula.

Exemplo:

```java id="hylpdg"
void metodoAbstrato();
```

Esse método precisa ser obrigatoriamente implementado por uma classe que implementa a interface.

## ✅ Método default

O método `default` possui implementação dentro da própria interface.

Exemplo:

```java id="b0v9p9"
default void metodoDefault() {
    System.out.println("Este é um método default na interface.");
}
```

Diferente do método abstrato, o método default tem corpo.

Ou seja, ele usa chaves:

```java id="gw24jn"
{
    // implementação
}
```

A classe que implementa a interface pode usar esse método diretamente, sem precisar sobrescrevê-lo.

Mas, se quiser, a classe também pode sobrescrever esse método.

## 🔁 Método default pode ser sobrescrito

Uma classe pode usar o comportamento padrão da interface ou criar sua própria implementação.

Exemplo:

```java id="agzz3h"
interface ExemploInterfaceEspecial {

    default void metodoDefault() {
        System.out.println("Este é um método default na interface.");
    }
}

class ExemploClasse implements ExemploInterfaceEspecial {

}
```

Nesse caso, `ExemploClasse` não implementou o método `metodoDefault()`, mas mesmo assim consegue usá-lo, porque ele já possui implementação na interface.

Também seria possível sobrescrever:

```java id="x0cfmn"
class ExemploClasse implements ExemploInterfaceEspecial {

    @Override
    public void metodoDefault() {
        System.out.println("Método default sobrescrito na classe.");
    }
}
```

## 🧩 Por que método default existe?

Os métodos default foram introduzidos para permitir adicionar novos métodos a interfaces sem quebrar todas as classes que já implementavam aquela interface.

Antes, se uma interface ganhasse um novo método abstrato, todas as classes que implementavam essa interface precisariam implementar esse novo método.

Com `default`, é possível adicionar um comportamento padrão.

```text id="tq1h4k"
Método default ajuda a evoluir uma interface sem obrigar todas as classes a mudarem imediatamente.
```

## ⚙️ Método static em interface

O método `static` pertence à própria interface.

Ele não pertence ao objeto criado a partir de uma classe que implementa a interface.

Exemplo:

```java id="i9rq1e"
static void metodoStatic() {
    System.out.println("Este é um método static na interface.");
}
```

Esse método deve ser chamado diretamente pelo nome da interface:

```java id="dkmsxi"
ExemploInterfaceEspecial.metodoStatic();
```

## ⚠️ Método static não pode ser sobrescrito

Diferente do método default, o método static da interface não é sobrescrito pelas classes que implementam a interface.

A chamada deve ser feita pela própria interface.

```text id="7xz7bo"
Método default → pode ser sobrescrito.

Método static → não é sobrescrito pela classe implementadora.
```

## 💻 Código completo da aula com boas práticas

```java id="dwgdng"
interface ExemploInterfaceEspecial {

    void metodoAbstrato();

    default void metodoDefault() {
        System.out.println("Este é um método default na interface.");
    }

    static void metodoStatic() {
        System.out.println("Este é um método static na interface.");
    }
}

class ExemploClasse implements ExemploInterfaceEspecial {

    @Override
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato.");
    }
}

public class TesteInterfaceEspecial {

    public static void main(String[] args) {

        ExemploClasse exemplo = new ExemploClasse();

        exemplo.metodoAbstrato();

        exemplo.metodoDefault();

        ExemploInterfaceEspecial.metodoStatic();
    }
}
```

## 🧪 Resultado esperado

```text id="9pt5r7"
Implementação do método abstrato.
Este é um método default na interface.
Este é um método static na interface.
```

## 🔎 Entendendo as chamadas

No método `main`, temos três chamadas diferentes.

Primeira chamada:

```java id="80wlyv"
exemplo.metodoAbstrato();
```

Esse método foi implementado dentro da classe `ExemploClasse`, porque era obrigatório.

Segunda chamada:

```java id="n03cs8"
exemplo.metodoDefault();
```

Esse método existe na interface, mas pode ser chamado pelo objeto da classe que implementa a interface.

Terceira chamada:

```java id="c9v5qf"
ExemploInterfaceEspecial.metodoStatic();
```

Esse método é chamado diretamente pela interface, porque é `static`.

## 📌 Diferença entre os três tipos de método

```text id="6hqd6c"
Método abstrato:
- não tem corpo;
- termina com ponto e vírgula;
- a classe é obrigada a implementar.

Método default:
- tem corpo;
- fica dentro da interface;
- a classe pode usar como está;
- a classe pode sobrescrever, se quiser.

Método static:
- tem corpo;
- pertence à interface;
- é chamado pelo nome da interface;
- não é sobrescrito pela classe.
```

## ⚠️ Correção importante da transcrição

Na transcrição apareceu a palavra “aesthetics”, mas o termo correto no contexto da aula é:

```text id="c6u3pc"
static
```

Então, sempre que aparecer algo como “métodos aesthetics”, o correto é entender como:

```text id="kxlrks"
métodos static
```

Isso provavelmente foi apenas erro da transcrição automática.

## 🧱 Ligação com os conceitos anteriores

Essa aula complementa o que foi visto nas aulas anteriores.

Antes, a regra principal era:

```text id="0qbc4f"
Métodos de interface são public abstract por padrão.
```

Agora entra uma observação importante:

```text id="c7z24l"
Isso vale para métodos abstratos tradicionais.

Mas interfaces também podem ter métodos default e static com corpo.
```

Então, a ideia correta fica mais completa:

```text id="it8bbz"
Interface pode ter métodos abstratos, métodos default e métodos static.
```

## 🔗 Ligação com Java back-end

No Java back-end, métodos default podem aparecer em interfaces quando se quer fornecer um comportamento padrão.

Por exemplo, uma interface poderia ter um método obrigatório e outro método auxiliar com comportamento padrão.

Exemplo simples:

```java id="5t0qae"
interface Relatorio {

    void gerar();

    default void imprimirCabecalho() {
        System.out.println("Relatório do sistema");
    }
}
```

A classe que implementa `Relatorio` seria obrigada a implementar `gerar()`, mas poderia usar `imprimirCabecalho()` como está.

Métodos static em interfaces podem ser usados como métodos auxiliares ligados ao próprio contrato da interface.

Neste momento, o importante é entender a base, sem avançar para arquitetura ou frameworks.

## ⚠️ Erros comuns

Alguns erros comuns nessa aula:

```text id="eo7lf5"
- achar que todo método de interface precisa ser abstrato;
- esquecer que método default tem corpo;
- tentar finalizar método default com ponto e vírgula sem corpo;
- achar que método static pode ser sobrescrito;
- chamar método static pelo objeto em vez de chamar pela interface;
- esquecer de implementar o método abstrato obrigatório;
- confundir método default com método comum de classe.
```

## 🧱 Resumo rápido para revisão

```text id="ope3ys"
Interface pode ter método abstrato, default e static.

Método abstrato não tem corpo e deve ser implementado pela classe.

Método default tem corpo e fornece uma implementação padrão.

A classe pode sobrescrever um método default, mas não é obrigada.

Método static pertence à interface.

Método static deve ser chamado pelo nome da interface.

Método static de interface não é sobrescrito pela classe implementadora.
```

## 📝 Anotação pessoal

Nesta aula, entendi que interfaces em Java não ficam limitadas apenas a métodos abstratos.

Também existem métodos `default` e `static`.

O método `default` tem implementação dentro da interface e pode ser usado pela classe que implementa essa interface. A classe pode sobrescrever esse método se precisar, mas não é obrigada.

O método `static` também tem implementação, mas pertence à interface. Por isso, ele deve ser chamado diretamente pelo nome da interface.

Ponto principal para guardar:

```text id="jye6xc"
Método abstrato obriga implementação.
Método default oferece implementação padrão.
Método static pertence à interface.
```
