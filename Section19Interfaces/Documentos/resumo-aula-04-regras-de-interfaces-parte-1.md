# Aula 167 - Regras de Interfaces - Parte 1

## 🎯 Objetivo da aula

Apresentar algumas regras importantes sobre interfaces em Java.

Nesta aula, os principais pontos estudados foram:

```text
- interfaces não podem ser instanciadas diretamente;
- atributos declarados em interfaces são automaticamente public, static e final;
- constantes de interface podem ser acessadas pelo nome da interface.
```

## 🧠 Conceito principal

Interface não é uma classe comum.

Ela funciona como uma especificação, um contrato. Por isso, ela não deve ser usada para criar objetos diretamente.

A interface define o que deve existir, mas quem realmente implementa o comportamento é uma classe concreta.

```text
Interface define o contrato.
Classe concreta implementa o contrato.
```

## 🚫 Interface não pode ser instanciada diretamente

Uma interface não pode ser instanciada com `new`.

Exemplo incorreto:

```java
interface Animal {
    void fazerSom();
}

public class TesteInterface {

    public static void main(String[] args) {

        Animal animal = new Animal(); // Erro
    }
}
```

Esse código não compila, porque `Animal` é uma interface.

A interface não possui implementação completa para ser transformada diretamente em objeto.

## 📌 Por que isso acontece?

A interface representa uma especificação.

Ela diz quais métodos uma classe precisa ter, mas não cria o funcionamento completo sozinha.

Usando o exemplo do cardápio:

```text
Interface → cardápio
Classe → chefe de cozinha
Método implementado → prato preparado
```

O cardápio apenas lista os pratos. Quem prepara o prato é o chefe.

Da mesma forma, a interface apenas define o contrato. Quem implementa o comportamento é a classe.

## ✅ Forma correta: instanciar uma classe que implementa a interface

Para usar uma interface na prática, uma classe precisa implementá-la.

Exemplo:

```java
interface Animal {
    void fazerSom();
}

class Cachorro implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz au au");
    }
}
```

Agora podemos criar um objeto da classe `Cachorro`:

```java
public class TesteInterface {

    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();
        meuCachorro.fazerSom();
    }
}
```

## ⚠️ Observação importante

A interface não pode ser instanciada diretamente assim:

```java
Animal animal = new Animal(); // Erro
```

Mas uma variável do tipo da interface pode apontar para um objeto de uma classe que implementa essa interface:

```java
Animal animal = new Cachorro();
animal.fazerSom();
```

Esse ponto se conecta com **polimorfismo**, que provavelmente será reforçado nas próximas aulas.

Por enquanto, a ideia principal é:

```text
Não posso criar um objeto direto da interface.
Mas posso usar a interface como tipo de referência para uma classe que a implementa.
```

## 🧾 Atributos em interfaces

Outra regra importante da aula:

Todo atributo declarado em uma interface é automaticamente:

```text
public
static
final
```

Ou seja, atributos em interfaces são constantes por padrão.

Exemplo:

```java
interface Animal {
    String DESCRICAO = "Animal é um ser vivo importante";
}
```

Mesmo escrevendo apenas:

```java
String DESCRICAO = "Animal é um ser vivo importante";
```

O compilador entende como se fosse:

```java
public static final String DESCRICAO = "Animal é um ser vivo importante";
```

## 🔒 O que significa public static final?

Cada palavra tem um papel:

```text
public → pode ser acessado de fora da interface.

static → pertence à interface, não a um objeto.

final → não pode ter o valor alterado depois de definido.
```

Por isso, esse atributo funciona como uma constante.

## 📌 Boa prática de nome para constantes

Como atributos de interface são `public static final`, eles devem seguir a convenção de constantes em Java:

```text
Letras maiúsculas
Palavras separadas por underline
Sem acentos
```

Exemplo recomendado:

```java
String DESCRICAO = "Animal é um ser vivo importante";
```

Evitar:

```java
String descrição = "Animal é um ser vivo importante";
```

Mesmo que Java permita alguns caracteres Unicode em identificadores, na prática profissional é melhor evitar acentos em nomes de variáveis, métodos, classes e constantes.

## 💻 Código completo da aula com melhoria de boas práticas

