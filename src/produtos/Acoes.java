package produtos;

// Classe concreta para ações

public class Acoes extends RendaVariavel {

    private double dividendo;  // Rendimento por ação
    private int quantidade;     // Quantidade de ações

    // Construtor da classe
    public Acoes(String nome, double preco, double grauRisco, String ticker, 
                 double dividendo, int quantidade) {
        setNome(nome);
        setPreco(preco);
        setGrauRisco(grauRisco);
        setTicker(ticker);
        this.dividendo = dividendo;
        this.quantidade = quantidade;
    }

    // Implementação do método exibirDetalhes
    @Override
    public void exibirDetalhes() {
        System.out.printf("Produto: %s\nPreço: R$ %.2f\nGrau de Risco: %.2f\nTicker: %s\n" +
                          "Dividendo: R$ %.2f\nQuantidade de Ações: %d\n",
                          getNome(), getPreco(), getGrauRisco(), getTicker(), 
                          dividendo, quantidade);
    }

    @Override
    public String toString() {
        return "Ações - " + super.toString() + ", Dividendo: R$ " + dividendo + 
               ", Quantidade: " + quantidade;
    }
}
