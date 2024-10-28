import entidades.*;
import ordem.*;
import produtos.*;
import utilitarios.*;

public class App {
    public static void main(String[] args) {

        /*
        * - Implementar métodos para criar novos produtos (ações, fundos...) interagindo com o usuário
        * - Desenvolver a classe App.java 
        * - Verificar se é possível acrescentar a classe Assessor.java (re-configurar os métodos para a classe funcionar)
        * - Podemos implementar melhoras nas classes, otimizar os códigos... 
        */

        // Criando algumas ações
        Acoes petrobras = new Acoes("Petrobras S.A.", 34.50, 9, "PETR4",6.5, 100);
        Acoes magazineLuiza = new Acoes("Magazine Luiza S.A.", 3.50, 8.0, "MGLU3", 1.2, 200);
        Acoes itau = new Acoes("Itaú Unibanco Holding S.A", 27.80, 6.0, "ITUB4", 5.8, 300);
        Acoes vale = new Acoes("VALE S.A.", 60.00, 5.0, "VALE3", 7.1, 500); 
         
        // Criando tesouros diretos
        TesouroDireto selic = new TesouroDireto("Tesouro Selic", 100.00, 12.75, "Tesouro Selic");
        TesouroDireto cdb = new TesouroDireto("CDB (Certificado de Depósito Bancário) de Grandes Bancos", 500.00, 90.00, "Tesouro CDB");

        // Criando um fundo imobiliário
        FundoImobiliario shoppingVinci = new FundoImobiliario("Vinci Shopping Centers", 100.00, 2.0, "VISC11", 0.70);

        // Criando clientes
        Cliente cliente1 = new PessoaFisica("João Silva", "123456", "12345678900");
        Cliente cliente2 = new PessoaJuridica("Empresa XYZ", "654321", "98765432000195");

        boolean continuar = true;

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
        
         /* 
         Exemplo para depositar dinheiro nas contas dos clientes
         cliente1.depositar(500.0);
         cliente2.depositar(1000.0);
 
         // Exemplo para exibir saldos
         cliente1.exibirSaldo();
         cliente2.exibirSaldo();
 
         // Exemplo para realizar compras
         Compra compra1 = new Compra(cliente1, magazineLuiza, 5);
         compra1.executarOrdem(); // Executa a compra
 
         // Exemplo para listar carteiras
         System.out.println("Carteira do João:");
         cliente1.listarCarteira();
 
         System.out.println("Carteira da Empresa XYZ:");
         cliente2.listarCarteira();
 
         // Exemplo para realizar vendas
         Venda venda1 = new Venda(cliente1, magazineLuiza, 2);
         venda1.executarOrdem(); // Executa a venda
 
         // Exemplo para exibir saldos após venda
         cliente1.exibirSaldo();
         */        
    }
}
   