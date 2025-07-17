/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;


public class DemoFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuad = new Cuadrado(10,"Rojo", "Negro");
        System.out.println("Color linea del cuadrado: " + cuad.getColorLinea()); 
        System.out.println("Area: " + cuad.calcularArea()); 
        System.out.println("Representacion del cuadrado: " + cuad.toString()); 
        Triangulo t = new Triangulo(10,20,25,"Blanco","Verde");
        System.out.println("Color linea del triangulo: " + t.getColorLinea()); 
        System.out.println("Area: " + t.calcularArea()); 
        System.out.println("Representacion del triangulo: " + t.toString()); 
       
    }
    
    
    
}
