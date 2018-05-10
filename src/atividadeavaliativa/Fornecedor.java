package atividadeavaliativa;

/**
 *
 * @author marcos
 */
public class Fornecedor extends Pessoa {

    private float valorCredito;/*credito máximo atribuído ao fornecedor*/
    private float valorDivida;/*montante de dívida para com o fornecedor*/
    
    public Fornecedor(){
        super();
    }
    
    public Fornecedor(String nome, String endereco){
        super(nome,endereco);
    }
    
    public Fornecedor (String nome,String endereco,String telefone){
        super(nome,endereco,telefone);
    }


    public float obterSaldo() {
        float saldo = valorCredito - valorDivida;
        return saldo;
    }
    
    public void cadastraFornecedor(String nome,String endreco,String Telefone){

    }
    
    public float getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

    public float getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }

}
