/* <- (abertura do comentário multilinha)
* Autor: Mateus Bezerra;
* Data: 05/11/2023;
* Fonte: IFCE - Aula 01 - Conceitos iniciais;

Tópicos da aula:
  Sintaxe básica da classe Java;     
  Variável: definição, declaração e tipos de dados; 
  Operadores: aritméticos, de comparação, lógicos e incremento/decremento;
  
(fechamento do comentário multilinha) -> */

/* 
* Sintaxe básica da classe Java:

public class NomeDaClasse{
    public static void main(String[] args){
        //codificação;
    }
}

* É importante ter em mente que, um arquivo Java (.java) nada mais é que uma classe; 
* o nome dado ao arquivo Java (.java) deve ser o mesmo dado a classe; existe uma padronização de mercado para nomear uma classe
e assim um arquivo Java (.java), chamada de Camelcase;
Camelcase: a primeira letra de cada palavra que compôe o nome da classe deve ser em maiúscula, as demais letras em minúsculas, 
a exemplo, a classe "HelloWorld"; nesse caso o nome do arquivo fica, HelloWorld.java;

*/

/* 
* Variável: 
    é um espaço da memória (hardware) definido por um "nome" e um "tipo de dado" com a função de armazenar valores/dados
    do tipo definido; a ideia de utilizar uma variável é, armazenar algum dado para o uso deste dado no programa;  

* Declaração: 
    Inicialização s/dado: <nome> <tipo_de_dado>; dado a ser definido durante o processamento do programa;
    Inicialização c/ dado: <nome> <tipo_de_dado> = <dado>;

* Tipos de dados:
    inteiro: byte, short, int, long; int é mais utilizado nos programas;
    ponto flutuante: float e double; float é mais utilizado;
    lógico: boolean (true ou false);
    caracter: char e String; String é um caso especial, pois em Java é uma classe, possui métodos;
    
*/

/*
* Operadores:
    
* Aritméticos: utilizados em operações matemáticas;
     Atribuição: = (igual)
     Soma: +
     Subtração: -
     Divisão: / (barra)
     Resto da divisão: %

* Comparação: utilizados em condicionais;
    maior que: >
    menor que: <
    é igual a: ==
    é diferente a: !=
    é maior ou igual a: >=
    é menor ou igual a: <=
     
* Lógico:
    Não: !
    E: &&
    Ou: ||
    
* Incremento/decremento:
  mais uma und: ++
  menos uma und: --
    
*/


public class Variavel {
	public static void main(String[] args) {
    //print direto de um texto
    System.out.println("Hello World");
    
    //print de uma variável que o dado é um texto
    String message = "Hello World";
    System.out.println(message);
    System.out.println("Hello World");
	}
}



