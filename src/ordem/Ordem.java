package ordem;
import produtos.*;

// Classe abstrata que representa uma ordem de compra ou venda de um ativo financeiro

public abstract class Ordem {

    private ProdutoFinanceiro ativo; // O ativo financeiro associado à ordem de compra ou venda
    private int quantidade; // A quantidade do ativo a ser comprada ou vendida

    // Método para definir o ativo financeiro da ordem
    public void setAtivo(ProdutoFinanceiro ativo) {
        this.ativo = ativo;
    }

    // Método para definir a quantidade do ativo
    public void setQuantidade(int quantidade) {
        // Verifica se a quantidade é maior que 0
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que 0.");
        } else {
            this.quantidade = quantidade; // Definir a quantidade somente se for válida
        }
    }

    // Método para obter o ativo financeiro da ordem
    public ProdutoFinanceiro getAtivo() {
        return ativo;
    }

    // Método para obter a quantidade do ativo
    public int getQuantidade() {
        return quantidade;
    }

    // Método para calcular o preço total da ordem
    public double calcularPrecoTotal() {
        // Verifica se o ativo não é nulo
        if (ativo != null) {
            // Calcula o preço total multiplicando a quantidade pelo preço do ativo
            return quantidade * ativo.getPreco();  
        }
        return 0.0; // Retorna 0.0 se o ativo for nulo
    }

    // Método abstrato
    public abstract void executarOrdem();

    // Método para exibir detalhes da ordem
    public void exibirDetalhes() {
        System.out.println("Ativo: " + (ativo != null ? ativo.getNome() : "N/A") + 
                           ", Quantidade: " + quantidade + 
                           ", Preço Total: R$ " + String.format("%.2f", calcularPrecoTotal()));
    }
}
