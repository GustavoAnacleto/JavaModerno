# Aula 02 — Polimorfismo e Interfaces em Java

## 🎯 Objetivo da aula

Compreender como as interfaces podem ser utilizadas como tipos de referência para aplicar polimorfismo em Java.

Nesta aula, o conceito foi demonstrado com:

* a interface `Veiculo`;
* as classes `Carro` e `Moto`;
* o método `acelerar()` definido como contrato;
* referências do tipo `Veiculo` apontando para objetos diferentes;
* a execução da implementação correspondente ao tipo real de cada objeto.

---

## 🔗 Relação com a aula anterior

Na aula anterior, o polimorfismo foi demonstrado por meio de uma classe abstrata:

```java
Animal meuCachorro = new Cachorro();
Animal meuGato = new Gato();
```

Com interfaces, a lógica é semelhante:

```java
Veiculo meuCarro = new Carro();
Veiculo minhaMoto = new Moto();
```

Nos dois casos:

* a referência possui um tipo mais geral;
* o objeto criado possui um tipo mais específico;
* o método sobrescrito é escolhido de acordo com o tipo real do objeto.

---

## 📜 A interface como contrato

A interface `Veiculo` define um comportamento comum:

```java
interface Veiculo {
    void acelerar();
}
```

O método `acelerar()` não possui corpo nessa declaração. Nas interfaces, um método desse tipo é implicitamente:

```java
public abstract
```

Portanto, a declaração poderia ser entendida como:

```java
public abstract void acelerar();
```

As classes concretas que implementam `Veiculo` assumem o compromisso de fornecer uma implementação para esse método.

---

## 🚗 Implementação na classe `Carro`

```java
class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }
}
```

A palavra-chave `implements` informa que `Carro` implementa o contrato definido por `Veiculo`.

Como `Carro` é uma classe concreta, ela deve implementar o método abstrato da interface.

---

## 🏍️ Implementação na classe `Moto`

```java
class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }
}
```

A classe `Moto` implementa o mesmo contrato, mas fornece seu próprio comportamento para `acelerar()`.

Assim, `Carro` e `Moto` compartilham o mesmo tipo geral, mas podem responder de maneiras diferentes ao mesmo método.

---

## 💻 Exemplo completo

```java
interface Veiculo {
    void acelerar();
}

class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }
}

class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }
}

public class TestePolimorfismoInterface {

    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaMoto = new Moto();

        meuCarro.acelerar();
        minhaMoto.acelerar();
    }
}
```

### Saída esperada

```text
O carro está acelerando
A moto está acelerando
```

---

## 🧩 Entendendo as referências polimórficas

Considere as declarações:

```java
Veiculo meuCarro = new Carro();
Veiculo minhaMoto = new Moto();
```

| Referência | Tipo da referência | Tipo real do objeto |
|---|---|---|
| `meuCarro` | `Veiculo` | `Carro` |
| `minhaMoto` | `Veiculo` | `Moto` |

A interface determina o contrato disponível por meio da referência. O tipo real do objeto determina qual implementação sobrescrita será executada.

Quando o código chama:

```java
meuCarro.acelerar();
```

o Java executa `Carro.acelerar()`.

Quando chama:

```java
minhaMoto.acelerar();
```

o Java executa `Moto.acelerar()`.

O mesmo método é chamado por referências do mesmo tipo, mas o comportamento varia conforme o objeto recebido.

---

## ⏱️ Compilação e execução

O processo pode ser compreendido em duas etapas:

1. **Durante a compilação:** o Java verifica se `acelerar()` está declarado na interface `Veiculo`.
2. **Durante a execução:** o Java verifica o tipo real do objeto e executa a implementação de `Carro` ou `Moto`.

Esse é o mesmo mecanismo de despacho dinâmico observado no polimorfismo com classes.

---

## 🛠️ Um método trabalhando com diferentes veículos

Uma vantagem importante do polimorfismo é poder criar métodos que recebem o tipo mais geral:

```java
public static void iniciarAceleracao(Veiculo veiculo) {
    veiculo.acelerar();
}
```

O mesmo método pode receber objetos diferentes:

```java
iniciarAceleracao(new Carro());
iniciarAceleracao(new Moto());
```

Dentro de `iniciarAceleracao()`, não é necessário verificar manualmente se o objeto é um `Carro` ou uma `Moto`. Cada objeto sabe executar sua própria implementação de `acelerar()`.

