/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_09;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author w.rocha
 */
public class Prova_08 {

       public static void main(String[] args) {
        FileWriter arquivo = null;
        try {
            Scanner ler = new Scanner(System.in);
            int num = 0;
            System.out.println("Digite um numero inteiro");
            num = ler.nextInt();
            String caminho = System.getProperty("user.dir") + File.separator + "TABUADA.txt.txt";
            arquivo = new FileWriter(caminho);
            
            PrintWriter gravar = new PrintWriter(arquivo);
            gravar.println("Tabuada do " + num);
            for (int i = 0; i < 10; i++) {
                gravar.println(num + " * " + i + " = " + (num * i));
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Prova_08.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                arquivo.close();
            } catch (IOException ex) {
                Logger.getLogger(Prova_08.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}