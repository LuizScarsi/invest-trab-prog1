package utilitarios;
import produtos.*;
import ordem.*;
import java.util.*;

// Classe concreta que representa uma carteira de produtos financeiros

public class Carteira<T> implements Iterable<T> {

    // Lista para armazenar produtos financeiros
    private List<T> produtos;

    // Construtor da classe que inicializa a lista de produtos
    public Carteira() {
        produtos = new ArrayList<>();
    }

    // Método para adicionar um produto financeiro à carteira
    public void adicionarProduto(T produto) {
        if (produto != null) { // Verifica se o produto não é nulo
            produtos.add(produto); // Adiciona o produto à lista
        } else {
            System.out.println("Produto não pode ser nulo.");
        }
    }

    // Método para remover um produto financeiro da carteira
    public void removerProduto(T produto) {
        if (produto != null) { // Verifica se o produto não é nulo
            // Tenta remover o produto da lista e informa se foi removido ou não encontrado
            if (produtos.remove(produto)) // Retorna true ou false
            {
                System.out.println("Produto removido da carteira.");
            } else {
                System.out.println("Produto não encontrado na carteira.");
            }
        } else {
            System.out.println("Produto não pode ser nulo.");
        }
    }
    
    // Método para listar todos os produtos na carteira
    public void listarProdutos() {
        if (produtos.isEmpty()) { // Verifica se a carteira está vazia
            System.out.println("A carteira está vazia.");
        } else {
            System.out.println("Produtos na carteira:");
            for (T produto : produtos) {
                 // Se o produto for do tipo ProdutoFinanceiro, exibe os detalhes específicos
                if (produto instanceof ProdutoFinanceiro) {
                    ((ProdutoFinanceiro) produto).exibirDetalhes();
                } else {
                    // Exibe o toString() para outros tipos
                    System.out.println(produto.toString());
                }
            }
        }
    }

    // Método para obter a quantidade de produtos na carteira
    public int getQuantidadeProdutos() {
        return produtos.size(); // Retorna o tamanho da lista de produtos
    }

    // Implementação do método iterator() da interface Iterable para funcionar com o For Each
    @Override
    public Iterator<T> iterator() {
        return produtos.iterator(); // Retorna o iterator da lista de produtos
    }  
}
