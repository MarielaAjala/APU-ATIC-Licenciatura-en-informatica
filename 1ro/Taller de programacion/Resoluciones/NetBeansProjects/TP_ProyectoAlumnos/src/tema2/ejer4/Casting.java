package tema2.ejer4;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
import tema2.Persona;

public class Casting {

    public static void main(String[] args) {
        // TODO code application logic here
        int dimF = 5, dimC = 8, cant = 0, cantAux = 0, i, j,tope = 40,opcion;
        Persona p;
        String nombreNulo = "ZZZ", nombre;
        GeneradorAleatorio.iniciar();
        Persona[][] vectorAspirantes = new Persona[dimF][dimC];
        int [] vectorOcupacionxDia = new int[dimF];
        for (i=0; i<dimF; i++){
            vectorOcupacionxDia[i] = 0;
        }
        System.out.println("Escriba nombre del aspirante, fin de ingreso nombre ZZZ: ");
        nombre = Lector.leerString().toUpperCase();
        while ((cant<tope)&&(!nombre.equals(nombreNulo))){
            System.out.println("Escriba DNI y edad del aspirante: ");
            p = new Persona(nombre,Lector.leerInt(),Lector.leerInt());
            System.out.println("Escriba en que dia desea presentarse, dias posibles del 1 al 5: ");
            opcion = Lector.leerInt();
            if (vectorOcupacionxDia[opcion - 1]<dimC){
                cant++;
                vectorAspirantes[opcion - 1][vectorOcupacionxDia[opcion - 1]++] = p;
            }
            else{
                System.out.println("No quedan lugares disponibles el dia elegido. ");
            }
            System.out.println();
            System.out.println("Escriba otro nombre de aspirante: ");
            nombre = Lector.leerString().toUpperCase();
        }
        System.out.println();
        if (cant==tope){
            System.out.println("Cupo completo. ");
        }
        System.out.println();
        System.out.println("Cantidad de inscriptos cada dia: ");
        for (i=0; i<dimF; i++){
            System.out.println("Dia "+(i+1)+": "+vectorOcupacionxDia[i]+" aspirantes.");
            if(vectorOcupacionxDia[i]>0){
                for (j = 0; j<vectorOcupacionxDia[i]; j++){
                    System.out.println("Turno "+(j+1)+", aspirante: "+vectorAspirantes[i][j].getNombre());
                }
            }
            System.out.println();
        }
    }   
}
