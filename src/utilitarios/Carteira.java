package utilitarios;
import java.util.*;


public class Carteira<T> implements Iterable<T>{
    
    private List<T> produtos;

    public Carteira(){
        produtos = new ArrayList<>();
    }

    // Método para adicionar um produto financeiro à carteira
    public void adicionarProduto(T produto) {
        if(produtos != null){
            produtos.add(produto);
        }
    }

    // Método para remover um produto financeiro da carteira
    public void removerProduto(T produto) {
        if (produtos != null){
            produtos.remove(produto);
        }
    }
    
    // Método para listar todos os produtos na carteira
/*  public void listarProdutos() {
        System.out.println("Produtos na carteira:");
        for (T produto : produtos) {
            produto.exibirDetalhes();
        }
    }*/

    // Método para obter a quantidade de produtos na carteira
    public int getQuantidadeProdutos() {
        return produtos.size();
    }

// Implementação do método iterator() da interface Iterable para funcionar o For Each
    @Override
    public Iterator<T> iterator() {
        return produtos.iterator(); // Usando o iterator interno do Vector
    }  

/*      // Método para imprimir todos os elementos do ArrayList
    public void imprimir() {
        for (T elemento : lista) { // For each
            System.out.println(elemento);  //To string
        }
    } */

}
