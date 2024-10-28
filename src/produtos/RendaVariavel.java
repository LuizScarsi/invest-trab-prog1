package produtos;

public abstract class RendaVariavel extends ProdutoFinanceiro{
    private double grauRisco;
    private String ticker;


    public void setTicker(String ticker){
        this.ticker = ticker;
    }

    public void setGrauRisco(double grauRisco){
        this.grauRisco = grauRisco;
    }

    public double getGrauRisco(){
        return grauRisco;
    }

    public String getTicker(){
        return ticker;
    }

    public abstract void exibirDetalhes();
}
