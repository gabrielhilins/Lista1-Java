/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1q4;

/**
 *
 * @author Windows
 */
import java.util.Scanner;
public class Lista1q4 {

    public static void main(String[] args) {
        int a, dobro, triplo;
        Scanner numero;
        numero = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        a = numero.nextInt();
        
        dobro = a*2;
        triplo = a*3;
        
        if(a < 0){
            System.out.println("" + triplo);
        }
        else{
            System.out.println("" + dobro);
        }
    }
}
