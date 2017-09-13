/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1part2;

/**
 *
 * @author Ebrahim
 */
public class Lab1Part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num1 = 50;
//    num1 and num2 are variables
int num2;
        System.out.println("Printing variable values");
        System.out.println("Num1 = " + num1);
        num2 = 10;
        System.out.println("Num2= " + num2);
        System.out.println("sum of num1 & num2 = " + (num1 + num2));
        System.out.println();
//        prints a blank line
        num1 = num1 - (num2*6);
        num2 = num2/5 + num1/num2;
        System.out.println("New value of num1 is " + num1);
        System.out.println(num2+" is the final value of num2");
        System.out.println("Adding nums (version1) " + num1 + num2);
        System.out.println("Adding nums (version2) " + (num1 + num2));
        
        
        
                
    
    
    
    
    
    }
    
}
