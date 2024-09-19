public class Produto {
    private String nome;
    private Float preco;

    public Produto(String nome, Float preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public Float getPreco(){
        return this.preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(Float preco){
        this.preco = preco;
    }
}
