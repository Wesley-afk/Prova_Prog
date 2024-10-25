/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_04;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Prova_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        
        JOptionPane.showInputDialog("Digite um numero inteiro");
        num = ler.nextInt();
        
     
        JOptionPane.showMessageDialog(null, "Sucessor = " + (num + 1) + " Antecessor = " + (num - 1));
        
    }
}
