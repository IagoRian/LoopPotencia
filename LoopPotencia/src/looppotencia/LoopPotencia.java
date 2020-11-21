/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looppotencia;
import java.util.Scanner;
/**
 *
 * @author Naja
 */
public class LoopPotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        double num ,a;
        int i;
        System.out.print("Digite um número: ");
        num = leitor.nextInt();
        i = 1;
        while(i<=15){
        a = Math.pow(num, i);
        System.out.println(a);
        i = i+1;
        }
       
    }
    
}
