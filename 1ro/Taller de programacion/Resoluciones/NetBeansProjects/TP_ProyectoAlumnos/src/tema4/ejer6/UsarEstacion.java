package tema4.ejer6;
import PaqueteLectura.GeneradorAleatorio;
public class UsarEstacion {

    public static void main(String[] args) {
        // TODO code application logic here
//Realice un main que cree un Sistema con reporte anual para 3 años 
//consecutivos a partir del 2021, para la estación La Plata (latitud -34.921 y longitud -
//57.955). 
    GeneradorAleatorio.iniciar();
    //params =(nombre, latitud, longitud, unLimiteInferior, unaCantAnios) {
    int i,j,cantAnios = 3,cantAnios2 = 4,cantMeses = 12,limInf = 2021,limInf2 = 2020;
    ReporteEstacionalAnual repAnu = new ReporteEstacionalAnual("La Plata","-34.921 ","57.955",limInf,cantAnios);
    for (i = 0; i<cantAnios; i++){
        for (j = 0; j<cantMeses; j++){
            repAnu.setTemperaturaMensual(GeneradorAleatorio.generarDouble(36), j+1, limInf+i);
        }
    }
    System.out.println(repAnu.toString());
    System.out.println(repAnu.getMesyAnio_MAX());
//Luego cree un Sistema con informe mensual para 4 años a partir de 2020, para la 
//estación Mar del Plata (latitud -38.002 y longitud -57.556). 
    ReporteEstacionalMensual repMens = new ReporteEstacionalMensual("Mar del Plata","-38.002 ","-57.556",limInf2,cantAnios2);
//nombre, latitud, longitud, unLimiteInferior, unaCantAnios
    for (i = 0; i<cantAnios2; i++){
        for (j = 0; j<cantMeses; j++){
            repMens.setTemperaturaMensual(GeneradorAleatorio.generarDouble(36), (j+1), limInf2+i);
        }
    }
    System.out.println(repMens.toString());
    System.out.println(repMens.getMesyAnio_MAX());
    }
}
