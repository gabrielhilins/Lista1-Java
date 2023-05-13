/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1q7;

/**
 *
 * @author Windows
 */
import java.util.Scanner;
public class Lista1q7 {

    public static void main(String[] args) {
        Scanner logico;
        logico = new Scanner (System.in);
        boolean a, b;
        System.out.println("Digite o primeiro valor booleano (true(VERDADEIRO) ou false (FALSO):");
        a = logico.nextBoolean();
         System.out.println("Digite o segundo valor booleano (true ou false:");
        b = logico.nextBoolean();
        
        if((a == true) && (b == true)){
            System.out.println("Essa sentença é verdadeira");
        }
        else{
            System.out.println("Essa sentença é Falsa");
        }
        
    }
}
