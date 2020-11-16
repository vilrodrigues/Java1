package quicksort;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        
        int[] vetor ={6,3,4,5,2,7,9,10,11,0};
        
        quicksort(vetor, 0, vetor.length - 1);
        
        System.out.println(Arrays.toString(vetor));
    }
    
    private static void quicksort(int[] vetor, int esq, int dir){
        
        if(esq < dir){
            int j = separar(vetor, esq, dir);
            quicksort(vetor, j + 1, dir);
        }
    }
    
    private static int separar(int[] vetor, int esq, int dir){
        
        int i = esq + 1;
        int j = dir;
        int pivo = vetor[esq];
        
        while(i <= j){
            if(vetor[i] <= pivo){
                i++;
            }
            else if(vetor[j] > pivo){
                j--;
            }
            else if(i <= j){
                trocar(vetor, i, j);
                i++;
                j--;
            }
        }
        
        trocar(vetor, esq, j);
        return j;
    }
    
    private static void trocar(int[]vetor , int posicao1, int posicao2){
        
        int aux = vetor[posicao1];
        vetor[posicao1] = vetor[posicao2];
        vetor[posicao2] = aux;
    }
}