Esse uso ajuda a reduzir repetição e deixa o código mais flexível.

---

## ➕ Facilidade para adicionar novas implementações

Futuramente, outra classe poderá implementar o mesmo contrato:

```java
class Caminhao implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando");
    }
}
```

Ela também poderá ser tratada como `Veiculo`:

```java
Veiculo meuCaminhao = new Caminhao();
meuCaminhao.acelerar();
```

O método criado anteriormente continuará funcionando:

```java
iniciarAceleracao(new Caminhao());
```

Isso demonstra como o polimorfismo facilita a extensão do código.

---

## ⚖️ Polimorfismo com classe e com interface

| Com classe ou classe abstrata | Com interface |
|---|---|
| A subclasse usa `extends`. | A classe usa `implements`. |
| A superclasse pode possuir atributos, construtores e métodos concretos. | A interface representa principalmente um contrato de comportamento. |
| A superclasse pode ser usada como tipo da referência. | A interface pode ser usada como tipo da referência. |
| O método sobrescrito é escolhido pelo tipo real do objeto. | O método implementado é escolhido pelo tipo real do objeto. |

Exemplos:

```java
Animal animal = new Cachorro();
Veiculo veiculo = new Carro();
```

Nos dois casos existe polimorfismo, pois um tipo mais geral referencia um objeto mais específico.

---

## 🔎 Ajuste importante de terminologia

Uma interface não se transforma na **superclasse** da classe que a implementa.

No exemplo:

```java
class Carro implements Veiculo {
}
```

* `Veiculo` é uma interface;
* `Carro` implementa o contrato de `Veiculo`;
* `Veiculo` pode funcionar como um **supertipo de referência** para `Carro`;
* não existe herança de classe entre `Veiculo` e `Carro`.

Portanto, a forma mais precisa de explicar é:

> A interface `Veiculo` é um tipo mais geral que pode referenciar qualquer objeto cuja classe implemente esse contrato.

---

## ♻️ Benefícios do polimorfismo com interfaces

O polimorfismo com interfaces favorece:

* reutilização de código;
* redução de métodos repetidos;
* uso de contratos comuns;
* facilidade de manutenção;
* inclusão de novas implementações;
* menor dependência de classes concretas;
* organização do design orientado a objetos.

Um código que trabalha com `Veiculo` não precisa conhecer antecipadamente todas as classes concretas que implementarão essa interface.

---

## ⚠️ Erros comuns

### 1. Utilizar `extends` no lugar de `implements`

Uma classe implementa uma interface com `implements`:

```java
class Carro implements Veiculo {
}
```

### 2. Tentar instanciar a interface

Isto não é permitido:

```java
Veiculo veiculo = new Veiculo();
```

Uma interface não pode ser instanciada diretamente. É necessário criar um objeto de uma classe concreta que a implemente.

### 3. Esquecer de implementar o método obrigatório

Uma classe concreta que implementa `Veiculo` deve fornecer uma implementação para `acelerar()`.

Caso contrário, ocorrerá erro de compilação.

### 4. Reduzir a visibilidade do método

O método declarado na interface é público. Por isso, sua implementação também precisa ser `public`:

```java
@Override
public void acelerar() {
    System.out.println("O carro está acelerando");
}
```

### 5. Pensar que todos os objetos executarão a mesma implementação

Embora as referências sejam do tipo `Veiculo`, cada objeto executa a implementação definida por sua própria classe.

---

## ✅ Boas práticas observadas

* utilizar nomes de interfaces que representem claramente o contrato;
* empregar `implements` corretamente;
* usar `@Override` nas implementações;
* declarar as referências com o tipo mais geral quando fizer sentido;
* manter o comportamento específico dentro de cada classe concreta;
* criar hierarquias que representem relações coerentes do domínio.

---

## 🧠 Principal aprendizado da aula

> Uma interface pode ser usada como tipo de referência para objetos de qualquer classe que a implemente. Ao chamar um método do contrato, o Java executa em runtime a implementação correspondente ao tipo real do objeto.

No exemplo:

```java
Veiculo meuCarro = new Carro();
Veiculo minhaMoto = new Moto();
```

As duas referências são do tipo `Veiculo`, mas `meuCarro.acelerar()` executa o comportamento de `Carro`, enquanto `minhaMoto.acelerar()` executa o comportamento de `Moto`.
