public class Aluno {
    private String nome;
    private Float nota1;
    private Float nota2;

    public Aluno(String nome, Float nota1, Float nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome(){
        return this.nome;
    }

    public Float getNota1(){
        return this.nota1;
    }

    public Float getNota2(){
        return this.nota2;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota1(Float nota1){
        this.nota1 = nota1;
    }

    public void setNota2(Float nota2){
        this.nota2 = nota2;
    }

    public Float calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    public Boolean verificarAprovacao(){
        return this.calcularMedia() >= 7;
    }
}
