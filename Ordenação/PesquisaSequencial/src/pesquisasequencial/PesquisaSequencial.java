package pesquisasequencial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PesquisaSequencial {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[10];
        int i, j, pesquisado;
        boolean achou; // retorna true quando encontrar o item pesquisado
        String resp;
        
        // entrada de dados
        
        for (int k = 0; k <= 9; k++) {
            System.out.print("Entre com o "+(k+1)+"º elemento: ");
            vetor[k] = scan.nextInt();
        }
        
        // inicia a pesquisa
        
        do {
            
            // recebe o valor a ser pesquisado
            
            System.out.println();
            System.out.print("Entre com o valor a ser pesquisado: ");
            pesquisado = scan.nextInt();
            i = 0;
            achou = false;
            
            // percorre o vetor inteiro
            
            while(i <= 9 && achou == false) 
                if(pesquisado == vetor[i])
                    achou = true;
                else 
                    i++;
                if(achou == true)
                    System.out.println("Localizado na posição "+(i+1));
                else 
                    System.out.println(pesquisado+" Não foi localizado !!!");
                
            // tentar de novo
                
            System.out.println();
            System.out.println();
            System.out.print("Continuar ? [S]/[N]: ");
            
            // trata a exceção se o que o usuario digitar não for o esperado
            
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
                resp = br.readLine();
            } catch (Exception e) {
                resp = "";
            }
            
            resp = resp.toUpperCase();
            
        } while(resp.compareTo("S") == 0);
    }
}

