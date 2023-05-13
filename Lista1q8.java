/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista1q8;

/**
 *
 * @author Windows
 */
import java.util.Scanner;

public class Lista1q8 {

    public static void main(String[] args) {
        Scanner numero;
        numero = new Scanner (System.in);
        int pagamento;
        float c1, c2, c3, c4, valor;
        System.out.println("Boa noite. Qual o valor do seu produto?");
        valor = numero.nextFloat();
        
        c1 = (float) (valor - valor*0.1);
        c2 = (float) (valor - valor*0.5);
        c3 = valor;
        c4 = (float) (valor + valor*0.05);
        
        System.out.println("Formas de pagamento:");
        System.out.println("1) À vista em dinheiro ou pix, recebe 10% de desconto");
        System.out.println("2) À vista no cartão de crédito, recebe 5% de desconto");
        System.out.println("3) Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("4) Em três vezes, preço normal de etiqueta mais juros de 5%");
        
        System.out.println("Qual vai ser sua forma de pagamento? 1-4");
        pagamento = numero.nextInt();
        
        switch(pagamento){
            case 1 -> System.out.println("O valor que você irá pagar é de " + c1);
            case 2 -> System.out.println("O valor que você irá pagar é de " + c2);
            case 3 -> System.out.println("O valor que você irá pagar é de " + c3);
            case 4 -> System.out.println("O valor que você irá pagar é de " + c4);
                
            default -> {
            }
            
        }
        
     
    }
}
