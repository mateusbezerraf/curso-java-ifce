/* <- (abertura do comentário multilinha)
* Autor: Mateus Bezerra;
* Data: 05/11/2023;
* Fonte: IFCE - Aula 01 - Conceitos iniciais;

Tópicos da aula:
  Saída de dados;     
  Entrada de dadps; 
  String;
  
(fechamento do comentário multilinha) -> */

/*
* Saída de dados: é a saída de dados no console para apresentar ao usuário;

* Comando:
    System.out.print(conteudo);
    System.out.println(conteudo); imprime o conteudo e pula uma linha;
    
    Lembrando que, o conteúdo pode ser um texto vazio, o dado de uma variável (texto, inteiro, decimal e etc) ou o texto concatenado com um dado de uma 
    variável;
    
    System.out.println(); não imprime nada, apenas pula uma linha;
    System.out.println("Hello World"); imprime o texto Hello World;
    System.out.println(num1); imprime o dado contido na variável num1 e pula uma linha;
    
* Concatenação: juntar dois ou mais dados;  
    concatenar: + (soma)
    
    Lembrando que, se forem dois ou mais dados númericos, o operador realizará a soma; a concatenção é realizada em 
    dois ou mais dados de tipos diferente e a saída padrão é no formato texto;

* Comando saída formatada: utiliza marcadores temporários que serão substituidas pelas variáveis;
    System.out.printf();

    Marcadores temporários: %d: int; %s: String; %f: float; %c: char;

    System.out.printf("Os numeros sao %d e %d.\n", num1, num2);

    
* Entrada de dados: é a entrada de dados a partir do usuário;
    O Java não vem com o comando de entrada de dados por padrão, por isso é necessário importa-lo;
    
    1. Importe a classe Scanner a partir de: import java.util.Scanner;
    2. Instanciar um objeto da classe Scanner: Scanner nomeDoObjeto = new Scanner(System.in);
    3. Utilizar métodos do objeto para ler o dado digitado pelo usuário, é necessário guardar essa informação em uma variável, faça da forma abaixo:
    p/ int: int idade = nomeDoObjeto.nextInt(); a variável idade recebe o dado digitado pelo usuário, o método para leitura nesse caso é o nextInt();
    p/ String: String nome = nomeDoObjeto.nextLine();
    p/ Float: float peso = nomeDoObjeto.nextFloat();

*/

import java.util.Scanner;
public class EntradaESaidaDeDados {
    public static void main (String[] agrs){
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Usuario, digite uma medida em polegadas (in): ");
        double MedPol = leitor.nextDouble();
        double MedCm = MedPol*2.54;

        System.out.println();
        System.out.println("A medida digitada em polegadas é: " + MedPol);

    }
    
}