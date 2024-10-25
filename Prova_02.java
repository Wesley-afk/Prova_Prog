/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_02;

import java.util.Scanner;

/**
 *
 * @author w.rocha
 */
public class Prova_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int anos = 0;
        int meses = 30;
        int dias = 0;
        
        System.out.println("Digite sua idade em anos, meses e dias");
        
        System.out.println("Anos: ");
        anos = ler.nextInt();
        
        System.out.println("Meses: ");
        meses = ler.nextInt();
        
        System.out.println("Dias: ");
        dias = ler.nextInt();
        
        System.out.println(anos + "anos, " + meses + " meses e " + dias + " dias");
        System.out.print((anos * 365) + (meses * 30) + dias + " dias");
    }
}
