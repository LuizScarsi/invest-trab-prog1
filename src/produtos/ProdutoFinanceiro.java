package produtos;

// Classe mais abstrata dos produtos financeiros, define as variáveis de nome e preço

public abstract class ProdutoFinanceiro {

    private String nome;
    private double preco;

    public double getPreco() {
        return preco; // Método para retornar o preço
    }

    // Método para setar o preço
    public void setPreco(double preco) {
        if (preco >= 0) { // Verifica se o valor é positivo
            this.preco = preco;
        } else {
            System.out.println("O preço deve ser um valor positivo!");
        }
    }

    public String getNome() {
        return nome; // Método para retornar o nome
    }

    // Método para setar o nome
    public void setNome(String nome) {
        // Se nome não for nulo ou vazio
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Produto Sem Nome";
        } else {
            this.nome = nome;
        }
    }

    // Método abstrato
    public abstract void exibirDetalhes();

    @Override
    public String toString() {
        return "ProdutoFinanceiro: " + nome + ", Preço: R$ " + preco;
    }
}
