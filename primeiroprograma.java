package com.mycompany.primeiroprograma;

import java.util.Scanner;
public class primeiroprograma {

    public static void main(String[] args) {
        
        float nota1, nota2, nota3, media;
        Scanner nota;
        nota = new Scanner (System.in);
        
        System.out.println("Bom dia, Boa tarde, Boa noite");
        
        System.out.println("Nota 1: ");
        nota1 = nota.nextFloat();
        
        System.out.println("Nota 2: ");
        nota2 = nota.nextFloat();
        
        System.out.println("Nota 3: ");
        nota3 = nota.nextFloat();
        
        media = (nota1 + nota2 + nota3)/3;
        System.out.println("Média:" + media);
        
      
        if(media >= 6.0 && media <=10)
        {
            System.out.println("APROVADO!");
        }
        else{
        System.out.println("REPROVADO!");
    }
        
        
        
   
    }
}
