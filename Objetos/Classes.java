package classes;

public class Classes {

    public static void main(String[] args) {
            
        Veiculo v1, v2, v3;
        v1 = new Veiculo();
        
        v1.modelo = "Fusca"; 
        v1.ano = 1977;
        v1.motor = 1300;
        v1.cor = "verde";
        
        System.out.print("V1: "+v1);
        
        v2 = v1;
        v2.ano = 1979;
        v2.cor = "azul";
       
        System.out.println();
        System.out.print("V2: "+v2);
        System.out.format("\n%s %d %.1f %s \n", v1.modelo, v1.ano, v1.motor, v1.cor);
        
    }
}
