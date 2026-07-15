# Aula 03 — A Classe `Object` em Java

## 🎯 Objetivo da aula

Compreender o papel da classe `Object` na hierarquia do Java e entender por que uma referência do tipo `Object` pode apontar para qualquer objeto criado a partir de uma classe.

A aula também apresentou:

* herança direta e indireta de `Object`;
* uso de `Object` como tipo de referência;
* diferença entre o tipo da referência e o tipo real do objeto;
* limitação dos métodos acessíveis pela referência;
* conversão de tipos por meio de casting;
* duas formas de realizar o downcasting.

---

## 🌳 `Object`: a raiz da hierarquia de classes

Em Java, a classe `Object` está no topo da hierarquia de classes.

Toda classe herda de `Object` de forma:

* **direta**, quando não existe outra superclasse declarada;
* **indireta**, quando a classe herda de outra classe que, em algum ponto da hierarquia, herda de `Object`.

Exemplo:

```java
class Animal {
}
```

Mesmo sem escrever `extends Object`, a classe `Animal` herda diretamente de `Object`.

Para fins de compreensão, a declaração anterior equivale a:

```java
class Animal extends Object {
}
```

Escrever `extends Object` é permitido, mas normalmente é desnecessário porque essa relação já é implícita.

---

## 🔗 Herança direta e indireta

Considere a seguinte hierarquia:

```java
abstract class Animal {
    public abstract void fazerSom();
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
```

A hierarquia formada é:

```text
Object
└── Animal
    ├── Cachorro
    └── Gato
```

Nesse exemplo:

* `Animal` herda diretamente de `Object`;
* `Cachorro` herda diretamente de `Animal` e indiretamente de `Object`;
* `Gato` herda diretamente de `Animal` e indiretamente de `Object`.

Portanto, todo `Cachorro` e todo `Gato` também são objetos do tipo geral `Object`.

---

## 🔎 Ajuste importante sobre o compilador

Para explicar a herança implícita, é comum dizer que o compilador “coloca” `extends Object` na classe.

Essa frase ajuda a visualizar o conceito, mas o compilador não altera literalmente o arquivo-fonte. A explicação mais precisa é:

> Quando uma classe não declara outra superclasse, o Java considera `Object` como sua superclasse direta, com exceção da própria classe `Object`.

Assim, os dois exemplos representam a mesma relação de herança:

```java
class Animal {
}
```

```java
class Animal extends Object {
}
```

---

## 🧰 Métodos herdados de `Object`

A classe `Object` define comportamentos básicos disponíveis para os objetos Java.

Alguns métodos importantes são:

| Método | Finalidade geral |
|---|---|
| `toString()` | Retorna uma representação textual do objeto. |
| `equals(Object obj)` | Compara um objeto com outro. |
| `hashCode()` | Retorna um código numérico associado ao objeto. |
| `getClass()` | Informa a classe real do objeto em runtime. |

Esses métodos poderão ser estudados detalhadamente em aulas próprias. Neste momento, o importante é entender que eles existem porque todas as classes herdam de `Object`.

---

## 🦎 `Object` como tipo de referência polimórfica

Como `Object` está no topo da hierarquia, uma referência desse tipo pode apontar para objetos de diferentes classes:

```java
Object meuCachorro = new Cachorro();
Object meuGato = new Gato();
Object texto = "Java";
```

No exemplo principal:

```java
Object meuCachorro = new Cachorro();
```

* `Object` é o tipo da referência;
* `Cachorro` é o tipo real do objeto;
* a atribuição é válida porque `Cachorro` descende de `Object`.

Essa conversão de um tipo mais específico para um tipo mais geral ocorre de forma automática e é chamada de **upcasting**.

---

## 🚫 Por que `meuCachorro.fazerSom()` não compila?

Considere:

```java
Object meuCachorro = new Cachorro();
meuCachorro.fazerSom();
```

O objeto real é um `Cachorro`, mas a chamada de `fazerSom()` não compila.

Isso ocorre porque o compilador verifica quais métodos estão disponíveis por meio do **tipo da referência**. Como `Object` não declara `fazerSom()`, o compilador não permite essa chamada.

O erro será semelhante a:

```text
cannot find symbol
symbol: method fazerSom()
location: variable meuCachorro of type Object
```

Compare:

```java
Animal meuCachorro = new Cachorro();
meuCachorro.fazerSom();
```

Agora a chamada compila porque `Animal` declara o método `fazerSom()`. Em runtime, o Java executa a implementação sobrescrita por `Cachorro`.

---

## ⚖️ Tipo da referência e tipo real do objeto

Em:

```java
Object meuCachorro = new Cachorro();
```

cada tipo possui uma função diferente:

| Elemento | Tipo | Responsabilidade |
|---|---|---|
| Referência | `Object` | Determina os membros que podem ser acessados diretamente na compilação. |
| Objeto real | `Cachorro` | Determina a implementação executada quando existe um método sobrescrito acessível. |

Mesmo sabendo que o objeto real é um `Cachorro`, o compilador considera inicialmente o tipo declarado da referência.

---

## 🔄 Casting de `Object` para `Cachorro`

Para acessar um método exclusivo de `Cachorro` por meio da referência `Object`, é necessário realizar uma conversão explícita.

