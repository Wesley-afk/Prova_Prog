/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova_05;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Prova_05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int codUser = 1234; // armazenado internamente no algorítimo
        int senha = 9999;
        
        int codUserUser = 0;
        int senhaUser = 0; 
        
        System.out.println("Digite o código de usuário");
        codUserUser = ler.nextInt();
        
        if(codUserUser != codUser){
            System.out.println("Usuário inválido!");
        }
        else{
            System.out.println("Digite a senha.");
             senhaUser = ler.nextInt();
             if(senhaUser != senha){
                 System.out.println("Senha incorreta!");
             }
             else{
                 System.out.println("Ascesso permitido!");
             }
        }
    }
}
