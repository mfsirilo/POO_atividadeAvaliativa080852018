package atividadeavaliativa;

/**
 *
 * @author marcos
 */
public class AtividadeAvaliativa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        String nome, endreco, telefone;
        Empregado empregado = new Empregado("", "", "");

        /*inicio do - teste dos metodos e classes */
        Fornecedor fornece = new Fornecedor("joao", "rua");
        System.out.println(fornece.getNome() + " " + fornece.getEndereco());

        fornece.setEndereco("modifica o endereco");
        fornece.setNome("modifica o nome");
        fornece.setTelefone("modifica o telefone");

        System.out.println(fornece.getNome() + " " + fornece.getEndereco() + " " + fornece.getTelefone());

        /*fim do - teste dos metodos e classes */
        
        /*inicio do - teste dos metodos e classes */
        System.out.println("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is", pessoa.getNome());
        System.out.printf("%s %s%n", "First name is", pessoa.getEndereco());
        System.out.printf("%s %s%n", "First name is", pessoa.getTelefone());
        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", empregado.toString());

        /*fim do - teste dos metodos e classes */
    }

}
