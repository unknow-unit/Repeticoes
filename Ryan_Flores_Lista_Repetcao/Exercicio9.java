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
public class Exercicio9 {
    public static void main(String[] Args){
        Scanner leia = new Scanner(System.in);
        double nm;
        double c=0;
        int s =0;
        
       System.out.println("Digite 20 números"); 
       for(int i = 1; i<=20; i++){
           System.out.print("Digite o " + i +"° número: ");
           nm = leia.nextInt();
           c = nm%2;
           if(c == 0){
                s = s+1;
           }
       }
       if(s == 1){
           System.out.println("Apenas um número é par");   
       }else if(s >=2){
            System.out.println(s +" números são pares");
       }else{
           System.out.println("Nenhum número digitado é par");
       }
    }
}
