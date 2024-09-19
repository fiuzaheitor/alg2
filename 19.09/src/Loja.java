import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Loja {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;
    private HashMap<Funcionario, Date> horaEntrada;
    private HashMap<Funcionario, Date> horaSaida;

    public Loja(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
        this.horaEntrada = new HashMap<Funcionario, Date>();
        this.horaSaida = new HashMap<Funcionario, Date>();
    }

    public String getNome() {
        return this.nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void contratarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void demitirFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void iniciarExpediente(Funcionario funcionario) {
        this.horaEntrada.put(funcionario, new Date());
    }

    public void encerrarExpediente(Funcionario funcionario) {
        this.horaSaida.put(funcionario, new Date());
    }

    public Date tempoTrabalhado(Funcionario funcionario) {
        Date entrada = this.horaEntrada.get(funcionario);
        Date saida = this.horaSaida.get(funcionario); //Poderia implementar para verificar o dia também
        return new Date(saida.getTime() - entrada.getTime());
    }
}
