/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1part3;

/**
 *
 * @author Ebrahim
 */
public class Lab1Part3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//       Correctly find the roots of the quadratic equtaion given

int a;
        a = 4;  
        int b = -32;
        System.out.println("The coefficient for x*x (x squared) is "+ a);        
        System.out.println("The coefficient for x is "+ b);        
        double xPos = 0, xNeg = 0;
 int c = 64;

        xPos = (-b + Math.sqrt(b*b - 4*a*c)) / (2.0*a);
        xNeg = (-b - Math.sqrt(b*b - 4*a*c)) / (2.0*a);
        
        System.out.println("The additional constant is "+ c);        
 
        System.out.println("so the positive root x is "+ xPos);  
        System.out.println("and the negative root x is "+ xNeg);  
        System.out.println("for x = "+a + "x * x + "+b+"x + "+c);
        System.out.println();
        System.out.println();


        
    }
    
}
