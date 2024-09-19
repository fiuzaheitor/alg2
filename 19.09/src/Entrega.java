import java.util.Date;

public class Entrega {
    private Pedido pedido;
    private String endereco;
    private String status;

    public Entrega(String endereco, Pedido pedido){
        this.pedido = pedido;
        this.endereco = endereco;
        this.status = "Pendente";
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getStatus(){
        return this.status;
    }

    public Pedido getPedido(){
        return this.pedido;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void entregarPedido(){
        this.status = "Entregue";
    }

    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

}
