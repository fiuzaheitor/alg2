import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
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

    public void listarFuncionarios() {
        for (Funcionario funcionario : this.funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }

    public void folhaDePagamento() {
        Float total = 0.0f;
        for (Funcionario funcionario : this.funcionarios) {
            total += funcionario.getSalario();
        }
        System.out.println("Total da folha de pagamento: " + total);
    }
}
