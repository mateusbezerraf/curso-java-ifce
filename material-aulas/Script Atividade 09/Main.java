/* Atividade Aula 09 - Encapsulamento*/


public class Main
{
	public static void main(String[] args) {
		//criação de dois objetos da classe 'Livro'; //Na criação dos objetos já defini-se os atributos;
		Livro livro_1 = new Livro("978-65-900484-1-7", "Ensaios em Cabos Isolados 1 a 35 kV", "Rodrigo Ciarlini", "Publicação independente", 2020);
		Livro livro_2 = new Livro("978-85-216-3633-5", "Manual de Equipamentos Elétricos", "João Mamede", "LTC", 2022);
		
		System.out.println("Usuário, abaixo segue os dados dos livros solicitados: ");
		System.out.println("Dados do livro 1: " + livro_1.get_ISBN() + ", " + livro_1.get_titulo() + ", " + livro_1.get_autor() + ", " + livro_1.get_editora() + ", " + livro_1.get_ano() + ".");
		System.out.println("Dados do livro 2: " + livro_2.get_ISBN() + ", " + livro_2.get_titulo() + ", " + livro_2.get_autor() + ", " + livro_2.get_editora() + ", " + livro_2.get_ano() + ".");
        System.out.println();
        
        System.out.println("Usuário, abaixo segue os dados CORRIGIDOS dos livros solicitados: ");
        livro_1.set_titulo("Ensaios em Cabos Isolados de Média Tensão");
        livro_1.set_ano(2023);
        livro_2.set_autor("João Mamede Filho");
        livro_2.set_ano(2023);
        System.out.println("Dados do livro 1: " + livro_1.get_ISBN() + ", " + livro_1.get_titulo() + ", " + livro_1.get_autor() + ", " + livro_1.get_editora() + ", " + livro_1.get_ano() + ".");
		System.out.println("Dados do livro 2: " + livro_2.get_ISBN() + ", " + livro_2.get_titulo() + ", " + livro_2.get_autor() + ", " + livro_2.get_editora() + ", " + livro_2.get_ano() + ".");

	}
}