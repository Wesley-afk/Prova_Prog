/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_o9;

import java.util.Scanner;

/**
 *
 * @author w.rocha
 */
public class Prova_o9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ganhoPorHora;
        int horasTrabalhadas;
        
        System.out.println("Quanto o funcionario ganha por hora?");
        ganhoPorHora = ler.nextInt();
        
        System.out.println("Por quantas horas o funcionario trabalhou no mes?");
        horasTrabalhadas = ler.nextInt();
        
        int SalarioBruto = (ganhoPorHora * horasTrabalhadas);
        float desconto = 0;
                
        System.out.println("Salario bruto: " + SalarioBruto);
        System.out.println("- imposto de renda" + ((0.11 * SalarioBruto) / 100));
        desconto += (0.11 * SalarioBruto) / 100;
        
        System.out.println("- inss " + ((0.8 * SalarioBruto) / 100));
        desconto += (0.8 * SalarioBruto) / 100;
        
        System.out.println("- sindicato  " + ((0.5 * SalarioBruto) / 100));
        desconto+= (0.5 * SalarioBruto) / 100;
          
        System.out.println("Desconto de : " + desconto);
        System.out.println("Salario liquido: " + (SalarioBruto - desconto));
        
    }
}
