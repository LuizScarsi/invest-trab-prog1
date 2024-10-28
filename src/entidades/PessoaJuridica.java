package entidades;

public class PessoaJuridica extends Cliente {

    // Construtor que inicializa somente atributos essenciais
    public PessoaJuridica(String nome, String conta, String documentoIdentidade) {
        super();  // Chama o construtor da classe pai (Cliente)
        setNome(nome);
        setConta(conta);
        setDocumentoIdentidade(documentoIdentidade);
        setTipoParticipante("Pessoa Jurídica");
        // Define a data de cadastro como a data atual
        setDataCadastro(java.time.LocalDate.now().toString());  
    }

    // Construtor que inicializa todos os atributos
    public PessoaJuridica(String nome, String conta, String endereco, String tipoParticipante, 
                          String documentoIdentidade) {
        super();  // Chama o construtor da classe pai (Cliente)
        setNome(nome);
        setConta(conta);
        setEndereco(endereco);
        setTipoParticipante(tipoParticipante);
        setDocumentoIdentidade(documentoIdentidade);
        setDataCadastro(java.time.LocalDate.now().toString()); 
    }

    // Método para exibir dados da pessoa jurídica
    @Override
    public void exibirDados() {
        System.out.println("Dados da Pessoa Jurídica:");
        System.out.printf("ID: %d, Nome: %s, Conta: %s, Saldo: R$ %.2f, Documento: %s, Data de Cadastro: %s\n", 
                          getId(), getNome(), getConta(), getSaldoConta(), getDocumentoIdentidade(), getDataCadastro());
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica - " + super.toString();
    }
}
