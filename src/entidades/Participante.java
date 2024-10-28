package entidades;

public abstract class Participante {

    private int id;
    private String nome;
    private String endereco;

    public void setNome(String nome){
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Sem nome";
         }
         else this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {  
        if (endereco == null || endereco.trim().isEmpty()) {
           this.endereco = "Sem endereço";
        }
        else this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setId(int id){
        this.id = id; //implementar um incremento de id com uma variavel global
    }

    public int getId(){
        return id;
    }

    public abstract void exibirDados();

    @Override
    public String toString(){
        return "Cadastro incompleto.";
    }

}
