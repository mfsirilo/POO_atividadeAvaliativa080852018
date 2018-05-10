package atividadeavaliativa;

/**
 *
 * @author marcos
 */
public class Vendedor extends Empregado{
    
    public Vendedor(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    private double valorVendas;
    private double comissao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
     public void calcularSalario(double salarioBase) {
        double salarioLiquido = salarioBase - (calcularSalarioInss(salarioBase) + calcularSalarioIr(salarioBase));
        salarioLiquido = salarioLiquido+comissao+valorVendas;
        
        System.out.println(salarioLiquido);
    }
    
}
