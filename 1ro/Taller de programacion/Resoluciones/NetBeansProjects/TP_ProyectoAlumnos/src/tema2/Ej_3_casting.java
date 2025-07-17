package tema2;

/**
 *
 * @author marie
 */
import PaqueteLectura.GeneradorAleatorio;

public class Ej_3_casting {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        int dimF = 5, dimC = 8, cant = 0, cantAux = 0, i = 0, j = 0;
        Persona p;
        String nombreNulo = "ZZZ", nombre;
        GeneradorAleatorio.iniciar();
        Persona[][] vectorAspirantes = new Persona[dimF][dimC];
        nombre = "ZZ" + GeneradorAleatorio.generarString(1).toUpperCase();
        while ((i < dimF) && (!nombre.equals(nombreNulo))) {// o while((i<dimF)&&(nombre.equals(nombreNulo)))do{?
            while ((j < dimC) && (!nombre.equals(nombreNulo))) {
                cant++;
                p = new Persona(nombre, GeneradorAleatorio.generarInt(70000000), GeneradorAleatorio.generarInt(101));
                vectorAspirantes[i][j] = p;
                nombre = "ZZ" + GeneradorAleatorio.generarString(1).toUpperCase();
                j++;
            }
            i++;
            j = 0;
        }
        i = 0;
        j = 0;
        System.out.println();
        System.out.println("Se anotaron " + cant + " personas para el casting. ");
        while ((i < dimF) && (cantAux < cant)) {// o while((i<dimF)&&(nombre.equals(nombreNulo)))do{?
            System.out.println("Dia " + (i + 1));
            while ((j < dimC) && (cantAux < cant)) {
                System.out.println("Turno: " + (j + 1) + ", nombre: " + vectorAspirantes[i][j].getNombre());
                j++;
                cantAux++;
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}
