package atividade03;

import java.util.Scanner;

public class TabuadaInterativa {
    
    public static void main(String[] args){
       
        int vet[] = new int[10], numero, j = 1;
        
        for(int i = 1; i < 10; i++){
            vet[i] = vet[i] + i;
        }
        
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Insira um numero inteiro: ");
        numero = scanner1.nextInt();
        scanner1.nextLine();
        
        while(j < 10){
            System.out.println(vet[j] + " * " + numero + " = " +  (vet[j]*numero));
        j++;
        }
        
    }
    
}
