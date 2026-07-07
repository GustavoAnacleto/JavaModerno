# 📘 Resumo Aula 003 - Sobrescrita de Métodos em Java

## 🎯 Tema da aula

Sobrescrita de métodos em Java, também chamada de **method overriding**.

Nesta aula, o professor mostrou que uma subclasse pode fornecer sua própria implementação para um método que já existe na superclasse.

---

## 🧠 Ideia principal

Quando uma classe filha herda de uma classe mãe, ela pode reaproveitar métodos da superclasse.

Mas, em alguns casos, a classe filha precisa ter um comportamento próprio.

Para isso, usamos a **sobrescrita de métodos**.

Em outras palavras:

```text
A subclasse redefine um método que já existe na superclasse.
```

---

## 🧬 Exemplo da aula

A estrutura usada foi:

```text
Animal
 └── Cachorro
```

Ou seja:

```text
Cachorro é um Animal.
```

A classe `Animal` possui um método chamado `fazerSom()`.

A classe `Cachorro` também possui um método chamado `fazerSom()`.

O nome é o mesmo, mas a implementação é diferente.

---

## 💻 Código base da aula

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

public class TesteHeranca {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();

        dog.fazerSom();
    }
}
```

---

## 📤 Saída esperada

```text
O cachorro late.
```

---

## 🔎 Explicação do código

A classe `Animal` possui este método:

```java
public void fazerSom() {
    System.out.println("O animal faz um som.");
}
```

A classe `Cachorro` também possui um método com o mesmo nome:

```java
public void fazerSom() {
    System.out.println("O cachorro late.");
}
```

Como `Cachorro` herda de `Animal`, mas também possui sua própria versão do método `fazerSom()`, o Java executa o método da subclasse.

Ou seja, ao chamar:

```java
dog.fazerSom();
```

o Java procura primeiro o método dentro da classe `Cachorro`.

Como encontra o método na subclasse, ele executa essa versão.

Por isso a saída é:

```text
O cachorro late.
```

---

## 🧭 Ordem de procura do método

Quando o objeto é da classe `Cachorro` e chamamos:

```java
dog.fazerSom();
```

O Java segue esta lógica:

```text
1. Procura o método fazerSom() na classe Cachorro.
2. Se encontrar, executa o método da classe Cachorro.
3. Se não encontrar, procura na superclasse Animal.
4. Se encontrar na superclasse, executa o método herdado.
```

No caso da sobrescrita, o método existe nas duas classes.

Por isso, o método da subclasse tem prioridade.

---

## 🧩 O que é sobrescrita?

Sobrescrita acontece quando a subclasse cria um método com a mesma assinatura de um método da superclasse.

A assinatura precisa respeitar:

```text
mesmo nome;
mesmo tipo de retorno;
mesma lista de parâmetros;
mesma ordem dos parâmetros.
```

Exemplo correto de sobrescrita:

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
```

Aqui temos sobrescrita porque os dois métodos têm:

```text
mesmo nome: fazerSom
mesmo retorno: void
mesmos parâmetros: nenhum parâmetro
```

---

## ⚠️ Cuidado com os parâmetros

A lista de parâmetros precisa ser igual.

Exemplo com sobrescrita válida:

```java
class Animal {

    public void fazerSom(int numero, String texto) {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    public void fazerSom(int numero, String texto) {
        System.out.println("O cachorro late.");
    }
}
```

Nesse caso, existe sobrescrita porque os parâmetros são iguais:

```text
int, String
```

---

## ❌ Quando não é sobrescrita

Se a ordem dos parâmetros mudar, não é sobrescrita.

Exemplo:

```java
class Animal {

    public void fazerSom(int numero, String texto) {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    public void fazerSom(String texto, int numero) {
        System.out.println("O cachorro late.");
    }
}
```

Nesse caso, os métodos têm o mesmo nome, mas a lista de parâmetros é diferente.

Na superclasse:

```text
int, String
```

Na subclasse:

```text
String, int
```

Portanto, isso não é sobrescrita.

Esse caso fica parecido com uma **sobrecarga de métodos**, porque existem métodos com o mesmo nome, mas com parâmetros diferentes.

---

## 🔁 Diferença entre sobrescrita e sobrecarga

