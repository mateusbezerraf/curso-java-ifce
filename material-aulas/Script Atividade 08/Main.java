/*Atividade Aula 08*/

public class Main{
	public static void main(String[] args) {
		//Criação de objetos com construtor não vazio;
		Livro livro_1 = new Livro("978-65-900484-1-7", "Ensaios em Cabos Isolados 1 a 35 kV", "Rodrigo Ciarlini", "Publicação independente", 2020);
		Livro livro_2 = new Livro("978-85-216-3633-5", "Manual de Equipamentos Elétricos", "João Mamede", "LTC", 2022);
	
	    System.out.println("Usuário, abaixo segue os dados dos livros solicitados.");
	    System.out.print("Dados do livro 1: ");
	    System.out.println(livro_1.ISBN + ", " + livro_1.titulo + ", " + livro_1.autor + ", " + livro_1.editora + ", " + livro_1.ano + ".");
	    
	    System.out.print("Dados do livro 2: ");
        System.out.println(livro_2.ISBN + ", " + livro_2.titulo + ", " + livro_2.autor + ", " + livro_2.editora + ", " + livro_2.ano + ".");	    
	    System.out.println(); //pula uma linha;
	    
	    System.out.println("Utilizando um método para exibir os dados novamente.");
	    System.out.println("Usuário, abaixo segue os dados dos livros solicitados.");
	    System.out.print("Dados do livro 1: ");
	    System.out.println(livro_1.retorna_ISBN() + ", " + livro_1.retorna_titulo() + ", " + livro_1.retorna_autor() + ", " + livro_1.retorna_editora() + ", " + livro_1.retorna_ano() + ".");
	
	    System.out.print("Dados do livro 2: ");
	    System.out.println(livro_2.retorna_ISBN() + ", " + livro_2.retorna_titulo() + ", " + livro_2.retorna_autor() + ", " + livro_2.retorna_editora() + ", " + livro_2.retorna_ano() + ".");
	}
}
