import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Integer numero;
    private Date data;
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    public Pedido(Integer numero, Cliente cliente, Date data){
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public Integer getNumero(){
        return this.numero;
    }

    public Date getData(){
        return this.data;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto){
        this.produtos.remove(produto);
    }

    public void exibirProdutos(){
        for (Produto produto : this.produtos){
            System.out.println("Produto: " + produto.getNome() + " - Preço: " + produto.getPreco() + " - Cliente: " + this.cliente.getNome());
        }
    }

    public Float calcularTotal(){
        Float total = 0.0f;
        for (Produto produto : this.produtos){
            total += produto.getPreco();
        }
        return total;
    }
}

