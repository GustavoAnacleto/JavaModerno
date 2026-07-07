# 📘 Resumo Aula 001 - Introdução à Herança em Java

## 🎯 Tema da aula

Introdução ao conceito de **Herança em Java**.

Nesta aula, o foco principal foi entender o que é herança, por que ela existe e em quais situações ela faz sentido dentro da programação orientada a objetos.

---

## 🧠 Ideia principal

Herança é um conceito fundamental da programação orientada a objetos que permite **reutilizar código já existente** em novas classes.

A ideia é criar uma classe mais geral, com atributos e métodos comuns, e depois criar classes mais específicas que herdam essas características.

Em Java, a herança é implementada usando a palavra-chave:

```java
extends
```

---

## 🧬 Conceito do “é um”

Antes de usar herança, é importante verificar se a relação entre as classes responde corretamente à pergunta:

```text
A classe filha é um tipo da classe mãe?
```

Ou de forma mais simples:

```text
A classe filha é uma classe mãe?
```

Se a resposta for sim, a herança pode fazer sentido.

---

## ✅ Exemplos corretos

```text
Funcionário é uma Pessoa.
Terceiro é uma Pessoa.
Aluno é uma Pessoa.
Cachorro é um Animal.
Carro é um Veículo.
```

Nesses casos, existe uma relação clara de especialização.

A classe filha representa um tipo mais específico da classe mãe.

---

## ❌ Exemplos que exigem cuidado

```text
Endereço é uma Pessoa? Não.
Venda é um Produto? Não.
Estoque é um Produto? Não.
Banco é uma Conta? Provavelmente não.
```

Nesses exemplos, a relação não representa corretamente o conceito de “é um”.

Pode até existir algum relacionamento entre as classes, mas provavelmente não será herança.

---

## 🧩 Exemplo conceitual da aula

Uma classe `Pessoa` pode conter informações comuns a várias pessoas:

```text
nome
CPF
endereço
idade
```

Depois, uma classe `Funcionario` pode herdar essas informações, porque todo funcionário é uma pessoa.

Além disso, `Funcionario` pode ter informações próprias, como:

```text
salário
cargo
matricula
```

O mesmo raciocínio vale para uma classe `Terceiro`.

Um terceiro também é uma pessoa, mas pode ter dados específicos, como:

```text
empresa contratada
tempo de contrato
tipo de serviço
```

---

## 💻 Exemplo simples em Java

```java
public class Pessoa {

    String nome;
    String cpf;
    String endereco;
    int idade;

    public void exibirDadosPessoais() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
    }
}
```

```java
public class Funcionario extends Pessoa {

    double salario;
    String cargo;

    public void exibirDadosFuncionario() {
        exibirDadosPessoais();
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}
```

```java
public class Aplicacao {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Gustavo";
        funcionario.cpf = "123.456.789-00";
        funcionario.endereco = "Ribeirão Preto";
        funcionario.idade = 38;
        funcionario.cargo = "Desenvolvedor Java";
        funcionario.salario = 3500.00;

        funcionario.exibirDadosFuncionario();
    }
}
```

---

## 🔎 Leitura do código

```java
public class Funcionario extends Pessoa
```

A leitura correta é:

```text
Funcionario herda de Pessoa.
Funcionario é uma Pessoa.
Funcionario é um tipo de Pessoa.
```

A classe `Pessoa` representa algo mais geral.

A classe `Funcionario` representa algo mais específico.

---

## 🚀 Vantagem da herança

A principal vantagem da herança é o **reaproveitamento de código**.

Quando uma estrutura é bem planejada, a herança pode ajudar a:

```text
evitar repetição de código;
organizar melhor as classes;
economizar tempo de desenvolvimento;
facilitar a criação de novas classes;
concentrar comportamentos comuns em uma classe mãe.
```

Em projetos reais, isso pode representar economia de tempo para o desenvolvimento e para a manutenção do sistema.

---

## ⚠️ Cuidado importante

Herança não deve ser usada apenas para evitar repetição de código.

Ela deve representar uma relação real de especialização.

Antes de usar `extends`, devo sempre perguntar:

```text
Essa classe filha realmente é um tipo da classe mãe?
```

Se a resposta for sim, a herança pode fazer sentido.

Se a resposta for não, provavelmente outro tipo de relação deve ser usado.

---

## 🔗 Relação com projetos Java back-end

Em sistemas Java back-end, herança pode aparecer em estruturas como:

```text
Pessoa -> Cliente
Pessoa -> Funcionario
Usuario -> Administrador
Produto -> ProdutoFisico
Produto -> ProdutoDigital
Conta -> ContaCorrente
Conta -> ContaPoupanca
```

Mesmo assim, em projetos profissionais, herança precisa ser usada com cuidado.

Hierarquias grandes demais podem deixar o código difícil de entender, testar e manter.

---

## 🧱 Aprendizado principal

Herança começa pelo conceito, não pelo código.

Antes de escrever `extends`, preciso validar se existe uma relação verdadeira de:

```text
é um
```

ou

```text
é um tipo de
```

A boa herança nasce de uma boa modelagem.

---

## 📝 Observação pessoal

A aula reforça que herança é útil para reutilização de código, mas esse reaproveitamento precisa respeitar a lógica do domínio.

Neste início, o mais importante é entender bem o conceito antes de avançar para assuntos como:

```text
super
sobrescrita de métodos
encapsulamento com herança
hierarquias maiores
```

---

## ✅ Resumo rápido

```text
Herança permite reaproveitar código.
Em Java, usamos extends.
A classe mãe é mais geral.
A classe filha é mais específica.
A relação precisa responder ao princípio do "é um".
Herança mal usada pode deixar o código confuso.
Antes de usar extends, devo validar o conceito.
```

---

## 🚀 Sugestão de commit

```bash
git commit -m "docs: adiciona resumo da aula inicial sobre heranca"
```
