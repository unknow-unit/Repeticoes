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
public class Exercicio11 {
    public static void main(String[] Args){
        Scanner leia = new Scanner(System.in);
        int i=1, zc=0, cd = 0, d = 0;
        double nm, s= 0;
        
        do{
            System.out.print("Digite o " + i +"° número: ");
            nm = leia.nextInt();
            if(i>1){
            s +=nm;
            System.out.println("A soma deu: " + s);
            }
            i++;
        }while(nm>0);
        System.out.println("Você digitou um número negativo");
}
}