/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import java.util.Scanner;

public class VerificacaoNumeros {
    public static void main(String[] args){
        
        int vetor[] = new int[3];
        int maior;
        
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Digite o numero 1:");
        vetor[0] = scanner1.nextInt();
        
        scanner1.nextLine();
        
        System.out.println("Digite o numero 2:");
        vetor[1] = scanner1.nextInt();
        
        scanner1.nextLine();
        
        System.out.println("Digite o numero 3:");
        vetor[2] = scanner1.nextInt();
        
        scanner1.nextLine();
        
        maior = vetor[0];
        
        
        for(int i = 0; i < 3; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        
        System.out.println("O maior número é: " + maior);
       
        for(int i = 0; i < 3; i++){
            if(vetor[i] > 0){
                System.out.println(vetor[i] + " é positivo");
            }else if(vetor[i] == 0){
                System.out.println(vetor[i] + " é igual a zero");
            }else if(vetor[i] < 0){
                System.out.println(vetor[i] + " é negativo");
            }
        }
        
        
        
    }
}
