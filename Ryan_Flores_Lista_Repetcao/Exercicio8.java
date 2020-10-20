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
public class Exercicio8 {
    public static void main(String[] Args){
        Scanner leia = new Scanner(System.in);
        double nm;
        int c=0;
        
       System.out.println("Digite 20 números"); 
       for(int i = 1; i<=20; i++){
           System.out.print("Digite o " + i +"° número: ");
           nm = leia.nextInt();
           if(nm >= 8){
                c = c+1;
           }
       }
       if(c == 1){
           System.out.println("Apenas um número é maior que 8");   
       }else if(c >= 2){
            System.out.println(c +" números são maiores que 8");
       }else{
           System.out.println("Nenhum número digitado é maior que 8");
       }
        
        
        
        
    }
}
