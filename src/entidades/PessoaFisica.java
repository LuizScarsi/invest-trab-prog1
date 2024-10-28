package entidades;

public class PessoaFisica extends Cliente{

    private String cpf;

    public PessoaFisica(int id, String nome, String conta, String cpf){
        setId(id);
        setNome(nome);
        setConta(conta);
        this.cpf = cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void exibirDados(){
        //implementar
    }

}
