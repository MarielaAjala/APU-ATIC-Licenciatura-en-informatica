/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3.ejer1;

public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangulo t1 = new Triangulo(10,15,12.5,"Verde","Rosa");
        System.out.println("Area: "+t1.calcularArea());
        System.out.println("Perimetro: "+t1.calcularPerimetro());
    }
   }
