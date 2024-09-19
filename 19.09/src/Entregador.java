import java.util.ArrayList;

public class Entregador {
    private String nome;
    private String cpf;
    private ArrayList<Entrega> entregas;

    public Entregador(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.entregas = new ArrayList<Entrega>();
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarEntrega(Entrega entrega) {
        this.entregas.add(entrega);
    }

    public void removerEntrega(Entrega entrega) {
        this.entregas.remove(entrega);
    }

    public void entregarPedido(Pedido pedido){
        for (Entrega entrega : this.entregas) {
            if (entrega.getPedido().equals(pedido)) {
                entrega.entregarPedido();
            }
        }
    }

    public void listarEntregas() {
        for (Entrega entrega : this.entregas) {
            System.out.println("Pedido: " + entrega.getPedido().getNumero() +
                    "\nEndereço: " + entrega.getEndereco() +
                    "\nStatus: " + entrega.getStatus());
        }
    }
}