## 🧬 Sobrescrita

Acontece entre superclasse e subclasse.

O método da subclasse substitui o comportamento do método da superclasse.

Exemplo:

```java
public void fazerSom()
```

sobrescrevendo:

```java
public void fazerSom()
```

Mesma assinatura.

---

## ➕ Sobrecarga

Acontece quando existem métodos com o mesmo nome, mas parâmetros diferentes.

Exemplo:

```java
public void fazerSom()
```

e:

```java
public void fazerSom(String som)
```

ou:

```java
public void fazerSom(int numero, String texto)
```

Assinaturas diferentes.

---

## 🔐 Regra dos modificadores de acesso

Na sobrescrita, o modificador de acesso do método na subclasse **não pode ser mais restritivo** do que o modificador de acesso do método na superclasse.

Exemplo inválido:

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    private void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
```

Esse código gera erro.

O motivo é que o método da superclasse é `public`, mas o método da subclasse foi declarado como `private`.

Isso tenta reduzir o nível de acesso do método herdado, o que o Java não permite.

---

## ✅ Exemplo correto

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
```

Aqui está correto porque os dois métodos são `public`.

---

## 🧠 Boa prática: usar `@Override`

Embora o professor tenha focado no conceito, uma boa prática em Java é usar a anotação `@Override` quando fazemos sobrescrita.

Exemplo:

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
```

A anotação `@Override` ajuda o compilador a verificar se realmente estamos sobrescrevendo um método da superclasse.

Se o nome, retorno ou parâmetros estiverem errados, o compilador avisa.

Isso evita erros silenciosos.

---

## 🧪 Código recomendado para estudo

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}

public class TesteHeranca {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro();

        dog.fazerSom();
    }
}
```

---

## 📤 Saída do código recomendado

```text
O cachorro late.
```

---

## ⚠️ Erros comuns

```text
1. Achar que qualquer método com mesmo nome é sobrescrita.
2. Esquecer que os parâmetros precisam ser iguais.
3. Alterar a ordem dos parâmetros e pensar que ainda é sobrescrita.
4. Confundir sobrescrita com sobrecarga.
5. Tentar reduzir o modificador de acesso na subclasse.
6. Não usar @Override e deixar passar erro de digitação.
7. Achar que o Java sempre chama o método da superclasse primeiro.
```

---

## 🔗 Relação com projetos Java back-end

Em sistemas reais, sobrescrita aparece quando uma classe mais específica precisa alterar o comportamento herdado de uma classe mais geral.

Exemplos simples:

```text
Animal -> Cachorro
Pessoa -> Funcionario
Usuario -> Administrador
Produto -> ProdutoDigital
Conta -> ContaCorrente
```

Exemplo conceitual:

```text
Uma classe Conta pode ter um método calcularTarifa().
Uma classe ContaCorrente pode sobrescrever esse método com uma regra própria.
Uma classe ContaPoupanca pode sobrescrever esse mesmo método com outra regra.
```

O importante é que a subclasse mantenha a mesma assinatura do método.

---

## 🧱 Aprendizado principal

Sobrescrita permite que a subclasse tenha sua própria implementação de um método herdado da superclasse.

Para ser sobrescrita, o método precisa manter:

```text
mesmo nome;
mesmo tipo de retorno;
mesma lista de parâmetros;
mesma ordem dos parâmetros;
modificador de acesso não mais restritivo.
```

---

## ✅ Resumo rápido

```text
Sobrescrita também é chamada de overriding.
Acontece entre superclasse e subclasse.
A subclasse redefine um método da superclasse.
O método precisa ter a mesma assinatura.
A ordem dos parâmetros importa.
Se os parâmetros forem diferentes, não é sobrescrita.
O modificador de acesso não pode ser mais restritivo.
Usar @Override é uma boa prática.
```

---

## 📝 Anotação pessoal

Nesta aula, o ponto mais importante foi entender que a sobrescrita depende da assinatura do método.

Não basta o método ter o mesmo nome.

Para ser sobrescrita, a lista de parâmetros também precisa ser igual, inclusive na ordem.

Também ficou claro que, quando o método existe na subclasse, o Java executa a versão da subclasse.

---


