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
public class Exe05 {
    public static void main(String[] args) {
        Scanner numero =new Scanner(System.in);
        System.out.println("Fale um numero");
        Integer n1 = numero.nextInt();

        System.out.println("Fale outro numero");
        Integer n2 = numero.nextInt();
        
        Integer soma = n1+ n2;
        Integer subtracao = n1 - n2;
        Integer multiplicacao = n1 * n2;
        Integer  divicao = n1 / n2;
        
        String frase=String.format("Numermo 1:\n" +
"%d\n" +
"Numero 2:\n" +
"%d\n" +
"Resultado da soma:\n" +
"%d\n" +
"Resultado da subtração:\n" +
"%d\n" +
"Resultado da multiplicação:\n" +
"%d\n" +
"Resultado da divisão:\n" +
"%d", n1, n2, soma, subtracao,multiplicacao,divicao);
        
        System.out.println(frase);
        
        
        
    }
    
}
