/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1q3;

/**
 *
 * @author Windows
 */
import java.util.Scanner;
public class Lista1q3 {

    public static void main(String[] args) {
        System.out.println("Bom dia, boa tarde, boa noite");
        int a, b, soma, mult;
        Scanner numero;
        numero = new Scanner(System.in);
        
        System.out.println("Digite o valor de A:");
        a = numero.nextInt();
         System.out.println("Digite o valor de B:");
         b = numero.nextInt();
         
         soma = a + b;
         mult = a*b;
         
         if(a == b){
             System.out.println("C = " + soma);
         }
         else {
             System.out.println("C = " + mult);
         }
         
          
        
    }
}
