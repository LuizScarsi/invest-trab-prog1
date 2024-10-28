package produtos;

// Classe concreta para tesouros diretos

public class TesouroDireto extends RendaFixa {

    private String tipoTesouro;  // Ex: Tesouro Selic

    // Construtor da classe
    public TesouroDireto(String nome, double preco, double taxaJuros, String tipoTesouro) {
        setNome(nome);
        setPreco(preco);
        setTaxaJuros(taxaJuros);
        this.tipoTesouro = tipoTesouro;
    }

    // Implementação do método exibirDetalhes
    @Override
    public void exibirDetalhes() {
        System.out.printf("Produto: %s\nPreço: R$ %.2f\nTaxa de Juros: %.2f%%\nTipo de Tesouro: %s\n",
                          getNome(), getPreco(), getTaxaJuros(), tipoTesouro);
    }

    @Override
    public String toString() {
        return "Tesouro Direto - " + super.toString();
    }
}
