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
public class Exe06 {
    public static void main(String[] args) {
        Scanner numero= new Scanner(System.in);
        System.out.println("Qual seu salario bruto");
        Double salario = numero.nextDouble();
        
        System.out.println("Quanto você gasta com condução para ir ao serviço?");
        Double conducao = numero.nextDouble();
        
        
        Double inss= salario * 0.1;
        Double ir= salario * 0.2;
        Double vt= (conducao * 2 )* 22;
        Double totalDesconto = inss+ ir + vt;
        
        String frase=String.format("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f", salario, totalDesconto,(salario-totalDesconto));

            System.out.println(frase);
    }
    
}
