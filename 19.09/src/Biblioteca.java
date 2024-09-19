import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public void removerLivro(Livro livro){
        this.livros.remove(livro);
    }

    public void exibirLivros(){
        for (Livro livro : this.livros){
            livro.ExibirDetalhes();
        }
    }

    public void buscarLivro(String titulo){
        for (Livro livro : this.livros){
            if (livro.getTitulo().equals(titulo)){
                livro.ExibirDetalhes();
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

}
