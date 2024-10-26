/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_10;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prova_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int cadast = 0;
        
        System.out.println("Quantos produtos voce deseja cadastrar?");
        cadast = ler.nextInt();
        ler.nextLine();
        
        String[] nome = new String[cadast];
        int[] precos = new int[cadast];
        
        for (int i = 0; i < cadast; i++) {
            System.out.println("Insira o nome " + (i + 1));
            nome[i] = ler.nextLine();
        }
        
          for (int i = 0; i < cadast; i++) {
            System.out.println("Insira o preco do " + nome[i] + " ");
            precos[i] = ler.nextInt();
        }
          
          System.out.println("relacao em JOptionPane.");
          
          
          String message = "Relacao produtos e precos";
          for (int i = 0; i < cadast; i++) {
            message += "Produto: " + nome[i] + " preco " + precos[i] + "rs";
        }
          JOptionPane.showMessageDialog(null, message);
          PassandoParaTxt(message);
    }
           public static void PassandoParaTxt(String message){
        try {
            FileWriter writer = new FileWriter("Relacao produtos e textos");
            writer.write(message);
        } catch (IOException ex) {
            Logger.getLogger(Prova_10.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
                  
        
    }
