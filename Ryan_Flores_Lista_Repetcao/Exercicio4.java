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
public class Exercicio4 {
    public static void main(String[] Args){
        Scanner leia = new Scanner(System.in);
        int i=1;
        int s=0;
        System.out.println("Digite 10 números");
        for(int f =1; f<=10; f++){
            System.out.print("Digite o " +f + "° Número: ");
            int nm = leia.nextInt();
            s +=nm;
            
        }
        System.out.println("A soma dos números é: " + s);
    }
        
        
        
        
        
        
    }

