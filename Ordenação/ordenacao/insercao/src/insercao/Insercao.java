package insercao;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class Insercao {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int vetor[] = {8,2,4,9,3,6};
                
        insercao(vetor);
                
        System.out.print(Arrays.toString(vetor));
        System.out.println();
        }
    
    private static void insercao(int vetor[]){
            
        int x, j;
                
        for (int i = 0; i < vetor.length; i++) {
                
            x = vetor[i];
            j = i - 1;
                        
            while((j >= 0) && (vetor[j] > x)){
                            
                vetor[j + 1] = vetor[j];
                j = j  - 1;
            }
                        
            vetor[j + 1] = x;
        }
    }
}
