package tema4.ejer6;

public abstract class Estacion {
    private String nombre, latitud, longitud;
    private int limiteInferiorRango,limiteSuperiorRango,cantAnios;
    private double valorAlto;
    private double[][] temperaturas; 
    private String [] nombresMeses;

    public Estacion(String nombre, String latitud, String longitud, int unLimiteInferior, int unaCantAnios) {
        this.setNombre (nombre) ;
        this.setLatitud (latitud) ;
        this.setLongitud (longitud) ;
        this.setValorAlto();
        this.setCantAnios(unaCantAnios);
        this.setLimiteInferiorRango(unLimiteInferior);
        this.setLimiteSuperiorRango();
        this.inicializarTemperaturas();
        this.setNombresMeses();  
    }

    private void setNombresMeses(){
        this.nombresMeses = new String[12];
        this.nombresMeses[0] = "Enero";
        this.nombresMeses[1] = "Febrero";
        this.nombresMeses[2] = "Marzo";
        this.nombresMeses[3] = "Abril";
        this.nombresMeses[4] = "Mayo";
        this.nombresMeses[5] = "Junio";
        this.nombresMeses[6] = "Julio";
        this.nombresMeses[7] = "Agosto";
        this.nombresMeses[8] = "Septiembre";
        this.nombresMeses[9] = "Octubre";
        this.nombresMeses[10] = "Noviembre";
        this.nombresMeses[11] = "Diciembre";        
    }
    
    private String [] getNombresMeses (){
        return this.nombresMeses;
    }
    
    public String getNombreMes(int i){
    //Se da por sentado que el mes es valido porque se envia de un metodo interno
        return this.getNombresMeses()[i];
    }
    
    private void inicializarTemperaturas(){
        this.temperaturas = new double [this.getCantAnios()][12];
        for (int i = 0; i<this.getCantAnios(); i++){
             for (int j = 0; j<12; j++){
                this.setTemperaturaMensual(this.getValorAlto(),j+1,this.getLimiteInferiorRango()+i) ;
            }
        }
    }
    
    private double getValorAlto(){
        return valorAlto;
    }
    
    private void setValorAlto(){
        this.valorAlto = 9000.0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public int getLimiteInferiorRango() {
        return limiteInferiorRango;
    }

    public void setLimiteInferiorRango(int limiteInferiorRango) {
        this.limiteInferiorRango = limiteInferiorRango;
    }
    
    private void setLimiteSuperiorRango() {
        this.limiteSuperiorRango = this.getLimiteInferiorRango() + this.getCantAnios()-1;
    }
    
    public int getLimiteSuperiorRango(){
        return this.limiteSuperiorRango;
    }
    
    public int getCantAnios() {
        return cantAnios;
    }

    public void setCantAnios(int cantAnios) {
        this.cantAnios = cantAnios;
    }

    private boolean perteneceAlAnio (int unMes){
        return ((unMes>=1)&&(unMes<=12));
    }
    
    private boolean perteneceAlRangoDeAnios (int unAnio){
        return ((unAnio>=this.getLimiteInferiorRango())&&(unAnio<=this.getLimiteSuperiorRango()));
    }
    //EVALUAR SI SE RETORNA O NO BOOLEAN
    public boolean setTemperaturaMensual(double unaTemperatura,int unMes,int unAnio){
        if((this.perteneceAlAnio(unMes))&&(this.perteneceAlRangoDeAnios(unAnio))){
            this.temperaturas[unAnio - this.getLimiteInferiorRango()][unMes -1] = unaTemperatura;
            return true;
        }
        else return false;
    }
    
    public double getTemperaturaMensual(int unMes,int unAnio){
        int i;
        if(this.perteneceAlRangoDeAnios(unAnio))
            i = this.getLimiteSuperiorRango()-this.getLimiteInferiorRango();
        else i = -1;
        if((this.perteneceAlAnio(unMes))&&(i != -1)){
            return this.getTemperaturas()[i][unMes - 1];
        }
        else return this.getValorAlto();
    }
    
    public double[][] getTemperaturas() {
        return temperaturas;
    }

    private void setTemperaturas(double[][] temperaturas) {
        this.temperaturas = temperaturas;
    }
    
    public String getMesyAnio_MAX (){
        String aux;
        int i,j = -1,mesMax=-1,anioMax=-1;
        double max = -1;
        for (i = 0; i < this.getCantAnios(); i++){
            for (j = 0; j < 12; j++){
                if (this.getTemperaturas()[i][j] > max){
                    max = this.getTemperaturas()[i][j];
                    anioMax = i;
                    mesMax = j;
                }
            }
        }
        aux = "Temperatura maxima sucedio en el mes "+this.getNombreMes(mesMax)+" del año "+(anioMax+this.getLimiteInferiorRango())+".";
        System.out.println();
        return aux;
    }
    
    @Override
    public String toString(){
       return this.getNombre() + " ( " + this.getLatitud ()+ " - " + this.getLongitud ()+ ")\n";
    }
    public abstract String getReporte();
}
