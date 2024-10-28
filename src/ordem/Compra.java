package ordem;
import produtos.*;
import entidades.*;

public class Compra extends Ordem{

    public Compra(String ativo, int quantidade, double preco) {
        setAtivo(ativo);
        setQuantidade(quantidade);
        setPreco(preco);
    }

    @Override
    public void executarOrdem() {
        System.out.println("Ordem de Compra Executada:");
        exibirDetalhes();
        //executar a ordem de compra
    }


}
