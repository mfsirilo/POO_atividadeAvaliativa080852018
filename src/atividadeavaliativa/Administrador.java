package atividadeavaliativa;

/**
 *
 * @author marcos
 */
public class Administrador extends Empregado {

    public Administrador(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }

    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public void calcularSalario(double salarioBase) {
        double salarioLiquido = salarioBase - (calcularSalarioInss(salarioBase) + calcularSalarioIr(salarioBase));
        salarioLiquido = salarioLiquido+ajudaDeCusto;
        
        System.out.println(salarioLiquido);
    }

}
