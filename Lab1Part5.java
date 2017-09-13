/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1part5;

/**
 *
 * @author Ebrahim
 */
public class Lab1Part5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2,b = 3,c = 5,d = 7;
        System.out.println("a = " +a+ ",b = " +b+ ",c = " +c+ ",d = " +d);
        double fracSum = 0.0;
        System.out.println("The formula for finding fractions is as follows:");
        System.out.println("Sum of fractions = ((a*d) + (b*c))/(double)(b*d)");
        System.out.println();
        System.out.println("The fractions are as follows: ");
        System.out.println("a/b = " +a+ "/" +b+ "  c/d = " +c+ "/" +d);  
        fracSum = ((a*d) + (b*c))/(double)(b*d);
        System.out.println("The sum of the fraction a/b + c/d = " + fracSum);
        System.out.println();
        double f1 = a/(double)b;
        double f2 = c/(double)d;
        System.out.println("Now we will store the fractions a/b and c/d as decimal numbers");
        System.out.println();
        System.out.println("f1 = a/b = " +f1+ " , f2 = c/d = " +f2);
        System.out.println("decSum = f1 + f2");
        double decSum = f1 + f2;
        System.out.println();
        System.out.println("so we get the decSum = " +decSum);
        
        
        
        
                
        
                
        
        
    }
    
}
