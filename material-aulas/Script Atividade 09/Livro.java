public class Livro{
    //definição dos atributos;
    private String ISBN, titulo, autor, editora;
    private int ano;
    
    //Construtor 'Livro' com todos os atributos;
    Livro(String ISBN, String titulo, String autor, String editora, int ano){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }
    
    //Métodos acessadores (métodos get);
    public String get_ISBN(){
        return ISBN;
    }
    public String get_titulo(){
        return titulo;
    }
    public String get_autor(){
        return autor;
    }
    public String get_editora(){
        return editora;
    }
    public int get_ano(){
        return ano;
    }
    
    //Métodos modificadores (métodos set);
    public void set_ISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public void set_titulo(String titulo){
        this.titulo = titulo;
    }
    public void set_autor(String autor){
        this.autor = autor;
    }
    public void set_editora(String editora){
        this.editora = editora;
    }
    public void set_ano(int ano){
        this.ano = ano;
    }
}


