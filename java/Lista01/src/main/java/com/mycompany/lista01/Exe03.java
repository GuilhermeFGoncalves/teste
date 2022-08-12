/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;


 
public class Exe03
{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Quanto minutos você se aqueceu?");
        Integer tempoAquecimento = numero.nextInt();
        
        System.out.println  ("Quanto minutos você fez exercicios aerobicos?");
        Integer tempoAerobico = numero.nextInt();
        
        System.out.println  ("Quanto minutos você fez exercicios Musculação?");
        Integer tempoMusculacao = numero.nextInt();
        
        Integer total = tempoAerobico + tempoAquecimento + tempoMusculacao;
        Integer caloriasAquecimento = tempoAquecimento * 12;
        Integer caloriasAerobico = tempoAerobico * 20;
        Integer caloriasMusculacao = tempoMusculacao * 25;
        Integer totalCalorico = caloriasAerobico + caloriasAquecimento + caloriasMusculacao;
        
        String frase =String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", total, totalCalorico);
        System.out.println(frase);
        
    }
    
}
