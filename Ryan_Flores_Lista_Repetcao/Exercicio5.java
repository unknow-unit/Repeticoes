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
public class Exercicio5 {
    public static void main(String[] Args){
        Scanner leia = new Scanner(System.in);
        double media = 0;
        int i =1;
        double s = 0;
        while( i<=20){
            System.out.print("Digite a idade da " + i + "° pessoa: ");
            int idade = leia.nextInt();
            s += idade;
            media = s/20;
            i+=1;
        }
        System.out.println("A média de idade entre essas 20 pessoas é " + media);
        
        
        
        
        
        
    }
}
