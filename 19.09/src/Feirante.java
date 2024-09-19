import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Feirante {
    private String nome;
    private ArrayList<Produto> produtos;
    private HashMap<Date, Produto> vendas;
    private HashMap<Date, Float> faturamentoDiario;

    public Feirante(String nome) {
        this.nome = nome;
        this.produtos = new ArrayList<Produto>();
        this.vendas = new HashMap<Date, Produto>();
        this.faturamentoDiario = new HashMap<Date, Float>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public void venderProduto(Produto produto) {
        this.vendas.put(new Date(), produto);
    }

    public void calcularFaturamentoDiario() {
        Float total = 0.0f;
        ArrayList<Produto> produtosVendidos = new ArrayList<Produto>();
        for (Date date : this.vendas.keySet()) {
            if (date.getDay() == new Date().getDay()) {
                produtosVendidos.add(this.vendas.get(date));
            }
        }
        for (Produto produto : produtosVendidos) {
            total += produto.getPreco();
        }
        this.faturamentoDiario.put(new Date(), total);
    }
}
