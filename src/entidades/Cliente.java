package entidades;
import produtos.*;
import utilitarios.Carteira;
import ordem.*;

// Classe abstrata com métodos para depositar/sacar e adicionar informações na carteira

public abstract class Cliente extends Participante {

    private String conta;
    private double saldoConta;
    private Carteira<ProdutoFinanceiro> carteira; // Adicionando a carteira do cliente

    public Cliente() {
        this.saldoConta = 0.00; // Saldo inicial é zerado
        this.carteira = new Carteira<>(); // Inicializando a carteira
    }

    public void setConta(String conta) {
        this.conta = conta; // Método para setar o número da conta
    }

    public String getConta() {
        return conta;  // Método para retornar o número da conta
    }

    public double getSaldoConta() {
        return saldoConta;  // Método para retornar o saldo da conta
    }

    public abstract void exibirDados(); // Método abstrato

    // Método para depósito
    public void depositar(double valor) {
        if (valor > 0) { // Valor precisa ser positivo
            saldoConta += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    // Método para exibir o saldo da conta
    public void exibirSaldo() {
        System.out.printf("O saldo da conta é de: R$ %.2f\n", getSaldoConta());
    }

    // Método para adicionar um produto financeiro na carteira do cliente
    public void adicionarNaCarteira(ProdutoFinanceiro produto, int quantidade) {
        // Se o produto não for nulo e ser maior do que 0
        if (produto != null && quantidade > 0) {
            // Loop para adicionar o produto à carteira o número de vezes especificado pela quantidade
            for (int i = 0; i < quantidade; i++) {
                carteira.adicionarProduto(produto); // Adiciona o produto à carteira
            }
            System.out.printf("Adicionado %d de %s à carteira.\n", quantidade, produto.getNome());
        } else {
            System.out.println("Produto inválido ou quantidade inválida.");
        }
    }
    
    // Método para remover um produto da carteira
    public void removerDaCarteira(ProdutoFinanceiro ativo, int quantidade) {
        // Se o ativo não fur nulo e for maior do que 0
        if (ativo != null && quantidade > 0) {
            // Loop para tentar remover o ativo o número de vezes especificado pela quantidade
            for (int i = 0; i < quantidade; i++) {
                // Verifica se há pelo menos um ativo disponível para remoção
                if (temAtivo(ativo, 1)) {
                    carteira.removerProduto(ativo); // Remove um produto da carteira
                } else {
                    System.out.println("Quantidade insuficiente do ativo para remoção.");
                    break; // Sai do loop se não houver mais ativos para remover
                }
            }
        // Se o ativo for nulo ou a quantidade for inválida, exibe uma mensagem de erro
        } else {
            System.out.println("Ativo inválido ou quantidade incorreta.");
        }
    }

    // Método para verificar se tem uma quantidade x de um y ativo na carteira
    public boolean temAtivo(ProdutoFinanceiro ativo, int quantidade) {
        int count = 0; // Inicializa um contador para contar o número de ocorrências do ativo
        // Percorre cada produto na carteira
        for (ProdutoFinanceiro produto : carteira) {
            // Verifica se o produto atual é igual ao ativo especificado
            if (produto.equals(ativo)) {
                count++; // Incrementa o contador se o ativo for encontrado
            }
        }
        return count >= quantidade; // Retorna verdadeiro se a quantidade de ativos for suficiente
    }
    
    // Método para validar se o saldo da conta é suficiente para uma operação
    public boolean validarSaldo(double valor) {
        // Retorna verdadeiro se o valor desejado for menor ou igual ao saldo disponível na conta
        return valor <= getSaldoConta();
    }

    // Método que retorna um objeto do tipo carteira
    public Carteira<ProdutoFinanceiro> getCarteira() {
        return carteira;
    }

    // Método para listar os produtor da carteira do cliente
    public void listarCarteira() {
        carteira.listarProdutos(); // Exibe os produtos na carteira
    }

    public void comprarAcao(ProdutoFinanceiro ativo, int quantidade) {
        Compra compra;
        compra = new Compra(this, ativo, quantidade);
        compra.executarOrdem();

        carteira.adicionarProduto(ativo);
    }

    public void venderAcao(ProdutoFinanceiro ativo, int quantidade) {
        Venda venda;
        venda = new Venda(this, ativo, quantidade);
        venda.executarOrdem();

        carteira.removerProduto(ativo);
    }

}
