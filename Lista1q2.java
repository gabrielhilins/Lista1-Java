/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1q2;

/**
 *
 * @author Windows
 */
import java.util.Scanner;
public class Lista1q2 {

    public static void main(String[] args) {
        int a, b, c, soma;
        Scanner numero;
        numero = new Scanner(System.in);
        System.out.println("Bom dia, Boa tarde, Boa noite");
        
        System.out.println("Digite o valor de A");
        a = numero.nextInt();
        System.out.println("Digite o valor de B");
        b = numero.nextInt();
        System.out.println("Digite o valor de C");
        c = numero.nextInt();
        
        soma = a + b;
        System.out.println("O valor da soma é " + soma);
        
        if(soma > c ){
            System.out.println("A soma de A + B é maior que C");
        }
        if(soma <= c){
            System.out.println("A soma de A + B é menor que C");
        }
        
        
        
    }
}
