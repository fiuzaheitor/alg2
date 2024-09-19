public class Funcionario {
    private String nome;
    private String cpf;
    private Float salario;

    public Funcionario(String nome, String cpf, Float salario){
        setNome(nome);
        setCpf(cpf);
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public Float getSalario(){
        return this.salario;
    }

    private void setNome(String nome){
        if(nome.length() < 3){
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    private void setCpf(String cpf) {
        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido");
        }

        this.cpf = cpf;
    }

    public void setSalario(Float salario){
        this.salario = salario;
    }
}