Essa conversão do tipo mais geral para o tipo mais específico é chamada de **downcasting**.

### Forma 1 — Criando uma nova referência

```java
Object meuCachorro = new Cachorro();

Cachorro objetoConvertido = (Cachorro) meuCachorro;
objetoConvertido.fazerSom();
```

Na linha:

```java
Cachorro objetoConvertido = (Cachorro) meuCachorro;
```

* `(Cachorro)` indica o tipo para o qual a referência será convertida;
* `meuCachorro` continua apontando para o mesmo objeto;
* não é criado um novo objeto `Cachorro`;
* é criada apenas outra referência para o objeto que já existe.

### Forma 2 — Convertendo e chamando o método diretamente

```java
Object meuCachorro = new Cachorro();

((Cachorro) meuCachorro).fazerSom();
```

Os parênteses são importantes:

```java
((Cachorro) meuCachorro)
```

Essa expressão passa a ser tratada como uma referência do tipo `Cachorro`. Em seguida, o método `fazerSom()` pode ser chamado.

As duas formas produzem o mesmo resultado:

```text
O cachorro faz au au
```

---

## 💻 Exemplo completo

```java
abstract class Animal {

    public abstract void fazerSom();
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
        Object meuCachorro = new Cachorro();

        Cachorro objetoConvertido = (Cachorro) meuCachorro;
        objetoConvertido.fazerSom();

        ((Cachorro) meuCachorro).fazerSom();
    }
}
```

### Saída esperada

```text
O cachorro faz au au
O cachorro faz au au
```

---

## ⚠️ O risco do downcasting incorreto

O compilador pode aceitar um casting que não corresponde ao tipo real do objeto:

```java
Object meuGato = new Gato();
Cachorro cachorro = (Cachorro) meuGato;
```

O código pode compilar porque a referência está declarada como `Object`, mas a conversão falhará durante a execução. O objeto real é um `Gato`, não um `Cachorro`.

O Java lançará uma exceção chamada:

```text
ClassCastException
```

Portanto, o casting não transforma o objeto. Ele apenas informa ao compilador que a referência deve ser tratada como determinado tipo. O tipo informado precisa ser compatível com o objeto real.

---

## 🛡️ Verificação com `instanceof`

Quando não existe certeza sobre o tipo real do objeto, é possível verificar antes de converter:

```java
if (meuCachorro instanceof Cachorro) {
    Cachorro cachorro = (Cachorro) meuCachorro;
    cachorro.fazerSom();
}
```

O operador `instanceof` verifica se o objeto é compatível com o tipo indicado.

Esse recurso será mais importante quando o programa trabalhar com referências que podem apontar para objetos de diferentes classes.

---

## ✅ Quando o casting é necessário?

O casting é necessário quando:

* a referência possui um tipo mais geral;
* o método desejado não está declarado nesse tipo geral;
* o objeto real é compatível com o tipo específico da conversão.

Entretanto, não é recomendável declarar tudo como `Object` sem necessidade.

Se o código precisa trabalhar com o comportamento `fazerSom()`, esta declaração é mais adequada:

```java
Animal animal = new Cachorro();
animal.fazerSom();
```

Ela é preferível a:

```java
Object animal = new Cachorro();
((Cachorro) animal).fazerSom();
```

Usar `Animal` mantém o polimorfismo e evita um casting desnecessário.

---

## ⚠️ Erros comuns

### 1. Pensar que `Object` possui todos os métodos das subclasses

`Object` pode referenciar qualquer objeto, mas sua declaração não contém métodos como `fazerSom()`.

### 2. Acreditar que o casting cria outro objeto

O casting não cria um novo `Cachorro`. Ele cria outra forma de referenciar o mesmo objeto.

### 3. Converter sem verificar o tipo real

Uma conversão incompatível pode causar `ClassCastException` em runtime.

### 4. Declarar tudo como `Object`

Embora seja permitido, usar `Object` pode esconder comportamentos importantes e exigir conversões desnecessárias.

### 5. Confundir casting com sobrescrita

* casting altera a maneira como uma referência é tratada;
* sobrescrita define qual implementação de um método será executada.

São conceitos relacionados ao polimorfismo, mas possuem funções diferentes.

---

## ✅ Boas práticas

* utilizar o tipo geral mais adequado ao comportamento necessário;
* evitar casting quando a superclasse ou interface já oferece o método desejado;
* verificar a compatibilidade antes de realizar um downcasting duvidoso;
* lembrar que o casting não altera o tipo real do objeto;
* manter explícita apenas a herança necessária — normalmente não é preciso escrever `extends Object`.

---

## 🧠 Principal aprendizado da aula

> Toda classe Java herda direta ou indiretamente de `Object`. Por isso, uma referência `Object` pode apontar para qualquer objeto criado a partir de uma classe, mas somente os membros conhecidos pelo tipo `Object` ficam diretamente acessíveis. Para acessar um comportamento específico da subclasse, pode ser necessário realizar um downcasting compatível com o tipo real do objeto.

Exemplo:

```java
Object meuCachorro = new Cachorro();
((Cachorro) meuCachorro).fazerSom();
```

O objeto sempre foi um `Cachorro`; o casting apenas permite que a referência seja tratada como `Cachorro` naquele ponto do código.
