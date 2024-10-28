package entidades;

public class PessoaJuridica extends Cliente{

    private String cnpj;

    public PessoaJuridica(int id, String nome, String conta, String cnpj){
        setId(id);
        setNome(nome);
        setConta(conta);
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void exibirDados(){
        //implementar
    }

}
