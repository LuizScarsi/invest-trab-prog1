package ordem;
import produtos.*;
import entidades.*;

// Classe que representa uma ordem de compra de um ativo financeiro

public class Compra extends Ordem {

    private Cliente cliente;  // Cliente que está realizando a compra

    // Construtor da classe Compra
    public Compra(Cliente cliente, ProdutoFinanceiro ativo, int quantidade) {
        this.cliente = cliente;  // Armazena o cliente que está realizando a compra
        setAtivo(ativo);  // Configura o ativo da ordem
        setQuantidade(quantidade);  // Configura a quantidade do ativo
    }

    // Implementação do método para executar a ordem de compra
    @Override
    public void executarOrdem() {
        // Calcula o total da compra
        double total = calcularPrecoTotal();
        // Verifica se o cliente tem saldo suficiente para a compra
        if (cliente.getSaldoConta() >= total) {
            cliente.depositar(-total);  // Deduzir o total do saldo do cliente
            System.out.println("Ordem de Compra Executada:");
            exibirDetalhes(); // Exibe detalhes da ordem de compra
            // Adiciona o ativo à carteira do cliente
            cliente.adicionarNaCarteira(getAtivo(), getQuantidade());
        } else {
            System.out.println("Saldo insuficiente para a compra.");
        }
    }

    // Método para exibir detalhes da ordem de compra
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();  // Chama o método da classe pai para exibir detalhes básicos
        System.out.printf("Cliente: %s\n", cliente.getNome());  // Exibe o nome do cliente
    }
}
