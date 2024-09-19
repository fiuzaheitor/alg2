import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //1. Pessoa

        Pessoa pessoa1 = new Pessoa("João", 20);

        System.out.println
                ("Nome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade());

        pessoa1.Cumprimentar();

        //2. Calculadora

        Calculadora calculadora = new Calculadora();

        System.out.println
                ("Soma: " + calculadora.somar(10, 5) +
                        "\nSubtração: " + calculadora.subtrair(10, 5) +
                        "\nMultiplicação: " + calculadora.multiplicar(10, 5) +
                        "\nDivisão: " + calculadora.dividir(10, 5));

        //3. Aluno

        Aluno aluno1 = new Aluno("Heitor", 8.0f, 7.0f);

        System.out.println
                ("Nome: " + aluno1.getNome() +
                        "\nNota 1: " + aluno1.getNota1() +
                        "\nNota 2: " + aluno1.getNota2() +
                        "\nMédia: " + aluno1.calcularMedia() +
                        "\nAprovado: " + aluno1.verificarAprovacao());

        //4. Livro

        Livro livro1 = new Livro
                ("Declínio de um homem", "Osamu Dazai" , 1948);

        livro1.ExibirDetalhes();

        //5. Biblioteca

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.exibirLivros();
        biblioteca.buscarLivro("Declínio de um homem");
        biblioteca.removerLivro(livro1);

        //8. Pedido
        Cliente heitor = new Cliente("Heitor", "12345678910");
        Pedido pedido = new Pedido(1, heitor, new Date());

        Produto produto1 = new Produto("ESP8266", 50.0f);
        Produto produto2 = new Produto("Arduíno", 100.0f);

        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        pedido.exibirProdutos();
        System.out.println("Total: " + pedido.calcularTotal());
        pedido.removerProduto(produto1);
        pedido.exibirProdutos();
        System.out.println("Total: " + pedido.calcularTotal());

        //9. Empresa
        Funcionario heitorFuncionario = new Funcionario("Heitor", "12345678910",1000.0f);
        Funcionario alyssonFuncionario = new Funcionario("Alysson", "12345678911",2000.0f);

        Empresa empresa = new Empresa("Empresa", "12345678910");

        empresa.contratarFuncionario(heitorFuncionario);
        empresa.contratarFuncionario(alyssonFuncionario);
        empresa.listarFuncionarios();
        empresa.folhaDePagamento();
        empresa.demitirFuncionario(heitorFuncionario);
        empresa.listarFuncionarios();
        empresa.folhaDePagamento();

        //10. Loja

        Loja loja = new Loja("Loja", "12345678910");

        loja.contratarFuncionario(heitorFuncionario);
        loja.contratarFuncionario(alyssonFuncionario);

        loja.iniciarExpediente(heitorFuncionario);
        loja.iniciarExpediente(alyssonFuncionario);

        Thread.sleep(1000);

        loja.encerrarExpediente(heitorFuncionario);
        loja.encerrarExpediente(alyssonFuncionario);

        System.out.println("Tempo trabalhado Heitor: " + loja.tempoTrabalhado(heitorFuncionario));
        System.out.println("Tempo trabalhado Alysson: " + loja.tempoTrabalhado(alyssonFuncionario));

        //11. Feirante

        Feirante feirante = new Feirante("Feirante");

        feirante.adicionarProduto(produto1);
        feirante.adicionarProduto(produto2);

        feirante.venderProduto(produto1);
        feirante.venderProduto(produto2);
        feirante.venderProduto(produto2);

        feirante.calcularFaturamentoDiario();

        //12. Entregador

        Entregador entregador = new Entregador("Entregador", "12345678910");

        entregador.adicionarEntrega(new Entrega("Rua 1", pedido));
        entregador.entregarPedido(pedido);

        entregador.listarEntregas();
    }
}
