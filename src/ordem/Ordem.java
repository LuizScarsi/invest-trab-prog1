package ordem;

public abstract class Ordem {

    private String ativo;
    private int quantidade;
    private double preco; //ajustar, não deve informar o preço na ordem, vai calcular o preço com base na quantidade/preço do ativo

    public void setAtivo(String ativo){
        this.ativo = ativo;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getAtivo(){
        return ativo;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double getPreco(){
        return preco;
    }

    public abstract void executarOrdem();

    public void exibirDetalhes() {
        System.out.println("Ativo: " + ativo + ", Quantidade: " + quantidade + ", Preço: R$ " + preco);
    }
    
}
