import entidades.*;
import ordem.*;
import produtos.*;
import utilitarios.*;

public class App {
    public static void main(String[] args){
        
        boolean continuar = true;

        Carteira<ProdutoFinanceiro>carteira;

        carteira = new Carteira<>();

        TesouroDireto tesouro2027 = new TesouroDireto("'Tesouro 2027'", 1000.00, 10);

        carteira.adicionarProduto(tesouro2027);

        while(continuar){
            //interface inicial
            System.out.println("Bem-vindo a sua Plataforma de Investimentos!");
            System.out.println("Escolha uma ação:");
            System.out.println("1. Criar Ordem de Compra");
            System.out.println("2. Criar Ordem de Venda");
            System.out.println("3. Sair");

            int escolha = Teclado.readInt();

            switch (escolha) {
                case 1:
                    //criar ordem de compra
                    //criarOrdemDeCompra(escolha);
                    break;
                case 2:
                    //criar ordem de venda
                    //criarOrdemDeVenda(escolha);
                    break;
                case 3:
                    //sair do sistema
                    continuar = false;
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    //implementar métodos nas classes de ordem
    /*private static void criarOrdemDeCompra(int escolha) {
        System.out.println("Criando Ordem de Compra...");
    
        System.out.print("Digite o nome do ativo: ");
        String ativo = Teclado.readString();
    
        System.out.print("Digite a quantidade: ");
        int quantidade = Teclado.readInt();
    
        System.out.print("Digite o preço por unidade: ");
        double preco = Teclado.readDouble();
    
        Compra compra = new Compra(ativo, quantidade, preco);
        compra.executarOrdem();
    }
    
    private static void criarOrdemDeVenda(int escolha) {
        System.out.println("Criando Ordem de Venda...");
    
        System.out.print("Digite o nome do ativo: ");
        String ativo = Teclado.readString();
    
        System.out.print("Digite a quantidade: ");
        int quantidade = Teclado.readInt();
    
        System.out.print("Digite o preço por unidade: ");
        double preco = Teclado.readDouble();
    
        Venda venda = new Venda(ativo, quantidade, preco);
        venda.executarOrdem();
    }*/
    
}

