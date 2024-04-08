/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05;

import java.util.Scanner;

public class MediaNotas {

    
    public static void calcularMedia(double total, int alunos){
        System.out.println("Média: " + total/alunos);
     
    }
    
    public static void main(String[] args) {

        int alunos = 0;
        double total = 0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos");
        alunos = scanner1.nextInt();
        
        double vet[] = new double[alunos];

        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite a nota do aluno " + (i+1) + " :");
            vet[i] = scanner1.nextInt();
            scanner1.nextLine();
        }
        
        for(int i = 0; i < alunos; i++){
            total += vet[i];
        }
        
        calcularMedia(total,alunos);
        

    }
}
