# 📌 Resumo Aula 003 - Annotation `@Deprecated`

## 🎯 Tema da aula

Nesta aula foi estudada a annotation `@Deprecated`.

A annotation `@Deprecated` é usada para indicar que uma classe, método, construtor ou atributo está obsoleto e não deve mais ser utilizado em novos códigos.

---

## 🧠 Ideia principal

Quando algo é marcado com `@Deprecated`, isso significa:

> “Este recurso ainda existe, mas seu uso não é mais recomendado.”

Ele pode continuar funcionando, mas o programador deve evitar usá-lo.

Exemplo:

```java id="3ckztt"
@Deprecated
public void mostrarRegrasParaAposentadoria() {
    System.out.println("Regras antigas para aposentadoria");
}
```

---

## 🧩 Por que não apagar o método antigo direto?

Em sistemas reais, nem sempre é possível simplesmente apagar um método antigo.

Isso poderia quebrar várias partes do sistema que ainda dependem daquele método.

Por isso, uma estratégia comum é:

1. manter o método antigo temporariamente;
2. marcar esse método como `@Deprecated`;
3. criar um método novo para substituir o antigo;
4. atualizar o sistema aos poucos;
5. remover o método antigo em uma versão futura, se fizer sentido.

---

## 🧪 Exemplo prático da aula

Arquivo sugerido:

```text id="j9xgdk"
Fontes/Previdencia.java
```

Código:

```java id="ms1eea"
class InformaRegras {

    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras antigas para aposentadoria");
    }

    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("Novas regras para aposentadoria");
    }
}

public class Previdencia {

    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();

        // Uso do método obsoleto
        regras.mostrarRegrasParaAposentadoria();

        // Uso do método novo
        regras.mostrarNovasRegrasParaAposentadoria();
    }
}
```

---

## ⚠️ O que acontece ao compilar?

O código ainda compila.

A annotation `@Deprecated` não impede o funcionamento do método.

Porém, quando o método obsoleto é usado, o compilador pode exibir um aviso informando que há uso de recurso deprecated.

Exemplo de compilação:

```bash id="4fbadz"
javac Previdencia.java
```

O compilador pode mostrar uma observação dizendo que o código usa uma API obsoleta.

---

## 🔎 Como ver mais detalhes do aviso?

Para ver detalhes sobre o uso de métodos obsoletos, podemos compilar com:

```bash id="qbr4wk"
javac -Xlint:deprecation Previdencia.java
```

Essa opção mostra exatamente onde o método obsoleto está sendo usado.

Exemplo:

```java id="tvbsx3"
regras.mostrarRegrasParaAposentadoria();
```

O compilador aponta essa chamada como uso de método deprecated.

---

## ✅ Como resolver corretamente?

A melhor solução é parar de usar o método antigo e usar o método novo.

Exemplo melhorado:

```java id="ih3edn"
class InformaRegras {

    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras antigas para aposentadoria");
    }

    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("Novas regras para aposentadoria");
    }
}

public class Previdencia {

    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();

        // Uso do método novo
        regras.mostrarNovasRegrasParaAposentadoria();
    }
}
```

Mesmo com o método antigo ainda existindo na classe, o aviso desaparece porque ele não está mais sendo chamado.

---

## ⚠️ Cuidados importantes

A annotation `@Deprecated` não apaga o método.

Ela também não impede o método de ser chamado.

Ela apenas informa que aquele recurso está obsoleto e deve ser evitado.

---

## 🧱 Relação com projetos reais

Em projetos reais, `@Deprecated` é muito comum em bibliotecas, APIs e sistemas grandes.

Ela serve para avisar outros programadores que determinado recurso será substituído ou removido futuramente.

Isso ajuda a manter compatibilidade sem quebrar o sistema de uma vez.

---

## 💡 Principal aprendizado da aula

`@Deprecated` é uma annotation usada para marcar algo como obsoleto.

Ela ajuda o programador e o compilador a identificarem métodos antigos que ainda existem, mas não devem mais ser usados em novos códigos.

A forma correta de resolver o aviso não é esconder o problema, mas substituir o uso do método antigo pelo método novo.
