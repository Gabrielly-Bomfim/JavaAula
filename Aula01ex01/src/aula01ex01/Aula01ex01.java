
package aula01ex01;

import java.util.Scanner;

public class Aula01ex01 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        //exercicio 02 = receba 3 numeros 
        Scanner input = new Scanner (System.in);
            
        System.out.println("Num 1: "); 
        int num1 = input.nextInt();
        System.out.println("Num 2: "); 
        int num2 = input.nextInt();
        System.out.println("Num 3: "); 
        int num3 = input.nextInt();
        
        if (num1<num2 && num1<num3){
            if (num2<num3){
                System.out.println("" + num1);
                System.out.println("" + num2);
                System.out.println("" + num3);
            }else{
                System.out.println("" + num1);
                System.out.println("" + num3);
                System.out.println("" + num2);
            }
        }else {
            if (num2<num3 && num2< num3){
                if (num1 <num3){
                    System.out.println("" + num2);
                    System.out.println("" + num1);
                    System.out.println("" + num3);
                }else{
                    System.out.println("" + num2);
                    System.out.println("" + num3);
                    System.out.println("" + num1);
                }
                
            }else{
                if (num1<num2){
                    System.out.println("" + num3);
                    System.out.println("" + num1);
                    System.out.println("" + num2);
            }else{
                    System.out.println("" + num3);
                    System.out.println("" + num2);
                    System.out.println("" + num1);
                }
            }
        }
        
        
        
        
        
    }
    
}
