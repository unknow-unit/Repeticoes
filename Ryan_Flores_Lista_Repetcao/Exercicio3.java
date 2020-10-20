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
public class Exercicio3 {
    public static void main(String[] Args){
        Scanner leia = new Scanner(System.in);
        int nm;
        System.out.print("Digite um número que gostaria de repetir N vezes: ");
        nm = leia.nextInt();
        int i=1;
        while(i<=nm){
            System.out.println(i+"° Repetição");
            i+=1;
        }
        
        
        
    }
}
