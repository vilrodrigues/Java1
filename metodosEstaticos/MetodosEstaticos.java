package metodosestaticos;

public class MetodosEstaticos {

    public static void main(String[] args) {
        
        empregado folha[] = new empregado[5];
        
        empregado.ajustarAliquotaINSS(7.3);
        
        folha[0] = new empregado("Juca", 1900);
        folha[1] = new empregado("Pafuncio");
        folha[2] = new empregado("Ana", 2100);
        folha[3] = new empregado("Ermenegildo", 1800);
        folha[4] = new empregado("Bianca", 2200);
        
        for(empregado e : folha){
            
            System.out.println(e);
            System.out.println();
        }
    }
}
