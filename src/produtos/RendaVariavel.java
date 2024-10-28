package produtos;

// Classe abstrata para produtos de Renda Fixa

public abstract class RendaVariavel extends ProdutoFinanceiro {

    private double grauRisco;
    private String ticker;

    // Método para setar o Ticker
    public void setTicker(String ticker) {
       // Se ticker for nullo ou estiver vazio  
        if (ticker == null || ticker.trim().isEmpty()) {
            this.ticker = "Ticker Não Definido";
        } else {
            this.ticker = ticker;
        }
    }

    // Método para setar o grau de risco
    public void setGrauRisco(double grauRisco) {
        if (grauRisco >= 0 && grauRisco <= 10) { // Risco de 0 a 10
            this.grauRisco = grauRisco;
        } else {
            System.out.println("O grau de risco deve estar entre 0 e 10.");
        }
    }

    // Método para retornar o grau de risco
    public double getGrauRisco() {
        return grauRisco;
    }

    // Método para retornar o ticker
    public String getTicker() {
        return ticker;
    }

    @Override
    public abstract void exibirDetalhes(); // Método abstrato
    
    @Override
    public String toString() {
        return super.toString() + ", Ticker: " + ticker + ", Grau de Risco: " + grauRisco;
    }
}
