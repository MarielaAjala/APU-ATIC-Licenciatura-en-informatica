/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 *
 * @author marie
 */
import PaqueteLectura.GeneradorAleatorio;
public class Ej_2 {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int dimF = 15, dimL = 0, cantMay65=0, indiceMinDNI=0,minDNI=70000000;
        Persona [] vectorPersonas = new Persona [dimF];
        GeneradorAleatorio.iniciar();
        Persona p = new Persona(GeneradorAleatorio.generarString(6),GeneradorAleatorio.generarInt(70000000),GeneradorAleatorio.generarInt(101));
        
        while((dimL<dimF)&&(p.getEdad()!=0)){
            if (p.getEdad()>65){
                cantMay65++;
            }
            if(p.getDNI()<minDNI){
                minDNI=p.getDNI();
                indiceMinDNI=dimL;
            }
            vectorPersonas[dimL++]=p;
            p = new Persona(GeneradorAleatorio.generarString(6),GeneradorAleatorio.generarInt(70000000),GeneradorAleatorio.generarInt(101));
        }
        if(dimL>0){
            System.out.println("Cantidad de personas mayores a 65 años: "+cantMay65);
            System.out.println("DNI minimo: "+minDNI);
            System.out.println("Persona con minimo DNI: "+vectorPersonas[indiceMinDNI]);
        }
        //El procesado de los datos segun CADP se deberia realizar luego de cargados los datos
    }
    
}
