package Ryan_Flores_Lista_Repetcao;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanc
 */
public class Exercicio7 {
    public static void main(String[] Agrs){
        Scanner la = new Scanner(System.in);
        int id;
        String nome;
        String nm = "";
        int mn = 3;
        
        for(int i = 0; i< 3; i++){  
            System.out.print("Digite seu nome: ");
            nome = la.next();
            System.out.print("Digite sua idade: ");
            id = la.nextInt();
            
            if(id < mn){  
                mn = id;
                nm = nome;
            } 
        } 
        System.out.println("O nome da pessoa mais nova é " + nm);
}
}