package entidades;

import produtos.Acoes;
import produtos.FundoImobiliario;
import produtos.ProdutoFinanceiro;
import produtos.TesouroDireto;

public abstract class Cliente extends Participante{

    private String conta;
    private double saldoConta;

    public void setConta(String conta){
        this.conta = conta;
        this.saldoConta = 0.00;
    }

    public String getConta(){
        return conta;
    }

    public double getSaldoConta(){
        return saldoConta;
    }

    public abstract void exibirDados();

    public void depositar(double valor){
        if(valor > 0){
            saldoConta += valor;
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

    public void exibirSaldo(){
        System.out.printf("O saldo da conta é de: R$ %.2f\n", saldoConta);
    }

    public void adicionarNaCarteira() {

    }

    public void validarSaldo(double valor) {
        if (valor > getSaldoConta()) {
            // retorna erro?????
        }
        saldoConta -= valor;
    }

    public void comprar(ProdutoFinanceiro produto, int quantidade) {
        // ver se o cliente vai no construtor ou aqui no método comprar

        double total = 0;
        if (produto instanceof Acoes) {
            total = quantidade*produto.getPreco();
        } else if (produto instanceof FundoImobiliario) {
            total = quantidade*produto.getPreco();
        } else if (produto instanceof TesouroDireto) {
            total = quantidade*produto.getPreco();
        }

        // validar saldo
        if (total > cliente.getSaldoConta()) {
            // retorna erro?????
        } else {
            cliente.adicionarNaCarteira(quantidade, produto);
        }
    }
}
