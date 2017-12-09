/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inharitanch;

/**
 *
 * @author nafiul
 */
public class Inharitance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculation c=new Calculation();
        double d=c.add(20, 30);
        
        double d2=c.add(20, 50, 30);
        
        double m=c.multiply(45, 4);
        
        double div=c.divition(8, 0);
        
        System.out.println(div);
    }
    
}
