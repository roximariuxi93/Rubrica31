/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasmultiplicar;

/**
 *
 * @author Usuario
 */
public class Tablasmultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingenieria de Software2");
        
        int tabla=2;
        int total;
        
        for (int i = 1; i <= 12; i++) {
           total= i*tabla;
            System.out.println(""+total);
        }
    }
    
}
