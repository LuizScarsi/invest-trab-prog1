package ordem;
import produtos.*;
import entidades.*;

// Classe que representa uma ordem de venda de um ativo financeiro

public class Venda extends Ordem {

    private Cliente cliente;  // Cliente que está realizando a venda

    // Construtor da classe Venda
    public Venda(Cliente cliente, ProdutoFinanceiro ativo, int quantidade) {
        this.cliente = cliente;  // Armazena o cliente que está realizando a venda
        setAtivo(ativo);  // Configura o ativo da ordem
        setQuantidade(quantidade);  // Configura a quantidade do ativo
    }

    // Implementação do método para executar a ordem de venda
    @Override
    public void executarOrdem() {
        // Verifica se o cliente possui o ativo em quantidade suficiente para venda
        if (cliente.temAtivo(getAtivo(), getQuantidade())) {  
            double total = calcularPrecoTotal();  // Calcula o total da venda
            cliente.depositar(total);  // Adiciona o total ao saldo do cliente
            System.out.println("Ordem de Venda Executada:");
            exibirDetalhes(); // Exibe detalhes da ordem de venda
            // Remove o ativo da carteira do cliente
            cliente.removerDaCarteira(getAtivo(), getQuantidade());
        } else {
            System.out.println("Quantidade insuficiente de ativo para venda.");
        }
    }

    // Método para exibir detalhes da ordem de venda
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();  // Chama o método da classe pai para exibir detalhes básicos
        System.out.printf("Cliente: %s\n", cliente.getNome());  // Exibe o nome do cliente
    }
}
