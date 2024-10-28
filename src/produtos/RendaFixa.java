package produtos;

public abstract class RendaFixa extends ProdutoFinanceiro{

    public double taxaJuros;

    public void setTaxaJuros(double taxaJuros){
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros(){
        return taxaJuros;
    }

    public abstract void exibirDetalhes();
}
