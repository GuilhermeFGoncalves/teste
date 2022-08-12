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
public class Exe02 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Quantos filhos voce tem entre 0 e 3 anos");
        Integer ateTres = numero.nextInt();
        
        System.out.println("Quantos filhos voce tem entre 4 e 16 anos");
        Integer ateDezesseis = numero.nextInt();
        
        System.out.println("Quantos filhos voce tem entre 17 e 18 anos");
        Integer ateDezoito = numero.nextInt();
        
        Double mediaAteTres = ateTres * 25.12;
        Double mediaAteDezesseis = ateDezesseis * 25.12;
        Double mediaAteDezoito = ateDezoito * 25.12;
        
        Integer somaQtd =ateTres + ateDezesseis + ateDezoito;
        Double somaTotal = mediaAteDezesseis + mediaAteDezoito + mediaAteTres;
        
        String frase = String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa" 
, somaQtd, somaTotal);
        System.out.println(frase);
        
        
        
    }
    
}
