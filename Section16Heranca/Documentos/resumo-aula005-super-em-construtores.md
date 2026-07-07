# 📘 Resumo Aula 005 - Uso de `super` em Construtores

## 🎯 Tema da aula

Uso da palavra-chave `super` dentro de construtores em Java.

Nesta aula, o professor mostrou que `super` não serve apenas para acessar métodos da superclasse.  
Ela também pode ser usada para chamar o construtor da classe mãe.

---

## 🧠 Ideia principal

Em Java, quando uma classe filha herda de uma classe mãe, o construtor da classe mãe pode ser chamado a partir do construtor da classe filha usando:

```java
super();
```

Quando o construtor da superclasse possui parâmetros, usamos:

```java
super(valor);
```

ou:

```java
super(parametro1, parametro2);
```

dependendo da assinatura do construtor da superclasse.

---

## 🧬 Relação entre `this` e `super`

A aula reforçou a diferença entre duas palavras importantes:

```text
this  -> acessa membros da própria classe.
super -> acessa membros ou construtores da superclasse imediata.
```

Exemplo:

```java
this.raca = raca;
```

Significa:

```text
A variável membro raca desta classe recebe o valor do parâmetro raca.
```

Exemplo:

```java
super(nome);
```

Significa:

```text
Chame o construtor da superclasse, passando o valor da variável nome.
```

---

## 🏗️ Estrutura do exemplo

A estrutura usada na aula foi:

```text
Animal
 └── Cachorro
```

Ou seja:

```text
Cachorro é um Animal.
```

A classe `Animal` possui o atributo:

```text
nome
```

A classe `Cachorro` possui o atributo:

```text
raca
```

O nome é uma característica geral de qualquer animal.

A raça, neste exemplo, é uma característica específica do cachorro.

---

## 💻 Código base da aula

```java
class Animal {

    String nome;

    Animal(String nome) {
        this.nome = nome;
    }
}

class Cachorro extends Animal {

    String raca;

    Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }
}

public class TesteSuper {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex", "Labrador");

        System.out.println("O nome do animal é: " + dog.nome);
        System.out.println("A raça do cachorro é: " + dog.raca);
    }
}
```

---

## 📤 Saída esperada

```text
O nome do animal é: Rex
A raça do cachorro é: Labrador
```

---

## 🔎 Explicação do código

A classe `Animal` possui uma variável membro:

```java
String nome;
```

Depois, foi criado um construtor para inicializar esse atributo:

```java
Animal(String nome) {
    this.nome = nome;
}
```

Aqui, a palavra `this` indica que estamos acessando a variável membro da própria classe `Animal`.

A leitura correta é:

```text
O atributo nome da classe Animal recebe o valor do parâmetro nome.
```

---

## 🐶 Classe `Cachorro`

A classe `Cachorro` herda de `Animal`:

```java
class Cachorro extends Animal
```

Ela também possui uma variável própria:

```java
String raca;
```

Depois, foi criado um construtor recebendo dois valores:

```java
Cachorro(String nome, String raca)
```

Esse construtor recebe:

```text
nome -> será enviado para a superclasse Animal.
raca -> será usado na própria classe Cachorro.
```

---

## 🧪 Uso de `super(nome)`

Dentro do construtor de `Cachorro`, aparece esta linha:

```java
super(nome);
```

Essa linha chama o construtor da superclasse `Animal`.

Como o construtor de `Animal` recebe uma `String`, o valor de `nome` é enviado para ele.

Fluxo:

```text
1. O objeto Cachorro é criado.
2. O construtor de Cachorro recebe "Rex" e "Labrador".
3. A linha super(nome) chama o construtor de Animal.
4. O construtor de Animal recebe "Rex".
5. O atributo nome da classe Animal é inicializado.
6. O código volta para o construtor de Cachorro.
7. O atributo raca da classe Cachorro é inicializado.
```

---

## 🧭 Ordem de execução

Quando executamos:

```java
Cachorro dog = new Cachorro("Rex", "Labrador");
```

acontece esta sequência:

```text
1. Java chama o construtor de Cachorro.
2. O construtor de Cachorro recebe os valores "Rex" e "Labrador".
3. A primeira instrução executada é super(nome).
4. O construtor de Animal é chamado.
5. Animal inicializa o atributo nome com "Rex".
6. O fluxo volta para Cachorro.
7. Cachorro inicializa o atributo raca com "Labrador".
8. O objeto dog termina de ser criado.
```

---

## ⚠️ Regra importante sobre `super` em construtores

Quando usamos `super()` dentro de um construtor, ele deve ser a primeira instrução do construtor.

