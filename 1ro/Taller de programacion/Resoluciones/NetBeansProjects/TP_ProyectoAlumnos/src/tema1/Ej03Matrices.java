//Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice 
//la matriz con números aleatorios entre 0 y 30. 
//Luego realice las siguientes operaciones: 
//- Mostrar el contenido de la matriz en consola. 
//- Calcular e informar la suma de los elementos de la fila 1
//- Generar un vector de 5 posiciones donde cada posición j contiene la suma 
//de los elementos de la columna j de la matriz. Luego, imprima el vector.
//- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de 
//encontrarse indique su ubicación (fila y columna) en caso contrario 
//imprima “No se encontró el elemento”
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ej03Matrices {

    public static void main(String[] args) {
        System.out.println("- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice \n" +
"la matriz con números aleatorios entre 0 y 30. \n" +
"Luego realice las siguientes operaciones: \n" +
"- Mostrar el contenido de la matriz en consola. \n" +
"- Calcular e informar la suma de los elementos de la fila 1\n" +
"- Generar un vector de 5 posiciones donde cada posición j contiene la suma \n" +
"de los elementos de la columna j de la matriz. Luego, imprima el vector.\n" +
"- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de \n" +
"encontrarse indique su ubicación (fila y columna) en caso contrario \n" +
"imprima “No se encontró el elemento”.");
        int dimF=5, dimC=5,i,j,suma = 0,num;
        boolean encontre = false;
	//Paso 2. iniciar el generador aleatorio     
        GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        int [][] matrizInt = new int [dimF][dimC];
        for (i = 0; i < dimF; i++){
          for (j = 0; j < dimF; j++){
            matrizInt[i][j] = GeneradorAleatorio.generarInt(31);
          }
        }
        //Paso 4. mostrar el contenido de la matriz en consola
        for (i = 0; i < dimF; i++){
          for (j = 0; j < dimF; j++){
            System.out.println("matrizInt["+i+"]["+j+"]: "+matrizInt[i][j] );
          }
        }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        for (i = 0; i < dimC; i++){
          suma += matrizInt[1][i];
        }
        System.out.println("Resultado de la suma de los elementos de la fila nro 1: "+suma);
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        int [] vectorSumaColumnaJ = new int [dimC];
        for (j = 0; j < dimC; j++){
            vectorSumaColumnaJ[j]=0;
        }
        for (i = 0; i < dimF; i++){
          for (j = 0; j < dimC; j++){
            vectorSumaColumnaJ[j]+= matrizInt[i][j];
          }
          suma = 0;
        }
        //        Luego, imprima el vector.
        for (i = 0; i < dimC; i++){
          System.out.println("vector["+i+"]: "+vectorSumaColumnaJ[i] );
        }
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        System.out.println("Ingrese numero entero a buscar en la matriz: ");
        num = Lector.leerInt();
        i=0;
        while ((i<dimF)&&(!encontre)){
            j=0;
            while ((j<dimC)&&(!encontre)){
              if(matrizInt[i][j]==num){
                 encontre = true;
              }
              j++;
          }
          i++;
        }
        if(encontre){
          System.out.println("El numero se encontraba en la matriz ");
        }
        //   y en caso contrario imprima "No se encontró el elemento".
        else{
          System.out.println("El numero no se encontraba en la matriz ");}
    }
}