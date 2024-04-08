/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

/**
 *
 * @author Iksortso K2
 */
public class VerificacaoNumerosPares {
    public static void main(String[] args){
        
        int vet[] = new int[101];
        
        for(int i = 1; i< 101; i++){
            vet[i] = vet[i] + i;
        }
        
        for(int i = 1; i< 101; i++){
            if(vet[i] % 2 == 0){
                System.out.println(vet[i]);
            }
        }
        
    }
}
