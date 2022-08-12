/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author guilherme.goncalves
 */
public class Exe07 {
    public static void main(String[] args) {
        Scanner numero= new Scanner(System.in);
        
        System.out.println("Qual o limite de peso do elevador");
        Integer totalPeso = numero.nextInt();
        
        System.out.println("Qual o limite de pessoas no elevador");
        Integer totalPessoas = numero.nextInt();
        
        System.out.println("Qual o peso da primeira pessoa?");
        Integer pesoUM = numero.nextInt();
        
        System.out.println("Qual o peso da segunda pessoa?");
        Integer pesoDois = numero.nextInt();
        
        System.out.println("Qual o peso da terceira pessoa?");
        Integer pesoTres = numero.nextInt();
        
        String frase = String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas.\n" +
"O peso total no elevador é de %d, sendo que ele suporta %d", totalPessoas,(pesoUM+pesoDois+pesoTres), totalPeso );
        
        System.out.println(frase);

    }
    
}
