/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ejer3;

/**
 *
 * @author marie
 */
public class UsarPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Mariela ",26132132,41);
        Trabajador t = new Trabajador("Jardinero","Mauro",11203737,70);
        System.out.println(p.toString());
        System.out.println(t.toString());
    }
    
}
