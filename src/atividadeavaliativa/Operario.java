package atividadeavaliativa;

/**
 *
 * @author marcos
 */
public class Operario extends Empregado {

    public Operario(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    private double valorProducao;
    private double comissao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
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
        salarioLiquido = salarioLiquido+comissao;
        
        System.out.println(salarioLiquido);
    }

}
