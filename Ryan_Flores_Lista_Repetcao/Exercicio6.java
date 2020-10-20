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
public class Exercicio6 {
    public static void main(String[] Args){
       Scanner leia = new Scanner(System.in);
       int idade, c=0;
       
       System.out.println("Digite a idade de 20 pessoas"); 
       for(int i = 1; i<=20; i++){
           System.out.print("Digite a idade da " + i +"° pessoa: ");
           idade = leia.nextInt();
           if(idade >= 18){
                c = c+1;
           }
       }
       if(c == 1){
           System.out.println("Apenas uma pessoa é maior que 18 anos");   
       }else if(c >= 2){
            System.out.println(c +" pessoas são maiores de idade");
       }else{
           System.out.println("Ninguém é maior de idade");
       }
    }             
}