```java
interface Animal {

    String DESCRICAO = "Animal é um ser vivo importante";

    void fazerSom();
}

class Cachorro implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz au au");
    }
}

class Gato implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O gato faz miau miau");
    }
}

public class TesteInterface {

    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro();
        meuCachorro.fazerSom();

        Gato meuGato = new Gato();
        meuGato.fazerSom();

        System.out.println("Descrição da interface: " + Animal.DESCRICAO);
    }
}
```

## 🧪 Resultado esperado

```text
O cachorro faz au au
O gato faz miau miau
Descrição da interface: Animal é um ser vivo importante
```

## 🔎 Acessando constante da interface

Como `DESCRICAO` é `static`, ela pertence à interface.

Por isso, pode ser acessada assim:

```java
Animal.DESCRICAO
```

Não é necessário criar objeto para acessar esse valor.

Na verdade, nem seria possível criar um objeto direto da interface.

## ⚠️ Tentativa de alterar a constante

Como o atributo é `final`, não pode ser alterado.

Exemplo incorreto:

```java
Animal.DESCRICAO = "Outro texto"; // Erro
```

Isso não compila, porque `DESCRICAO` é uma constante.

## 🧩 Relação com a Seção 18 - Imutabilidade

Essa aula se conecta bem com a seção anterior sobre `final`.

Na Seção 18, foi estudado que `final` impede nova atribuição depois da definição inicial.

Aqui acontece a mesma coisa:

```java
String DESCRICAO = "Animal é um ser vivo importante";
```

Dentro de uma interface, isso é automaticamente entendido como:

```java
public static final String DESCRICAO = "Animal é um ser vivo importante";
```

Ou seja, o valor não poderá ser modificado depois.

## 🧱 Separação de responsabilidades

A aula também reforça a ideia de separação de responsabilidades.

A interface não deve executar tudo.

Ela deve definir o contrato.

A classe concreta deve implementar o comportamento.

```text
Interface → especifica
Classe → implementa
Objeto → executa
```

Essa separação ajuda a organizar melhor o código.

## 🔗 Ligação com Java back-end

No Java back-end, interfaces são muito usadas para definir contratos de serviços.

Por exemplo:

```java
interface EmailService {
    void enviarEmail();
}
```

Depois, uma classe concreta poderia implementar esse comportamento:

```java
class EmailServiceSimples implements EmailService {

    @Override
    public void enviarEmail() {
        System.out.println("Enviando e-mail...");
    }
}
```

Neste momento, não precisa avançar para Spring Boot ou arquitetura. O importante é entender a base:

```text
A interface define o comportamento esperado.
A classe concreta implementa esse comportamento.
```

## ⚠️ Erros comuns

Alguns erros comuns nesta aula:

```text
- tentar instanciar uma interface com new;
- esquecer que atributos de interface são constantes;
- tentar alterar o valor de um atributo da interface;
- não saber que atributos de interface são public static final por padrão;
- usar nomes de constantes em letras minúsculas;
- confundir interface com classe comum;
- esquecer que a implementação real fica na classe concreta.
```

## 🧱 Resumo rápido para revisão

```text
Interfaces não podem ser instanciadas diretamente.

Não posso fazer:
Animal animal = new Animal();

Uma classe concreta deve implementar a interface.

Atributos em interfaces são automaticamente public, static e final.

Por isso, atributos de interface são constantes.

Constantes devem ser nomeadas em letras maiúsculas.

Como são static, podem ser acessadas pelo nome da interface.

Exemplo:
Animal.DESCRICAO

A interface especifica.
A classe implementa.
O objeto executa.
```

## 📝 Anotação pessoal

Nesta aula, entendi duas regras importantes sobre interfaces.

A primeira é que uma interface não pode ser instanciada diretamente. Ela não é uma classe comum. Ela funciona como uma especificação ou contrato, então quem deve ser instanciada é uma classe que implementa essa interface.

A segunda regra é que todo atributo dentro de uma interface é automaticamente `public static final`. Isso significa que ele funciona como uma constante.

Também fez sentido conectar isso com a seção anterior sobre `final`, porque uma constante não pode ter seu valor alterado depois de definida.

Ponto principal para guardar:

```text
Interface não cria objeto diretamente.
Atributo em interface é constante por padrão.
```
