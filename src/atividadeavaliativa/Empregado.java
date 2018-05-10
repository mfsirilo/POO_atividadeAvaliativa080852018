package atividadeavaliativa;

/**
 *
 * @author marcos
 */
public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public Empregado(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);

    }

    public double calcularSalarioInss(double salarioBase) {
        
        /*Aliquotas segundo o site https://www.salarioliquido.blog.br */

        double descontoSalario = 0;
        if (salarioBase <= 1693.72) {
            descontoSalario = (salarioBase * 0.08);
            return descontoSalario;
        } else if ((salarioBase > 1693.72) && (salarioBase <= 2822.90)) {
            descontoSalario = (salarioBase * 0.09);
            return descontoSalario;
        } else if ((salarioBase > 2822.90) && (salarioBase <= 5645.80)) {
            descontoSalario = (salarioBase * 0.11);
            return descontoSalario;
        }
        return descontoSalario;
    }
    public double calcularSalarioIr(double salarioBase) {
        
        /*Aliquotas segundo o site https://www.salarioliquido.blog.br */

        double descontoSalario = 0;
        if (salarioBase < 1903.98) {
            descontoSalario = salarioBase;
            return descontoSalario;
        } else if ((salarioBase > 1903.99) && (salarioBase <= 2826.65)) {
            descontoSalario = (salarioBase * 0.075);
            return descontoSalario;
        } else if ((salarioBase > 2826.66) && (salarioBase <= 3751.05)) {
            descontoSalario = (salarioBase * 0.15);
            return descontoSalario;
        } else if ((salarioBase >  3751.06) && (salarioBase <= 4664.68)) {
            descontoSalario = (salarioBase * 0.225);
            return descontoSalario;
        } else if (salarioBase >  4664.68) {
            descontoSalario = (salarioBase * 0.275);
            return descontoSalario;
        }
        return descontoSalario;
    }
    
    public void calcularSalario(double salarioBase){
        double salarioLiquido =salarioBase - (calcularSalarioInss(salarioBase) + calcularSalarioIr(salarioBase));
        
    }
    
    
    

    

}
