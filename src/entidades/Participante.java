package entidades;

public abstract class Participante {

    // Classe mais abstrata do pacote Entidades, define métodos estáticos e variáveis.

    private static int totalUsuarios = 0;  // Contador para retornar o total de usuários e controlar os id's.
    private int id;
    private String nome;
    private String endereco;
    private String tipoParticipante; // Pessoa física, pessoa jurídica
    private String documentoIdentidade; // CPF para PF E CNPJ para PJ
    private String dataCadastro; // Data de criação da conta

    protected Participante() {
        gerarId(); // Gera o ID automaticamente quando o participante é criado
    }

    // Incrementa o id dinamicamente
    protected void gerarId() {
        totalUsuarios++;
        this.id = totalUsuarios;
    }

    public int getId() {
        return id; // Método para retornar o ID
    }

    // Método para setar o nome
    public void setNome(String nome) {
        // Se nome for nulo ou se a String for vazia
        if (nome == null || nome.trim().isEmpty()) { 
            this.nome = "Sem nome";
        } else {
            this.nome = nome.trim();  // Remover espaços em branco
        }
    }

    public String getNome() {
        return nome; // Método para retornar o nome
    }

    public String getEndereco() {
        return endereco; // Método para retornar o endereço
    }

    // Método para setar o endereço
    public void setEndereco(String endereco) {
        // Se endereço for nulo ou se a String for vazia
        if (endereco == null || endereco.trim().isEmpty()) {
            this.endereco = "Endereço não definido";
        } else {
            this.endereco = endereco.trim();  // Remover espaços em branco
        }
    }

    public String getTipoParticipante() {
        return tipoParticipante; // Método para retornar o tipo do participante
    }

    // Método para setar o tipo do participante
    public void setTipoParticipante(String tipoParticipante) {
        this.tipoParticipante = tipoParticipante;
    }

    public String getDocumentoIdentidade() {
        return documentoIdentidade; // Método para retornar o CPF ou CNPJ
    }

    // Método para setar o documento de identidade
    public void setDocumentoIdentidade(String documentoIdentidade) {
        this.documentoIdentidade = documentoIdentidade;  // Considerar validação se necessário
    }

    public String getDataCadastro() {
        return dataCadastro; // Método para retornar a data de cadastro
    }

    // Método para setar a data de cadastro
    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro; 
    }

    public static int getTotalUsuarios() {
        return totalUsuarios; // Retorna o total de usuários
    }

    public abstract void exibirDados(); // Método abstrato

    public String toString() {
        return String.format("ID: %d, Nome: %s, Endereço: %s, Tipo: %s, Documento: %s, Data de Cadastro: %s",
                             id, nome, endereco, tipoParticipante, documentoIdentidade, dataCadastro);
    }
}
