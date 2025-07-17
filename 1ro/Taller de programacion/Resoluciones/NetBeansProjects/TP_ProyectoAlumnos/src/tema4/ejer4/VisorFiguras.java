package tema4.ejer4;

import tema4.Figura;
public class VisorFiguras {
 private int mostradas;
 
 public VisorFiguras(){
 mostradas=0;
 }
 public void mostrar(Figura f){
 System.out.println(f.toString()); 
 mostradas++;
 }
 public int getMostradas() {
 return mostradas;
 }
}
