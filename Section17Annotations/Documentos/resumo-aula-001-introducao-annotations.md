# 📌 Resumo Aula 001 - Introdução às Annotations em Java

## 🎯 Tema da aula

Nesta aula foi apresentada a introdução ao conceito de **annotations em Java**, também chamadas de **anotações Java**.

A ideia principal da aula foi mostrar que annotations podem parecer estranhas no começo, principalmente quando aparecem em grande quantidade em códigos maiores, mas são recursos muito importantes para tornar o código mais seguro, mais expressivo e mais integrado com ferramentas e frameworks.

---

## 🧠 Ideia principal

Annotations são formas de adicionar **metadados** ao código Java.

Metadados são informações extras sobre alguma parte do código, como uma classe, método, atributo, construtor ou parâmetro.

Exemplo já conhecido:

```java
@Override
public void fazerSom() {
    System.out.println("O cachorro late");
}
```

Nesse caso, `@Override` informa ao compilador que o método está sobrescrevendo um método existente na superclasse.

---

## 🦸 Annotation como “mocinha”

Annotations ajudam o programador porque podem:

* aumentar a segurança do código;
* melhorar a leitura e compreensão;
* ajudar o compilador a identificar erros;
* conectar o código Java com bibliotecas e frameworks;
* deixar mais clara a intenção de uma classe, método ou atributo.

Um exemplo importante é `@Override`.

Ela ajuda o compilador a verificar se um método realmente está sobrescrevendo outro método. Se o nome do método estiver errado, o compilador acusa o problema.

---

## 🦹 Annotation como “vilã”

Para quem está começando, annotations podem assustar.

Isso acontece porque códigos Java reais, principalmente em projetos back-end, podem ter várias annotations juntas. Para quem ainda não entende o papel delas, o código parece mais pesado e abstrato.

Exemplo visual:

```java
@Override
public void meuMetodo() {
    // implementação
}
```

Com o tempo, depois de entender o que cada annotation faz, elas deixam de parecer confusas e passam a ajudar na leitura do código.

---

## 💬 Diferença entre annotation e comentário

Comentário é apenas uma explicação textual ignorada pelo compilador.

```java
// Este método sobrescreve outro método
public void fazerSom() {
    System.out.println("Som");
}
```

Annotation pode ser interpretada pelo compilador, por ferramentas, bibliotecas ou frameworks.

```java
@Override
public void fazerSom() {
    System.out.println("Som");
}
```

A diferença é importante:

* comentário explica para humanos;
* annotation informa algo para o Java, compilador, ferramenta ou framework.

---

## 🔗 Relação com Java back-end

Em Java back-end, annotations aparecem muito em frameworks como Spring Boot.

Exemplos futuros:

```java
@RestController
@Service
@Autowired
@Entity
```

Neste momento, o foco ainda não é aprender Spring Boot. O importante agora é entender que essas annotations são usadas para dar informações extras ao framework sobre o papel de cada classe, método ou atributo.

Ou seja: entender annotations agora prepara a base para compreender melhor frameworks no futuro.

---

## ⚠️ Cuidados importantes

Não se deve usar annotation apenas porque parece profissional ou bonito.

Toda annotation deve ter uma finalidade.

Também é importante entender que nem toda annotation altera diretamente o comportamento do código. Algumas apenas informam algo. Outras podem ser usadas por ferramentas ou frameworks para gerar algum comportamento adicional.

---

## ✅ Aprendizado principal da aula

Annotations são metadados no código Java.

Elas podem parecer confusas no início, mas são fundamentais para escrever e entender códigos Java mais modernos, seguros e integrados com ferramentas e frameworks.

O primeiro exemplo importante desta seção é `@Override`, que já foi usado na seção de Herança e ajuda o compilador a validar se um método realmente está sendo sobrescrito.
