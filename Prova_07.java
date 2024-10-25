/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_07;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Prova_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome1 = "";
        String nome2 = "";
        String filme = "";
        String pista[] = new String[5];
        String resposta = "";
        
        System.out.println("Jogador Um, digite seu nome:");
        nome1 = ler.nextLine();
        
        System.out.println("Digite o nome do filme.");
        filme = ler.nextLine();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("DIgite a pista " + (i + 1)+ ":");
            pista[i] = ler.nextLine();
        }
        
        System.out.println("Jogador Dois, digite seu nome!");
        nome2 = ler.nextLine();
        
        for (int i = 0; i < 5; i++) {
            System.out.println(nome2 + ", a pista " + (i + 1) + " e " + pista[i]);
            
            System.out.println(nome2 + " qual e o nome do filme?");
            resposta = ler.nextLine();
            
            if(resposta.equals(filme)){
                System.out.println(nome2 + " voce acertou!");
            }
            else{
                System.out.println(nome2 + " voce errou!");
            }
        }
        
    }
}
