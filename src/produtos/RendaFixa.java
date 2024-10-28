package produtos;

// Classe abstrata para produtos de Renda Fixa

public abstract class RendaFixa extends ProdutoFinanceiro {

    private double taxaJuros;

    // Método para setar a taxa de juros
    public void setTaxaJuros(double taxaJuros) {
        if (taxaJuros >= 0) { // Valor precisa ser positivo
            this.taxaJuros = taxaJuros;
        } else {
            System.out.println("A taxa de juros precisa ser um valor positivo.");
        }
    }


    // Método para retornar a taxa de juros
    public double getTaxaJuros() {
        return taxaJuros;
    }

    @Override
    public abstract void exibirDetalhes(); // Método abstrato

    @Override
    public String toString() {
        return super.toString() + ", Taxa de Juros: " + taxaJuros + "%";
    }
}