Exemplo correto:

```java
Cachorro(String nome, String raca) {
    super(nome);
    this.raca = raca;
}
```

Exemplo errado:

```java
Cachorro(String nome, String raca) {
    this.raca = raca;
    super(nome);
}
```

Esse segundo exemplo gera erro, porque a chamada ao construtor da superclasse precisa vir primeiro.

---

## 🧩 Por que isso acontece?

Antes de criar completamente o objeto da classe filha, o Java precisa inicializar a parte herdada da classe mãe.

Por isso, a superclasse é construída primeiro.

No exemplo:

```text
Antes de existir completamente um Cachorro,
primeiro o Java inicializa a parte Animal desse cachorro.
```

Isso faz sentido porque:

```text
Cachorro é um Animal.
```

---

## 🔐 Observação sobre encapsulamento

Na aula, os atributos foram usados sem `private` para facilitar o exemplo:

```java
String nome;
String raca;
```

Isso é aceitável para uma demonstração inicial.

Mas, em códigos mais organizados, o ideal seria proteger os atributos com `private` e usar métodos de acesso.

Exemplo:

```java
private String nome;

public String getNome() {
    return nome;
}
```

Por enquanto, o foco da aula é entender o uso de `super` com construtores.

---

## 🧠 Comparação entre `this` e `super` no exemplo

```java
super(nome);
```

Chama o construtor da classe mãe `Animal`.

```java
this.raca = raca;
```

Inicializa o atributo `raca` da própria classe `Cachorro`.

Resumo:

```text
super(nome)      -> envia o nome para Animal.
this.raca = raca -> guarda a raça em Cachorro.
```

---

## ✅ Código com comentários didáticos

```java
class Animal {

    String nome;

    Animal(String nome) {
        // this acessa o atributo da própria classe Animal
        this.nome = nome;
    }
}

class Cachorro extends Animal {

    String raca;

    Cachorro(String nome, String raca) {
        // super chama o construtor da superclasse Animal
        super(nome);

        // this acessa o atributo da própria classe Cachorro
        this.raca = raca;
    }
}

public class TesteSuper {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex", "Labrador");

        System.out.println("O nome do animal é: " + dog.nome);
        System.out.println("A raça do cachorro é: " + dog.raca);
    }
}
```

---

## 🔗 Relação com projetos Java back-end

Esse conceito aparece em projetos Java quando uma classe filha precisa reaproveitar a inicialização da classe mãe.

Exemplo conceitual:

```text
Pessoa
 └── Funcionario
```

A classe `Pessoa` poderia ter:

```text
nome
cpf
idade
```

A classe `Funcionario` poderia ter:

```text
cargo
salario
```

No construtor de `Funcionario`, poderíamos chamar o construtor de `Pessoa` com `super`:

```java
super(nome, cpf, idade);
```

Depois, inicializar os dados específicos do funcionário:

```java
this.cargo = cargo;
this.salario = salario;
```

---

## 🧱 Aprendizado principal

A palavra-chave `super` pode ser usada dentro de construtores para chamar o construtor da superclasse.

Isso permite inicializar primeiro os dados herdados da classe mãe e depois os dados específicos da classe filha.

No exemplo da aula:

```text
Animal inicializa o nome.
Cachorro inicializa a raça.
```

---

## ⚠️ Erros comuns

```text
1. Esquecer que super() deve ser a primeira linha do construtor.
2. Confundir this com super.
3. Tentar chamar um construtor da superclasse com parâmetros errados.
4. Achar que super serve apenas para métodos.
5. Esquecer que a classe filha precisa respeitar o construtor existente na classe mãe.
6. Compilar o arquivo errado no terminal.
7. Salvar o arquivo com nome diferente da classe public.
```

---

## ✅ Resumo rápido

```text
super pode ser usado em construtores.
super chama o construtor da superclasse imediata.
this acessa membros da própria classe.
super acessa membros ou construtores da classe mãe.
A chamada super(...) deve ser a primeira instrução do construtor.
Animal inicializa o nome.
Cachorro inicializa a raça.
```

---

## 📝 Anotação pessoal

Nesta aula, o ponto principal foi perceber que a criação de um objeto da subclasse também envolve a construção da parte herdada da superclasse.

Ao criar um `Cachorro`, o Java também precisa inicializar a parte `Animal`.

Por isso, o construtor de `Cachorro` usa `super(nome)` para enviar o nome ao construtor de `Animal`.

Esse conceito ajuda a entender melhor como a herança organiza responsabilidades entre classe mãe e classe filha.

---

