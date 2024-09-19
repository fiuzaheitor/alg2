public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    private void setNome(String nome){
        if(nome.length() < 3){
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    private void setCpf(String cpf){
        if(cpf.length() != 11){
            throw new IllegalArgumentException("CPF inválido");
        }

        this.cpf = cpf;
    }
}
