# Aula 165 - Introdução a Interfaces

## 🎯 Objetivo da aula

Apresentar o conceito de **interface em Java**, mostrando que ela é um recurso importante da programação orientada a objetos.

A aula explica que uma interface funciona como um **contrato** para as classes, definindo quais métodos uma classe deve implementar.

## 🧠 Conceito principal

Uma interface em Java pode ser entendida como um **contrato de comportamento**.

Ela especifica quais métodos uma classe precisa ter, mas não define exatamente como esses métodos serão implementados.

Em outras palavras:

```text
A interface define o que deve existir.
A classe define como aquilo será feito.
```

Esse conceito ajuda a criar sistemas mais organizados, flexíveis e modulares.

## 📄 Interface como contrato

Quando uma classe implementa uma interface, ela assume a obrigação de implementar os métodos definidos por essa interface.

A interface não está preocupada com os detalhes internos da implementação.

Ela apenas diz:

```text
Toda classe que usar esta interface precisa ter estes comportamentos.
```

Isso melhora o design orientado a objetos porque separa responsabilidades.

## 🍽️ Exemplo do cardápio do restaurante

O professor usou o exemplo de um **cardápio de restaurante**.

O cardápio lista os pratos disponíveis, mas não explica como cada prato será preparado.

Quem prepara o prato é o chefe de cozinha.

Comparando com Java:

```text
Interface → cardápio
Métodos da interface → pratos listados no cardápio
Classe → chefe de cozinha
Implementação dos métodos → forma como o chefe prepara os pratos
```

Cada chefe pode preparar o prato de um jeito diferente, mas todos seguem o mesmo cardápio.

Da mesma forma, várias classes podem implementar a mesma interface, mas cada uma pode implementar os métodos de maneira diferente.

## 💻 Como criar uma interface em Java

Para criar uma interface em Java, usamos a palavra-chave `interface`.

A estrutura é parecida com a criação de uma classe, mas usamos `interface` no lugar de `class`.

Exemplo:

```java
public interface MinhaInterface {
    void executar();
}
```

Nesse exemplo, `MinhaInterface` define um método chamado `executar`.

A interface está dizendo que toda classe que implementá-la deverá ter esse método.

## 🧩 Como implementar uma interface

Para uma classe usar uma interface, usamos a palavra-chave `implements`.

Exemplo:

```java
public class MinhaClasse implements MinhaInterface {

    @Override
    public void executar() {
        System.out.println("Executando método da interface.");
    }
}
```

Nesse caso:

```text
MinhaClasse implementa MinhaInterface.
Por isso, ela precisa implementar o método executar().
```

O uso de `@Override` indica que o método está sendo implementado a partir da interface.

## 🔁 Diferença entre extends e implements

Um ponto importante da aula é a diferença entre `extends` e `implements`.

```text
extends → usado para herança entre classes.
implements → usado quando uma classe implementa uma interface.
```

Exemplo com herança:

```java
public class Cachorro extends Animal {
}
```

Exemplo com interface:

```java
public class MinhaClasse implements MinhaInterface {
}
```

A palavra `implements` mostra que a classe está assumindo o contrato definido pela interface.

## 📌 Ponto importante

A interface define os métodos, mas a classe concreta precisa escrever o código desses métodos.

A interface funciona como a definição do cardápio.

A classe funciona como o chefe que prepara os pratos.

Por isso, a mesma interface pode ser implementada de formas diferentes por classes diferentes.

## 🔗 Ligação com Java back-end

No Java back-end, interfaces são muito usadas para organizar responsabilidades e definir comportamentos esperados.

Por exemplo, futuramente uma interface poderia definir ações como:

```text
- salvar;
- buscar;
- atualizar;
- remover;
- calcular;
- processar.
```

Cada classe concreta poderia implementar essas ações de acordo com sua necessidade.

Neste momento, o importante é entender a base:

```text
Interface cria um contrato.
Classe implementa esse contrato.
```

## ⚠️ Erros comuns

Alguns erros comuns ao começar com interfaces:

```text
- usar extends no lugar de implements;
- achar que a interface é uma classe comum;
- esquecer de implementar os métodos obrigatórios;
- pensar que a interface define como o método funciona;
- não entender que classes diferentes podem implementar a mesma interface de formas diferentes.
```

## 🧱 Resumo rápido para revisão

```text
Interface é um contrato em Java.

Ela define quais métodos uma classe precisa implementar.

A interface diz o que precisa existir, mas não diz como deve ser feito.

A classe que implementa a interface escreve o código real dos métodos.

Usamos interface para criar uma interface.

Usamos implements para uma classe implementar uma interface.

extends é usado para herança entre classes.

implements é usado para implementar interfaces.
```

## 📝 Anotação pessoal

Nesta aula, entendi melhor que interface em Java funciona como um contrato. Ela define métodos que uma classe precisa ter, mas quem decide como esses métodos vão funcionar é a própria classe.

O exemplo do cardápio ajudou bastante. O cardápio mostra os pratos, mas não ensina o preparo. A interface mostra os métodos, mas não implementa a lógica.

O ponto principal para guardar é:

```text
Interface define o contrato.
Classe implementa o comportamento.
```
