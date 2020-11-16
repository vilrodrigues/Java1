package exerc;

import java.util.Scanner;

public class Exerc {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        dados amostra[] = new dados[2];
        double somaPeso = 0, mediaPeso = 0;
        int somaAltura = 0, mediaAltura = 0;
        
        for (int i = 0; i < 2; i++) {
                dados pessoa = new dados();
                
                System.out.println("Informe o nome: "); pessoa.nome = scan.nextLine();
                System.out.println("Informe a idade: ");pessoa.idade = scan.nextInt();
                System.out.println("Informe o peso: ");pessoa.peso = scan.nextFloat();
                System.out.println("Informe a altura");pessoa.altura = scan.nextInt();
                
                scan.skip("\n"); 
                amostra[i] = pessoa;
                
                somaPeso = somaPeso + amostra[i].peso;
                somaAltura = somaAltura + amostra[i].altura;
        }
        
        mediaPeso = somaPeso / 2;
        mediaAltura = somaAltura / 2;
        
        System.out.print("O Peso médio é: "+mediaPeso);System.out.println();
        System.out.print("A altura média é: "+mediaAltura);System.out.println();
        
        
        for (int i = 0; i < 2; i++) { // ou for(dados pessoa : amostra)  percorre a colecao inteira
                
                if((amostra[i].idade > 50) && (amostra[i].peso > mediaPeso)){
                        
                        System.out.print(amostra[i].nome+"Tem mais de 50 anos e peso acima da média!");System.out.println();
                        
                }
                
                if((amostra[i].altura < mediaAltura) && (amostra[i].idade > 20)){
                    
                        System.out.print(amostra[i].nome+"Tem altura abaixo da média e mais de 20 anos!");System.out.println();
                    
                }
            
        }
        
        
        
        
        
    }
}
