/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade01;

import static java.lang.Integer.parseInt;
import java.util.Scanner;



public class VerificacaoIdade {
   
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite a idade da pessoa");
        idade = parseInt(scanner1.nextLine());
        
        if(idade >= 18){
            System.out.println("É maior de idade!");
        }else{
            System.out.println("É menor de idade!");
        }
    }
}
