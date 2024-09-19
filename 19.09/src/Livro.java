public class Livro {
    private String titulo;
    private String autor;  // Poderia criar uma classe "Autor"
    private Integer anoPublicacao;

    public Livro(String titulo, String autor, Integer anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public Integer getAnoPublicacao(){
        return this.anoPublicacao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnoPublicacao(Integer anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public void ExibirDetalhes(){
        System.out.println("Título: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nAno de Publicação: " + this.anoPublicacao);
    }
}
