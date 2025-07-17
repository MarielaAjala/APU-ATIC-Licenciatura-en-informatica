package tema4.ejer6;

public class ReporteEstacionalAnual extends Estacion {

    
    public ReporteEstacionalAnual(String nombre, String latitud, String longitud, int unLimiteInferior, int unaCantAnios) {
        super(nombre, latitud, longitud, unLimiteInferior, unaCantAnios);        
    }

    public String getReporte(){
        int i,j;
        double suma,promedio;
        String aux="";
        for ( i = 0; i<super.getCantAnios(); i++){
            suma = 0;
            for (j = 0; j<12; j++){
                suma += super.getTemperaturas()[i][j];
            }
            promedio = suma / 12;
            aux += "- Año "+(super.getLimiteInferiorRango()+i)+": "+promedio+"°C. \n";
        }
        return aux;
    }
    
    @Override
    public String toString() {
        String aux ;
        int i;
        aux= "ReporteEstacionalAnual: \npromediosAnuales= \n" +super.toString()+this.getReporte();
        return aux;
    }
    
}
