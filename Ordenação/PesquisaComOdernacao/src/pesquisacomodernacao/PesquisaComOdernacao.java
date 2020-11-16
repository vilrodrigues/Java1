package pesquisacomodernacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PesquisaComOdernacao {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o tamanho do vetor: ");
        int tamanhoVetor = scan.nextInt();
        int vetor[] = new int[tamanhoVetor];
        int i, j, pesquisado;
        boolean achou; 
        String resp;
        
        for (int k = 0; k < vetor.length; k++) {
            System.out.print("Entre com o "+(k+1)+"º elemento: ");
            vetor[k] = scan.nextInt();
        }
        
        quickSort(vetor, 0, vetor.length - 1);
        
        do {
            
            System.out.println();
            System.out.print("Entre com o valor a ser pesquisado: ");
            pesquisado = scan.nextInt();
            i = 0;
            achou = false;
            
            while(i <= vetor.length && achou == false) 
                if(pesquisado == vetor[i])
                    achou = true;
                else 
                    i++;
                if(achou == true)
                    System.out.println("Localizado na posição "+(i+1));
                else 
                    System.out.println(pesquisado+" Não foi localizado !!!");
                
            System.out.println();
            System.out.println();
            System.out.print("Continuar ? [S]/[N]: ");
            
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
                resp = br.readLine();
            } catch (Exception e) {
                resp = "";
            }
            
            resp = resp.toUpperCase();
            
        } while(resp.compareTo("S") == 0);
        
        System.out.println(Arrays.toString(vetor));
    }
    
    private static void quickSort(int[] vetor, int esq, int dir){
        
        if(esq < dir){
            int j = separar(vetor, esq, dir);
            quickSort(vetor, j + 1, dir);
        }
    }
    
    private static int separar(int[] vetor, int esq, int dir){
        
        int i = esq + 1;
        int j = dir;
        int pivo = vetor[esq];
        
        while(i <= j){
            if(vetor[i] <= pivo)
                i++;
            else if(vetor[j] > pivo)
                j--;
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
