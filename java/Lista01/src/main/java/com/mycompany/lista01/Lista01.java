/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author guilherme.goncalves
 */
public class Lista01 {

    public static void main(String[] args) {
        
        System.out.println("Qual é o seu login?");
        Scanner txt = new Scanner(System.in);
        
        String login = txt.nextLine();
        System.out.println("Qual a sa senha?");
        String senha = txt.nextLine();
        System.out.println("Numero de tentativas maximas para acessar a conta");
        String quantidadeTentativas = txt.nextLine();
        
        String frase = String.format("Seu login é %s sua senha é %s Voce tem %s tentativas antes de ser bloqueado",
        login, senha, quantidadeTentativas);
        
        System.out.println(frase);
        
        
        
    }
}