# Aula 166 - Criação de Interfaces

## 🎯 Objetivo da aula

Criar uma interface em Java e implementar essa interface em classes concretas.

A aula mostra, na prática, que uma interface define métodos obrigatórios e que as classes que implementam essa interface precisam escrever o corpo desses métodos.

## 🧠 Conceito principal

Uma interface pode declarar métodos sem corpo.

Esses métodos funcionam como uma obrigação para as classes que implementarem a interface.

Exemplo:

```java
interface Animal {
    void fazerSom();
}
```

Nesse caso, a interface `Animal` está dizendo:

```text
Todo Animal precisa saber fazer som.
```

Mas ela não diz como o som será feito.

Quem define isso são as classes que implementam a interface.

## 📌 Método abstrato na interface

Dentro da interface, o método foi declarado assim:

```java
void fazerSom();
```

Esse método termina com ponto e vírgula e não possui corpo.

Ou seja, ele não tem:

```java
{
    // código aqui
}
```

Por isso, ele é considerado um método abstrato.

A interface apenas define que o método precisa existir.

## 🐶 Classe Cachorro implementando Animal

A classe `Cachorro` implementa a interface `Animal`.

```java
class Cachorro implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz au au");
    }
}
```

Como `Cachorro` implementa `Animal`, ela é obrigada a implementar o método `fazerSom()`.

Aqui aparece a palavra-chave:

```java
implements
```

Ela é usada quando uma classe implementa uma interface.

## 🐱 Classe Gato implementando Animal

A classe `Gato` também implementa a interface `Animal`.

```java
class Gato implements Animal {

    @Override
    public void fazerSom() {
        System.out.println("O gato faz miau miau");
    }
}
```

A lógica é a mesma da classe `Cachorro`.

A interface exige o método `fazerSom()`, mas cada classe implementa esse método do seu próprio jeito.

```text
Cachorro → faz au au
Gato → faz miau miau
```

Isso mostra que classes diferentes podem seguir o mesmo contrato, mas ter comportamentos diferentes.

## 💻 Código completo da aula

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
    }
}
```

## 🧪 Resultado esperado

Ao compilar e executar o programa, a saída será:

```text
O cachorro faz au au
O gato faz miau miau
```

## 🔁 Relação com override

Quando uma classe implementa uma interface, ela precisa sobrescrever os métodos definidos nela.

Por isso, usamos a anotação:

```java
@Override
```

Ela ajuda o compilador a verificar se o método realmente está implementando ou sobrescrevendo um método existente.

Neste caso, o `@Override` indica que `Cachorro` e `Gato` estão implementando o método `fazerSom()` da interface `Animal`.

## ⚠️ Diferença entre extends e implements

Nesta aula, apareceu novamente um ponto muito importante:

```text
extends → usado para herança entre classes.
implements → usado para implementar interfaces.
```

Exemplo com interface:

```java
class Cachorro implements Animal {
}
```

Não usamos `extends` nesse caso, porque `Animal` é uma interface.

## 📄 Observação sobre o arquivo Java

No exemplo da aula, tudo foi colocado no mesmo arquivo `TesteInterface.java`.

Isso funciona porque apenas a classe `TesteInterface` está pública.

Em Java, a regra é:

```text
Se uma classe pública existe no arquivo, o nome do arquivo deve ser igual ao nome dessa classe pública.
```

Por isso:

```text
Classe pública: TesteInterface
Arquivo: TesteInterface.java
```

Como `Animal`, `Cachorro` e `Gato` não estão com `public`, elas podem ficar no mesmo arquivo para fins didáticos.

Em projetos mais organizados, normalmente cada classe ou interface ficaria em seu próprio arquivo.

## 🧱 Boas práticas observadas

Nesta aula, algumas boas práticas importantes aparecem:

```text
- usar nomes de classes e interfaces com PascalCase;
- usar implements para interface;
- usar @Override ao implementar métodos da interface;
- manter nomes de métodos claros;
- criar exemplos simples para entender o conceito antes de avançar.
```

Exemplos de nomes adequados:

```text
Animal
Cachorro
Gato
TesteInterface
```

Evitar nomes como:

```text
animal
cachorro
gato
testeinterface
```

porque em Java classes e interfaces seguem a convenção `PascalCase`.

## 🔗 Ligação com Java back-end

No futuro, em Java back-end, essa mesma ideia aparece em situações como:

```text
- uma interface definindo um serviço;
- uma classe implementando a regra de negócio;
- uma interface definindo um repositório;
- uma classe implementando uma forma de buscar dados;
- diferentes classes seguindo o mesmo contrato.
```

Mas, neste momento, a ideia principal é simples:

```text
Interface define o método obrigatório.
Classe implementa o método com o comportamento real.
```

## ⚠️ Erros comuns

Alguns erros comuns nessa fase:

```text
- esquecer o ponto e vírgula no método da interface;
- tentar colocar corpo no método abstrato da interface;
- usar extends em vez de implements;
- esquecer de implementar o método obrigatório;
- escrever o nome do método diferente do que está na interface;
- esquecer o public no método implementado;
- usar nomes de classes começando com letra minúscula.
```

Exemplo de erro comum:

```java
interface Animal {
    void fazerSom();
}

class Cachorro implements Animal {

}
```

Nesse caso, a classe `Cachorro` dará erro, porque implementa `Animal`, mas não implementou o método `fazerSom()`.

## 🧱 Resumo rápido para revisão

```text
Interface define um contrato.

Um método dentro da interface pode ser declarado sem corpo.

Esse método termina com ponto e vírgula.

A classe que implementa a interface usa implements.

A classe é obrigada a implementar os métodos da interface.

Classes diferentes podem implementar a mesma interface de formas diferentes.

Cachorro e Gato implementam Animal, mas cada um faz um som diferente.

Isso reforça a ideia de contrato e comportamento obrigatório.
```

## 📝 Anotação pessoal

Nesta aula, vi na prática como criar uma interface e implementar em classes concretas.

A interface `Animal` definiu o método `fazerSom()`, mas não colocou o corpo do método. Depois, as classes `Cachorro` e `Gato` implementaram essa interface e foram obrigadas a criar esse método.

O mais importante foi perceber que a interface obriga a classe a seguir um contrato.

Também ficou claro que a mesma interface pode ser usada por classes diferentes, e cada uma pode implementar o comportamento do seu jeito.

Ponto principal para guardar:

```text
A interface exige o método.
A classe implementa o método.
```
