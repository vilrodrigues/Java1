package metodosestaticos;

public class empregado {
    
    static double salarioMinimo = 1050; // global
    static double aliquotaINSS = 7.5;
    
    String nome;
    double salario;
    
    public empregado(String nome){
        
        this.nome = nome; // o this diferencia o atributo do parâmetro 
        salario = salarioMinimo; // se nao for informado o salario ele ser ao minimo
    }
    
    public empregado(String nome, double salario){
        
        this.nome = nome;
        this.salario = salario;
    }
    
    public double calcularINSS(){
        
        return (salario * aliquotaINSS) / 100.0;
    }
    
    public double calcularSalarioLiquido(){
        
        return salario - calcularINSS();
    }
    
    public static void ajustarAliquotaINSS(double aliquota){
        
        aliquotaINSS = aliquota;
    }
    
    public String toString(){
        
        return String.format(" %s R$ %.2f - R$ %.2f = R$ %.2f", nome,salario,calcularINSS(), calcularSalarioLiquido());
    }
}
