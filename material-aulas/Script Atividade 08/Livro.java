public class Livro{
    //Atributos;
    String ISBN, titulo, autor, editora;
    int ano;
    
    //Construtor 'Livro';
    Livro(String ISBN, String titulo, String autor, String editora, int ano){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }
    
    //Métodos;
    public String retorna_ISBN(){
        return ISBN;
    }
    public String retorna_titulo(){
        return titulo;
    }
    public String retorna_autor(){
        return autor;
    }
    public String retorna_editora(){
        return editora;
    }
    public int retorna_ano(){
        return ano;
    }
}