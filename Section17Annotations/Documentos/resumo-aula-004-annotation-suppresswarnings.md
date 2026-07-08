# 📌 Resumo Aula 004 - Annotation `@SuppressWarnings`

## 🎯 Tema da aula

Nesta aula foi estudada a annotation `@SuppressWarnings`.

Essa annotation é usada para suprimir, ou seja, esconder determinados avisos emitidos pelo compilador Java.

Um exemplo comum é esconder o aviso gerado quando usamos um método marcado com `@Deprecated`.

---

## 🧠 Ideia principal

A annotation `@SuppressWarnings` informa ao compilador que determinado aviso deve ser ignorado naquele trecho do código.

Exemplo:

```java id="erc4ve"
@SuppressWarnings("deprecation")
public static void main(String[] args) {
    InformaRegras regras = new InformaRegras();
    regras.mostrarRegrasParaAposentadoria();
}
```

Nesse caso, o compilador não mostrará o aviso de uso de método obsoleto dentro do método `main`.

---

## ⚠️ Relação com `@Deprecated`

Na aula anterior, vimos que `@Deprecated` marca um método como obsoleto.

Exemplo:

```java id="c6l6c3"
class InformaRegras {

    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras antigas para aposentadoria");
    }

    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("Novas regras para aposentadoria");
    }
}
```

Se chamarmos o método obsoleto de outra classe, o compilador pode emitir um aviso:

```java id="o2643u"
public class TestDeprecated {

    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();
        regras.mostrarRegrasParaAposentadoria();
    }
}
```

Compilando com:

```bash id="w235zz"
javac -Xlint:deprecation TestDeprecated.java
```

O compilador mostra que um método obsoleto está sendo usado.

---

## 🔇 Suprimindo o aviso

Podemos usar `@SuppressWarnings("deprecation")` para esconder esse aviso:

```java id="d3e3d6"
public class TestDeprecated {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();
        regras.mostrarRegrasParaAposentadoria();
    }
}
```

Agora o código ainda usa o método obsoleto, mas o aviso do compilador é suprimido.

---

## 🚨 Cuidado importante

`@SuppressWarnings` não corrige o problema.

Ela apenas esconde o aviso.

Se um método está obsoleto, o ideal é usar o método novo:

```java id="rnyxou"
public class TestDeprecated {

    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();
        regras.mostrarNovasRegrasParaAposentadoria();
    }
}
```

Essa é a melhor solução, porque remove o uso do método obsoleto em vez de apenas esconder o alerta.

---

## 🧪 Curiosidade da aula: chamada dentro da mesma classe

O professor também mostrou um comportamento interessante.

Quando um método obsoleto é chamado de dentro da própria classe, o compilador pode não emitir o aviso de depreciação.

Exemplo:

```java id="9trhmg"
class InformaRegras {

    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras antigas para aposentadoria");
    }

    public void chamarMetodoObsoletoNaMesmaClasse() {
        mostrarRegrasParaAposentadoria();
    }
}

public class TestDeprecated {

    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();
        regras.chamarMetodoObsoletoNaMesmaClasse();
    }
}
```

Nesse caso, o método obsoleto está sendo chamado dentro da própria classe `InformaRegras`.

A ideia é que o compilador entende que quem está dentro da própria classe tem mais controle sobre aquele código.

Já quando outra classe chama diretamente o método obsoleto, o aviso é mais importante, porque quem está usando pode não saber que aquele método não deve mais ser utilizado.

---

## ✅ Quando usar `@SuppressWarnings`?

Use com cuidado.

Ela pode fazer sentido quando:

* você sabe exatamente o motivo do aviso;
* não há uma alternativa melhor naquele momento;
* o uso é temporário;
* o trecho está controlado;
* existe uma justificativa clara.

Evite usar apenas para “limpar” mensagens do terminal.

Aviso do compilador geralmente existe por algum motivo.

---

## ❌ Má prática

Não é uma boa prática fazer isso sem necessidade:

```java id="q55gk7"
@SuppressWarnings("deprecation")
public static void main(String[] args) {
    InformaRegras regras = new InformaRegras();
    regras.mostrarRegrasParaAposentadoria();
}
```

Se existe um método novo, o correto é usar o método novo.

---

## 💡 Principal aprendizado da aula

`@SuppressWarnings` serve para esconder avisos específicos do compilador.

Mas esconder um aviso não significa resolver o problema.

No caso de métodos `@Deprecated`, a melhor solução normalmente é substituir o uso do método antigo pelo método novo.

---

## 🧱 Conexão com Java back-end

Em projetos Java reais, `@SuppressWarnings` aparece às vezes em códigos legados, integrações antigas ou bibliotecas que ainda geram avisos.

Mesmo assim, deve ser usada com moderação.

Um bom programador não sai escondendo warning sem entender a causa.
