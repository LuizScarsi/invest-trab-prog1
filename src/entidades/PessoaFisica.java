package entidades;

public class PessoaFisica extends Cliente {

    // Construtor que inicializa somente atributos essenciais
    public PessoaFisica(String nome, String conta, String documentoIdentidade) {
        super();  // Chama o construtor da classe pai (Cliente)
        setNome(nome);
        setConta(conta);
        setDocumentoIdentidade(documentoIdentidade);
        setTipoParticipante("Pessoa Física"); 
        // Define a data de cadastro como a data atual
        setDataCadastro(java.time.LocalDate.now().toString());
    }

    // Construtor que inicializa todos os atributos
    public PessoaFisica(String nome, String conta, String endereco, String tipoParticipante, 
                        String documentoIdentidade) {
        super();  // Chama o construtor da classe pai (Cliente)
        setNome(nome);
        setConta(conta);
        setEndereco(endereco);
        setTipoParticipante(tipoParticipante);
        setDocumentoIdentidade(documentoIdentidade);
        setDataCadastro(java.time.LocalDate.now().toString());
    }

    // Método para exibir os dados da pessoa física
    @Override
    public void exibirDados() {
        System.out.println("Dados da Pessoa Física:");
        System.out.printf("ID: %d, Nome: %s, Conta: %s, Saldo: R$ %.2f, Documento: %s\n", 
                          getId(), getNome(), getConta(), getSaldoConta(), getDocumentoIdentidade());
    }

    @Override
    public String toString() {
        return "Pessoa Física - " + super.toString();
    }
}
