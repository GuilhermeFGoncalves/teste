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
public class Exe04 {
    public static void main(String[] args) {
        Scanner numero= new Scanner(System.in);
        
        System.out.println("Informe o valor unitario de um produto");
        Double valor = numero.nextDouble();
        
        System.out.println("Informe a quantidade vendida");
        Double quantidade = numero.nextDouble();
        
        System.out.println("Informe o valor dado pelo cliente para calcular o troco");
        Double pago = numero.nextDouble();
        
        Double total= valor * quantidade;
        Double troco= pago-total;
        
        String frase = String.format("Seu troco será de R$%.2f", troco);
        System.out.println(frase);
        
        
        
    }
    
}
