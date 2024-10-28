package produtos;

// Classe concreta para fundos imobiliários

public class FundoImobiliario extends RendaVariavel { 

    private double rendimentoMensal;  // Rendimento mensal do fundo

    // Construtor da classe
    public FundoImobiliario(String nome, double preco, double grauRisco, String ticker, 
                             double rendimentoMensal) {
        setNome(nome);
        setPreco(preco);
        setGrauRisco(grauRisco);
        setTicker(ticker);
        this.rendimentoMensal = rendimentoMensal;
    }

    // Método para exibir os detalhes
    @Override
    public void exibirDetalhes() {
        System.out.printf("Produto: %s\nPreço: R$ %.2f\nGrau de Risco: %.2f\nTicker: %s\n" +
                          "Rendimento Mensal: R$ %.2f\n",
                          getNome(), getPreco(), getGrauRisco(), getTicker(), 
                          this.rendimentoMensal);
    }

    @Override
    public String toString() {
        return "Fundo Imobiliário - " + super.toString() + ", Rendimento Mensal: R$ " + rendimentoMensal;
    }
}
