/*Atividade Aula 07*/

public class Main
{
	public static void main(String[] args) {
		Livro livro_1 = new Livro(); //definição do objeto 'livro_1' da classe 'Livro';
	    Livro livro_2 = new Livro(); //definição do objeto 'livro_2' da classe 'Livro';
	    
	    //Atributos livro_1:
	    livro_1.ISBN = "978-65-900484-1-7";
	    livro_1.titulo = "Ensaios em Cabos Isolados 1 a 35 kV";
	    livro_1.autor = "Rodrigo Ciarlini";
	    livro_1.editora = "Publicação independente";
	    livro_1.ano = 2020;
	    
	    //Atributos livro_2:
	    livro_2.ISBN = "978-85-216-3633-5";
	    livro_2.titulo = "Manual de Equipamentos Elétricos";
	    livro_2.autor = "João Mamede";
	    livro_2.editora = "LTC";
	    livro_2.ano = 2022;	    
	    
	    System.out.println("Usuário, abaixo segue os dados dos livros solicitados.");
	    System.out.print("Dados do livro 1: ");
	    System.out.println(livro_1.ISBN + ", " + livro_1.titulo + ", " + livro_1.autor + ", " + livro_1.editora + ", " + livro_1.ano + ".");
	    
	    System.out.print("Dados do livro 2: ");
        System.out.println(livro_2.ISBN + ", " + livro_2.titulo + ", " + livro_2.autor + ", " + livro_2.editora + ", " + livro_2.ano + ".");	    
	}
}
