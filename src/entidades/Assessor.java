package entidades;

import produtos.*;

public class Assessor extends Participante{

    private String registro;
    private String areaEspecializacao;
    private double taxaComissaoRf;
    private double taxaComissaoRv;
    private double comissaoAcumulada;

    public Assessor(int id, String nome, String registro, String areaEspecializacao) {
        setId(id);
        setNome(nome);
        this.registro = registro;
        this.areaEspecializacao = areaEspecializacao;
        this.comissaoAcumulada = 0.00;
    }

    public void setRegistro(String registro){
        this.registro = registro;
    }

    public void setAreaEspecializao(String areaEspecializacao){
        this.areaEspecializacao = areaEspecializacao;
    }

    public void setTaxaComissaoRf(double taxaComissaoRf){
        this.taxaComissaoRf = taxaComissaoRf;
    }

    public void setTaxaComissaoRv(double taxaComissaoRv){
        this.taxaComissaoRv = taxaComissaoRv;
    }

    public String getRegistro(){
        return registro;
    }

    public String getAreaEspecializacao(){
        return areaEspecializacao;
    }

    public double getTaxaComissaoRf(){
        return taxaComissaoRf;
    }

    public double getTaxaComissaoRv(){
        return taxaComissaoRv;
    }

    public double getComissaoAcumulada(){
        return comissaoAcumulada;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome do assessor: "+ getNome() + "\nRegistro: " + registro);
    }

    public double calculaComissao(ProdutoFinanceiro produto, int quantidade){
        double valorTotal = produto.getValorInvestido() * quantidade;
        double comissao = 0.00;

        if (produto instanceof RendaFixa){
            comissao = valorTotal * (taxaComissaoRf / 100);
        } else if (produto instanceof RendaVariavel){
            comissao = valorTotal * (taxaComissaoRv / 100);
        }

        comissaoAcumulada += comissao;

        return comissao;
    }

}
