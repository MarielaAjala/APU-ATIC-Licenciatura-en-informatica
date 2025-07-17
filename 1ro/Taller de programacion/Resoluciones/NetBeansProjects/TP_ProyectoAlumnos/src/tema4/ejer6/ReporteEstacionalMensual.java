/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ejer6;

/**
 *
 * @author marie
 */
public class ReporteEstacionalMensual extends Estacion {
    
    public ReporteEstacionalMensual(String nombre, String latitud, String longitud, int unLimiteInferior, int unaCantAnios) {
        super(nombre, latitud, longitud, unLimiteInferior, unaCantAnios);
    }
    
    public String getReporte(){
        int i,j;
        double suma,promedio;
        String aux="";
        for (j = 0; j<12; j++){
            suma = 0;
            for( i = 0; i<super.getCantAnios(); i++)
            {   
                suma += super.getTemperaturas()[i][j];
            }
            promedio = suma / super.getCantAnios();
            aux += "- "+super.getNombreMes(j)+": "+promedio+"°C. \n";
        }
        return aux;
    }
    
    @Override
    public String toString() {
        String aux;
        aux = "ReporteEstacionalMensual: \npromediosMensuales= \n"+ super.getNombre() + " ( " + super.getLatitud ()+ " - " + super.getLongitud ()+ ")\n"+this.getReporte();
        return aux;
    }
}
