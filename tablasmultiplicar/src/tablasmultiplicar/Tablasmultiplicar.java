/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasmultiplicar;

import java.util.Scanner;

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
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingenieria de Software2");
        System.out.println("Opciones \n 1)Ingreso de tabla a visualizar \n 2)Visualizar las tablas del 2 al 12");
        int opcion =lector.nextInt();
        int total;
        
        if (opcion==1) {
            System.out.println("ingrese la tbla q desee visualizar");
            int tabla=lector.nextInt();
            for (int i = 1; i <= 12; i++) {
                
               total= i*tabla;
                System.out.println(i+" X "+tabla+" = "+total);
            }
        }
        if (opcion==2) {
                
            for (int i = 2; i <= 12; i++) {
                System.out.println("\n"+"Tabla del "+i);
                for (int j = 1; j <= 12; j++) {
                    total=i*j;
                    System.out.println(j+" X "+i+" = "+total);
                }
            }
                
        }
    }
    
}
