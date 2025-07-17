/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ejer4;

import tema4.*;
public class VisorFigurasModificado {
 private int guardadas;
 private int capacidadMaxima=5;
 private Figura [] vector;
 
 public VisorFigurasModificado(){
    guardadas = 0;
    vector = new Figura [capacidadMaxima];
 }
 
 public void guardar(Figura f){
    if(this.quedaEspacio()) {vector [guardadas] = f;}
    else System.out.println("No he guardado nada. ");
    guardadas++;
 }
 
 //sigue a la derecha -> 
 public boolean quedaEspacio(){
    return guardadas < capacidadMaxima;
 }
 
 public void mostrar(){
    for (int i = 0; i<this.getGuardadas(); i++){
        System.out.println(this.vector[i].toString());
    }
 }
 public int getGuardadas() {
 return guardadas;
 }
 
}
