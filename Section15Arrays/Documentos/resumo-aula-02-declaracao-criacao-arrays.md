# Resumo - Aula 02 - Declaração, Criação e Percurso de Arrays

Array em Java é uma estrutura usada para armazenar vários valores do mesmo tipo.

Uma variável comum armazena apenas um valor:

int idade = 38;

Um array pode armazenar vários valores:

int[] idades = new int[3];

Os índices de um array em Java começam em zero. Portanto, um array com 3 posições possui os índices 0, 1 e 2.

Exemplo:

int[] meuArray = new int[3];

meuArray[0] = 5;
meuArray[1] = 8;
meuArray[2] = 2;

Também é possível criar e preencher o array diretamente:

meuArray = new int[] {5, 8, 2};

Para acessar um elemento, usamos o nome do array e o índice entre colchetes:

System.out.println(meuArray[0]);

Para percorrer todo o array, usamos normalmente um laço for:

for (int i = 0; i < meuArray.length; i++) {
    System.out.println(meuArray[i]);
}

A propriedade length indica o tamanho do array. Em arrays, length não usa parênteses.

Cuidado: tentar acessar uma posição fora do limite do array gera erro. Um array com 3 posições vai do índice 0 ao índice 2.