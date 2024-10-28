package ordem;

public class Venda extends Ordem{

    public Venda(String ativo, int quantidade, double preco) {
        setAtivo(ativo);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    @Override
    public void executarOrdem() {
        System.out.println("Ordem de Venda Executada:");
        exibirDetalhes();
        //executar a ordem de venda
    }

}
