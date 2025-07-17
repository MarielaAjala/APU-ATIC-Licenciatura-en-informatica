package tema1;
//Escriba un programa que lea las alturas de los 15 jugadores de un equipo de 
//básquet y las almacene en un vector. Luego informe: 
//- la altura promedio
//- la cantidad de jugadores con altura por encima del promedio

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;
public class Ej02Jugadores {
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        int dimF = 15;
        double [] vectorAlturas;
        //Paso 3: Crear el vector para 15 double 
        vectorAlturas = new double [dimF];
        //Paso 4: Declarar indice y variables auxiliares a usar
        int i,cant=0;
        double promedio, suma = 0;
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (i = 0; i<dimF; i++){
          System.out.println("Ingrese altura del jugador ");
          vectorAlturas[i] = Lector.leerDouble();
          suma+=vectorAlturas[i];
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        promedio = suma / dimF;
        System.out.println("Promedio de alturas: "+promedio);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for (i = 0; i<dimF; i++){
          if (vectorAlturas[i]>promedio){
            cant++;
          }
        }
        //Paso 9: Informar la cantidad.
        System.out.println("Cantidad de jugadores con alturas por encima del promedio: "+cant);
    }
}