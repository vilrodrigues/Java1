package selection;

import java.util.Arrays;
import java.util.Random;

public class Selection {

    public static void main(String[] args) {
        
        int v[] = gerarVetor(5000);
        selectSort(v);
        
        System.out.print(Arrays.toString(v));
    }
    
    private static void selectSort(int v[]){
        
        for (int i = 0; i < v.length-1; i++){
            
            int menor = i;
            
            for (int j = (i+1); j < v.length; j++){
                
                if (v[j] < v[menor])
                menor = j;
            }
            
        trocar(v, i, menor);
        } 
    }
    
    private static void trocar(int v[], int i, int menor){
        
                int aux = v[i];
                v[i]    = v[menor];
                v[menor]  = aux;
    }
    
    public static int [] gerarVetor(int n){
        
        int v[] = new int[n];
        Random gerarRandom = new Random();
        
        for (int i = 0; i < n; i++) {
            
            v[i] = gerarRandom.nextInt(100);
        }
        
        return v;
    }
}

