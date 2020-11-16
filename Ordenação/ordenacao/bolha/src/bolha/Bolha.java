package bolha;

import java.util.Arrays;
import java.io.*;
import java.util.Random;
import java.util.Scanner;


public class Bolha {

        public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int vetor[] = gerarVetor(5000);
	
	bolha(vetor);
	
	System.out.print(Arrays.toString(vetor));
        System.out.println();
        }
    
        private static void bolha(int vetor[]){
	
            for(int ultimo = vetor.length - 1; ultimo  > 0; ultimo--){
                for (int i = 0; i < ultimo; i++) {
                    if(vetor[i] > vetor[i+1]){
                        trocar(vetor,i,i+1);
                    }
                }
            }
        }
        
        private static void trocar(int vetor[], int i, int j){
            
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
        
         public static int [] gerarVetor(int n){
        
            int v[] = new int[n];
            Random gerarRandom = new Random();
        
            for (int i = 0; i < n; i++){
            
            v[i] = gerarRandom.nextInt(100);
            }
        
        return v;
    }
}
