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
public class Exercicio10 {
    public static void main(String[] Args){
        Scanner leia = new Scanner(System.in);
        int i=1, zc=0, cd = 0, d = 0;
        double nm;
        
        System.out.println("Digite 20 números");
        do{
            System.out.print("Digite o " + i +"° número: ");
            nm = leia.nextInt();
            if(nm >= 0 && nm <= 100){
                zc = zc+1;
           }
            if(nm >= 101 && nm <= 200){
                cd = cd+1;
           }
            if(nm > 200){
                d = d+1;
           }
            i++;
        }while(i<=5);
        System.out.println("Quantidade de números digitados entre 0 e 100: " + zc);
        System.out.println("Quantidade de números digitados entre 101 e 200: " + cd);
        System.out.println("Quantidade de números maiores que 200: " + d);
        
}
}
