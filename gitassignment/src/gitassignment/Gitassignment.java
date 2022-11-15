/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitassignment;

import java.util.Scanner;

/**
 *
 * @author a.mazhar
 */
public class Gitassignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("enter any number: ");
        
        int num1 = scan.nextInt();
        
        System.out.print("enter any number: ");
        
        int num2 = scan.nextInt();
        
        System.out.print(" ");
        
        scan.close();
        
        System.out.println("sum of both numbers: " +(num1+num2));
        
    }
    
}
