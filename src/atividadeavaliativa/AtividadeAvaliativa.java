package atividadeavaliativa;
/**
 *
 * @author marcos
 */
public class AtividadeAvaliativa {

    public static void main(String[] args) {
        /*inicio do - teste dos metodos e classes */
        
        Fornecedor fornece = new Fornecedor("joao","rua");
        System.out.println(fornece.getNome()+" "+fornece.getEndereco());
        
        fornece.setEndereco("modifica o endereco");
        fornece.setNome("modifica o nome");
        fornece.setTelefone("modifica o telefone");
        
        System.out.println(fornece.getNome()+" "+fornece.getEndereco()+" "+fornece.getTelefone());
        
        /*fim do - teste dos metodos e classes */
        
        
        
        

    }
    
}
