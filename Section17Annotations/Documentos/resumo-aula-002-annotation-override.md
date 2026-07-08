# 📌 Resumo Aula 002 - Annotation `@Override`

## 🎯 Tema da aula

Nesta aula foi estudado o uso da annotation `@Override` em Java.

A ideia principal foi entender que o código pode funcionar sem essa annotation, mas usá-la torna o código mais seguro, mais claro e ajuda o compilador a identificar erros antes da execução.

---

## 🧠 O que é uma annotation?

Annotations em Java são formas de adicionar **metadados** ao código.

Elas podem fornecer informações para:

* o compilador;
* ferramentas de compilação;
* bibliotecas;
* frameworks;
* outras partes do código.

Exemplo:

```java
@Override
public void fazerSom() {
    System.out.println("O cachorro late");
}
```

Nesse exemplo, `@Override` informa ao compilador que o método `fazerSom()` deve sobrescrever um método existente na superclasse.

---

## 🔁 Relembrando Herança

Na seção anterior, foi estudado que uma subclasse pode herdar de uma superclasse usando `extends`.

Exemplo:

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}
```

Aqui, `Cachorro` herda de `Animal`.

A classe `Animal` possui o método `fazerSom()`.

A classe `Cachorro` sobrescreve esse método, criando uma versão específica para cachorro.

---

## ✅ Por que usar `@Override`?

O código abaixo funciona mesmo sem `@Override`:

```java
class Cachorro extends Animal {

    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}
```

Mas usar `@Override` é uma boa prática:

```java
class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}
```

A vantagem é que o compilador passa a verificar se o método realmente está sobrescrevendo um método da superclasse.

Se não estiver, o Java acusa erro na compilação.

---

## ⚠️ Erro comum: achar que sobrescreveu, mas criou outro método

Exemplo incorreto:

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom(int quantidade) {
        System.out.println("O cachorro late");
    }
}
```

Esse código não representa uma sobrescrita.

O método da superclasse é:

```java
public void fazerSom()
```

O método da subclasse é:

```java
public void fazerSom(int quantidade)
```

Como a lista de parâmetros é diferente, isso não é sobrescrita. É sobrecarga.

Com `@Override`, o compilador acusa o erro.

Sem `@Override`, o código poderia compilar, mas o comportamento não seria o esperado.

---

## 🔁 Diferença entre sobrescrita e sobrecarga

### Sobrescrita

Acontece quando a subclasse redefine um método herdado da superclasse.

O método precisa respeitar a assinatura do método original.

Exemplo:

```java
@Override
public void fazerSom() {
    System.out.println("O cachorro late");
}
```

### Sobrecarga

Acontece quando existem métodos com o mesmo nome, mas parâmetros diferentes.

Exemplo:

```java
public void fazerSom() {
    System.out.println("O cachorro late");
}

public void fazerSom(int quantidade) {
    System.out.println("O cachorro late " + quantidade + " vezes");
}
```

---

## 🧪 Exemplo prático compatível com a aula

Arquivo sugerido:

```text
Fontes/TesteAnnotations.java
```

Código:

```java
class Animal {

    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

public class TesteAnnotations {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();
    }
}
```

Saída esperada:

```text
O cachorro late
```

---

## ⚠️ Atenção ao nome do arquivo

Em Java, se existir uma classe `public`, o nome do arquivo precisa ser exatamente igual ao nome da classe pública.

Exemplo correto:

```java
public class TesteAnnotations {
}
```

Nome correto do arquivo:

```text
TesteAnnotations.java
```

Evitar nomes como:

```text
teste-annotations.java
```

O hífen não é válido no nome da classe Java, e o padrão correto para classes é PascalCase.

---

## 💡 Principal aprendizado da aula

Quando um método realmente deve sobrescrever outro método, é boa prática usar `@Override`.

Ela ajuda o compilador a confirmar se a sobrescrita está correta.

Isso evita erros silenciosos, melhora a leitura do código e deixa clara a intenção do programador.

---

## 🧱 Conexão com Java back-end

Em projetos Java back-end, annotations aparecem com muita frequência.

No futuro, frameworks como Spring Boot vão usar annotations para identificar controllers, services, entidades, rotas, injeção de dependência e várias outras responsabilidades.

Mas, neste momento, o foco é entender a base:

`@Override` é uma annotation usada pelo compilador para validar sobrescrita de métodos.

---

## ✅ Conclusão

A annotation `@Override` não é obrigatória para o código funcionar, mas é altamente recomendada.

Ela torna o código mais seguro, mais claro e ajuda a identificar erros ainda em tempo de compilação.
