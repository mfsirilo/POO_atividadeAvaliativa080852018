package atividadeavaliativa;

/**
 *
 * @author marcos
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    
    /*Contrutor padrão*/
    public Pessoa(){
        
    }
    
    public  Pessoa(String nome,String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }

    public Pessoa(String nome,String endereco,String telefone){
        this.endereco=endereco;
        this.nome=nome;
        this.telefone=telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
