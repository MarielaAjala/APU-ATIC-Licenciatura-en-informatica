package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ej4_Matrices {
//Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
//(1..4). Realice un programa que permita informar la cantidad de personas que 
//concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al 
//edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de 
//oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro. 
//de piso 9. Al finalizar la llegada de personas, informe lo pedido.
    public static void main(String[] args) {
        System.out.println("Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso\n" +
"(1..4). Realice un programa que permita informar la cantidad de personas que \n" +
"concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al \n" +
"edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de \n" +
"oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro. \n" +
"de piso 9. Al finalizar la llegada de personas, informe lo pedido.");
        int dimF=8, dimC=4,i,j,suma = 0,num;
	GeneradorAleatorio.iniciar();
        int [][] matrizInt = new int [dimF][dimC];
        for (i = 0; i < dimF; i++){
          for (j = 0; j < dimC; j++){
            matrizInt[i][j] = 0;
          }
        }
        System.out.println("Ingrese numero de piso y oficina al que quiere ir, pisos 1..8, oficinas 1..4, fin ingreso = piso 9 ");
        int oficina,piso = Lector.leerInt()-1;
        while(piso != 8){
            oficina = Lector.leerInt()-1;
            matrizInt[piso][oficina]++;
            System.out.println("Ingrese numero de piso y oficina: ");
            piso = Lector.leerInt()-1;
        }
        
        System.out.println("Resultados: ");
        for (i = 0; i < dimF; i++){
          for (j = 0; j < dimC; j++){
            System.out.println("Piso "+(i+1)+"oficina "+(j+1)+" = "+matrizInt[i][j]+ "visitantes" );
          }
        }
        
        }

}
